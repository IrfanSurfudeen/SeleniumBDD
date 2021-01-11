package com.seleniumautomation.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookPageObjects2 {

    @FindBy(xpath="//input[@id='email']")
    WebElement emailid;

    @FindBy(xpath="//input[@id='pass']")
    WebElement pass;

    @FindBy(xpath="//button[@name='login']")
    WebElement login;

//    public static String loginpage_txtusername="//input[@id='email']";
//    public static String loginpage_txtpassword="//input[@id='pass']";
//    public static String loginpage_btnlogin="//button[@name='login']";
}
