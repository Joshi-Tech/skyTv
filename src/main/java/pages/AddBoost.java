package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddBoost {
    WebDriver driver;

    private final By withoutBoost = By.xpath("//a[text()='Continue without Boost']");

    public AddBoost(WebDriver driver){
        this.driver = driver;
    }

    public void clickWithOutBoost(){
        List<WebElement> wBoost = driver.findElements(withoutBoost);
        wBoost.get(0).click();
    }
}
