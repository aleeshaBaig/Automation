import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver ;
import org.openqa.selenium.support.ui.Select;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjc0NTg5MDAyLCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("Aleesha");
        driver.findElement(By.xpath("//*[@name=\"lastname\"]")).sendKeys("Baig");
        driver.findElement(By.xpath("//*[@name=\"reg_email__\"]")).sendKeys("03085773030");
        driver.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys("apple@1");
         Select sel1 = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
         sel1.selectByIndex(21);
         Select sel2 = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
         sel2.selectByIndex(7);
         Select sel3 = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
         sel3.selectByValue("1996");
         driver.findElement(By.xpath("//input[@value='1']")).click();
         System.out.println("Login Done with Submit");
         Thread.sleep(10000);
        driver.quit();
        //Create Sign up//

    }
}

