package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test4 {

    public static void main( String[] args ) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.ivi.ru/ ");

        WebElement webElement = driver.findElement(By.xpath(".//div[@class='headerTop__headerSearch']/button/div[@class='nbl-button__primaryText']"));

        webElement.click();

        driver.findElement(By.xpath(".//input[@class='nbl-input__editbox']")).sendKeys("Матрица");
        driver.findElement(By.xpath(".//input[@class='nbl-input__editbox']")).submit();

        driver.quit();
    }
}
