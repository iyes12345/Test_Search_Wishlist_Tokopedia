package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.pages.Search_Wishlist_Tokopedia;
import cucumber.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class TestSearch_Wishlist_Tokopedia {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private Search_Wishlist_Tokopedia search= new Search_Wishlist_Tokopedia();

    public TestSearch_Wishlist_Tokopedia() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User go to Web Tokopedia")
    public void user_got_to_web_tokopedia() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to Web Tokopedia");
    }


    @And("User click and input text search")
    public void user_click_input_text_search() {
        search.inserttextsearch("RTX 4090");
        extentTest.log(LogStatus.PASS, "User click and input text search");
    }

    @And("User click button search")
    public void user_click_button_search() {
        search.buttonsearch();
        extentTest.log(LogStatus.PASS, "User click button masuk");
    }

    @And("User click item")
    public void user_click_item() {
        search.buttonclickitemproduct();
        extentTest.log(LogStatus.PASS, "User click item");
    }

    @Then("User click button wishlist")
    public void user_click_button_wishlist() {
        search.buttonclickwishlist();
        extentTest.log(LogStatus.PASS, "User click button wishlist");
    }




}