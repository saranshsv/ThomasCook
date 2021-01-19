package testcases;

import org.testng.annotations.Test;

import pages.actions.HomePage;

public class SearchPackagesTest {
	
	@Test
	public void searchPackagesTest() {
		HomePage obj1=new HomePage();
		obj1.SearchPackages();
	}
}
