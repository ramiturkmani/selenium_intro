package test;

import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class _01_Validate_Apple_Title {
    public static void main(String[] args) {
        //1. Set up driver
//        System.setProperty("webdriver.chromedriver", "/Users/ramiturkmani/IdeaProjects/slenium_intro/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebDriver driver = Driver.getDriver();

        //2. Validation
        driver.get("https://www.apple.com/");

        String expectedTitle = "Apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) System.out.println("Apple title validation PASSED");
        else System.out.println("Apple title validation FAILED!!!");

        Driver.quitDriver();

        System.out.println("End of the program!");
    }
}
