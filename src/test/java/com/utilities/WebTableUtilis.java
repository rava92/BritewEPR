package com.utilities;

import com.components.TestBase;
import com.pages.CRMPage;
import com.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTableUtilis extends TestBase {

    public static List<WebElement> headers(){
        CRMPage crmPage = new CRMPage();
        List<WebElement> list=crmPage.listOfModules;
       return list;

    }

public static List<WebElement>tableRows(){
   CRMPage crmPage = new CRMPage();
    List<WebElement>list = crmPage.tableRows;
        return list;

}
////table[contains(@class,'table')]//td[contains(text(),'Rava')]/../td[9]


public static WebElement columns(String row,String col ){
int indexCol =0;

    for (int i = 0; i < headers().size(); i++) {
         if(headers().get(i).getText().contains(col)){
             indexCol = i;
             break;
         }

    }

int indexRow=0;
    for (int l = 0; l < tableRows().size(); l++) {
         if(tableRows().get(l).getText().equals(row)){
             indexRow = l;
             break;
         }

    }

  String element= "//table[contains(@class,'table')]//td[contains(text(),'"+indexRow+"')]/../td["+indexCol+"]";

WebElement element1 = Driver.get().findElement(By.xpath(element));

    return element1;
}



public static String uu(String name,String col){
    String element= "//table[contains(@class,'table')]//td[contains(text(),'"+name+"')]/../td["+col+"]";
        return element;
}









}
