package testNG.framework.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Homepage {

	  WebDriver driver;                  //declaring driver. it will be generic which will use by through out the classes.
	
	  public Homepage(WebDriver driver) //this constructor called as parametric constructor
	  {
	  this.driver= driver;                     
	  PageFactory.initElements(driver, this);
	  }
	
	//in page we put three kind of information
		//object
		//method
		//create Constructor and initialize the elements 
		
	//as soon AS obj of home page created constructor gets called up automatically 
  //it happens internally,in order to initialize some memory
  //to the variable of class.
	//Constructor helps in assigning the default values to the class variable
	//this key word means generic driver that we declared on top 
	
	
	@FindBy(id = "nav-link-accountList")
	WebElement SignIN;
	
	public void SignINDisplayed()
	{
		Assert.assertEquals(SignIN.isDisplayed(), true);
		//System.out.println(SignIN.isDisplayed());
	}
}

