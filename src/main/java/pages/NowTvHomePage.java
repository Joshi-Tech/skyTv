package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NowTvHomePage {
    private WebDriver driver;
    private final By cookieBtn = By.xpath("//*[contains(@title,'OK with that')]");
    private final By joinBtn = By.xpath("//*[text()='Join NOW']");
    private final By randomTxt = By.xpath("//span[text()='Choose your membership']");

    public NowTvHomePage(WebDriver d) {
        this.driver = d;
    }

    public void joinNow() {
        driver.findElement(joinBtn).click();
    }

    public void clickCookies() {
        driver.findElement(cookieBtn).click();
    }

    public String getRandomTxt(){
      return   driver.findElement(randomTxt).getText().trim();
    }
}
