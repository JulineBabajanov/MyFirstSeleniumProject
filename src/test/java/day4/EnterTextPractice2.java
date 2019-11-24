package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

public class EnterTextPractice2 {
    public static void main(String[] args) {
        //Test 3 verify that confirmation message is displayed
//1 go to http://practice.cybertekschool.com/forgot_password
        //2 enter valid email
        //3 click on retrieve password button
        //3 verify that message "your emails been sent!" is displayed
        //as usually, we are starting from driver setup
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement input=driver.findElement(By.name("email"));
        input.sendKeys("jbabajanov@yahoo.com", Keys.ENTER);
        WebElement confirmationMessage=driver.findElement(By.name("confirmation message"));
        String expectedMessage="Your e-mail's been sent!";
        //to get the text from element
        String actualMessage=confirmationMessage.getText();
        if(expectedMessage.equals(actualMessage)) {
            System.out.println("Test Passed");
        }else{
            System.out.println("Test failed");
        }
        driver.close();

    }
}
