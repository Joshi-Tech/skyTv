package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketSummaryPage {
    private WebDriver driver;
    private final By continueToCheckoutBtn = By.xpath("//*[text()='Continue to checkout']");

    public BasketSummaryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickContinueToCheckoutBtn() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        driver.findElement(continueToCheckoutBtn).click();
    }
}
