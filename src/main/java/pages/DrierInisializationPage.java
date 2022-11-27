package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrierInisializationPage {
    private WebDriver driver;

    NowTvHomePage nowTvHomePage = new NowTvHomePage(driver);

    public DrierInisializationPage() {
        WebDriverManager driverManager = new ChromeDriverManager();
        driverManager.setup();
        driver = new ChromeDriver();
        driver.get("https://www.nowtv.com/membership");

    }

    public NowTvHomePage nowTvHomePageAttributes() {
        return nowTvHomePage;
    }
}
