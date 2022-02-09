package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class test2 {

    public static void main( String[] args ) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.ivi.ru/ ");

        WebElement webElement = driver.findElement(By.xpath(".//li/a[@href='https://www.ivi.ru/movies']/div[@class='nbl-button__primaryText']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(webElement).build().perform();

        driver.findElement(By.xpath(".//a[@href='https://www.ivi.ru/movies/ru']")).click();







    }
}
