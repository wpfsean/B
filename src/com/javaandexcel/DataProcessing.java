package com.javaandexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
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

/**
 * @author wpf
 */
public class DataProcessing {

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
		String str3 = String.valueOf(data.charAt(2));
		String str4 = String.valueOf(data.charAt(3));
		String two = data.substring(0, 2);
		String three = data.substring(0, 3);
    if(three.equals("福建省")){
    	method_fujiansheng( row1,  rIndex,  data, getCode,three);
    	
    }else if(two.equals("厦门")){
    	row1.createCell((short) 1).setCellValue("福建省");
    	row1.createCell((short) 2).setCellValue("厦门市");
    }else if(two.equals("福州")){
    	row1.createCell((short) 1).setCellValue("福建省");
    	row1.createCell((short) 2).setCellValue("福州市");
    }else if(String.valueOf(data.charAt(0)).equals("漳")){
    	row1.createCell((short) 1).setCellValue("福建省");
    	row1.createCell((short) 2).setCellValue("漳州市");
    }	
		
		

	}
	
	

	//以“福建省”，"平潭”
	private static void method_fujiansheng(HSSFRow row1, int rIndex,
			String data, List<Code> getCode, String three) {
		  String two=data.substring(0,2);
		
			if(three.equals("福建省")){
				row1.createCell((short) 1).setCellValue(three);
				String last=data.replace(three, "");
                String three1=last.substring(0, 3);
                String two1=last.substring(0,2);
                if(three1.equals("福州市")){
                	row1.createCell((short) 2).setCellValue(three1);
                }else if(two1.equals("福州")){
                	row1.createCell((short) 2).setCellValue(two1);
                }else if(three1.equals("长乐市")){
                	row1.createCell((short) 2).setCellValue("福州市");
                	row1.createCell((short) 3).setCellValue("长乐市");
                }else if(three1.equals("龙海市")){
                	row1.createCell((short) 2).setCellValue("漳州市");
                	row1.createCell((short) 3).setCellValue("龙海市");
                }else if(three1.equals("泉州市")){
                	row1.createCell((short) 2).setCellValue("泉州市");
                }else if(three1.equals("龙岩市")){
                	row1.createCell((short) 2).setCellValue("龙岩市");
                }else if(three1.equals("宁德市")){
                	row1.createCell((short) 2).setCellValue("宁德市");
                }else if(two1.equals("平潭")){
                	row1.createCell((short) 2).setCellValue("福州市");
                	row1.createCell((short) 3).setCellValue("平潭县");
                }else if(three1.equals("平潭县")){
                	row1.createCell((short) 2).setCellValue("福州市");
                	row1.createCell((short) 3).setCellValue("平潭县");
                } else if(three1.equals("南平市")){
                	row1.createCell((short) 1).setCellValue("南平市");
                }else if(three1.equals("漳州市")){
                	row1.createCell((short) 1).setCellValue("漳州市");
                }else if(three1.equals("三明市")){
                	row1.createCell((short) 1).setCellValue("三明市");
                }
				
		}else if(three.equals("建瓯市")){
        	row1.createCell((short) 2).setCellValue("南平市");
        	row1.createCell((short) 3).setCellValue("建瓯市");
        }else if(three.equals("龙海市")){
        	row1.createCell((short) 2).setCellValue("漳州市");
        	row1.createCell((short) 3).setCellValue("龙海市");
        }else if(two.equals("平潭")){
        	row1.createCell((short) 2).setCellValue("福州市");
        	row1.createCell((short) 2).setCellValue("平潭县");
        }else if(three.equals("平潭县")){
        	row1.createCell((short) 2).setCellValue("福州市");
        	row1.createCell((short) 2).setCellValue("平潭县");
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
					code.setProvinceCode(row.getCell(4).toString());
					code.setProvinceCode(row.getCell(3).toString());
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
