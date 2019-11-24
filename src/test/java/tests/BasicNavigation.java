package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {
        //if you have expectation: cannot load a class
        //that means that package name, doesnt match with location of the class itself
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        //to maximize browser
        driver.manage().window().maximize();
        driver.get("http://google.com");
        //we want to navigate, to the different page
        driver.navigate().to("http://amazon.com");
        //if I want to come back to the previous page
        driver.navigate().back();
        //if I want to know URL of current website
        String url=driver.getCurrentUrl();
        System.out.println(url);
        //Selenium can not close browser automatically
        //for this, we use method close()
        driver.close();
    }

}
