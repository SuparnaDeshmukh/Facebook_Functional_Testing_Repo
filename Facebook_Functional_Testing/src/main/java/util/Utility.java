package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility {
	public static String getDataFromExcelSheet(String sheetName, int rowNo, int cellNo)
			throws EncryptedDocumentException, IOException {
		String path = "C:\\Users\\Admin\\Desktop\\Book1.xlsx";

		String result;

		FileInputStream file = new FileInputStream(path);

		Cell cell = WorkbookFactory.create(file).getSheet("sheetName").getRow(rowNo).getCell(cellNo);

		try {
			result = cell.getStringCellValue();
			System.out.println(result);
		} catch (IllegalStateException i) {
			double result1 = cell.getNumericCellValue();
			// now we need to convert this double in to string so we will use
			result = String.valueOf(result1);
			System.out.println(result);

		}

		return result;

	}
}
