package steps;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.MembershipTypePage;
import pages.NowTvHomePage;
import pages.ProdcutPage;

public class E2EPaymentByCard {
    WebDriver driver;
    ProdcutPage prodcutPage;
   private NowTvHomePage nowTvHomePage;
   private MembershipTypePage membershipTypePage;


    @Given("user launches Chrome Browser")
    public void user_launches_chrome_browser() {
        WebDriverManager driverManager = new ChromeDriverManager();
        driverManager.setup();
    }
    @When("launching {url}")
    public void launching(String url) {
        WebDriverManager driverManager = new ChromeDriverManager();
        driverManager.setup();
        driver= new ChromeDriver();
        driver.get(url);
        nowTvHomePage = new NowTvHomePage(driver);
    }
    @Then("accept cookies")
    public void accept_cookies() {
        driver.switchTo().frame(1);
        //NowTvHomePage nowTvHomePage = new NowTvHomePage(driver);
        nowTvHomePage.clickCookies();
        driver.manage().window().maximize();
        driver.switchTo().defaultContent();
    }
    @Then("get title of the page")
    public void get_title_of_the_page() {
        driver.getTitle();
        System.out.println(driver.getTitle());

    }
    @Then("click button join now")
    public void click_button_join_now() {
        System.out.println(nowTvHomePage.getRandomTxt());
        Assert.assertEquals(nowTvHomePage.getRandomTxt(),"Choose your membership");
        nowTvHomePage.joinNow();
    }



  /*  @Given("user launches Chrome Browser")
    public void user_launches_chrome_browser() {
        WebDriverManager driverManager = new ChromeDriverManager();
        driverManager.setup();

    }


    @When("launching {string}")
    public void launching(String string) {
        WebDriverManager driverManager = new ChromeDriverManager();
        driverManager.setup();
        driver= new ChromeDriver();
        driver.get(string);
       nowTvHomePage = new NowTvHomePage(driver);
    }

    @Then("accept cookies")
    public void accept_cookies() {
        driver.switchTo().frame(1);
        //NowTvHomePage nowTvHomePage = new NowTvHomePage(driver);
        nowTvHomePage.clickCookies();
        driver.manage().window().maximize();
        driver.switchTo().defaultContent();
    }

    @Then("get title of the page")
    public void get_title_of_the_page() {
        driver.getTitle();
        System.out.println(driver.getTitle());

    }

    @Then("^click button join now$")
    public void click_button_join_now()  {
        System.out.println(nowTvHomePage.getRandomTxt());
        Assert.assertEquals(nowTvHomePage.getRandomTxt(),"Choose your membership");
        nowTvHomePage.joinNow();
    }
*/
  /*  @Then("opens get title of new page")
    public void opens_get_title_of_new_page() {
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"NOW Membership - Watch Movies, Sports, TV & Kids Shows");
        membershipTypePage = new MembershipTypePage(driver);
        membershipTypePage.clickMemberShipType();

    }
    @Then("click Entertainment Membership")
    public void click_entertainment_membership() {
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
       // JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
       // javascriptExecutor.executeScript("windows.scroll(0,300)","");
        *//* membershipTypePage = new MembershipTypePage(driver);
        membershipTypePage.clickMemberShipType();*//*
    }
*/

}
