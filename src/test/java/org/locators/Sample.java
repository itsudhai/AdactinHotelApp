package org.locators;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.functionallib.Baseclass;

public class Sample extends Baseclass {

	public static void main(String[] args) throws IOException {

		chromeBrower();
		launchJseUrl("http://adactinhotelapp.com/");
		maxWindow();
		LoginPage lp = new LoginPage();

		lp.getTxtUser().sendKeys("daniel001");
		lp.getTxtPassword().sendKeys("temp001");
		lp.getBtnLogin().click();

		File f = new File(".\\src\\test\\resources\\Excel\\TestData.xlsx");

		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet1");

		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row row = sh.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if (cellType == 1) {
					String data = cell.getStringCellValue();
				} else if (DateUtil.isCellDateFormatted(cell)) {
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
					Date dd = cell.getDateCellValue();
					String data = sdf.format(dd);
				} else {
					double d = cell.getNumericCellValue();
					long l = (long) d;
					String data = String.valueOf(l);
				}

			}

		}

	}

}
