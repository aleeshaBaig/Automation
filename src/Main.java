import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver ;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.quit();

    }
}

