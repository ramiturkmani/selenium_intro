package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _09_Locator_linkText_partialLinkText {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");

        WebElement aboutLink = driver.findElement(By.linkText("About"));
        WebElement imagesLink = driver.findElement(By.linkText("Images"));
        WebElement storeLink = driver.findElement(By.linkText("Store"));
        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));

        if (aboutLink.isDisplayed() && aboutLink.isEnabled()) System.out.println("About link validation PASSED");
        else System.out.println("About link validation FAILED!!!");

        if (imagesLink.isDisplayed() && imagesLink.isEnabled()) System.out.println("Images link validation PASSED");
        else System.out.println("Images link validation FAILED!!!");

        if (storeLink.isDisplayed() && storeLink.isEnabled()) System.out.println("Store link validation PASSED");
        else System.out.println("Store link validation FAILED!!!");

        if (gmailLink.isDisplayed() && gmailLink.isEnabled()) System.out.println("Gmail link validation PASSED");
        else System.out.println("Gmail link validation FAILED!!!");

        Driver.quitDriver();


    }
}
