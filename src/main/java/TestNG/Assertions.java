package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Assertions {

    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:/Users/mxjcruz/IdeaProjects/AutomationWorkshop/drivers/chrome/106/chromedriver.exe");
        driver = new ChromeDriver();

        // Using driver navigate to the URL given, and maximize the window
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().window().maximize();
    }

    //@BeforeClass
    //void setup(){

    //}


}
