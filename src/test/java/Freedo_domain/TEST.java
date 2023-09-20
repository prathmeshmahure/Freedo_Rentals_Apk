package Freedo_domain;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.List;

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
					for(int i=0; i<3; i++) {
					r.keyPress(KeyEvent.VK_PAGE_DOWN);r.keyRelease(KeyEvent.VK_PAGE_DOWN);
					}
			WebElement ele4=driver.findElement(By.xpath("//button[@title='Reset']"));library.Custom_click(ele4, "Reset button");
//			WebElement ele1=driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[3]"));library.Custom_click(ele1, "10 user");
//			WebElement ele2=driver.findElement(By.xpath("//li[normalize-space()='50']"));library.Custom_click(ele2, "50 user");
			Thread.sleep(3000);
			String s=config.getFirst_name();//user name to find web table
			String l=config.getLast_name();
			Thread.sleep(3000);
			WebElement ele5=driver.findElement(By.xpath("//text[text()='"+s+" "+l+"']/parent::div/parent::td//following-sibling::td//div[@id='approve-action']"));
			library.Custom_click(ele5, "accept booking request");
			Thread.sleep(1000);
			WebElement ele6=driver.findElement(By.xpath("//button[text()='Yes']"));
			library.Custom_click(ele6, "Yes button");
			
			Thread.sleep(4000);
					try {
					if(ele5.isDisplayed() && ele5.isEnabled() == true)  {
						
						library.Custom_click(ele5, "accept booking request 2");
						Thread.sleep(1000);
						library.Custom_click(ele6, "Yes button 2");
					}}catch(Exception e) {
						library.passmsg("Admin request ", "Accepted");
					}
			
			
			Thread.sleep(2000);
			WebElement ele7=driver.findElement(By.xpath("//text[text()='"+s+" "+l+"']/parent::div/parent::td//following-sibling::td//div[@id='view-action']"));
			library.Custom_click(ele7, "view data");
			Thread.sleep(3000);
			WebElement ele8=driver.findElement(By.xpath("//p[text()='Booking Management']"));library.Custom_click(ele8, "Booking management");
			
			WebElement ele9=driver.findElement(By.xpath("//input[@placeholder='Search User' or @value='prathmesh']"));	library.custom_sendkeys(ele9, config.getFirst_name(), "Search user name");
			Thread.sleep(3000);
			///////////////////////////////////////////////// calender
			
			
			WebElement calendar=driver.findElement(By.xpath("(//*[@data-testid='CalendarIcon'])[2]"));		library.Custom_click(calendar, "calender click");
			
			Date d=new Date();
			int  da=d.getDate();
			int m=Integer.parseInt(config.getdate());
			int date=da+m;
			
			List<WebElement> lastday=driver.findElements(By.xpath("//div[@role][4]/parent::div/parent::div/parent::div//following-sibling::div//button"));
			int totaldays=lastday.size();
			int i=date;
			int nextdate=i-totaldays;
				if(i<=totaldays) {
					WebElement dateselect=driver.findElement(By.xpath("(//button[normalize-space()="+i+"])[1]"));
					library.Custom_click(dateselect, "Select date");
				}else {
					driver.findElement(By.xpath("//button[@title='Next month']")).click();
					WebElement dateselect=driver.findElement(By.xpath("(//button[normalize-space()="+nextdate+"])[1]"));
					library.Custom_click(dateselect, "Select date");
				}
			
					
			///////////////////////////////////////////////////////////
			WebElement ele10=driver.findElement(By.xpath("//h5[text()='Upcoming']"));library.Custom_click(ele10, "Upcoming button");
			
			Thread.sleep(2000);
			WebElement ele11=driver.findElement(By.xpath("//div[@id='view-action']"));
			library.Custom_click(ele11, "table search user request view action");
			
		//	WebElement ele12=driver.findElement(By.xpath("//*[text()='Control Buttons']"));library.Custom_click(ele12, "Control button");
			WebElement ele13=driver.findElement(By.xpath("(//button[text()='Start Ride' or @data-bs-toggle='modal'])[1]"));library.Custom_click(ele13, "Start ride");
			WebElement ele14=driver.findElement(By.xpath("//input[@placeholder='Start Reading']"));library.custom_sendkeys(ele14, config.getstart_km_reading(), "enter bike reading");
			WebElement dropdownbike=driver.findElement(By.xpath("//option[text()='Select Registration']"));library.Custom_click(dropdownbike, "Select bike number");
			WebElement dropdownbike1=driver.findElement(By.xpath("(//option[@value])[2]"));library.Custom_click(dropdownbike1, "bike number is selected");
			
			//////////////////////////////////////////////////////// date as per select bike booking
			WebElement calendar2=driver.findElement(By.xpath("//input[@type='date']"));		library.Custom_click(calendar2, "calender click");
			if(i<=totaldays) {
				WebElement dateselect=driver.findElement(By.xpath("(//button[normalize-space()="+i+"])[1]"));
				library.Custom_click(dateselect, "Select date");
			}else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
				WebElement dateselect=driver.findElement(By.xpath("(//button[normalize-space()="+nextdate+"])[1]"));
				library.Custom_click(dateselect, "Select date");
			}
			///////////////////////////////////////////////////////
			
			
			WebElement ele15=driver.findElement(By.xpath("//button[text()='Start Ride']"));	library.Custom_click(ele15, "Start ride button");
//			WebElement ele16=driver.findElement(By.xpath("//button[text()='Yes']"));library.Custom_click(ele16, "Yes button");
			
			Thread.sleep(3000);
			log.info("Approval is sucessfully Accepted");
			driver.close();	
		}
}
