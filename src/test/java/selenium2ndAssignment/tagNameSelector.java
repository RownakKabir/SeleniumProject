package selenium2ndAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagNameSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/forgot_password");
        Thread.sleep(2000);
        driver.findElement(By.tagName("input")).sendKeys("jannatkabir@gmail.com");
        driver.findElement(By.tagName("button")).click();
    }
}
