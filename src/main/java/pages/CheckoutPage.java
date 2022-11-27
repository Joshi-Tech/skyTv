package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.function.Function;

public class CheckoutPage {
    private WebDriver driver;
    private final By title = By.id("title");
    private final By firstName = By.id("firstName");
    private final By lastName = By.id("lastName");
    private final By email = By.id("email");
    private final By cardNumber = By.id("card_number");
    private final By tabCard = By.id("tab-card");
    private final By expiry = By.id("expiry");
    private final By securityCode = By.id("cvv");
    private final By terms = By.id("terms");
    private final By confirmEmail = By.id("confirmEmail");
    private final By password = By.id("password");
    private final By confirmPassword = By.id("confirmPassword");
    private final By nextBtn = By.xpath("//*[contains(@data-tracking-context,'PERSONAL_DETAILS_SIGN_UP')]");
    private final By nextBtnForAddress = By.xpath("//div[@id='select-postcode-lookup-select-address-wrapper']/parent::div/parent::div/following::button[text()='Next']");
    private final By postCodeTxtBx = By.id("input-postcode-lookup");
    private final By addressDropDown = By.id("select-postcode-lookup-select-address");
    private final By address = By.xpath("//option[text()='Please Select']/following::option");
    private final By salute1 = By.xpath("//select[@id='title']/option");
    private final Function<String, By> t = sirName -> By.xpath(String.format("//option[@value='%s']"));
    private final By findAddressBtn = By.xpath("//*[text()='Find address']");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeFirstName(String name) {
        driver.findElement(firstName).sendKeys(name);
    }

    public void typeLastName(String name) {
        driver.findElement(lastName).sendKeys(name);
    }

    public void typeEmail(String emailId) {
        driver.findElement(email).sendKeys(emailId);
    }

    public void typeConfirmEmail(String emailId) {
        driver.findElement(confirmEmail).sendKeys(emailId);
    }

    public void typePostCode(String postcode) {
        driver.findElement(postCodeTxtBx).sendKeys(postcode);
    }

    public void typePassword(String passWord) {
        driver.findElement(password).sendKeys(passWord);
    }

    public void typeConfirmPassword(String emailId) {
        driver.findElement(confirmPassword).sendKeys(emailId);
    }

    public void clickNext() {
        driver.findElement(nextBtn).click();
    }

    public void clickTitleDropDown() {
        driver.findElement(title).click();
    }

    public void clickNextBtnForAddressForm() {
        driver.findElement(nextBtnForAddress).click();
    }

    public void findAddress() {
        driver.findElement(findAddressBtn).click();
    }

    public void selectTitle(String title) {
        List<WebElement> salute = driver.findElements(salute1);
        for (int i = 0; i < salute.size(); i++) {
            if (salute.get(i).getText().equals(title)) {
                salute.get(i).click();
            }
        }
    }

    public void title(String title) {
        System.out.println(driver.findElement(t.apply(title)).getText());
        driver.findElement(t.apply(title)).click();
    }

    public void clickAddressDropDown() {
        driver.findElement(addressDropDown).click();
    }

    public void clickAddress(String doorNumber) {
        List<WebElement> specificAddress = driver.findElements(address);
        for (WebElement web : specificAddress
        ) {
            if (web.getText().contains(doorNumber)) {
                web.click();
            }
        }
    }

    public List<WebElement> moveToFrame() {
        List<WebElement> iframe = driver.findElements(By.xpath("//iframe[@sandbox='allow-scripts allow-same-origin']"));
        return iframe;
    }

    public void getCardNumber(String number) {
        driver.switchTo().frame(moveToFrame().get(0));
        driver.findElement(cardNumber).sendKeys(number);
        driver.switchTo().defaultContent();
    }

    public void getExpiry(String expiryDate) {
        driver.findElement(expiry).sendKeys(expiryDate);
    }

    public void getSecurityCode(String cvv) {
        driver.switchTo().frame(moveToFrame().get(1));
        driver.findElement(securityCode).sendKeys(cvv);
        driver.switchTo().defaultContent();
    }

    public void clickTermChkBx() {
        driver.findElement(terms).click();
    }

    public void clickCardTab() {
        driver.findElement(tabCard).click();
    }
}
