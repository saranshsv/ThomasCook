package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Page;
import pages.locators.HomePageLocators;

public class HomePage extends Page{
	public HomePageLocators home;
	public HomePage() {
		this.home=new HomePageLocators();
		AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.home);
	}
	public void SearchPackages()
	{
		Page.initconfiguration();
		
		sendkeys(driver,home.destination,10,"Paris");
		
		clickOn(driver, home.budgetClick, 10);
		
		clickOn(driver, home.budgetSelect, 10);

		clickOn(driver,home.monthClick,10);

		clickOn(driver,home.monthSelection,10);
		
		clickOn(driver,home.submitBtn,10);
	}
}
