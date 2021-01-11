package com.seleniumautomation.StepDefinition;

import com.google.gson.Gson;
import com.seleniumautomation.envutils.Environment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class BaseClass {
    public static WebDriver driver=null;
    public static String currentDirectory= System.getProperty("user.dir");

    public static Gson gson = new Gson();
    public static Environment environment=null;

}
