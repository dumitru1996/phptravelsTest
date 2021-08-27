package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;

    public static void startDriver(){

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

    }

    public static void switchToTab(int tabNum){
        ArrayList<String> tabs = new ArrayList<String>();
        tabs.addAll(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(tabNum));

    }

    public static WebDriver getDriver(){

        return driver;

    }

    public static void stopDriver(){

        driver.quit();

    }





}
