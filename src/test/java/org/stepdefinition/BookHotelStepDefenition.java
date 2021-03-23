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

public class BookHotelStepDefenition {
	public WebDriver driver;

	@Given("user is in the login screen")
	public void user_is_in_the_login_screen() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@When("user passing valid details")
	public void user_passing_valid_details() throws InterruptedException {
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
		System.out.println("Successfully entered select hotel page");
		WebElement selectHotel = driver.findElement(By.id("radiobutton_0"));
		selectHotel.click();
		WebElement continueBtn = driver.findElement(By.id("continue"));
		continueBtn.click();
		Thread.sleep(2000);
		String url2 = driver.getCurrentUrl();
		Assert.assertTrue("Should contains the url", url2.contains("BookHotel.php"));
	}

	@Then("user clicking on Book now")
	public void user_clicking_on_Book_now() throws InterruptedException {
		WebElement userFirstName = driver.findElement(By.id("first_name"));
		userFirstName.sendKeys("Rudesh");
		WebElement userLastName = driver.findElement(By.id("last_name"));
		userLastName.sendKeys("V");
		WebElement userAddress = driver.findElement(By.id("address"));
		userAddress.sendKeys("xxxx yyyy");
		WebElement cardNo = driver.findElement(By.id("cc_num"));
		cardNo.sendKeys("1234567891234567");
		WebElement cardType = driver.findElement(By.id("cc_type"));
		Select s4 = new Select(cardType);
		s4.selectByIndex(3);
		WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
		Select s5 = new Select(expMonth);
		s5.selectByValue("12");
		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		Select s6 = new Select(expYear);
		s6.selectByValue("2022");
		WebElement cvvNo = driver.findElement(By.id("cc_cvv"));
		cvvNo.sendKeys("123");
		WebElement bookNowBtn = driver.findElement(By.id("book_now"));
		bookNowBtn.click();
		Thread.sleep(2000);
	}

	@Then("user should see")
	public void user_should_see() {
		System.out.println("Successfully booked a room");
	}
}
