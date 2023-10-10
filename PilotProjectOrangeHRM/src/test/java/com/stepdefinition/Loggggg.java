package com.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loggggg {
	WebDriver driver;
	@Given("Open Browser OrangeHRM")
	public void open_browser_orange_hrm() {
		driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.manage().window().maximize();
	   
	}
	@When("User should enter the username and password")
	public void user_should_enter_the_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@And("click the Login btn and logout")
	public void click_the_login_btn_and_logout() {
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		  driver.findElement(By.xpath("//li[@class='oxd-userdropdown']//child::span")).click();
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	 
	}

	@Then("Check for the Functionality of the Forgotten password")
	public void check_for_the_functionality_of_the_forgotten_password() {
		driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}
	
	@AfterMethod
	public void f() {
		driver.close();
		
	}

}
