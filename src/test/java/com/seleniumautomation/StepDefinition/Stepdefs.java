package com.seleniumautomation.StepDefinition;

import com.seleniumautomation.PageObjects.FacebookPageObjects;
import com.seleniumautomation.PageObjects.FacebookPageObjects2;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.ref.SoftReference;
import java.sql.*;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Stepdefs extends BaseClass {

public BaseClass baseClass;
    public Stepdefs(BaseClass baseClass){
        this.baseClass=baseClass;
    }
    SoftAssert softAssert = new SoftAssert();
//    public static WebDriver driver=null;
//    public static String currentDirectory= System.getProperty("user.dir");
//    Environment environment=null;
    @Given("^facebook page is launched$")
    public void facebookPageIsLaunched() throws FileNotFoundException, InterruptedException {


//        String envFilePath=currentDirectory+"\\src\\test\\config\\Env.json";
//        Gson gson = new Gson();
//        environment=gson.fromJson(new FileReader(envFilePath),Environment.class);
//        String brw = environment.getBrowser();
//        if (brw.equalsIgnoreCase("chrome")) {
//            String driverPath = currentDirectory + "\\libs\\chromedriver.exe";
//            System.setProperty("webdriver.chrome.driver", driverPath);
//            driver = new ChromeDriver();
//        }else if (brw.equalsIgnoreCase("ie")) {
//            String driverPath = currentDirectory + "\\libs\\IEDriverServer.exe";
//            System.setProperty("webdriver.ie.driver", driverPath);
//            driver = new InternetExplorerDriver();
//        }else if (brw.equalsIgnoreCase("firefox")) {
//            String driverPath = currentDirectory + "\\libs\\geckodriver.exe";
//            System.setProperty("webdriver.gecko.driver", driverPath);
//            driver = new FirefoxDriver();
//        }
//        driver.get(environment.getApplicationurl());
        Thread.sleep(5000);
        if (baseClass.driver.getTitle().contains("Facebook – log in or sign up")) {
//            System.out.println("facebook is launched");
        }else{
//            System.out.println("facebook not launched");
        }

    }

    @When("^userid and password is entered$")
    public void useridAndPasswordIsEntered() throws InterruptedException {

//        Users users= FrameworkUtils.getUserFromRole(environment,"Admin");
//        driver.findElement(By.xpath(FacebookPageObjects.loginpage_txtusername)).sendKeys(users.getUsername());
//        driver.findElement(By.xpath(FacebookPageObjects.loginpage_txtpassword)).sendKeys(users.getPassword());
        System.out.println("user id and password entered");
//        Environment environment= new Environment();
        baseClass.driver.findElement(By.xpath(FacebookPageObjects.loginpage_txtusername)).sendKeys(baseClass.environment.getUserName());
        baseClass.driver.findElement(By.xpath(FacebookPageObjects.loginpage_txtpassword)).sendKeys(baseClass.environment.getPassword());
        baseClass.driver.findElement(By.xpath(FacebookPageObjects.loginpage_btnlogin)).click();
        System.out.println("Log in button is clicked");
        Thread.sleep(5000);

        softAssert.assertEquals("same","same");

    }

    @Then("^facebook home page is shown$")
    public void facebookHomePageIsShown() {
//        if (driver.getTitle().contains("Facebook")) {
            System.out.println("Facebook driver title: "+driver.getTitle());
//        }else{
//            System.out.println("facebook homepage is not shown");
//        }
        softAssert.assertAll();
    }


//    @Given("^This will have all the annotations in testng$")
//    public void thisWillHaveAllTheAnnotationsInTestng() {
//        TestNextGeneration testNextGeneration = new TestNextGeneration();
//    }

    @When("^This is a sample test$")
    public void thisIsASampleTest() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("","","");
        Statement statement = connection.createStatement();
        ResultSet resultSet= statement.executeQuery("");
        while(resultSet.next()){
            resultSet.getString(1);
            resultSet.getString("");
        }
        connection.close();

    }

    @Then("^This is a sample(\\d+) test$")
    public void thisIsASampleTest(int arg0) {
    }


       @Given("^script to handle windows in selenium$")
    public void scriptToHandleWindowsInSelenium() {
           String driverPath = currentDirectory + "\\libs\\chromedriver.exe";
           System.setProperty("webdriver.chrome.driver", driverPath);
           WebDriver localDriver = new ChromeDriver();
           localDriver.get("http://demo.guru99.com/popup.php");
           localDriver.findElement(By.xpath("//a[text()='Click Here']")).click();
           try {
               Thread.sleep(5000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           String parentWindow = localDriver.getWindowHandle();
           localDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
           Set<String> allwindows = localDriver.getWindowHandles();
           for (String window:allwindows) {
               if (!window.equalsIgnoreCase(parentWindow)) {
                   localDriver.switchTo().window(window);
               }

           }
           localDriver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("abc@gmail.com");
           localDriver.findElement(By.xpath("//input[@name='btnLogin']")).click();
           try {
               Thread.sleep(5000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           localDriver.close();
           localDriver.switchTo().defaultContent();

           System.out.println(localDriver.getCurrentUrl().toString());



       }
}
