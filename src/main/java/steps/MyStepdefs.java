package steps;

import com.github.javafaker.Faker;
import gherkin.lexer.Th;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.*;
import utilites.FakeDetails;


public class MyStepdefs {
    private String password = FakeDetails.password();
    private FakeDetails fakeDetails = new FakeDetails();
    private String email = fakeDetails.email();
    private WebDriver driver;
    private NowTvHomePage nowTvHomePage;
    private MembershipTypePage membershipTypePage;
    @Given("user launches Chrome Browser")
    public void userLaunchesChromeBrowser() {
        WebDriverManager driverManager = new ChromeDriverManager();
        driverManager.setup();
    }
    @When("launching {string}")
    public void launching(String url) {
        WebDriverManager driverManager = new ChromeDriverManager();
        driverManager.setup();
        driver = new ChromeDriver();
        driver.get(url);
        nowTvHomePage = new NowTvHomePage(driver);
    }
    @Then("accept cookies")
    public void acceptCookies() {
        driver.manage().window().maximize();
        driver.switchTo().frame(1);
        nowTvHomePage.clickCookies();
        driver.switchTo().defaultContent();
    }
    @Then("get title of the page")
    public void getTitleOfThePage() {
        driver.getTitle();
        System.out.println(driver.getTitle());
    }
    @Then("click button join now")
    public void clickButtonJoinNow() {
        System.out.println(nowTvHomePage.getRandomTxt());
        Assert.assertEquals(nowTvHomePage.getRandomTxt(), "Choose your membership");
        nowTvHomePage.joinNow();
    }
    @Then("opens get title of new page")
    public void opensGetTitleOfNewPage() {
    }
    @Then("click Entertainment Membership")
    public void clickEntertainmentMembership() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        membershipTypePage = new MembershipTypePage(driver);
        membershipTypePage.clickMemberShipType();
    }
    @Then("get title of Choose your membership")
    public void getTitleOfChooseYourMembership() {
        System.out.println("**" + driver.getTitle());
    }
    @Then("click Entertainment voucher only")
    public void clickEntertainmentVoucherOnly() {
        YourMembershipPage yourMembershipPage = new YourMembershipPage(driver);
        yourMembershipPage.clickEnterTainment();
    }

 /*  @Then("get title of Add Boost page")
    public void getTitleOfAddBoostPage() {
       System.out.println("***"+driver.getTitle());
    }

    @Then("click continue without boost")
    public void clickContinueWithoutBoost() {
        AddBoostPage addBoostPage= new AddBoostPage(driver);
        addBoostPage.setContinueWithoutBoost();
    }*/

  /*  @Then("click continue CTA for NOW only membership")
    public void clickContinueCTAForNOWOnlyMembership() {
    }*/

    @Then("ensure title of the new page is NOW-Basket summary")
    public void ensureTitleOfTheNewPageIsNOWBasketSummary() {
        Assert.assertEquals(driver.getTitle(), "NOW - Basket summary");
    }

    @Then("click to CTA Continue to checkout")
    public void clickToCTAContinueToCheckout() {
        BasketSummaryPage basketSummaryPage = new BasketSummaryPage(driver);
        basketSummaryPage.clickContinueToCheckoutBtn();
    }
    @Then("ensure title of the new page is NOW-Checkout")
    public void ensureTitleOfTheNewPageIsNOWCheckout() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        Assert.assertEquals(driver.getTitle(), "NOW - Checkout");
    }
    @Then("enter title")
    public void enterTitle() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickTitleDropDown();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        checkoutPage.selectTitle();
    }
    @And("First name")
    public void firstName() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.typeFirstName(fakeDetails.firstName());
    }
    @And("Last name")
    public void lastName() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.typeLastName(fakeDetails.lastName());
    }
    @And("Email")
    public void email() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.typeEmail(email);
    }
    @Then("confirmEmail")
    public void confirmEmail() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.typeConfirmEmail(email);
    }

    @And("password")
    public void password() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.typePassword(password);
    }

    @Then("confirmPassword")
    public void confirmpassword() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.typeConfirmPassword(password);
    }

    @Then("click CTA Next")
    public void clickCTANext() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickNext();
    }

    @Then("Enter postcode")
    public void enterPostcode() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.typePostCode("UB4 8SH");
    }

    @And("click Find address")
    public void clickFindAddress() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.findAddress();
    }

    @Then("click Address dropdown")
    public void clickAddressDropdown() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickAddressDropDown();
    }

    @Then("click address")
    public void clickAddress() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickAddress("226");
    }

    @Then("click Next in Address Form")
    public void clickNextInAddressForm() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,300)", "");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickNextBtnForAddressForm();
    }

    @Then("click on payment by card tab")
    public void clickOnPaymentByCardTab() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickCardTab();
    }

    @Then("Enter card number")
    public void enterCardNumber() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.getCardNumber(fakeDetails.cardNumber());
    }

    @Then("Expiry date")
    public void expiryDate() {
        try {
            Thread.sleep(4000);
        } catch (Exception e) {

        }
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.getExpiry(fakeDetails.cardExpiry());
    }

    @Then("cvv")
    public void cvv() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.getSecurityCode(fakeDetails.cardCVV());
    }

    @Then("click Terms of use")
    public void clickTermsOfUse() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickTermChkBx();
    }
}
