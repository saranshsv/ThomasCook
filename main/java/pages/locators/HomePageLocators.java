package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {


	@FindBy(id="holidayPlace")
	public WebElement destination;
	
	@FindBy(xpath="//div[@class='selectric']/p[contains(text(),'Budget')]")
	public WebElement budgetClick;
	
	@FindBy(xpath="//div[@class='selectric-items']/div/ul/li[@data-index=2]")
	public WebElement budgetSelect;
	
	@FindBy(xpath="//div[@class='selectric']/p[contains(text(),'Month')]")
	public WebElement monthClick;
	
	@FindBy(xpath="//div[@class='selectric-items']/div/ul/ul/li[contains(text(),'Aug')]")
	public WebElement monthSelection;
	
	@FindBy(xpath="//button[@id='search-button']")
	public WebElement submitBtn;
}
