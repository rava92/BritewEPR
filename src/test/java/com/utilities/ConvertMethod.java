package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ConvertMethod {


    public static int date(String str) {

        int i = Integer.parseInt(str.substring(0, str.indexOf(" ")).replace(":", ""));
        return i ;

    }

    public static double numDouble(String str){
        double i = Double.parseDouble(str.replace(",",""));
        return i;
    }
}