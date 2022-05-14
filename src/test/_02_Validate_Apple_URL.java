package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _02_Validate_Apple_URL {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver", "/Users/ramiturkmani/IdeaProjects/slenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("https://www.apple.com/");

        String expectedURL = "https://www.apple.com/";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.equals(expectedURL)) System.out.println("Apple URL validation PASSED");
        else System.out.println("Apple URL validation FAILED!!!");

        driver.quit();

        System.out.println("End of the program!");
    }
}
