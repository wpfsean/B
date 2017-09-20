package com.javaandexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.javaandexcel.bean.Code;

/**
 * @author wpf 2016年11月18日 下午4:07:15
 */
public class Test {

	public static void main(String[] args) {

		
		
		System.out.println(getCode().toString());

	}

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
