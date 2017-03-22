package com.cjl.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileTest {
	
	public static void main(String[] args) {
		String filename = "/Users/chenjinliang/Desktop/商户基本信息.xlsx";
		try {
			dealMerFile(new File(filename));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static boolean dealMerFile(File file) throws FileNotFoundException, IOException {
		XSSFWorkbook xwb = new XSSFWorkbook(new FileInputStream(file));
		// 读取第一章表格内容
		XSSFSheet sheet = xwb.getSheetAt(0);
		// 定义 row、cell
		XSSFRow row;
		String cell;
		// 循环输出表格中的内容
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			row = sheet.getRow(i);
			for (int j = row.getFirstCellNum(); j < 33; j++) {
				// 通过 row.getCell(j).toString() 获取单元格内容，
//				System.out.print(j);
				if (row.getCell(j)==null) {
					cell = "@@@";
				}else
					cell = row.getCell(j).toString();

				System.out.print(cell + "\t");

			}

			System.out.println("");

		}

		return true;
	}
}
