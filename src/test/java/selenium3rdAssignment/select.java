package selenium3rdAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");

        Select select=new Select(driver.findElement(By.cssSelector("select[id='Skills']")));
        select.selectByIndex(2);
    }
}
