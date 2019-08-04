package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CRMPage {

    public CRMPage(){
        PageFactory.initElements(Driver.get(),this);

        }

    @FindBy(xpath = "//ul[contains(@class,'navbar-left')]/li")
    public List<WebElement> listOfModules;


    @FindBy(xpath = "//table[contains(@class,'table')]//th")
    public List<WebElement> headersList;

    @FindBy(xpath = "//table[contains(@class,'table')]//tbody/tr")
    public List<WebElement> tableRows;


    @FindBy(xpath = "//button[@data-original-title='Pivot']")
    public WebElement pivot;


     @FindBy(xpath = "//table/tbody/tr[]/td[9]")
    public WebElement SpecificRevenuePrice;

     @FindBy(xpath = "//table[contains(@class,'table')]//tbody/tr/td[3]")
     public List<WebElement> specificNameOfColumns;



     public String SpecificTotalPriceOfPerson(String tab){
      String xpath = "//table[contains(@class,'table-condensed table-striped')]/tbody//td[contains(text(),'"+tab+"')]/../td[9]";
         return Driver.get().findElement(By.xpath(xpath)).getText();



     }

      public String PiplineList(String tab){

         String xpath = "//table/tbody/tr/td[contains(text(),'"+tab+"')]/../td[2]";
         return Driver.get().findElement(By.xpath(xpath)).getText();
     }


}
