package Freedo_domain;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.page_object.booking_page;
import com.page_object.launch_login;
import com.utility.base_class;
import com.utility.library;
@Listeners(com.utility.listner.class)
public class TEST extends base_class {
	public launch_login login;
	public booking_page book;
	public static ExtentTest test;
//	public SoftAssert ass= new SoftAssert(); 
	
//	@Test
//	public void t1() throws Exception {
		
		
		@Test(priority=0)
		public void TC_0052_verify_install_apk() throws Exception {
			Browseropen();
			Thread.sleep(3000);
			Robot r = new Robot();
			for(int i=0; i<4; i++) {
				r.keyPress(KeyEvent.VK_CONTROL);r.keyPress(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_CONTROL);
			}
			Thread.sleep(3000);
			
			WebElement ele1=driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[3]"));library.Custom_click(ele1, "10 user");
			WebElement ele2=driver.findElement(By.xpath("//li[normalize-space()='50']"));library.Custom_click(ele2, "50 user");
		//	WebElement ele3=driver.findElement(By.xpath("//p[text()='Dashboard']"));library.Custom_click(ele3, "Dashboard");
			Thread.sleep(2000);
		//	WebElement ele4=driver.findElement(By.xpath("//button[@title='Reset']"));library.Custom_click(ele4, "Reset button");
			
			Thread.sleep(2000);
			
			String s=config.getFirst_name();
			String l=config.getLast_name();
			WebElement ele5=driver.findElement(By.xpath("//text[text()='"+s+ l+"']/parent::div/parent::td//following-sibling::td//div[@id='reject-action']"));
			library.Custom_click(ele5, "Reject bike booking");
			WebElement ele6=driver.findElement(By.xpath("//div[@id='demo-simple-select-label']"));library.Custom_click(ele6, "select drop down");
			
			Thread.sleep(1000);
			WebElement ele7=driver.findElement(By.xpath("//li[@data-value='Booked by mistake']"));library.Custom_click(ele7, "Booked My Mistake");
			WebElement ele8=driver.findElement(By.xpath("//button[text()='Submit']"));library.Custom_click(ele8, "Submit button");
			Thread.sleep(1000);
			WebElement ele9=driver.findElement(By.xpath("//button[text()='Yes']"));library.Custom_click(ele9, "Yes button");
			Thread.sleep(4000);
			try {
				driver.navigate().refresh();
				Thread.sleep(3000);
				if(ele5.isDisplayed()) {
					library.Custom_click(ele5, "Reject bike booking");
					library.Custom_click(ele6, "select drop down");
					
					Thread.sleep(1000);
					library.Custom_click(ele7, "Booked My Mistake");
					library.Custom_click(ele8, "Submit button");
					Thread.sleep(1000);
					library.Custom_click(ele9, "Yes button");
					Thread.sleep(4000);
				}
			}catch(Exception e) {
				
			}	
			library.passmsg("Approval is sucessfully "," rejected");
			driver.close();	
			
			
			
		}
}
