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
public class Excel2007 {

	public static void main(String[] args) throws SQLException {

		String file_Name = "C:\\Users\\Administrator\\Desktop\\wpf联通数据\\联通数据\\福州新增小微企业数据@整理.xlsx";
		File file = new File(file_Name);
		if (file.exists()) {

			// 提示：杀死多余的同mysql自启进程
			Connection conn = JdbcUtil.getconnection();
			Statement st = conn.createStatement();
			readExcel(file, st);

			System.out.println("成功");

		} else {
			System.out.println("文件不存在");
		}

	}

	// 读取xls文件
	public static void readExcel(File file, final Statement st)
			throws SQLException {
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
			Sheet sheet = wb.getSheetAt(0);// 第一个工作表
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
						StringBuffer buffer = new StringBuffer();
						if (cell != null) {
							if (cIndex == 6) {
								buffer.append(cell.toString());

								System.out.println(rIndex + 1
										+ buffer.toString());
								String first_Char = String.valueOf(buffer
										.toString().charAt(0));
								// 判断首字符是否是‘福’
								if (first_Char.equals("福")) {
									String fisrt_level = buffer.toString()
											.substring(0, 3);
									if (fisrt_level.equals("福建省")) {

										System.out.println("第一级别:"
												+ fisrt_level);
										String result1 = buffer.toString()
												.replace(fisrt_level, "");
										String second_level = result1
												.substring(0, 3);
										System.out.println("第二级:"
												+ second_level);
										String result2 = result1.replace(
												second_level, "");
										judgeAddress(result2, row1);
									} else {
										System.out.println("第一级别:‘" + "福建省’");
										System.out.println("第二级别:"
												+ fisrt_level);
										String re = buffer.toString().replace(
												fisrt_level, "");
										judgeAddress(re, row1);
									}
								} else {
									System.out.println(buffer.toString()
											+ "===========");
									System.out.println("第一级：‘" + "福建省’");
									System.out.println("第二级：‘" + "福州市’");
									if (buffer.toString().contains("县")) {
										int index = buffer.toString().indexOf(
												"县");// lastIndexof最后个字符，indexof是第一个字符
										String last_result = buffer.toString()
												.substring(index + 1);// 取出关键字后的部分
										System.out.println("第三级："
												+ buffer.toString().replace(
														last_result, ""));
										row1.createCell((short) 3)
												.setCellValue(last_result);

										System.out
												.println("第四级:" + last_result);
									} else {
										System.out.println("第三级:"
												+ buffer.toString().substring(
														0, 2));
										row1.createCell((short) 3)
												.setCellValue(
														buffer.toString()
																.replace(
																		buffer.toString()
																				.substring(
																						0,
																						2),
																		""));

										System.out
												.println("第四级："
														+ buffer.toString()
																.replace(
																		buffer.toString()
																				.substring(
																						0,
																						2),
																		""));
									}
								}
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

	private static void judgeAddress(String second_level, HSSFRow row1) {
		/**
		 * 利用if(){}else if(){}做关键字的优先级判断
		 */


		String third = String.valueOf(second_level.charAt(2));
		String fourth = String.valueOf(second_level.charAt(3));

		System.out.println(third);
		System.out.println(fourth);

		if (third.equals("市") || fourth.equals("市")) {

			int index = second_level.indexOf("市");
			String last_result = second_level.substring(index + 1);

			System.out.println(second_level.replace(last_result, ""));

		} else if (third.equals("镇") || fourth.equals("镇")) {

			int index = second_level.indexOf("镇");
			String last_result = second_level.substring(index + 1);

			System.out.println(second_level.replace(last_result, ""));

		} else if (third.equals("道") || fourth.equals("道")) {

			int index = second_level.indexOf("道");
			String last_result = second_level.substring(index + 1);

			System.out.println(second_level.replace(last_result, ""));

		} else if (third.equals("乡") || fourth.equals("乡")) {

			int index = second_level.indexOf("乡");
			String last_result = second_level.substring(index + 1);

			System.out.println(second_level.replace(last_result, ""));

		} else {
			if (second_level.contains("县")) {
				int index = second_level.indexOf("县");
				showData(second_level, index, row1);
			} else if (second_level.contains("区")) {
				int index = second_level.indexOf("区");
				showData(second_level, index, row1);
			} else if (second_level.contains("镇")) {
				int index = second_level.indexOf("镇");
				showData(second_level, index, row1);
			} else if (second_level.contains("道")) {
				int index = second_level.indexOf("道");
				showData(second_level, index, row1);
			} else if (second_level.contains("街")) {
				int index = second_level.indexOf("街");
				showData(second_level, index, row1);
			} else if (second_level.contains("乡")) {
				int index = second_level.indexOf("乡");
				showData(second_level, index, row1);
			} else if (second_level.contains("苑")) {
				int index = second_level.indexOf("苑");
				showData(second_level, index, row1);
			} else {// 不包含
				System.out.println(second_level + "~~~~~~~~~~~~~~~~");
			}

		}

		// System.out.println(third);
		// if(third.equals("市")||fourth.equals("市")){
		// int index = second_level.indexOf("市");
		// showData(second_level, index, row1);
		// }else{
		//
		//
		// if (second_level.contains("d")) {
		// int index = second_level.indexOf("d");//
		// lastIndexof最后个字符，indexof是第一个字符
		// showData(second_level, index, row1);
		//
		// } else if (second_level.contains("县")) {
		// int index = second_level.indexOf("县");
		// showData(second_level, index, row1);
		// }else if (second_level.contains("区")) {
		// int index = second_level.indexOf("区");
		// showData(second_level, index, row1);
		// } else if (second_level.contains("镇")) {
		// int index = second_level.indexOf("镇");
		// showData(second_level, index, row1);
		// } else if (second_level.contains("道")) {
		// int index = second_level.indexOf("道");
		// showData(second_level, index, row1);
		// } else if (second_level.contains("街")) {
		// int index = second_level.indexOf("街");
		// showData(second_level, index, row1);
		// }
		// else if (second_level.contains("苑")) {
		// int index = second_level.indexOf("苑");
		// showData(second_level, index, row1);
		// } else {// 不包含
		// System.out.println(second_level+"~~~~~~~~~~~~~~~~");
		// }
		//
		// }
	}

	public static void showData(String second_level, int index, Row row1) {
		String last_result = second_level.substring(index + 1);// 取出关键字后的部分
	//	System.out.println("第三级：" + second_level.replace(last_result, ""));

		last_Cut(last_result, row1);

		// System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	public static void last_Cut(String result, Row row1) {

		if (result.contains("路")) {
			int index = result.indexOf("路");

			String fourth_level = result.substring(0, index + 1);
			System.out.println("第四级:" + fourth_level);

			row1.createCell((short) 3).setCellValue(fourth_level);

		} else if (result.contains("道")) {
			int index = result.indexOf("道");
			String fourth_level = result.substring(0, index + 1);
			System.out.println("第四级:" + fourth_level);
			row1.createCell((short) 3).setCellValue(fourth_level);

		} else if (result.contains("村")) {
			int index = result.indexOf("村");
			String fourth_level = result.substring(0, index + 1);
			System.out.println("第四级:" + fourth_level);
			row1.createCell((short) 3).setCellValue(fourth_level);

		} else if (result.contains("园")) {
			int index = result.indexOf("园");
			String fourth_level = result.substring(0, index + 1);
			System.out.println("第四级:" + fourth_level);
			row1.createCell((short) 3).setCellValue(fourth_level);
		} else {

			System.out.println("第四级:" + result);
			row1.createCell((short) 3).setCellValue(result);
		}

	}

}
