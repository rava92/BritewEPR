package com.components;


import com.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait  wait;



    @BeforeMethod
    public void tearDown() {
        //INITIALIZE THE WEBDRIVER OBJECT IN TEST BASE CLASS USING THE DRIVER UTILITY
        driver = Driver.get() ;

        //SETTING IMPLICIT WAIT -->WHEN ELEMENTS NOT FOUND , IT WILL KEEP TRYING TO FIND IT  FOR 10 SECONDS
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        //SET UP THE EXPLICIT WAIT OBJECT.
        wait = new WebDriverWait(driver,10);

        //ACTIONS CLASS ENABLE ADVANCED INTERACTIONS LIKE DOUBLE CLICK, DRAG DROP...
        actions = new Actions(driver);

    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        Driver.closeDriver();
    }
}