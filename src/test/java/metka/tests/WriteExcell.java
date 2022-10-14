package metka.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcell {


    String path="SampleData.xlsx";
    XSSFWorkbook xssfWorkbook;
    XSSFSheet xssfSheet;
    @Test
    public void excel_Write() throws IOException {

        FileInputStream fileInputStream=new FileInputStream(path);
        xssfWorkbook=new XSSFWorkbook(fileInputStream);
        xssfSheet=xssfWorkbook.getSheet("Employees");

        XSSFCell salaryCell=xssfSheet.getRow(0).createCell(3);
        salaryCell.setCellValue("Salary");

        XSSFCell salary1=xssfSheet.getRow(1).createCell(3);
        salary1.setCellValue(200000);

        XSSFCell salary2=xssfSheet.getRow(2).createCell(3);
        salary2.setCellValue(300000);

        XSSFCell salary3=xssfSheet.getRow(3).createCell(3);
        salary3.setCellValue(2400000);

        XSSFCell salary4=xssfSheet.getRow(4).createCell(3);
        salary4.setCellValue(12300000);


        //TODO: change mary's last name

        for (int row=0;row< xssfSheet.getLastRowNum();row++){

                if(xssfSheet.getRow(row).getCell(0).toString().equals("Mary")){
                    xssfSheet.getRow(row).getCell(1).setCellValue("Jones");
                }
        }
        //open to write to the file :FileInputStream-->reading
        // save changes: -->FileOutputStream-->Writing
        FileOutputStream outputStream=new FileOutputStream(path);

        //save/write changes to the workbook
        xssfWorkbook.write(outputStream);

        //close all

        outputStream.close();
        xssfWorkbook.close();
        fileInputStream.close();



    }



}

