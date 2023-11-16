package Store_class;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobject.BookingPage;
import com.pageobject.LaunchLogin;
import com.utility.BaseClass;
import com.utility.Library;

public class appium_4 extends BaseClass{
	public BookingPage book;
	public LaunchLogin login;
	
	String vehicle_number,pick_up_date,Drop_off_date,odometer_start_reading,odometer_ending_reading,
	pick_up_location,duration,handover_time,Drop_off_location;
		
	@Test(priority=7)
	public void appium_4_TC_0028_verify_Booking_details() throws Exception {
		book = PageFactory.initElements(driver1, BookingPage.class);
		log.info("***************appium_4_TC_0028_verify_Boking_details starts*****************");
		
	//	Assert.assertTrue(book.getClick_Book_now_Button().isDisplayed());
		Library.Custom_click(book.getClick_home_page_button(), "home page tab");
		Library.Custom_click(book.getClick_home_page_Bookings_button(), "home page booking button");
		Thread.sleep(3000);
		appium_4.Scroll_down_page_Action("Page Down");
				try {
					book.getClick_Home_booking_tab_back_button().click();
				
				}catch(Exception e) {
					Thread.sleep(2000);
					appium_4.Scroll_down_page_Action("Page Down");
					book.getClick_Home_booking_tab_back_button().click();
				}
			
		Thread.sleep(5000);
		Library.visible_link(book.getClick_Home_booking_tab_bike_image(), "bike images");
		Library.visible_link(book.getClick_Home_booking_tab_bike_text(),"bike name ="+ book.getClick_Home_booking_tab_bike_text().getText());
		Library.visible_link(book.getClick_Home_booking_tab_pickup_location_txt(), "pick up Location ="+ book.getClick_Home_booking_tab_pickup_location_txt().getText());
		Library.visible_link(book.getClick_Home_booking_tab_pickup_date_txt(),"pick up date ="+ book.getClick_Home_booking_tab_pickup_date_txt().getText());
		Library.visible_link(book.getClick_Home_booking_tab_package_duration(),"Duration ="+ book.getClick_Home_booking_tab_package_duration().getText());
		Library.visible_link(book.getClick_Home_booking_tab_dropoff_date(),"Drop of date ="+ book.getClick_Home_booking_tab_dropoff_date().getText());
		Library.visible_link(book.getClick_Home_booking_tab_total_amount_paid(), "Total amount ="+ book.getClick_Home_booking_tab_total_amount_paid().getText());
		Library.visible_link(book.getClick_Home_booking_tab_booking_status(),"booking status ="+ book.getClick_Home_booking_tab_booking_status().getText());
		
		Library.Custom_click(book.getClick_booking_page_view_button(), "view booking");
		
		
	}
//=================================================================================================================
	@Test(dependsOnMethods={"appium_4_TC_0028_verify_Booking_details"})
	public void appium_4_TC_0029_verify_extend_ride_and_apply_coupon_code() throws Exception {
		book = PageFactory.initElements(driver1, BookingPage.class);
		log.info("***************appium_4_TC_0029_verify_extend_ride_and_apply_coupon_code starts*****************");
		
		Thread.sleep(4000);		
		Library.Custom_click(book.getClick_Home_booking_tab_extend_ride(),"extend ride");
		Thread.sleep(2000);
		try{
			if(book.getClick_Home_booking_tab_extend_ride_select_package().isDisplayed()) {
				//driver1.findElement(By.xpath("//android.widget.EditText[@text='Select Package']")).click();
				Library.Custom_click(book.getClick_Home_booking_tab_extend_ride_select_package(),"select package");
				Library.Custom_click(book.getClick_Home_booking_tab_extend_ride_1_days_package(), "package selected");
				
				Library.Custom_click(book.getClick_Home_booking_tab_extend_ride_verify_offers(), "View offers");
				Thread.sleep(6000);
				Library.Custom_click(book.getClick_Home_booking_tab_extend_ride_save_50_per_offer(), "100% offer selected");
				try {
	//				if(book.getcod_1st_available_ok_button().isDisplayed()) {
						Library.passmsg("Popup is = ", " Displayed");
	//					library.Custom_click(book.getcod_1st_available_ok_button(), "OK button");
		//			}
				}catch(Exception e) {				}
				
				Thread.sleep(4000);
				Library.Custom_click(book.getClick_Home_booking_tab_extend_ride_extend_button(), "extend button");
				Thread.sleep(5000);
				Library.Custom_click(book.getClick_Pay_using_Netbanking(), "select netbanking option");
				Library.Custom_click(book.getClick_Pay_using_SBI_bank(),"select bank ");
				Library.Custom_click(book.getClick_pay_now_button_sbi(), "pay now button");	
				Library.Custom_click(book.getClick_payment_successful(), "payment successful");
				Library.Custom_click(book.getClick_view_booking(), "booking details");
		//		Thread.sleep(3000);
		//		library.Custom_click(book.getClick_home_page_button(),"home page button");
				}
			}
		catch(Exception e) {
			Library.failmsg("Extend ride is"," not available");
		}
	}
//=========================================================================================================================
@SuppressWarnings("deprecation")
	//=========================================================================================================================
	@Test(dependsOnMethods={"appium_4_TC_0029_verify_extend_ride_and_apply_coupon_code"})
//	@Test
	public void appium_4_TC_0030_Admin_End_Ride_request () throws Exception {
		
		log.info("***************appium_4_TC_0030_Admin_End_Ride_request starts*****************");
		
		Browseropen();
		Robot r = new Robot();
		for(int i=0; i<4; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);r.keyPress(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_CONTROL);
		}
		Thread.sleep(3000);
		
