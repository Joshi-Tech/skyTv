package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdcutPage {
    private final By cinemaSubscription = By.xpath("//a[contains(@href,'choose-your-entertainment-membership')]");
    private WebDriver driver;

    public ProdcutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCinemaSubscription() {
        driver.findElement(cinemaSubscription).click();
    }
}
