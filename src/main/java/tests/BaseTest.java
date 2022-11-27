package tests;

import aquality.selenium.elements.interfaces.IButton;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.NowTvHomePage;

import static aquality.selenium.browser.AqualityServices.getElementFactory;

public class BaseTest {
    private static WebDriver driver;

   /* private final  IButton joinNowBtn = getElementFactory().getButton(
            By.xpath("//*[text()='Join NOW']"),"Join now button");*/
    public By joinNowBtn = By.xpath("//*[text()='Join NOW']");




        protected BaseTest(){

       /* this.driver=driver;
        driver = new ChromeDriver();*/
       // driver.get("https://www.nowtv.com/membership");

    }
   // @BeforeClass
    @BeforeClass
    public static void launchPage(){

       /* WebDriverManager driverManager = new ChromeDriverManager();
        driverManager.setup();
         driver = new ChromeDriver();
        driver.get("https://www.nowtv.com/membership");*/
        /*WebDriverManager driverManager = new ChromeDriverManager();
        driverManager.setup();*/
       // driver = new ChromeDriver();


        /*NowTvHomePage nowTvHomePage = new NowTvHomePage(driver);
        driver.switchTo().frame(1);
        nowTvHomePage.clickCookies();*/
       //  By cookieBtn = By.xpath("//*[contains(@title,'OK with that')]");

      //  driver.findElement(cookieBtn).click();
       // driver.switchTo().frame(0);
       // driver.getTitle();


      //  System.out.println(driver.findElements(By.tagName("iframe")).get(1).getText());
      //  driver.switchTo().frame(1);
       // System.out.println(driver.getTitle());
       // nowTvHomePage.clickCookies();
       // driver.switchTo().parentFrame();
      //  driver.getTitle();
      //  nowTvHomePage.clickCookies();
       // nowTvHomePage.joinNow();
       // driver.findElement(joinNowBtn).click();
      //  nowTvHomePage.joinNow();
    }
}
