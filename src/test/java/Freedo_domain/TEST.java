package Freedo_domain;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
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
	
//	@Test
//	public void t1() throws Exception {
		
		
		@Test(priority=0)
		public void TC_001_verify_install_apk() throws Exception {
			login=PageFactory.initElements(driver1, launch_login.class);
			book = PageFactory.initElements(driver1, booking_page.class);
			log.info("***************TC_001_Test class  starts*****************");
			login=PageFactory.initElements(driver1, launch_login.class);	
			
			Browseropen();
			Thread.sleep(3000);
			Robot r = new Robot();
			for(int i=0; i<4; i++) {
				r.keyPress(KeyEvent.VK_CONTROL);r.keyPress(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_CONTROL);
			}
			Thread.sleep(3000);
			
			WebElement ele3=driver.findElement(By.xpath("//h5[normalize-space()='Return Requests Received']"));library.Custom_click(ele3, "Return Requests Received");
			
			Thread.sleep(3000);
			String s=config.getFirst_name();//user name to find web table
			WebElement ele5=driver.findElement(By.xpath("//text[text()='"+s+"']/parent::div/parent::td//following-sibling::td//div[@id='view-action']"));
			library.Custom_click(ele5, "View booking request");
			Thread.sleep(2000);
			
			WebElement ViewEditreaidng=driver.findElement(By.xpath("//span[normalize-space()='View/Edit Odometer Readings']"));library.Custom_click(ViewEditreaidng, "View/Edit Odometer Readings");
			WebElement endreading=driver.findElement(By.xpath("//input[@value='0']"));	library.custom_sendkeys(endreading, config.getend_km_reading(), "End ride km reading");
			Thread.sleep(1000);
			WebElement ele15=driver.findElement(By.xpath("//button[normalize-space()='Update']"));	library.Custom_click(ele15, "Update button");
			
			Thread.sleep(2000);
			WebElement ele19=driver.findElement(By.xpath("//*[text()='Control Buttons']"));
			library.Custom_click(ele19, "Control button");
//			WebElement extracharge=driver.findElement(By.xpath("//button[text()='Add Extra Charges']"));library.Custom_click(extracharge, "add extra charges");
			WebElement Complete=driver.findElement(By.xpath("//button[normalize-space()='Complete Ride']"));		library.Custom_click(Complete, "Complete ride");
			Thread.sleep(2000);
			WebElement ele16=driver.findElement(By.xpath("//button[normalize-space()='Yes']"));library.Custom_click(ele16, "Yes button");
			Thread.sleep(2000);
			
			Thread.sleep(3000);
			log.info("Ride  is sucessfully completed");
			driver.close();

		
		}
	
}
