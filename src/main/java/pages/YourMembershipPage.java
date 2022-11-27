package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class YourMembershipPage {
    private final By openVoucher = By.xpath("//a[contains(@href,'choose-your-membership/entertainment-boost')]");
    private final By enterTainmentMemberShip = By.xpath("//a[contains(@href,'summary?product[]=FT_HD&voucher[]=5')]");
    private WebDriver driver;

    public YourMembershipPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOpenVoucher() {
        driver.findElement(openVoucher).click();
    }

    public void clickEnterTainment() {
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,500)", "");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        driver.findElement(enterTainmentMemberShip).click();
    }
}
