package Functional;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;




public class TC_001_ValidInputs {
	
	WebDriver driver;

  
  @BeforeClass
  
  public void setUp() 
  { 
	  //System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
	  WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver(); 
     driver.manage().window().maximize(); 
     String url = "https://www.calculator.net/carbohydrate-calculator.html"; 
     driver.get(url); 
    
   } 

	
  @Test
  public void calculateCarb() {
	  float age, height,weight;
	  age=25;
	  weight=70;
	  height=175;
	  
	  
	  //Creating object of Calculator page class to perform actions
	  Carb_Calculator cc=new Carb_Calculator(driver);
	  
	 
	  //Entering data and clicking button to Calculate
	  cc.clickClear();
	  cc.inputAge(age);
	  cc.inputHeight(height);
	  cc.inputWeight(weight);
	  
	 
	  cc.clickCalculate();
	  
	  
	  //
	  
	  
	  
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  
	  //checking the presence of result table indicating test success with valid inputs
	  if(!driver.findElements(By.xpath("//table[@class='cinfoT']")).isEmpty()){
		  
		  System.out.println("Test passed");
		  Assert.assertTrue(true);
		  
		  
	    }
	  else{
	       
	  	  System.out.println("Test failed");
	  	  Assert.assertFalse(true);
	    }
	  
  }
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
