package metka.tests;

import io.cucumber.java.After;
import metka.pages.VtTrackDashboardPage;
import metka.pages.VyTrackLoginPage;
import metka.utilities.BrowserUtils;
import metka.utilities.ConfigurationReader;
import metka.utilities.Driver;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class VyTrackLoginDDTTest {
    VyTrackLoginPage vyTrackLoginPage=new VyTrackLoginPage();
    VtTrackDashboardPage vtTrackDashboardPage=new VtTrackDashboardPage();

    @Before
    public void SetupMethod(){
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
    }

    @After
    public void tearDown(){

        Driver.closeDriver();
    }

    @Test
    public void loginDDTTest() throws IOException {

    String filePath="VyTrackQa2Users.xlsx";
        FileInputStream in=new FileInputStream(filePath);

        XSSFWorkbook workbook=new XSSFWorkbook(in);
        XSSFSheet sheet=workbook.getSheet("data");

        for(int i=1;i<= sheet.getLastRowNum();i++){

            String userName=sheet.getRow(i).getCell(0).toString();
            String password=sheet.getRow(i).getCell(1).toString();
            String firstName=sheet.getRow(i).getCell(2).toString();
            String lastName=sheet.getRow(i).getCell(3).toString();
           vyTrackLoginPage.login(userName,password);
//            WebDriverWait wait=new WebDriverWait(Driver.getDriver(),5);
//            wait.until(ExpectedConditions.visibilityOf(vtTrackDashboardPage.profileMenu));
            BrowserUtils.sleep(4);
            String actualProfileMenu=vtTrackDashboardPage.profileMenu.getText();

            XSSFCell resultCell=sheet.getRow(i).getCell(4);

            if(actualProfileMenu.contains(firstName)||actualProfileMenu.contains(password)){

                System.out.println("pass");
                resultCell.setCellValue("pass");
            }else{
                System.out.println("fail");
                resultCell.setCellValue("fail");
            }
            vtTrackDashboardPage.logOut();

        }
        FileOutputStream out=new FileOutputStream(filePath);
        workbook.write(out);
        in.close();
        out.close();
        workbook.close();

    }



}
