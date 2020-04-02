package stepsDefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.When;
import pageObjects.LogInPage;

public class WhenTest {
	LogInPage lg;
	public static WebDriver driver = GivenTest.driver;
	
	
	@When("User clicks on the Women button") //The program clicks on the women button on the top bar to see the list of women's products
	public void user_clicks_on_the_women_button() throws Exception {
		lg = new LogInPage(driver);
		Thread.sleep(5000);
		lg.clickWomen();
	}
	
	@When("User clicks on the list icon above the products") //The program clicks on the list icon to arrange the products into a list
	public void user_clicks_on_the_list_icon_above_the_products() throws Exception {
		Thread.sleep(5000);
		lg.clickList();
	}
	
	@When("User clicks Add to Compare button of the Faded Shirt product") //The program clicks on the add to compare line to compare the product with another one 
	public void user_clicks_add_to_compare_button_of_the_faded_shirt_product() throws Exception {
		Thread.sleep(5000);
		lg.addToCompare1();
	}
	
	@When("User clicks Add to Compare button of the Blouse product") //The program clicks on the add to compare line to compare the product with another one
	public void user_clicks_add_to_compare_button_of_the_blouse_product() throws Exception {
		Thread.sleep(5000);
		lg.addToCompare2();
	}
	
	@When("User clicks Compare button") //The program clicks on the compare button to go to the compare page
	public void user_clicks_compare_button() throws Exception {
		Thread.sleep(5000);;
		lg.compareProducts();
	}
	
	@When("User clicks on Add to cart button of the Faded Shirt product") //The program clicks on the Add to cart button, adding the selected product to the cart
	public void user_clicks_on_add_to_cart_button_of_the_faded_shirt_product() throws Exception {
		Thread.sleep(5000);;
		lg.clickCartBtn();
	}
	
	@When("User clicks Continue Shopping button") //The program clicks on the Continue Shopping button
	public void user_clicks_continue_shopping_button() throws Exception {
		Thread.sleep(5000);;
		lg.clickContinueShoppingBtn();
	}
	
	@When("User clicks on Add to cart button of the Blouse product") //The program clicks on the Add to cart button, adding the selected product to the cart
	public void user_clicks_on_add_to_cart_button_of_the_blouse_product() throws Exception {
		Thread.sleep(5000);;
		lg.clickCartBtn1();
	}
	
	@When("User clicks Continue Shopping button again") //The program clicks on the Continue Shopping button
	public void user_clicks_continue_shopping_button_again() throws Exception {
		Thread.sleep(5000);;
		lg.clickContinueShoppingBtn1();
	}
	
	@When("User clicks on the Cart tab") //The program clicks the cart tab to go to the cart page
	public void user_clicks_on_the_cart_tab() throws Exception {
		Thread.sleep(5000);
		lg.clickCart();
	}
	
	@When("User clicks Proceed to checkout button") //The program clicks the Proceed to checkout button
	public void user_clicks_proceed_to_checkout_button() throws Exception {
		Thread.sleep(5000);
		lg.proceedToCheckout();
	}
	

}

