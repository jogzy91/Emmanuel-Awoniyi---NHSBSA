package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMsteps {

    WebDriver driver;


    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium Works\\Browers drivers\\chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();     //launches chrome browser

    }

    @When("I open orange hrm homepage")
    public void i_open_orange_hrm_homepage() {

        driver.get("https://opensource-demo.orangehrmlive.com/");

    }

    @Then("I verify that logo is present on page")
    public void i_verify_that_logo_is_present_on_page() {

        boolean status = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertEquals(true, status);

    }

    @And("close browser")
    public void close_browser() {

        driver.quit();

    }


}
