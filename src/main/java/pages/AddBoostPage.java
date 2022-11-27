package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddBoostPage {
    WebDriver driver;
    private static By continueWithoutBoost = By.xpath("//a[text()='Continue without Boost']");

    public AddBoostPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setContinueWithoutBoost() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {

        }
        List<WebElement> withouthBoost = driver.findElements(continueWithoutBoost);
        withouthBoost.get(0).click();
    }
}
