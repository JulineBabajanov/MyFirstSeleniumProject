package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstAutomationScript {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        //to read title, there is a method .get
        String actualResult=driver.getTitle();
        String expectedResult="Google";
        if(actualResult.equals(expectedResult)){
            System.out.println("Test pass");

        }else{
            System.out.println("Test failed");
        }
        //to close browser
        driver.close();
    }
}
