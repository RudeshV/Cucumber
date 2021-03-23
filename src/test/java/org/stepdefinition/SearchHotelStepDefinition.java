package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchHotelStepDefinition {
	public WebDriver driver;

	@Given("user is in the Login screen and after passing the valid credentials user will enter to the search hotel screen")
	public void user_is_in_the_Login_screen_and_after_passing_the_valid_credentials_user_will_enter_to_the_search_hotel_screen() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@When("user passsing valid {string} and {string}")
	public void user_passsing_valid_and(String UserName, String PassWord) {
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys(UserName);
		WebElement userPass = driver.findElement(By.id("password"));
		userPass.sendKeys(PassWord);
	}

	@When("Click on Login button in login screen")
	public void click_on_Login_button_in_login_screen() throws InterruptedException {
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		Thread.sleep(3000);
	}

	@When("After entering into the search hotel screen user is selecting all the mandatory fields")
	public void after_entering_into_the_search_hotel_screen_user_is_selecting_all_the_mandatory_fields() {
		WebElement locationName = driver.findElement(By.id("location"));
		Select s = new Select(locationName);
		s.selectByIndex(1);
		WebElement hotelName = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotelName);
		s1.selectByValue("Hotel Creek");
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select s2 = new Select(roomType);
		s2.selectByVisibleText("Double");
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		Select s3 = new Select(adultRoom);
		s3.selectByIndex(2);
	}

	@Then("Click on Search button")
	public void click_on_Search_button() throws InterruptedException {
		WebElement searchBtn = driver.findElement(By.id("Submit"));
		searchBtn.click();
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		Assert.assertTrue("Url should contains", url.contains("SelectHotel.php"));
		System.out.println("Success");
	}

}
