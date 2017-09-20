package com.javaandexcel;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @author wpf
 * 
 * @excel   用exce输出数据
 */
public class OutPutExcelTest {

	public static void main(String[] args) {

		HSSFWorkbook book = new HSSFWorkbook();
		HSSFSheet sheet = book.createSheet("测试");

		HSSFRow row = sheet.createRow((int) 0);
		book.createCellStyle().setAlignment(HSSFCellStyle.ALIGN_CENTER);
//		row.createCell((short) 0).setCellValue("区");
//		row.createCell((short) 1).setCellValue("局");
//		row.createCell((short) 2).setCellValue("企业名称");
//		row.createCell((short) 3).setCellValue("城市");
//		row.createCell((short) 4).setCellValue("注册号");
//		row.createCell((short) 5).setCellValue("成立日期");
//		row.createCell((short) 6).setCellValue("注册资金");
//		row.createCell((short) 7).setCellValue("企业类型");
//		row.createCell((short) 8).setCellValue("企业状态");
//		row.createCell((short) 9).setCellValue("登记机关");
//		row.createCell((short) 10).setCellValue("行业名称");
//		row.createCell((short) 11).setCellValue("法人");
//		row.createCell((short) 12).setCellValue("联系方式");
//		row.createCell((short) 13).setCellValue("地址");

		for (int i = 1; i < 5; i++) {
			row = sheet.createRow((int) i);
			row.createCell((short) 2).setCellValue("北京道隆华尔软件有限公司");
			row.createCell((short) 3).setCellValue("北京");
			row.createCell((short) 5).setCellValue("1000001");
			row.createCell((short) 6).setCellValue("2016/11/8");
			row.createCell((short) 7).setCellValue("1000w");
			row.createCell((short) 8).setCellValue("软件、金融");
			row.createCell((short) 9).setCellValue("营业中");
			row.createCell((short) 10).setCellValue("海淀区工商局");
			row.createCell((short) 11).setCellValue("软件，验收");
			row.createCell((short) 11).setCellValue("王朋飞");
			row.createCell((short) 12).setCellValue("18310615134");
			row.createCell((short) 13).setCellValue("首钢国际大厦58号");
		}

		try {
			FileOutputStream fout = new FileOutputStream("f:/st.xls");
			System.out.println("成功");
			book.write(fout);
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
