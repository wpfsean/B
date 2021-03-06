package com.javaandexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.javaandexcel.bean.Code;
import com.javaandexcel.utils.JdbcUtil;
import com.javaandexcel.utils.Judge;

/**
 * @author wpf
 */
public class Data {

	/**
	 *  @福建省地址信息分割
	 * @param args
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {

		
		List<Code> getCode=getCode();
		String file_Name = "C:\\Users\\Administrator\\Desktop\\fj_data\\道隆 福建省 数据推送4.xls";
		File file = new File(file_Name);
		if (file.exists()) {
			readExcel(file,getCode);
		} else {
			System.out.println("文件不存在");
		}

	}

	// 读取xls文件
	public static void readExcel(File file,List<Code> getCode) throws SQLException {
		try {
			// 写入excel文档
			HSSFWorkbook book1 = new HSSFWorkbook();
			book1.createCellStyle().setAlignment(HSSFCellStyle.ALIGN_CENTER);
			HSSFSheet sheet1 = book1.createSheet("测试");

			InputStream inputStream = new FileInputStream(file);
			String fileName = file.getName();
			Workbook wb = null;
			if (fileName.endsWith("xls")) {
				wb = new HSSFWorkbook(inputStream);// 解析xls格式
			} else if (fileName.endsWith("xlsx")) {
				wb = new XSSFWorkbook(inputStream);// 解析xlsx格式
			}
			Sheet sheet = wb.getSheetAt(0);// 第二个工作表
			int firstRowIndex = sheet.getFirstRowNum();
			int lastRowIndex = sheet.getLastRowNum();
			for (int rIndex = firstRowIndex + 1; rIndex <= lastRowIndex; rIndex++) {
				Row row = sheet.getRow(rIndex);// 循环的获取行
				HSSFRow row1 = sheet1.createRow((int) rIndex);
				if (row != null) {
					int firstCellIndex = row.getFirstCellNum();
					int lastCellIndex = row.getLastCellNum();
					for (int cIndex = firstCellIndex; cIndex < lastCellIndex; cIndex++) {
						// 若获取某一列，就判断cIndex的值
						Cell cell = row.getCell(cIndex);// 循环的获取列
						if (cell != null) {
							if (cIndex == 12) {
								data_processing(row1, rIndex, cell.toString(),getCode);
							}
						}
					}
					System.out.println();
				}
			}
			try {
				FileOutputStream fout = new FileOutputStream("f:/数据1.xls");
				book1.write(fout);
				fout.close();
				 System.out.println("成功");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void data_processing(HSSFRow row1, int rIndex, String data,List<Code> getCode) {
		 System.out.println(data);
		row1.createCell((short) 0).setCellValue(data);
		row1.createCell((short) 5).setCellValue(13);
		
		
		String str3 = String.valueOf(data.charAt(2));
		String str4 = String.valueOf(data.charAt(3));
		String two = data.substring(0, 2);
		String three = data.substring(0, 3);
		if (three.equals("福建省")) {
			method_province(row1,rIndex,data,getCode);
		}else if (three.equals("福州市")) {
			method_fuzhoushi(row1,rIndex,data,getCode);
		} else if (two.equals("平潭")) {
			method_address(row1,rIndex,data,getCode);
		} else if (two.equals("福州")) {
			method_fuzhou(row1,rIndex,data,getCode);
		} else if (str3.equals("市") || str4.equals("市")) {
			method_changleshi(row1,rIndex,data,getCode);
		} else if (str3.equals("县") || str4.equals("县")) {
			method_county(row1,rIndex,data,getCode);
		}else if (str3.equals("区") || str4.equals("区")) {
			method_area(row1,rIndex,data,getCode);
		}else if (two.equals("厦门")) {
			method_xiamen(row1,rIndex,data,getCode);
		}else{
			row1.createCell((short) 1).setCellValue("福建省");
		}

	}
	
	//以“厦门”开头的解析方式
	private static void method_xiamen(HSSFRow row1, int rIndex, String data,List<Code> getCode) {
	     row1.createCell((short) 1).setCellValue("福建省");
		 row1.createCell((short) 2).setCellValue(data.substring(0, 2));
		 if(data.replace(data.substring(0, 2), "").contains("区")){
		  int index=	 data.replace(data.substring(0, 2), "").indexOf("区");
		  row1.createCell((short) 3).setCellValue(data.replace(data.substring(0, 2), "").substring(0, index+1));
		  getCode(row1, rIndex, data.substring(0, 2),data.replace(data.substring(0, 2), "").substring(0, index+1),getCode);
		  row1.createCell((short) 4).setCellValue(data.replace(data.substring(0, 2), "").replace(data.replace(data.substring(0, 2), "").substring(0, index+1), ""));
		 }
		
	}

	//以”马尾区“开头的，解析方式
	private static void method_area(HSSFRow row1, int rIndex, String data,List<Code> getCode) {

		 int index=data.indexOf("区");
	     row1.createCell((short) 1).setCellValue("福建省");
	     row1.createCell((short) 2).setCellValue("福州市");
		 row1.createCell((short) 3).setCellValue( data.substring(0,index+1));
		 getCode(row1, rIndex, "福州市",data.substring(0,index+1),getCode);
		 row1.createCell((short) 4).setCellValue(data.replace(data.substring(0,index+1), ""));
	}

	//以”长乐市“开头的，解析方式
	private static void method_changleshi(HSSFRow row1, int rIndex, String data,List<Code> getCode) {

		 int index=data.indexOf("市");
	     row1.createCell((short) 1).setCellValue("福建省");
		 row1.createCell((short) 2).setCellValue( data.substring(0,index+1));
		
		 if(data.replace(data.substring(0,index+1), "").substring(0,5).contains("镇")){
			 int index1=data.replace(data.substring(0,index+1), "").indexOf("镇");
			 row1.createCell((short) 3).setCellValue( data.replace(data.substring(0,index+1), "").substring(0,index1+1));
			 getCode(row1, rIndex, data.substring(0,index+1),data.replace(data.substring(0,index+1), "").substring(0,index1+1),getCode);
			 row1.createCell((short) 4).setCellValue( data.replace(data.substring(0,index+1), "").replace( data.replace(data.substring(0,index+1), "").substring(0,index1), ""));
		 }else if(data.replace(data.substring(0,index+1), "").substring(0,5).contains("道")){
			 int index2=data.replace(data.substring(0,index+1), "").indexOf("道");
			 row1.createCell((short) 3).setCellValue( data.replace(data.substring(0,index2+1), "").substring(0,index2+1));
			
			 getCode(row1, rIndex, data.substring(0,index+1),data.replace(data.substring(0,index2+1), "").substring(0,index2+1),getCode);

			 row1.createCell((short) 4).setCellValue( data.replace(data.substring(0,index2+1), "").replace( data.replace(data.substring(0,index2+1), "").substring(0,index2), ""));
		 }else if(data.replace(data.substring(0,index+1), "").contains("区")){
		     int index3=	 data.replace(data.substring(0,index+1), "").indexOf("区");
		     row1.createCell((short) 3).setCellValue(  data.replace(data.substring(0,index+1), "").substring(0,index3+1));
			
		     getCode(row1, rIndex, data.substring(0,index+1), data.replace(data.substring(0,index+1), "").substring(0,index3+1),getCode);
		     row1.createCell((short) 4).setCellValue( data.replace(data.substring(0,index+1), "").replace(  data.replace(data.substring(0,index+1), "").substring(0,index3+1), ""));
		 }else if(data.replace(data.substring(0,index+1), "").substring(0,5).contains("街")){
		     int index4=	 data.replace(data.substring(0,index+1), "").indexOf("街");
		     row1.createCell((short) 3).setCellValue(  data.replace(data.substring(0,index+1), "").substring(0,index4+1));
			
		     getCode(row1, rIndex, data.substring(0,index+1),data.replace(data.substring(0,index+1), "").substring(0,index4+1),getCode);
		     row1.createCell((short) 4).setCellValue( data.replace(data.substring(0,index+1), "").replace(  data.replace(data.substring(0,index+1), "").substring(0,index4+1), ""));
		 }
	}

	//以“连江县”开头的
	private static void method_county(HSSFRow row1, int rIndex, String data,List<Code> getCode) {
		row1.createCell((short) 1).setCellValue("福建省");
		row1.createCell((short) 2).setCellValue("福州市");
		row1.createCell((short) 3).setCellValue(data.substring(0,3));
		getCode(row1, rIndex, "福州市",data.substring(0,3),getCode);
		row1.createCell((short) 4).setCellValue(data.replace(data.substring(0,3), ""));
	}

	//以“福州”开头的，解析方式
	private static void method_fuzhou(HSSFRow row1, int rIndex, String data,List<Code> getCode) {
		row1.createCell((short) 1).setCellValue("福建省");
		row1.createCell((short) 2).setCellValue(data.substring(0,2));
	
        
		if(data.replace(data.substring(0,1), "").substring(0,5).contains("区")){
		int index=	data.replace(data.substring(0,2), "").indexOf("区");
		row1.createCell((short) 3).setCellValue(data.replace(data.substring(0,2),"").substring(0,index+1));
		getCode(row1, rIndex, data.substring(0,2),data.replace(data.substring(0,2),"").substring(0,index+1),getCode);
		row1.createCell((short) 4).setCellValue(data.replace(data.substring(0,2), "").replace(data.replace(data.substring(0,2),"").substring(0,index+1), ""));
		}else if(data.replace(data.substring(0,2), "").substring(0,5).contains("长乐")){
			row1.createCell((short) 3).setCellValue(data.replace(data.substring(0,2), "").substring(0, 2));
			getCode(row1, rIndex, data.substring(0,2),data.replace(data.substring(0,2), "").substring(0, 2),getCode);
			row1.createCell((short) 4).setCellValue(data.replace(data.substring(0,2), "").replace(data.replace(data.substring(0,2), "").substring(0, 2), ""));
		}else if(data.replace(data.substring(0,2), "").substring(0,5).contains("路")){
			int index5=data.replace(data.substring(0,2), "").indexOf("路");
			row1.createCell((short) 3).setCellValue(data.replace(data.substring(0,2), "").substring(0, index5+1));
			getCode(row1, rIndex, data.substring(0,2),data.replace(data.substring(0,2), "").substring(0, index5+1),getCode);
			row1.createCell((short) 4).setCellValue(data.replace(data.substring(0,2), "").replace(data.replace(data.substring(0,2), "").substring(0, index5+1), ""));
		}
		
	}

	//以“福州市”开头的，解析方式
	private static void method_fuzhoushi(HSSFRow row1, int rIndex, String data,List<Code> getCode) {
		row1.createCell((short) 1).setCellValue("福建省");
		row1.createCell((short) 2).setCellValue(data.substring(0, 3));
	
		if(data.replace(data.substring(0, 3), "").substring(0,5).contains("县")){
			int index=data.replace(data.substring(0, 3), "").indexOf("县");
			row1.createCell((short) 3).setCellValue(data.replace(data.substring(0, 3), "").substring(0,index+1));
			getCode(row1, rIndex, data.substring(0, 3),data.replace(data.substring(0, 3), "").substring(0,index+1),getCode);
			row1.createCell((short) 4).setCellValue(data.replace(data.substring(0, 3), "").replace(data.replace(data.substring(0, 3), "").substring(0,index+1), ""));
		}else if(data.replace(data.substring(0, 3), "").substring(0,5).contains("区")){
			int index1=data.replace(data.substring(0, 3), "").indexOf("区");
			row1.createCell((short) 3).setCellValue(data.replace(data.substring(0, 3), "").substring(0,index1+1));
			getCode(row1, rIndex, data.substring(0, 3),data.replace(data.substring(0, 3), "").substring(0,index1+1),getCode);
			row1.createCell((short) 4).setCellValue(data.replace(data.substring(0, 3), "").replace(data.replace(data.substring(0, 3), "").substring(0,index1+1), ""));
		}
	}

	//以“平潭”开头的，解析方式	
	private static void method_address(HSSFRow row1, int rIndex, String data,List<Code> getCode) {
		row1.createCell((short) 1).setCellValue("福建省");
		row1.createCell((short) 2).setCellValue("福州市");

		String two = data.substring(0, 2);
		row1.createCell((short) 3).setCellValue(two);
		getCode(row1, rIndex, "福州市",two,getCode);
		row1.createCell((short) 4).setCellValue(data.replace(two, ""));
	}

	//以“福建省”开头的，解析方式
	private static void method_province(HSSFRow row1, int rIndex, String data,List<Code> getCode) {
		
		String province=data.substring(0,3);
		System.out.println(data.replace(province, ""));
		String city=data.replace(province, "").substring(0,3);
		String two=data.replace(province, "").substring(0,2);
		String str2=String.valueOf(data.replace(province, "").charAt(2));
		String str3=String.valueOf(data.replace(province, "").charAt(3));
		row1.createCell((short) 1).setCellValue(province);
		
		if(city.endsWith("福州市")){
			row1.createCell((short) 2).setCellValue(city);
		
			if(data.replace(province+city, "").substring(0,5).contains("市")){
				int  index3=data.replace(province+city, "").indexOf("市");
				row1.createCell((short) 3).setCellValue(data.replace(province+city, "").substring(0, index3+1));
				getCode(row1, rIndex, city,data.replace(province+city, "").substring(0, index3+1),getCode);
				row1.createCell((short) 4).setCellValue(data.replace(province+city, "").replace(data.replace(province+city, "").substring(0, index3+1), ""));
			}else if(data.replace(province+city, "").substring(0,5).contains("区")){
				int  index4=data.replace(province+city, "").indexOf("区");
				row1.createCell((short) 3).setCellValue(data.replace(province+city, "").substring(0, index4+1));
				getCode(row1, rIndex, city,data.replace(province+city, "").substring(0, index4+1),getCode);
				row1.createCell((short) 4).setCellValue(data.replace(province+city, "").replace(data.replace(province+city, "").substring(0, index4+1), ""));
			}else if(data.replace(province+city, "").substring(0,5).contains("县")){
				int  index5=data.replace(province+city, "").indexOf("县");
				row1.createCell((short) 3).setCellValue(data.replace(province+city, "").substring(0, index5+1));
				getCode(row1, rIndex, city,data.replace(province+city, "").substring(0, index5+1),getCode);
				row1.createCell((short) 4).setCellValue(data.replace(province+city, "").replace(data.replace(province+city, "").substring(0, index5+1), ""));
			}else if(data.replace(province+city, "").substring(0,5).contains("镇")){
				int  index6=data.replace(province+city, "").indexOf("镇");
				row1.createCell((short) 3).setCellValue(data.replace(province+city, "").substring(0, index6+1));
				getCode(row1, rIndex, city,data.replace(province+city, "").substring(0, index6+1),getCode);
				row1.createCell((short) 4).setCellValue(data.replace(province+city, "").replace(data.replace(province+city, "").substring(0, index6+1), ""));
			}
		}else if(str2.equals("市")||str3.equals("市")){
			int index=data.replace(province, "").indexOf("市");
			String city1=data.replace(province, "").substring(0,index+1);
			row1.createCell((short) 2).setCellValue(city);
			if(data.replace(province+city1, "").substring(0,4).contains("区")){
				int index4=data.replace(province+city1, "").indexOf("区");
				row1.createCell((short) 3).setCellValue(data.replace(province+city1, "").substring(0, index4+1));
				getCode(row1, rIndex, city,data.replace(province+city1, "").substring(0, index4+1),getCode);
				row1.createCell((short) 4).setCellValue(data.replace(province+city1, "").replace(data.replace(province+city1, "").substring(0, index4+1), ""));
			}else if(data.replace(province+city1, "").substring(0,4).contains("道")){
				int index6=data.replace(province+city1, "").indexOf("道");
				row1.createCell((short) 3).setCellValue(data.replace(province+city1, "").substring(0, index6+1));
				getCode(row1, rIndex, city,data.replace(province+city1, "").substring(0, index6+1),getCode);
				row1.createCell((short) 4).setCellValue(data.replace(province+city1, "").replace(data.replace(province+city1, "").substring(0, index6+1), ""));
			}else if(data.replace(province+city1, "").substring(0,4).contains("县")){
				int index6=data.replace(province+city1, "").indexOf("县");
				row1.createCell((short) 3).setCellValue(data.replace(province+city1, "").substring(0, index6+1));
				getCode(row1, rIndex, city,data.replace(province+city1, "").substring(0, index6+1),getCode);
				row1.createCell((short) 4).setCellValue(data.replace(province+city1, "").replace(data.replace(province+city1, "").substring(0, index6+1), ""));
			}else if(data.replace(province+city1, "").substring(0,4).contains("市")){
				int index6=data.replace(province+city1, "").indexOf("市");
				row1.createCell((short) 3).setCellValue(data.replace(province+city1, "").substring(0, index6+1));
				getCode(row1, rIndex, city,data.replace(province+city1, "").substring(0, index6+1),getCode);
				row1.createCell((short) 4).setCellValue(data.replace(province+city1, "").replace(data.replace(province+city1, "").substring(0, index6+1), ""));
			}else if(data.replace(province+city1, "").substring(0,4).contains("镇")){
				int index6=data.replace(province+city1, "").indexOf("镇");
				row1.createCell((short) 3).setCellValue(data.replace(province+city1, "").substring(0, index6+1));
				getCode(row1, rIndex, city,data.replace(province+city1, "").substring(0, index6+1),getCode);
				row1.createCell((short) 4).setCellValue(data.replace(province+city1, "").replace(data.replace(province+city1, "").substring(0, index6+1), ""));
			}
		}else if(str2.equals("县")||str3.equals("县")){
			int index=data.replace(province, "").indexOf("县");
			String county=data.replace(province, "").substring(0,index+1);
			row1.createCell((short) 2).setCellValue("福州市");
		
			row1.createCell((short) 3).setCellValue(county);
			getCode(row1, rIndex, "福州市",county,getCode);
			row1.createCell((short) 4).setCellValue(data.replace(province+county, ""));
			
		}else if(two.equals("福州")){
			row1.createCell((short) 2).setCellValue(two);
		
			 if(data.replace(province, "").replace(two,"").contains("区")){
				 int index2=data.replace(province, "").replace(two,"").indexOf("区");
			    row1.createCell((short) 3).setCellValue( data.replace(province, "").replace(two,"").substring(0, index2+1));
				getCode(row1, rIndex, two,data.replace(province, "").replace(two,"").substring(0, index2+1),getCode);
			   row1.createCell((short) 4).setCellValue( data.replace(province, "").replace(two,"").replace( data.replace(province, "").replace(two,"").substring(0, index2+1), ""));
			 }
		}
	}

	public static void getCode(HSSFRow row1, int rIndex, String city,
			String county, List<Code> getCode) {
		/**
		 * 火炬高新区实际上是属于厦门市翔安区
		 *福州的保税区，实际上是属于福州市马尾区
		 * 
		 * 福建省福州市盖山镇江边村上道166号-1-2047（自贸试验区内）
		 * 这是福州市仓山区
		 * 
		 * 中国(福建)自由贸易试验区厦门片区象屿路97号厦门国际航运中心D栋8层03单元A之二
		 * 这是厦门市湖里区
		 * 
		 */
		
