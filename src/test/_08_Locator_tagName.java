package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _08_Locator_tagName {

    /*
    Go to https://www.wikipedia.org/
    Validate the WIKIPEDIA heading1 is displayed
    Validate the WIKIPEDIA LOGO is displayed
    Validate the search input box is displayed
    Validate the search button is displayed
    Validate the search button is enabled

     */
    public static void main(String[] args) {
//        WebDriver driver = Driver.getDriver();
//
//        driver.get("https://wikipedia.org/");
//
//        WebElement heading1 = driver.findElement(By.tagName("h1"));
//
//        if (heading1.isDisplayed()) System.out.println("Heading 1 validation PASSED");
//        else System.out.println("Heading 1 validation FAILED!!!");
//
//        WebElement logo = driver.findElement(By.className("central-featured-logo"));
//
//        if (logo.isDisplayed()) System.out.println("LOGO validation PASSED");
//        else System.out.println("LOGO validation FAILED!!!");
//
//        if (driver.findElement(By.id("searchInput")).isDisplayed()) System.out.println("Search input box validation PASSED");
//        else System.out.println("Search input box validation FAILED!!!");
//
//        if (driver.findElement(By.className("pure-button")).isDisplayed()) System.out.println("Search button validation PASSED");
//        else System.out.println("Search button validation FAILED!!!");
//
//        if (driver.findElement(By.className("pure-button")).isEnabled()) System.out.println("Search button ENABLED");
//        else System.out.println("Search button DISABLED");
//
//        Driver.quitDriver();

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.wikipedia.org/");


        //WebElement heading1 = driver.findElement(By.tagName("h1"));
        WebElement heading1 = driver.findElement(By.xpath("//h1"));
        WebElement logo = driver.findElement(By.cssSelector(".central-featured-logo"));
        WebElement searchInputBox = driver.findElement(By.cssSelector("#searchInput"));

        //WebElement searchButton = driver.findElement(By.className("pure-button"));
        //WebElement searchButton = driver.findElement(By.cssSelector(".pure-button"));
        WebElement searchButton = driver.findElement(By.cssSelector(".pure-button-primary-progressive"));

        System.out.println(heading1.isDisplayed()); // true
        System.out.println(heading1.getText()); //

        System.out.println(logo.isDisplayed()); // true
        System.out.println(searchInputBox.isDisplayed()); // true
        System.out.println(searchButton.isDisplayed()); // true
        System.out.println(searchButton.isEnabled()); // true

        Driver.quitDriver();

    }
}
