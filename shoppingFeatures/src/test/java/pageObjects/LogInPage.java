package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "email") //All tags
	WebElement emailLbl;
	
	@FindBy(id = "passwd") //All tags
	WebElement passwdLbl;
	
	@FindBy(id = "SubmitLogin") //All tags
	WebElement submitBtn;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/h1") //All tags
	WebElement accountHeader;
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a") //All tags
	WebElement womenBtn;
	
	@FindBy(xpath = "//*[@id=\"list\"]/a/i") //All tags
	WebElement listIcon;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div/div[3]/div/div[3]/div[2]/a") //Tag 2
	WebElement addCompare1;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div/div[3]/div/div[3]/div[2]/a") //Tag 2
	WebElement addCompare2;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div[3]/div[2]/form/button/span") //Tag 2
	WebElement compareBtn;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div/div[3]/div/div[2]/a[1]/span") //Tag 3, Tag 4, Tag 5
	WebElement cartButton;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div/div[3]/div/div[2]/a[1]/span") //Tag 3, Tag 5
	WebElement cartButton1;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span") //Tag 3, Tag 4, Tag 5
	WebElement continueShoppingButton;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span") //Tag 3
	WebElement continueShoppingButton1;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a") //Tag 3
	WebElement cartTab;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span") //Tag 5
	WebElement proceedCheckoutBtn;
	
	public void sendEmail(String email) { //Inputs the email String
		emailLbl.sendKeys("projecttesting2803@gmail.com");
	}
	
	public void sendPass(String pass) { //Inputs the password String
		passwdLbl.sendKeys("12345");
	}
	
	public void clickSubmit() { //Clicks the submit button
		submitBtn.click();
	}
	
	public void accountHeaderCheck() { //Compares the page header with the String value to see if they match
		accountHeader.getText().equals("MY ACCOUNT");
	}
	
	public void clickWomen() { //Clicks the Women Button
		womenBtn.click();
	}
	
	public void clickList() { //Clicks the List Icon above the products
		listIcon.click();
	}
	
	public void addToCompare1() { //Clicks the Add to Compare button
		addCompare1.click();
	}
	
	public void addToCompare2() { //Clicks the Add to Compare button
		addCompare2.click();
	}
	
	public void compareProducts() { //Clicks the Compare button
		compareBtn.click();
	}
	
	public void clickCartBtn() { //Clicks the Add to cart button
		cartButton.click();
	}
	
	public void clickContinueShoppingBtn() { //Clicks the Continue Shopping button
		continueShoppingButton.click();
	}
	
	public void clickCartBtn1() { //Clicks the Add to cart button
		cartButton1.click();
	}
	
	public void clickContinueShoppingBtn1() { //Clicks the Continue Shopping button
		continueShoppingButton1.click();
	}
	
	public void clickCart() { //Clicks the Cart tab
		cartTab.click();
	}
	
	public void proceedToCheckout() { //Clicks the Proceed to checkout button
		proceedCheckoutBtn.click();
	}
	

}

