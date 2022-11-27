package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MembershipTypePage {
    private WebDriver driver;
    private final By cinemaSubscription = By.xpath("//a[contains(@href,'CINEMA_SUBSCRIPTION')]/parent::div");
    private final By joinEntertainmnet = By.xpath("//a[contains(@href,'choose-your-entertainment-membership')]");
    private final By entertainmentTxt = By.xpath("//span[contains(text(),'ENTERTAINMENT MEMBERSHIP')]");

    public MembershipTypePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMemberShipType() {
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,700)", "");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {

        }
        driver.findElement(joinEntertainmnet).click();
    }

    public void clickCinemaSubscription() {
        driver.findElement(cinemaSubscription).click();
    }
}