		for (Code cc : getCode) {
		  if(city.equals("龙海市")||city.contains("龙海")){
			  row1.createCell((short) 2).setCellValue(cc.getCityName());
			  row1.createCell((short) 3).setCellValue(cc.getCountyName());
			  row1.createCell((short) 6).setCellValue(cc.getCityCode());
			  row1.createCell((short) 7).setCellValue(cc.getCountyCode());
			  row1.createCell((short) 8).setCellValue("AAAAAAAAAAAAAAAAA");
			  row1.createCell((short) 9).setCellValue(cc.toString());
		  }else  if(city.equals("长乐市")||city.contains("长乐")){
			  
			  row1.createCell((short) 2).setCellValue(cc.getCityName());
			  row1.createCell((short) 3).setCellValue(cc.getCountyName());
			  row1.createCell((short) 6).setCellValue(cc.getCityCode());
			  row1.createCell((short) 7).setCellValue(cc.getCountyCode());
			  row1.createCell((short) 8).setCellValue("BBBBBBBBBBBBBB");
			  row1.createCell((short) 9).setCellValue(cc.toString());
		  }
		  
		  
		  
		}

	}

	
	/**
	 * @return  @读取文件获取省市区编码表对象
	 */
	public static List<Code> getCode() {
		List<Code> codes = new ArrayList<Code>();
		FileInputStream input;
		try {
			input = new FileInputStream(
					"C:\\Users\\Administrator\\Desktop\\fj_data\\省市区字码表.xls");
			Workbook book = new HSSFWorkbook(input);
			Sheet sheet = book.getSheetAt(0);
			for (int rowNum = 0; rowNum <= sheet.getLastRowNum(); rowNum++) {
				Row row = sheet.getRow(rowNum);
				if (row != null) {
					Code code = new Code();
					code.setCountyCode(row.getCell(0).toString());
					code.setCountyName(row.getCell(1).toString());
					code.setCityCode(row.getCell(2).toString());
					code.setCityName(row.getCell(3).toString());
					codes.add(code);
				}
			}
			return codes;
		} catch (FileNotFoundException e) {
			System.err.println("excel读取异常");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("IO异常");
			e.printStackTrace();
		}
		return null;
	}

}
