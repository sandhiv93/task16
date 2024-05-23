package Selenium_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2_Chrome_DemoBlaze {

    static WebDriver driver;
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        driver = new ChromeDriver();
        System.out.println(driver);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.demoblaze.com/");


        String Title = driver.getTitle();
        System.out.println("Title of the page is :" + Title);

        String ExpectedTitle = "STORE";

        if (Title.equals(ExpectedTitle)) {
            System.out.println("Page landed on correct website");
        } else {
            System.out.println("Page Not landed on correct website" );
        }
    }

}