package Lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

public class TestSelenium {
    ChromeDriver chromeDriver;
    Random random = new Random();

    @BeforeMethod
    public void setup() {
        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        System.out.println("Browser started");
    }

    @Test
    public void test01() throws InterruptedException {


        chromeDriver.get("https://lms.poly.edu.vn/");

        chromeDriver.findElement(By.className("p-4")).click();

        chromeDriver.findElement(By.id("username")).clear();
        chromeDriver.findElement(By.id("password")).clear();

        chromeDriver.findElement(By.id("username")).sendKeys("dungthph38780@fpt.edu.vn");
        chromeDriver.findElement(By.id("password")).sendKeys("fghghhfgh");

        chromeDriver.findElement(By.name("cmd[doStandardAuthentication]")).click();


    }

    @AfterMethod
    public void exits() {
        // Close the browser
//        chromeDriver.quit();
        System.out.println("Browser closed");
    }
}
