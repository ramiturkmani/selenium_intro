package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _05_Locator_id {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");

        WebElement logo = driver.findElement(By.id("img_comp-kuiqjide2"));

        if(logo.isDisplayed()) System.out.println("The logo validation PASSED");
        else System.out.println("Logo validation FAILED!!!");

        WebElement name = driver.findElement(By.id("comp-kuiqjidf"));
        System.out.println(name.getText());

        if (name.isDisplayed() && name.getText().equals("TechGlobal")) System.out.println("The company name validation PASSED");
        else System.out.println("Company name validation FAILED!!!");

        WebElement quote = driver.findElement(By.id("comp-kuiqjidf1"));
        System.out.println(quote.getText());

        if (quote.isDisplayed() && quote.getText().equals("OUR GOAL IS YOUR SUCCESS")) System.out.println("The company quote validation PASSED");
        else System.out.println("Company quote validation FAILED!!!");

        Driver.quitDriver();

    }
}
