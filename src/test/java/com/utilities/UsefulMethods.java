package com.utilities;

import org.openqa.selenium.WebElement;

import java.util.List;

public class UsefulMethods {
    public static void lists(List<WebElement>lists,String str){
        for (int i = 0; i < lists.size(); i++) {
             if(lists.get(i).getText().equals(str)){
                 lists.get(i).click();
             }

        }
    }
}
