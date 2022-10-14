package metka.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {




    @Test
    public void read_from_excel_file() throws IOException {

        String path="SampleData.xlsx";

        //to read from excell we need to load it to FileInputStream

        FileInputStream fileInputStream=new FileInputStream(path);

        //workbook>sheet>row>cell

        //#1 create a workbook
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);

        //#2 create a sheet ,we need to get specific sheet from the currently opened workbook

        XSSFSheet sheet=workbook.getSheet("Employees");
        //select row and cell
        //printout mary s cell
        //indexes start from zero

        System.out.println(sheet.getRow(1).getCell(0));

        //print out developer
        System.out.println(sheet.getRow(3).getCell(2));

        //return the count of used cells only(if the cell is empty it does not count it)
        //starts counting from 1
        int usedRows=sheet.getPhysicalNumberOfRows();

        System.out.println(usedRows);

        //Returns the number from top cell to the bottom cell
        //it does not care if the cell is empty or not
        //starts counting from zero
        int lastUsedRow=sheet.getLastRowNum();
        System.out.println(lastUsedRow);

        //TODO: Create a logic to prints Vinod's name

        for(int row=0;row<usedRows;row++){

            if(sheet.getRow(row).getCell(0).toString().equals("Vinod")){

                System.out.println(sheet.getRow(row).getCell(0));
            }

        }
        //TODO: Create a logic to prints Linda's job_id

        for (int rowNum=0;rowNum<usedRows;rowNum++){

            if(sheet.getRow(rowNum).getCell(0).toString().equals("Linda")){
                System.out.println("Lindas job id is "+sheet.getRow(rowNum).getCell(2));
            }


        }


    }


}
