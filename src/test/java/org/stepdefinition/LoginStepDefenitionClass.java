package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefenitionClass {
	public WebDriver driver;

	@Given("user is in the login page")
	public void user_is_in_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@When("user passing the valid {string} and {string}")
	public void user_passing_the_valid_and(String username, String Password) {
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys(username);
		WebElement userPass = driver.findElement(By.id("password"));
		userPass.sendKeys(Password);
	}

	@When("click on Login button")
	public void click_on_Login_button() throws InterruptedException {
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		Thread.sleep(3000);
	}

	@Then("user should enter in to the Search hotel screen")
	public void user_should_enter_in_to_the_Search_hotel_screen() {
		String searchHotelUrl = driver.getCurrentUrl();
		Assert.assertTrue("Should contains", searchHotelUrl.contains("SearchHotel.php"));
	}

}
