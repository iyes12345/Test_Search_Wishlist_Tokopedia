package cucumber.pages;

import cucumber.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Wishlist_Tokopedia {

    private  WebDriver driver;

    public Search_Wishlist_Tokopedia() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    int detik = 3;

    @FindBy(xpath = "//input[@placeholder='Cari di Tokopedia']")
    WebElement textsearch;

    @FindBy(xpath = "//button[@aria-label='Kirimkan']")
    WebElement btnsearch;

    @FindBy(xpath = "//img[@alt='GIGABYTE GeForce RTX 4090 GAMING OC 24GB GDDR6X']")
    WebElement itemproduct;

    @FindBy(xpath = "//img[@data-testid='viewUnwishlisted']")
    WebElement wishlistitemproduct;


    public void inserttextsearch(String inserttextsearch) {
        this.textsearch.sendKeys(inserttextsearch);
    }

    public void buttonsearch() { delay(detik); btnsearch.click();}

    public void buttonclickitemproduct() {
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,500)");
        delay(detik); itemproduct.click();}

    public void buttonclickwishlist() { delay(detik); wishlistitemproduct.click();}

    static void delay(int detik) {


        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }




}
