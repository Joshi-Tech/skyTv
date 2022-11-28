package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.*;
import utilites.DetailsUtilites;

import java.util.Random;

public class JoinPageTest {
    private WebDriverManager webDriverManager;
    private WebDriver driver;
    private String emai= DetailsUtilites.getEmail();

    @Test
    public void joinTest() {
        webDriverManager = new ChromeDriverManager();
        webDriverManager.setup();
        driver = new ChromeDriver();
        driver.get("https://www.nowtv.com/membership");
        driver.switchTo().frame(1);
        NowTvHomePage nowTvHomePage = new NowTvHomePage(driver);
        driver.getTitle();
        driver.manage().window().maximize();
        nowTvHomePage.clickCookies();
        nowTvHomePage.joinNow();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollBy(0,700)","");
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }

        ProdcutPage prodcutPage = new ProdcutPage(driver);
        prodcutPage.clickCinemaSubscription();

        javascriptExecutor.executeScript("window.scrollBy(0,200)","");
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }

        javascriptExecutor.executeScript("window.scrollBy(0,500)","");
        try{
            Thread.sleep(8000);
        }catch (Exception e){
            e.printStackTrace();
        }

        YourMembershipPage yourMembershipPage = new YourMembershipPage(driver);
        yourMembershipPage.clickOpenVoucher();
        AddBoostPage addBoostPage = new AddBoostPage(driver);
        javascriptExecutor.executeScript("window.scrollBy(0,600)","");
        addBoostPage.setContinueWithoutBoost();

        try{
            Thread.sleep(8000);
        }catch (Exception e){
            e.printStackTrace();
        }

        BasketSummaryPage basketSummaryPage = new BasketSummaryPage(driver);

        basketSummaryPage.clickContinueToCheckoutBtn();

        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }

        CheckoutPage checkoutPage= new CheckoutPage(driver);
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        checkoutPage.clickTitleDropDown();
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
       // checkoutPage.selectTitle(DetailsUtilites.getTitle());
        checkoutPage.typeFirstName(DetailsUtilites.getFirstName());
        //checkoutPage.selectTitle("Mr");
       // checkoutPage.typeFirstName("Laxmi Kant");
        checkoutPage.typeLastName(DetailsUtilites.getLastName());
        checkoutPage.typeEmail(emai);
        checkoutPage.typeConfirmEmail(emai);
        checkoutPage.typePassword(DetailsUtilites.getPassword());
        checkoutPage.typeConfirmPassword(DetailsUtilites.getPassword());
        checkoutPage.clickNext();
        checkoutPage.typePostCode(DetailsUtilites.getPostCode());
        checkoutPage.findAddress();
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        checkoutPage.clickAddressDropDown();
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        checkoutPage.clickAddress(DetailsUtilites.address());
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        javascriptExecutor.executeScript("window.scrollBy(0,300)","");
        checkoutPage.clickNextBtnForAddressForm();
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        checkoutPage.clickCardTab();

        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        checkoutPage.getCardNumber(DetailsUtilites. cardNumber());
        checkoutPage.getExpiry(DetailsUtilites.expiry());
        checkoutPage.getSecurityCode(DetailsUtilites.cvv());
        checkoutPage.clickTermChkBx();
    }

    /*@AfterTest
    public void tearDown(){
        driver.close();
    }*/
}
