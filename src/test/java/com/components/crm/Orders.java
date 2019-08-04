package com.components.crm;

import com.components.TestBase;
import com.pages.CRMPage;
import com.pages.LoginPage;
import com.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Orders extends TestBase {

    @BeforeMethod
    public void setUp(){

        LoginPage loginPage  = new LoginPage();
        driver.get(ConfigurationReader.get("url"));
        String user = ConfigurationReader.get("user_username");
        String password = ConfigurationReader.get("user_password");
       loginPage.login(user,password);


    }
    @Test
    public void test1(){
        CRMPage crmPage = new CRMPage();
        UsefulMethods.lists(crmPage.listOfModules,"CRM");
        VerificationUtilis.waitForUIOverlay();
        driver.findElement(By.xpath("//button[@accesskey='l']")).click();
        VerificationUtilis.waitForUIOverlay();
        double specificPriceFromListTable = ConvertMethod.numDouble(crmPage.SpecificTotalPriceOfPerson("Oracle"));
        driver.findElement(By.xpath("//button[@aria-label='pivot']")).click();
        BrowserUtils.waitFor(3);
        driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Opportunity')]")).click();
        double piplinePrice = ConvertMethod.numDouble(crmPage.PiplineList("Oracle"));
        Assert.assertEquals(specificPriceFromListTable,piplinePrice);

    }
    @Test
    public void test2(){
        CRMPage crmPage = new CRMPage();
        UsefulMethods.lists(crmPage.listOfModules,"CRM");
        driver.findElement(By.xpath("//button[@aria-label='pivot']")).click();
        BrowserUtils.waitFor(3);
        driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Opportunity')]")).click();
        double PiplineTotalPrice = ConvertMethod.numDouble(crmPage.PiplineList("Total"));
        BrowserUtils.waitFor(3);
        List<WebElement>list = driver.findElements(By.xpath("//table[contains(@class,'table-hover')]/tbody/tr/td[2]"));
        List<Double>list2 =new ArrayList<>();

        for (WebElement webElement : list) {
            list2.add(ConvertMethod.numDouble(webElement.getText()));
        }
        double expected=0;
        for (int i = 0; i < list2.size(); i++) {
             if(list2.get(i)!=PiplineTotalPrice){
                 expected +=list2.get(i);
             }
        }
        Assert.assertEquals(PiplineTotalPrice,expected);

        System.out.println("Ravas code done");
    }
}
