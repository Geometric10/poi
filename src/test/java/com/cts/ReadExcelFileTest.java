package com.cts;

import java.util.List;

import org.junit.Test;

public class ReadExcelFileTest {
	@Test
	public void readExcelDataTest(){
		 String workingDir=null;
			workingDir = System.getProperty("user.dir");
			workingDir=workingDir+"\\src\\main\\resources\\Book.xlsx";
			List<RevenueBean> list = ReadExcelFile.readExcelData(workingDir);
	}

}
