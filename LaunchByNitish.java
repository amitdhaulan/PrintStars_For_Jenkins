/*
package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LaunchByNitish {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        EdgeOptions options = new EdgeOptions();
        options.addArguments("-inPrivate");
        WebDriverManager.edgedriver().setup();
        driver= new EdgeDriver(options);

        driver.get("https://www.google.com");
        Thread.sleep(2000);
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
        searchBox.sendKeys("Trying to get dfgdk");
        searchBox.sendKeys((Keys.ENTER));
    }
}
*/
