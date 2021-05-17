package testNG.framework.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubMenu{

     WebDriver driver;
	
     public SubMenu(WebDriver driver) 
	 {
	 this.driver= driver;                     
	 PageFactory.initElements(driver, this);
	 }
	
	@FindBy(id = "nav-hamburger-menu")
	WebElement SubMenu;

   @FindBy(xpath = "//*[@data-ref-tag=\"nav_em_1_1_1_18\"]")
   WebElement ElectronicsTile;

    @FindBy(xpath = "(//*[text()='Cell Phones & Accessories'])[2]")
    WebElement accessories;
    
    
    public void InitialSubMenustep()
    {
    	SubMenu.click();
    	ElectronicsTile.click();
    	accessories.click();
    }

}
