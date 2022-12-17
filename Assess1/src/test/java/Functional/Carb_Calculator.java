package Functional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class Carb_Calculator {
	
	WebDriver driver;
	
	Carb_Calculator(WebDriver driver)
	{
		this.driver=driver;
	}
	
	 //Locators
	// For Age, height, weight Text boxes, button calculate
	
	By txt_Age_loc= By.xpath("//input[@id='cage']");
	By txt_Height_loc= By.xpath("//input[@id='cheightmeter']");
	By txt_Weight_loc= By.xpath("//input[@id='ckg']");
	By btn_calculate_loc=  By.xpath("//input[@value='Calculate']");
	By btn_clear_loc=By.xpath("//img[@class='clearbtn']");
	
	
	
	
	
	
	//Action methods
	//Enter  data in fields age, height Weight; select radio buttons, select for dropdown, 
	 void inputAge(float age)
	 {
		 
	   driver.findElement(txt_Age_loc).sendKeys(String.valueOf(age));
	   
	 }
	 void inputHeight(float height)
	 {
		 
	   driver.findElement(txt_Height_loc).sendKeys(String.valueOf(height));
	   
	 }
	 void inputWeight(float weight)
	 {
		 
	   driver.findElement(txt_Weight_loc).sendKeys(String.valueOf(weight));
	   
	 }
	 void clickCalculate()
	 {
		 driver.findElement(btn_calculate_loc).click();
		 
		 
	 }
	 void clickClear()
	 {
		
		 driver.findElement(btn_clear_loc).click();
	 }
	 
	

}
