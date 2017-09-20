package com.javaandexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.javaandexcel.bean.Code;
import com.javaandexcel.utils.JdbcUtil;

/**
 * @读取excel文件数据
 * 
 *   读取excel 数据写入到数据库
 * @author wpf 2016年11月8日
 */
public class DbAndExcel {

	public static void main(String[] args) throws UnsupportedEncodingException {

		List<Code> codes = getCode();

	}

	public static List<Code> getCode() {
		List<Code> codes = new ArrayList<Code>();
		Statement st=null;
		Connection con = JdbcUtil.getconnection();
		try {
			 st = con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		FileInputStream input;
		try {
			input = new FileInputStream(
					"C:\\Users\\Administrator\\Desktop\\fj_data\\道隆 福建省 数据推送3.xls");
			Workbook book = new HSSFWorkbook(input);
			Sheet sheet = book.getSheetAt(0);
			for (int rowNum = 0; rowNum <= sheet.getLastRowNum(); rowNum++) {
				Row row = sheet.getRow(rowNum);
				if (row != null) {

				//	System.out.println(rowNum+"/////////"+row.getCell(25).toString());
					
				String	sql = "insert into t_basic ("
						+ "c_entname,"
						+ "c_frname,"
						+ "c_regno,"
						+ "c_oriregno,"
						+ "c_regcap,"
						+ "c_reccap,"
						+ "c_regcapcur,"
						+ "c_esdate,"
						+ "c_opfrom,"
						+ "c_opto,"
						+ "c_enttype,"
						+ "c_entstatus,"
						+ "c_dom,"
						+ "c_abuitem,"
						+ "c_cbuitem,"
						+ "c_opscope,"
						+ "c_opscoAndFrom,"
						+ "c_regorg,"
						+ "c_regorgcode,"
						+ "c_tel,"
						+ "c_province,"
						+ "c_city,"
						+ "c_district,"
						+ "c_ppid,"
						+ "c_pid,"
						+ "c_id)"
						+ " values("+"'"+
				         row.getCell(0).toString()+"',"+
				         "'"+row.getCell(1).toString()+"',"+
				         "'"+row.getCell(2).toString()+"',"+
				         "'"+row.getCell(3).toString()+"',"+
				         "'"+row.getCell(4).toString()+"',"+
				         "'"+row.getCell(5).toString()+"',"+
				         "'"+row.getCell(6).toString()+"',"+
				         "'"+row.getCell(7).toString()+"',"+
				         "'"+row.getCell(8).toString()+"',"+
				         "'"+row.getCell(9).toString()+"',"+
				         "'"+row.getCell(10).toString()+"',"+
				         "'"+row.getCell(11).toString()+"',"+
				         "'"	+row.getCell(12).toString()+"',"+
				         "'"+row.getCell(13).toString()+"',"+
				         "'"+row.getCell(14).toString()+"',"+
				         "'"+row.getCell(15).toString()+"',"+
				         "'"+row.getCell(16).toString()+"',"+
				         "'"	+row.getCell(17).toString()+"',"+
				         "'"	+row.getCell(18).toString()+"',"+
				         "'"+row.getCell(19).toString()+"',"+
				         "'"+row.getCell(20).toString()+"',"+
						  "'"+row.getCell(21).toString()+"',"+
						  "'"+row.getCell(22).toString()+"',"+
						  "'"+row.getCell(23).toString()+"',"+
						  "'"+row.getCell(24).toString()+"',"+
						  "'"	+row.getCell(25).toString()+"'"+
						")";
				
				//System.out.println(sql);	
				try {
					st.execute(sql);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				
				System.out.println("success");
				
				
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
