package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class navigationSteps {
	
	WebDriver driver = Hooks.driver;

	
	@Given("the user is on the homepage of hostmaker")
	public void user_on_homepage() {
		System.out.println("Step 1: user is on the home page");
		
		 
		driver.get("https://hostmaker.com/");
		
	}
	@When("the user enters vaild postcode")
	public void user_enters_vaild_postcode() {
		System.out.println("Step 2: user enters vails postcode");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[1]/div[1]/a[2]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/div/div[2]/form/div[1]/div/div[1]/input")).sendKeys("N1 9PD");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/div/div[2]/form/div[1]/div/div[2]/ul/li/span/b")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/div/div[2]/form/div[2]/label[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/div/div[2]/form/button")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/form/div[1]/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/form/div[2]/div[3]/div/div/div/div[2]/div[1]/button[2]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/form/div[2]/div[3]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[3]/td[7]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/form/button")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Neo");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Oke");
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("07539569557");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test@test.com");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/form/button")).click();	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}

	}
	
	@Then ("the user should be able to get an estimate")
	public void user_should_be_able_to_get_an_estimate() {
		System.out.println("Step 3: user should be able to get an estimate");
		String bodyText = driver.findElement(By.xpath("html/body")).getText();
		String Message ="london@hostmaker.com";
		System.out.println(bodyText);
		System.out.println(Message);
		Assert.assertTrue(bodyText.contains(Message));
		
		
	}
	@When("^user enters valid postcode as \"(.*)\"$")
	public void enters_postcode (String postcode) {
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/div/div[2]/form/div[1]/div/div[1]/input")).sendKeys(postcode);
		
	}
	
	@And("^user enters firstname as \"(.*)\"$")
	public void enters_firstname (String firstname) {
	driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(firstname);
   
	}
	
	@And("^user enters lastname as \"(.*)\"$")
	public void enters_lastname(String lastname) {
	driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(lastname);	
	}
	
	@And("^user enters phonenumber as \"(.*)\"$")
	public void enters_phonenumber(String phonenumber) {
	driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys(phonenumber);}
	
	@When("^user enters email as \"(.*)\"$")
	public void enters_email(String username) {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		
	}
}
