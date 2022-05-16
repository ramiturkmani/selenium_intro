package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _04_Locator_className {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://google.com/");

        WebElement googleImage = driver.findElement(By.className("lnXdpd"));

        if (googleImage.isDisplayed()) System.out.println("Google image validation is PASSED");
        else System.out.println("Google image validation is FAILED!!!");

        Driver.quitDriver();

    }
}
