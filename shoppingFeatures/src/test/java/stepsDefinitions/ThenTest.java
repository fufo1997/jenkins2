package stepsDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Then;

public class ThenTest {
	WebDriver driver = WhenTest.driver;
	
	@Then("User should see the products arranged in the form of a list") //The program checks the description of the faded shirt product that only appears if the list display is selected
	public void user_should_see_the_products_arranged_in_the_form_of_a_list() throws Exception {
		Thread.sleep(4000);
		WebElement lblDescription = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div/div[2]/p"));
		Assert.assertTrue(lblDescription.getText().equals("Faded short sleeve t-shirt with high neckline. Soft and stretchy material for a comfortable fit. Accessorize with a straw hat and you're ready for summer!"));
	}
	
	@Then("User should see the information of both products in the Product Comparison page") //The program checks the header of the compare page to confirm the user is in the correct page
	public void user_should_see_the_information_of_both_products_in_the_product_comparison_page() throws Exception {
		Thread.sleep(4000);
		WebElement lblCompare = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1"));
		Assert.assertTrue(lblCompare.getText().equals("PRODUCT COMPARISON"));
	}
	
	@Then("User should see the items in their cart") //The program checks the text of the cart page to confirm that the amount of items in it is the correct one
	public void user_should_see_the_items_in_their_cart() throws Exception {
		Thread.sleep(4000);
		WebElement lblCart = driver.findElement(By.xpath("//*[@id=\"cart_title\"]/span"));
		Assert.assertTrue(lblCart.getText().equals("Your shopping cart contains: 2 Products"));
	}
	
	@Then("User should see the Women products page to keep shopping and one item in their cart") //The program checks the url of the webpage to confirm the user is in the correct page, and then checks the cart tab to see if the number of items in it is correct
	public void user_should_see_the_women_products_page_to_keep_shopping_and_one_item_in_their_cart() throws Exception {
		Thread.sleep(4000);
		Assert.assertTrue(driver.getCurrentUrl().equals("http://automationpractice.com/index.php?id_category=3&controller=category"));
		WebElement lblCart = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[1]"));
		Assert.assertTrue(lblCart.getText().equals("1"));
	}
	
	@Then("User should see the items from their cart and continue to the payment process") //The program checks the text of the cart page to confirm that the amount of items in it is the correct one, and checks the url to confirm the user is in the correct page
	public void user_should_see_the_items_from_their_cart_and_continue_to_the_payment_process() throws Exception {
		Thread.sleep(4000);
		WebElement lblCart = driver.findElement(By.xpath("//*[@id=\"cart_title\"]/span"));
		Assert.assertTrue(lblCart.getText().equals("Your shopping cart contains: 2 Products"));
		Assert.assertTrue(driver.getCurrentUrl().equals("http://automationpractice.com/index.php?controller=order"));
	}
	
	

}