		WebElement ele8=driver.findElement(By.xpath("//p[text()='Booking Management']"));Library.Custom_click(ele8, "Booking management");
		Thread.sleep(1000);
		WebElement ele9=driver.findElement(By.xpath("//input[@placeholder='Search User' or @value='prathmesh']"));	Library.custom_sendkeys(ele9, config.getFirst_name(), "Search user name");
		Thread.sleep(3000);
		/////////////////////
		
		WebElement calendar=driver.findElement(By.xpath("(//*[@data-testid='CalendarIcon'])[2]"));		Library.Custom_click(calendar, "calender click");
		
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
				Library.Custom_click(dateselect, "Select date");
			}else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
				WebElement dateselect=driver.findElement(By.xpath("(//button[normalize-space()="+nextdate+"])[1]"));
				Library.Custom_click(dateselect, "Select date");
			}
		
		///////////////////
		WebElement ele10=driver.findElement(By.xpath("//h5[text()='Ongoing']"));Library.Custom_click(ele10, "Ongoing button");
		
		Thread.sleep(1000);
		String s=config.getFirst_name();
		WebElement ele11=driver.findElement(By.xpath("//text[text()='"+s+"']/parent::td//following-sibling::td//div[@id='view-action']"));
		Library.Custom_click(ele11, "table search user request");
		
		WebElement ele12=driver.findElement(By.xpath("//*[text()='Control Buttons']"));Library.Custom_click(ele12, "Control button");
		WebElement endride=driver.findElement(By.xpath("//button[text()='End Ride' or text()='Premature End Ride']"));	Library.Custom_click(endride, "End ride");
		
		Thread.sleep(1000);
		WebElement saveendride=driver.findElement(By.xpath("//button[normalize-space()='Save and End Ride']"));Library.Custom_click(saveendride, "save and end ride");
		Thread.sleep(1000);
		WebElement ViewEditreaidng=driver.findElement(By.xpath("//span[normalize-space()='View/Edit Odometer Readings']"));Library.Custom_click(ViewEditreaidng, "View/Edit Odometer Readings");
		WebElement endreading=driver.findElement(By.xpath("//input[@value='0']"));	Library.custom_sendkeys(endreading, config.getend_km_reading(), "End ride km reading");
		Thread.sleep(1000);
		WebElement ele15=driver.findElement(By.xpath("//button[normalize-space()='Update']"));	Library.Custom_click(ele15, "Update button");
		
		Thread.sleep(2000);
		WebElement ele19=driver.findElement(By.xpath("//*[text()='Control Buttons']"));
		Library.Custom_click(ele19, "Control button");
//		WebElement extracharge=driver.findElement(By.xpath("//button[text()='Add Extra Charges']"));library.Custom_click(extracharge, "add extra charges");
		WebElement Complete=driver.findElement(By.xpath("//button[normalize-space()='Complete Ride']"));		Library.Custom_click(Complete, "Complete ride");
		Thread.sleep(2000);
		WebElement ele16=driver.findElement(By.xpath("//button[normalize-space()='Yes']"));Library.Custom_click(ele16, "Yes button");
		Thread.sleep(2000);
		try {WebElement ele17=driver.findElement(By.xpath("//span[normalize-space()='Completed']"));
			if(ele17.isDisplayed()) {
				Library.passmsg("Successfully ride ","Completed");
			}
		}catch(Exception e) {
				Library.failmsg("Ride is not ", "Completed");
		}
		
		Thread.sleep(2000);
		driver.close();	
	}
//=============================================================================================
//=================================================================================================
	@Test(dependsOnMethods={"appium_4_TC_0030_Admin_End_Ride_request"})
