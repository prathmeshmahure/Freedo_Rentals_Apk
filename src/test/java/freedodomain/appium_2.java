package freedodomain;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.pageobject.BookingPage;
import com.pageobject.LaunchLogin;
import com.utility.BaseClass;
import com.utility.Library;

@Listeners(com.utility.listner.class)
public class appium_2 extends BaseClass{
	public BookingPage book;
	public LaunchLogin login;
	public static ExtentTest test;
//============================================================================================================
//	@Test(dependsOnMethods={"TC_0051_Verify_user_able_to_view_booking_status_all_elements"})
	@Test(priority=1)
	public void TC_0052_admin_Request_reject () throws Exception  {
		log.info("***************TC_0052_admin_Request_reject starts*****************");

		Browseropen();
		Thread.sleep(3000);
		Robot r = new Robot();
		for(int i=0; i<4; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);Thread.sleep(300);r.keyPress(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_CONTROL);
		}
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);	
		
		String s=config.getFirst_name();
		String l=config.getLast_name();
		WebElement ele5=driver.findElement(By.xpath("//text[text()='"+s+" "+l+"']/parent::div/parent::td//following-sibling::td//div[@id='reject-action']"));
		Library.Custom_click(ele5, "Reject bike booking");
		WebElement ele6=driver.findElement(By.xpath("//div[@id='demo-simple-select-label']"));Library.Custom_click(ele6, "select drop down");
		
		Thread.sleep(1000);
		WebElement ele7=driver.findElement(By.xpath("//li[@data-value='Booked by mistake']"));Library.Custom_click(ele7, "Booked My Mistake");
		WebElement ele8=driver.findElement(By.xpath("//button[text()='Submit']"));Library.Custom_click(ele8, "Submit button");
		Thread.sleep(1000);
		WebElement ele9=driver.findElement(By.xpath("//button[text()='Yes']"));Library.Custom_click(ele9, "Yes button");
		Thread.sleep(4000);
		try {
			driver.navigate().refresh();
			Thread.sleep(3000);
			if(ele5.isDisplayed()) {
				Library.Custom_click(ele5, "Reject bike booking");
				Library.Custom_click(ele6, "select drop down");
				
				Thread.sleep(1000);
				Library.Custom_click(ele7, "Booked My Mistake");
				Library.Custom_click(ele8, "Submit button");
				Thread.sleep(1000);
				Library.Custom_click(ele9, "Yes button");
				Thread.sleep(4000);
			}
		}catch(Exception e) {
			
		}	
		Library.passmsg("Approval is sucessfully "," rejected");
		driver.close();
	}

//=============================================================================================================
	//@Test(dependsOnMethods={"TC_0052_admin_Request_reject"})
	@Test(priority=2)
	public void TC_0053_Track_booking_status () throws Exception  {
		//book = PageFactory.initElements(driver1, booking_page.class);
		book = new BookingPage(driver1);
		log.info("***************TC_0053_Track_booking_status starts*****************");
		
		book.clickOnHomeButton();
		book.clickOnHomePageBookingsButton();
		book.verifyTrackBookingStatus();
		book.verifyBookingStatus();
		book.clickOnBackButtonInFBDPage();
	}
//==============================================================================================================	
	//@Test(dependsOnMethods={"TC_0053_Track_booking_status"})
	@Test(priority=3)
	public void TC_0054_Verify_user_able_to_logout_cancel () throws Exception  {
		log.info("***************TC_0054_Verify_user_able_to_logout_cancel starts*****************");
			
		book.clickOnHomeButton();
		book.clickOnHomePageMoreButton();
		book.clickOnLogoutCancelButton();
	}
//=============================================================================================================
	//@Test(dependsOnMethods={"TC_0054_Verify_user_able_to_logout_cancel"})
	@Test(priority=4)
	public void TC_0055_Verify_user_able_to_successful_logout () throws Exception  {
		//login=PageFactory.initElements(driver1, launch_login.class);
		login = new LaunchLogin(driver1);
		log.info("***************TC_0055_Verify_user_able_to_logout starts*****************");
			
			book.clickOnLogoutYesButton();
			login.verifyLoginHeading();
	}
