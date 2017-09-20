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

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.javaandexcel.utils.JdbcUtil;

/**
 * @author wpf
 */
public class Fj_Data {

	public static void main(String[] args) throws SQLException {

		String file_Name = "C:\\Users\\Administrator\\Desktop\\fj_data\\福州新增小微企业数据@整理.xlsx";
		File file = new File(file_Name);
		if (file.exists()) {

			readExcel(file);

			// System.out.println("成功");

		} else {
			System.out.println("文件不存在");
		}

	}

	// 读取xls文件
	public static void readExcel(File file) throws SQLException {
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
							if (cIndex == 6) {
								data_processing(row1, rIndex, cell.toString());
							}
						}
					}
					System.out.println();
				}
			}
			try {
				FileOutputStream fout = new FileOutputStream("f:/st.xls");
				System.out.println("成功");
				book1.write(fout);
				fout.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void data_processing(HSSFRow row1, int rIndex, String data) {
		System.out.println((rIndex + 1) + ":" + data);
		row1.createCell((short) 0).setCellValue(data);
		String first_level = data.substring(0, 3);
		String third_Char1 = String.valueOf(data.charAt(2));
		String fourth_Char1 = String.valueOf(data.charAt(3));
		if (first_level.equals("福建省")) {
			System.out.println("省:" + first_level);
			row1.createCell((short) 1).setCellValue(first_level);
			String a = data.replace(first_level, "");
			// System.out.println("a"+a);
			String flage=String.valueOf(a.charAt(1));//福建省沙'县'洋坊段东侧罗布家园6幢1703室
			String third_Char = String.valueOf(a.charAt(2));
			String fourth_Char = String.valueOf(a.charAt(3));
			String two=a.substring(0, 2);
			if (third_Char.equals("市") || fourth_Char.equals("市")) {
				int index = a.indexOf("市");
				String e = a.substring(0, index + 1);
				System.out.println("市:" + e);
				row1.createCell((short) 2).setCellValue(e);

				String f = a.replace(e, "");
				// System.out.println("f："+f);

				if (f.contains("县")) {
					int index1 = data.indexOf("县");
					String e1 = f.substring(0, index + 1);
					System.out.println("县:" + e1);
					row1.createCell((short) 3).setCellValue(e1);
					System.out.println("地址:" + f.replace(e1, ""));
					row1.createCell((short) 4).setCellValue(f.replace(e1, ""));
				} else if (f.contains("区")) {
					int index1 = data.indexOf("区");
					String e1 = f.substring(0, index + 1);
					System.out.println("县:" + e1);
					System.out.println("地址:" + f.replace(e1, ""));
					row1.createCell((short) 3).setCellValue(e1);
					row1.createCell((short) 4).setCellValue(f.replace(e1, ""));

				} else if (f.contains("镇")) {
					int index1 = data.indexOf("镇");
					String e1 = f.substring(0, index + 1);
					System.out.println("县:" + e1);
					System.out.println("地址:" + f.replace(e1, ""));
					row1.createCell((short) 3).setCellValue(e1);
					row1.createCell((short) 4).setCellValue(f.replace(e1, ""));

				} else if (f.contains("道")) {
					int index1 = data.indexOf("道");
					String e1 = f.substring(0, index + 1);
					System.out.println("县:" + e1);
					System.out.println("地址:" + f.replace(e1, ""));
					row1.createCell((short) 3).setCellValue(e1);
					row1.createCell((short) 4).setCellValue(f.replace(e1, ""));

				} else {
					if (f.contains("市")) {
						int index2 = data.indexOf("市");
						String e2 = f.substring(0, index + 1);
						System.out.println("县:" + e2);
						System.out.println("地址:" + f.replace(e2, ""));
						row1.createCell((short) 3).setCellValue(e2);
						row1.createCell((short) 4).setCellValue(
								f.replace(e2, ""));
					} else {
						System.out.println("else" + f);
					}
				}
			}else if (third_Char.equals("县") || fourth_Char.equals("县")){
				
				System.out.println("市:");
				int index = a.indexOf("县");
				String e = a.substring(0, index + 1);
				System.out.println("区:" + e);
				System.out.println("地址:"+a.replace(e, ""));
				row1.createCell((short) 2).setCellValue("");
				row1.createCell((short) 3).setCellValue(e);
				row1.createCell((short) 4).setCellValue(a.replace(e, ""));
				
			}else if (flage.equals("县")){
				
				System.out.println("市:");
				int index = a.indexOf("县");
				String e = a.substring(0, index + 1);
				System.out.println("区:" + e);
				System.out.println("地址:"+a.replace(e, ""));
				row1.createCell((short) 2).setCellValue("");
				row1.createCell((short) 3).setCellValue(e);
				row1.createCell((short) 4).setCellValue(a.replace(e, ""));
				
			}else if(two.equals("福州")){
				System.out.println("市:"+two);
				String a1=data.replace(first_level, "").replace(two,"");
				if(a1.contains("区")){
					int index2 = a1.indexOf("区");
					String e2 = a1.substring(0, index2 + 1);
					System.out.println("县:" + e2);
					System.out.println(a1.replace(e2, ""));
					
					row1.createCell((short) 1).setCellValue(first_level);
					row1.createCell((short) 2).setCellValue(two);
					row1.createCell((short) 3).setCellValue(e2);
					row1.createCell((short) 4).setCellValue(a1.replace(e2, ""));

				}
			}
		} else if (third_Char1.equals("县") || fourth_Char1.equals("县")) {
			System.out.println("省:" + "福建省");
			System.out.println("市:");
			int index = data.indexOf("县");
			String e = data.substring(0, index + 1);
			System.out.println("区:" + e);
			System.out.println(data.replace(e, ""));
			row1.createCell((short) 1).setCellValue("福建省");
			row1.createCell((short) 2).setCellValue("");
			row1.createCell((short) 3).setCellValue(e);
			row1.createCell((short) 4).setCellValue(data.replace(e, ""));

		} else {
			if (data.contains("市")) {
				System.out.println("省：" + "福建省");
				row1.createCell((short) 1).setCellValue("福建省");
				int index = data.indexOf("市");
				String e = data.substring(0, index + 1);
				System.out.println("市:" + e);
				row1.createCell((short) 2).setCellValue(e);
				String e1 = data.replace(e, "");
				if (e1.contains("区")) {
					int index1 = e1.indexOf("区");
					String e6 = e1.substring(0, index1 + 1);
					System.out.println("县:" + e6);
					System.out.println("住址:" + e1.replace(e6, ""));
					row1.createCell((short) 3).setCellValue(e6);
					row1.createCell((short) 4).setCellValue(e1.replace(e6, ""));
				}else if (e1.contains("镇")) {
			
				    int index4=e1.indexOf("镇");
				    String e5 = e1.substring(0, index4 + 1);
					System.out.println("县:" + e5);
					System.out.println("地址:"+e1.replace(e5, ""));
					row1.createCell((short) 3).setCellValue(e5);
					row1.createCell((short) 4).setCellValue(e1.replace(e5, ""));
				}
				else if (e1.contains("街")) {
					
				    int index4=e1.indexOf("街");
				    String e5 = e1.substring(0, index4 + 1);
					System.out.println("县:" + e5);
					System.out.println("地址:"+e1.replace(e5, ""));
					row1.createCell((short) 3).setCellValue(e5);
					row1.createCell((short) 4).setCellValue(e1.replace(e5, ""));
				}

			} else if (data.contains("区")) {
				System.out.println("省：" + "福建省");
				System.out.println("市:");
				row1.createCell((short) 1).setCellValue("福建省");
				row1.createCell((short) 2).setCellValue("");
				int index = data.indexOf("区");
				String e = data.substring(0, index + 1);
				System.out.println("县1:" + e);
				System.out.println("住址:" + data.replace(e, ""));
				row1.createCell((short) 3).setCellValue(e);
				row1.createCell((short) 4).setCellValue(data.replace(e, ""));
			}

		}
	}

}
