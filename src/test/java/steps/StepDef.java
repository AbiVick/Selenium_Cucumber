/*package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {

	WebDriver driver;

	@Given("User launch chrome browser")
	public void launchBrowser() {

		System.out.println("chrome browser...");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@When("user open app URL {string}")
	public void launchApp(String url) {
		driver.get(url);
	}

	@When("user enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String pwd) {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(pwd);

	}

	@When("click on Login")
	public void click_on_Login() {
		driver.findElement(By.tagName("button")).click();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) throws Exception {
		Thread.sleep(5000);
		Assert.assertEquals(expectedTitle, driver.getTitle());

	}

	@When("user click on Logout link")
	public void user_click_on_Logout_link() {
		driver.findElement(By.partialLinkText("Logo")).click();
	}

	@Then("close browser")
	public void close_browser() throws InterruptedException {

		Thread.sleep(5000);
		driver.close();
	}

}
*/