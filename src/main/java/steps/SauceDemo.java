package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemo {
	
	public ChromeDriver driver;
	@Given("Launch the Chrome browser")
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@And("Load the URL and maximize")
	public void loadURL()
	{
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@When("Enter Username as {string}")
	public void enterUsername(String username)
	{
		driver.findElement(By.id("user-name")).sendKeys(username);
	}
	
	@And("Enter Password as {string}")
	public void enterPassword(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@And("Click on Login")
	public void clickLogin()
	{
		driver.findElement(By.id("login-button")).click();
	}
	
	@When("Click on Sauce Labs Fleece Jacket")
	public void clickFleeceJacket()
	{
		driver.findElement(By.xpath("(//div[@class='inventory_item'])[4]//a[@id='item_5_title_link']")).click();
	}
	
	@And("Click on Add to Cart")
	public void addToCart()
	{
		driver.findElement(By.xpath("//div[@class='inventory_details_price']//following::button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
	}
	
	@And("Click on Back To Products")
	public void backToProducts() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.id("back-to-products")).click();
	}
	
	@And("Click on Sauce Labs Bolt T-Shirt")
	public void clickBoltTShirt()
	{
		driver.findElement(By.xpath("//a[@id='item_1_title_link']")).click();
	}
	
	@And("Add Bolt T-Shirt to Cart")
	public void clickAddToCart()
	{
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	}
	
	@And("Click on Shopping Cart Container on the top")
	public void clickCartContainer()
	{
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
	}
	
	@And("Click on Checkout")
	public void clickCheckout()
	{
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
	}
	
	@When("Enter FirstName as {string}")
	public void enterFirstName(String firstName)
	{
		driver.findElement(By.id("first-name")).sendKeys(firstName); 
	}
	
	@And("Enter LastName as {string}")
	public void enterLastName(String lastName)
	{
		driver.findElement(By.id("last-name")).sendKeys(lastName);
	}
	
	@And("Enter Zip as {string}")
	public void enterZip(String zip)
	{
		driver.findElement(By.id("postal-code")).sendKeys(zip);
	}
	
	@And("Click on Continue")
	public void clickContinue()
	{
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
	
	@And("Click on Finish")
	public void clickFinish() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.id("finish")).click();
	}
	
	@Then("Verify success message")
	public void verifySuccessMessage() throws InterruptedException
	{
		String successMsg = driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
		Thread.sleep(1000);
		System.out.println("Success Message :"+successMsg);
		Thread.sleep(3000);
		driver.quit();
	}

}
