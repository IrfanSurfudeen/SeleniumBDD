package com.seleniumautomation.StepDefinition;

import com.google.gson.Gson;
import com.seleniumautomation.StepDefinition.BaseClass;
import com.seleniumautomation.envutils.Environment;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Hooks extends BaseClass {

    public BaseClass baseClass;
    public Hooks(BaseClass baseClass){
        this.baseClass =baseClass;
    }
    @Before
    public void initdriver() {
        String envFilePath = currentDirectory + "\\src\\test\\config\\Env.json";
        {
            try {
                baseClass.environment = gson.fromJson(new FileReader(envFilePath), Environment.class);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }


        String brw =baseClass.environment.getBrowser();
        if (brw.equalsIgnoreCase("chrome")) {
            String driverPath = currentDirectory + "\\libs\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", driverPath);
            baseClass.driver = new ChromeDriver();
        } else if (brw.equalsIgnoreCase("ie")) {
            String driverPath = currentDirectory + "\\libs\\IEDriverServer.exe";
            System.setProperty("webdriver.ie.driver", driverPath);
            baseClass.driver = new InternetExplorerDriver();
        } else if (brw.equalsIgnoreCase("firefox")) {
            String driverPath = currentDirectory + "\\libs\\geckodriver.exe";
            System.setProperty("webdriver.gecko.driver", driverPath);
            baseClass.driver = new FirefoxDriver();
        }
        baseClass.driver.get(environment.getApplicationurl());
    }
}