//	@Test
	public void appium_4_TC_0031_verify_booking_page_status() throws Exception {
		book = PageFactory.initElements(driver1, BookingPage.class);
		log.info("***************appium_4_TC_0031_verify_booking_page_status starts*****************");
		Thread.sleep(1000);
		Library.Custom_click(book.getClick_home_page_button(), "home button");
		Library.Custom_click(book.getClick_home_page_Bookings_button(), "home booking button ");
		Thread.sleep(3000);
		Library.Custom_click(book.getClick_Home_booking_tab_back_button(), "back button");
		Thread.sleep(5000);
		Library.visible_link(book.getClick_Home_booking_tab_bike_image(), "bike images");
		Thread.sleep(2000);
		Library.visible_link(book.getClick_Home_booking_tab_bike_text(),"bike name ="+ book.getClick_Home_booking_tab_bike_text().getText());
		Library.visible_link(book.getClick_Home_booking_tab_pickup_location_txt(), "pick up Location ="+ book.getClick_Home_booking_tab_pickup_location_txt().getText());
		Library.visible_link(book.getClick_Home_booking_tab_pickup_date_txt(),"pick up date ="+ book.getClick_Home_booking_tab_pickup_date_txt().getText());
		Library.visible_link(book.getClick_Home_booking_tab_package_duration(),"Duration ="+ book.getClick_Home_booking_tab_package_duration().getText());
		Library.visible_link(book.getClick_Home_booking_tab_dropoff_date(),"Drop of date ="+ book.getClick_Home_booking_tab_dropoff_date().getText());
		Library.visible_link(book.getClick_Home_booking_tab_total_amount_paid(), "Total amount ="+ book.getClick_Home_booking_tab_total_amount_paid().getText());
		Library.visible_link(book.getClick_Home_booking_tab_booking_status(),"booking status ="+ book.getClick_Home_booking_tab_booking_status().getText());
		
		Library.Custom_click(book.getClick_booking_page_view_button(), "view button ");
		Library.Custom_click(book.getClick_show_more_details(), "show more details");
		Library.Custom_click(book.getClick_show_less_details(), "show less details");
		Library.Custom_click(book.getClick_home_page_button(), "home button");
	}
	
//===========================================================================================
	@Test(priority=8)
	public void appium_4_TC_0032_verify_log_out_account() {
		book = PageFactory.initElements(driver1, BookingPage.class);
		log.info("***************appium_4_TC_0032_verify_log_out_account starts*****************");
		
		Assert.assertTrue(book.getClick_home_page_button().isDisplayed());
		Library.Custom_click(book.getClick_home_page_button(), "home button");
		Library.Custom_click(book.getClick_home_page_More_button(), "more  button");
		appium_4.Scroll_UP_page_Action("page up");
//		driver1.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())"+".scrollIntoView(text(\"Logout\"));"));
		Library.Custom_click(book.getClick_more_option_logout_txt(), "log out account");
		Library.Custom_click(book.getClick_more_option_logout_yes_txt(), "confirm log out account");
	}
//=============================================================================================
	@Test(dependsOnMethods="appium_4_TC_0032_verify_log_out_account")
	public void appium_4__TC_0033_Verify_Create_Account_functionality() throws Exception {
		login=PageFactory.initElements(driver1, LaunchLogin.class);
		log.info("************* appium_4__TC_0033_Verify_Create_Account_functionality *************************");
		Thread.sleep(5000);
	Library.Custom_click(login.getCreateAccount(), "CreateAccount");
	Library.visible_link(book.getCA_MF_firstname(), "First name mandotary field ( * )");
	Library.custom_sendkeys(login.getClick_First_name(), config.getFirst_name(), "First name");
	Library.visible_link(book.getCA_MF_lastname(), "Last name mandotary field ( * )");
	Library.custom_sendkeys(login.getClick_Last_name(), config.getLast_name(), "Last name");
	Library.visible_link(book.getCA_MF_mobilenumber(), "Mobile number mandotary field ( * )");
	Library.custom_sendkeys(login.getClick_Enter_Mobile_Number_C_A(), config.getMobile(), "Enter number");
	Library.visible_link(book.getCA_MF_email(), "Email ID mandotary field ( * )");
	Library.custom_sendkeys(login.getClick_Enter_Email(), config.getEnter_Email(), "Enter Email");
	appium_21.EnterButton();
	Library.visible_link(book.getCA_MF_gender(), "Gender mandotary field ( * )");
			if(login.getClick_Gender_Male().isSelected()==true) {
				Library.passmsg("Gender MALE is by default = ", "Selected");
			}else {
				Library.failmsg("Gender MALE is by default = ", "NOT Selected");
			}
	Library.Custom_click(login.getClick_Gender_Female(), "Female gender selected");
	Library.Custom_click(login.getClick_Gender_Other(), "Other gender selected");
	Library.Custom_click(login.getClick_Gender_Male(), "Male gender selected");
			if(login.getClick_I_accept_checkbox().isSelected()==false) {
				Library.passmsg("i accept checkbox By default is not = ", "selected");
			}else {
				Library.failmsg("I accept check box is = ", "Selected");
			}
	Library.Custom_click(login.getClick_I_accept_checkbox(), "Check box selected");
			if(login.getClick_I_accept_checkbox().isSelected()==true) {
				Library.passmsg("I accept check box is = ", "Selected");
			}else {
				Library.failmsg("I accept check box is = ", "NOT Selected");
			}
	Library.visible_link(login.getClick_Terms_and_Conditions(), "Terms and condition ");
	Library.visible_link(login.getClick_Login_button_C_A(), "login button is present");
	Library.Custom_click(login.getClick_Create_My_Account(), "Create my account");
	Thread.sleep(5000);
	Library.custom_sendkeys(login.getEnter_OTP(),config.getOTP(), "Otp");
	Library.Custom_click(login.getSelect_Manually_location(), "location page Select_Manually_location");
	Library.Custom_click(login.getSelect_City_Automation_City(), "Automation city");


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