//==================================================================================================================
	//@Test(dependsOnMethods={"TC_0055_Verify_user_able_to_successful_logout"})
	@Test(priority=5)
	public void TC_0056_Verify_user_able_to_deactivate_account () throws Exception  {
		
		log.info("***************TC_0056_Verify_user_able_to_deactivate_account starts*****************");
			
		login.enterMobileNumber(config.getMobile());
		login.clickOnLoginButton();
		login.enterOtp2(config.getOTP());	
		login.verifyAndClicklocationNotification();
		login.clickSelectedCityName();
		book.clickOnHomePageMoreButton();
		book.clickAndVerifyPrivacyPolicyPage();
		login.clickAndVerifyPrivacyPolicyPage();
		appium_2.Back_button();
		Thread.sleep(2000);
		appium_2.Back_button();
		Thread.sleep(1000);
	}
//============================================================================================================================
	//@Test(dependsOnMethods={"TC_0056_Verify_user_able_to_deactivate_account"})
	@Test(priority=6)
	public void TC_0057_Verify_user_able_to_COD_booking() throws Exception  {
		log.info("***************TC_0057_Verify_user_able_to_COD_booking starts*****************");
		
		book.clickOnHomeButton();
		book.clickOnEnterAerrowButton();
		book.clickDatePackageAndGoFreedoButton();
		book.clickOnBookNowButton();
		book.clickOnLocationPopUpOkButton();
		book.clickOnContinueButton();
		book.clickOnCODBooking();
		book.clickOnSummaryPagePaynowButton();
		book.clickOnViewBooking();
	}
//=============================================================================================================================	
	@Test(dependsOnMethods={"TC_0057_Verify_user_able_to_COD_booking"})
	//@Test(priority=7)
	public void TC_0058_admin_Request_reject () throws Exception  {
		log.info("***************TC_0058_admin_Request_reject starts*****************");

		Browseropen();
		Robot r = new Robot();
		for(int i=0; i<4; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);Thread.sleep(300);r.keyPress(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_CONTROL);
		}
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		WebElement ele1=driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[3]"));library.Custom_click(ele1, "10 user");
//		WebElement ele2=driver.findElement(By.xpath("//li[normalize-space()='50']"));library.Custom_click(ele2, "50 user");
	//	WebElement ele3=driver.findElement(By.xpath("//p[text()='Dashboard']"));library.Custom_click(ele3, "Dashboard");
		Thread.sleep(2000);
	//	WebElement ele4=driver.findElement(By.xpath("//button[@title='Reset']"));library.Custom_click(ele4, "Reset button");
		
		Thread.sleep(2000);
		
		String s=config.getFirst_name(); 
		String l=config.getLast_name();
		WebElement ele5=driver.findElement(By.xpath("//text[text()='"+s+" "+l+"']/parent::div/parent::td//following-sibling::td//div[@id='reject-action']"));
		Library.Custom_click(ele5, "Reject bike booking");
		WebElement ele6=driver.findElement(By.xpath("//div[@id='demo-simple-select-label']"));Library.Custom_click(ele6, "select drop down");
		
		Thread.sleep(1000);
		WebElement ele7=driver.findElement(By.xpath("//li[@data-value='Booked by mistake']"));Library.Custom_click(ele7, "Booked My Mistake");
		WebElement ele8=driver.findElement(By.xpath("//button[text()='Submit']"));Library.Custom_click(ele8, "Submit button");
		Thread.sleep(1000);
		WebElement ele9=driver.findElement(By.xpath("//button[text()='Yes']"));Library.Custom_click(ele9, "Yes button");
		Thread.sleep(4000);
		try {
			driver.navigate().refresh();
			Thread.sleep(3000);
			if(ele5.isDisplayed()) {
				Library.Custom_click(ele5, "Reject bike booking");
				Library.Custom_click(ele6, "select drop down");
				
				Thread.sleep(1000);
				Library.Custom_click(ele7, "Booked My Mistake");
				Library.Custom_click(ele8, "Submit button");
				Thread.sleep(1000);
				Library.Custom_click(ele9, "Yes button");
				Thread.sleep(4000);
			}
		}catch(Exception e) {
			
		}	
		Library.passmsg("Approval is sucessfully "," rejected");
		driver.close();
	}
//===========================================================================================================================

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
