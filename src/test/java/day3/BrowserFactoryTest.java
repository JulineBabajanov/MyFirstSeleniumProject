package day3;


import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

public class BrowserFactoryTest {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        //how we can print a source code of the page
        driver.get("http://practice.cybertekschool.com");
        System.out.println(driver.getPageSource());
        //to finish test execution
        driver.quit();
    }
}
