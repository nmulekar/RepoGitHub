package com.jbk.qa.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.jbk.qa.Base.BaseClass;

public class TestUtil extends BaseClass {

	public static long Page_Load_TimeOut = 10;
	public static long Implicite_Wait = 10;

	static Workbook book;
	static Sheet sheet;

	public static String SheetPath = "C:\\Users\\hp\\Desktop\\Homepage.xls";

	public static Object[][] getTestData(String sheetname) {

		FileInputStream file = null;
		try {
			file = new FileInputStream(SheetPath);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {

			book = WorkbookFactory.create(file);

		} catch (InvalidFormatException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}

		sheet = (Sheet) book.getSheet(sheetname);

		int row = sheet.getLastRowNum();

		int col = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[row][col];

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();

			}

		}

		return data;

	}

}
