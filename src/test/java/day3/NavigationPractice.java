package day3;

import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class NavigationPractice {
    public static void main(String[] args) {
        //create a webdriver object, to work with a browser
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize(); // to maximize browser
        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");
        //wait for 3 seconds
        //this is our custom method
        //since method is static, we use class name to call the method
        //as a parameter, we provide number of seconds
        BrowserUtils.wait(3);
        //Hot to print title of page
        System.out.println(driver.getTitle());
        //navigate back to google
        driver.navigate().back();
        //move fwd to the amazon again
        driver.navigate().forward();
        //to refresh/reload a webpage/website
        driver.navigate().refresh();
        //shutdown browswer
        driver.quit();
        //What will happen if I will call driver again after quit0
        driver.get("http://google.com");
    }
}
