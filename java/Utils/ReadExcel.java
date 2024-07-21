package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readExcel(String fileName) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook workbook=new XSSFWorkbook("./Data/"+fileName+".xlsx");
		XSSFSheet worksheet=workbook.getSheetAt(0);
		int rowCount=worksheet.getLastRowNum();
		System.out.println(rowCount);
		short colCount=worksheet.getRow(0).getLastCellNum();
		String[][] data=new String[rowCount][colCount];
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				String stringCellValue = worksheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;
				
			}
		}
		workbook.close();
		return data;
		
		

	}

}
