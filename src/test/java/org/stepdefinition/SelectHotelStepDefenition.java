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

public class SelectHotelStepDefenition {
	public WebDriver driver;

	@Given("User is in the login page")
	public void user_is_in_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}

	@When("Passing valid details in the login and search hotel screen")
	public void passing_valid_details_in_the_login_and_search_hotel_screen() throws InterruptedException {
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("RudeshVA1");
		WebElement userPass = driver.findElement(By.id("password"));
		userPass.sendKeys("Newday@01");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		Thread.sleep(3000);
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
		WebElement searchBtn = driver.findElement(By.id("Submit"));
		searchBtn.click();
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		Assert.assertTrue("Url should contains", url.contains("SelectHotel.php"));
		System.out.println("Success");
	}

	@When("selecting the hotel in the screen")
	public void selecting_the_hotel_in_the_screen() {
		WebElement selectHotel = driver.findElement(By.id("radiobutton_0"));
		selectHotel.click();
	}

	@Then("Click on continue")
	public void click_on_continue() throws InterruptedException {
		WebElement continueBtn = driver.findElement(By.id("continue"));
		continueBtn.click();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		Assert.assertTrue("Should contains the url", url.contains("BookHotel.php"));
		System.out.println("Select Hotel Success");
		driver.quit();
	}

}
