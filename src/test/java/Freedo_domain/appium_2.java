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
public class appium_2 extends base_class{
	public booking_page book;
	public launch_login login;
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
			r.keyPress(KeyEvent.VK_CONTROL);r.keyPress(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_CONTROL);
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

//=============================================================================================================
	//@Test(dependsOnMethods={"TC_0052_admin_Request_reject"})
	@Test(priority=2)
	public void TC_0053_Track_booking_status () throws Exception  {
		//book = PageFactory.initElements(driver1, booking_page.class);
		book = new booking_page(driver1);
		log.info("***************TC_0053_Track_booking_status starts*****************");
			
		library.Custom_click(book.getClick_home_page_button(), "Home button");
		Thread.sleep(2000);
		library.Custom_click(book.getClick_home_page_Bookings_button(), "Home page booking button");
		Thread.sleep(12000);
		library.visible_link(book.getClick_Home_booking_tab_track_booking_status(), "Track booking status");
		Thread.sleep(1000);
		library.visible_link(book.getClick_Home_booking_tab_booking_status_page_tittle(), "Booking Status ");
		appium_2.Back_button();
		Thread.sleep(2000);
		appium_2.Back_button();
		Thread.sleep(1000);
	}
//==============================================================================================================	
	//@Test(dependsOnMethods={"TC_0053_Track_booking_status"})
	@Test(priority=3)
	public void TC_0054_Verify_user_able_to_logout_cancel () throws Exception  {
		log.info("***************TC_0054_Verify_user_able_to_logout_cancel starts*****************");
			
		Thread.sleep(3000);
		library.Custom_click(book.getClick_home_page_button(), "Home button");
		Thread.sleep(3000);
		library.Custom_click(book.getClick_home_page_More_button(), "more  button");
		Thread.sleep(2000);
		appium_2.Scroll_UP_page_Action("page up");
		library.Custom_click(book.getClick_more_option_logout_txt(), "log out account");
		library.Custom_click(book.getMore_button_logout_cancel(), "Logout cancel");
	}
//=============================================================================================================
	//@Test(dependsOnMethods={"TC_0054_Verify_user_able_to_logout_cancel"})
	@Test(priority=4)
	public void TC_0055_Verify_user_able_to_successful_logout () throws Exception  {
		//login=PageFactory.initElements(driver1, launch_login.class);
		login = new launch_login(driver1);
		log.info("***************TC_0055_Verify_user_able_to_logout starts*****************");
			
		Thread.sleep(2000);
		library.Custom_click(book.getClick_more_option_logout_txt(), "log out account");
		library.Custom_click(book.getClick_more_option_logout_yes_txt(), "Logout");
		Thread.sleep(3000);
		library.visible_link(login.getLogin_heading(), "Login heading");
	}
//==================================================================================================================
	//@Test(dependsOnMethods={"TC_0055_Verify_user_able_to_successful_logout"})
	@Test(priority=5)
	public void TC_0056_Verify_user_able_to_deactivate_account () throws Exception  {
		
		log.info("***************TC_0056_Verify_user_able_to_deactivate_account starts*****************");
			
		library.custom_sendkeys(login.getEnter_MO_Number(), config.getMobile(), "MObile number entering");
		library.Custom_click(login.getClick_Login_button(), "login button");
		Thread.sleep(6000);
		library.custom_sendkeys(login.getEnter_OTP(),config.getOTP(),"OTP send");
		Thread.sleep(2000);
		library.Custom_click(login.getSelect_Manually_location(), "Select manually location");
		Thread.sleep(2000);
		library.Custom_click(login.getSelect_City_Noida(), config.getcity_name()+" city");
		Thread.sleep(2000);
		library.Custom_click(book.getClick_home_page_More_button(), "More button");
		Thread.sleep(2000);
		library.Custom_click(book.getMore_button_privacy_policy(), "Privacy policy");
		library.Custom_click(login.getDelete_account_dropdown(), "Delete account");
		library.Custom_click(login.getDA_checkbox_1(), "Bad experiance on ride");
		library.visible_link(login.getDA_checkbox_1(), "Bad experiance on a ride");
		library.visible_link(login.getDA_checkbox_2(), "it's too experiance");
		library.visible_link(login.getDA_checkbox_3(), "Negative support experiance");
		library.visible_link(login.getDA_checkbox_4(), "Issues with my internet");
		library.visible_link(login.getDA_checkbox_5(), "No longer support company");
		library.visible_link(login.getDA_checkbox_6(), "Prefer not to say");
		library.visible_link(login.getDA_checkbox_7(), "Others");
		library.visible_link(login.getPrivacy_policy_Changed_mind_go_back(), "Changed mind go back");
		library.visible_link(login.getPrivacy_policy_Deactivate_account(), "Deactivate account");
		library.visible_link(login.getPrivacy_policy_confirm_deletion(), "Confirm deletion");
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
		
		Thread.sleep(3000);
		library.Custom_click(book.getClick_home_page_button(), "Home button");
		Thread.sleep(2000);
		library.Custom_click(book.getClick_1st_page_enter_button(), "Enter button");
		library.date_select();
		library.Custom_click(book.getClick_Package_dropdown(), "package dropdown");
		library.Custom_click(book.getClick_1_Days_package(),"Selected package");
		library.Custom_click(book.getClick_go_freedo_Button(), "Go Freedo button");
		Thread.sleep(2000);
		library.Custom_click(book.getBook_now_button(), "Book now button");
		Thread.sleep(2000);
		library.Custom_click(book.getclick_location_pop_up_ok_button(), "ok button");
		library.Custom_click(book.getClick_Continue_Tab(), "Continue button");
		Thread.sleep(2000);
		appium_2.Scroll_UP_page_Action("page up");
		library.Custom_click(book.getClick_cash_on_delivery(), "Cod booking");
	//	library.Custom_click(book.getClick_I_accept_checkbox(), "I accept checkbox");
		Thread.sleep(1000);
		library.Custom_click(book.getClick_summary_pay_now_button(), "Pay now button");
		Thread.sleep(1000);
		library.Custom_click(book.getClick_view_booking(), "View booking");
	}
//=============================================================================================================================	
	@Test(dependsOnMethods={"TC_0057_Verify_user_able_to_COD_booking"})
	//@Test(priority=7)
	public void TC_0058_admin_Request_reject () throws Exception  {
		log.info("***************TC_0058_admin_Request_reject starts*****************");

		Browseropen();
		Robot r = new Robot();
		for(int i=0; i<4; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);r.keyPress(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_CONTROL);
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
//===========================================================================================================================
	//@Test(dependsOnMethods={"TC_0058_admin_Request_reject"})
	@Test(priority=8)
	public void TC_0059_Verify_user_able_to_Online_payment_booking() throws Exception  {
		log.info("***************TC_0059_Verify_user_able_to_Online_payment_booking starts*****************");
		book = new booking_page(driver1);
		
		library.Custom_click(book.getClick_home_page_button(), "Home button");
		Thread.sleep(2000);
		library.Custom_click(book.getClick_1st_page_enter_button(), "Enter button");
		library.date_select();
		library.Custom_click(book.getClick_Package_dropdown(), "package dropdown");
		library.Custom_click(book.getClick_1_Days_package(),"Selected package");
		library.Custom_click(book.getClick_go_freedo_Button(), "Go Freedo button");
		Thread.sleep(2000);
		library.Custom_click(book.getBook_now_button(), "Book now button");
		Thread.sleep(2000);
		library.Custom_click(book.getclick_location_pop_up_ok_button(), "ok button");
		library.Custom_click(book.getClick_Continue_Tab(), "Continue button");
		Thread.sleep(4000);
		appium_2.Scroll_UP_page_Action("page up");
	//	library.Custom_click(book.getClick_I_accept_checkbox(), "I accept checkbox");
		Thread.sleep(1000);
		library.Custom_click(book.getClick_summary_pay_now_button(), "Pay now button");
		Thread.sleep(5000);
		library.Custom_click(book.getClick_Pay_using_Netbanking(), "Pay using Netbanking");
		library.Custom_click(book.getClick_Pay_using_SBI_bank(), "Select SBI bank");
		library.Custom_click(book.getClick_pay_now_button_sbi(), "Pay Now button");
		
		library.Custom_click(book.getClick_payment_successful(), "payment successful");
		library.Custom_click(book.getClick_view_booking(), "booking details");
		Thread.sleep(10000);	
		library.Custom_click(book.getClick_view_booking(), "booking details");
		Thread.sleep(7000);
		try {
			if(book.getClick_view_booking().isDisplayed()) {
			driver1.findElement(By.xpath("//android.widget.TextView[@content-desc='txt_ViewBooking']")).click();
			}
		}catch(Exception e){		}	
	}
//================================================================================================================================	
	@Test(dependsOnMethods={"TC_0059_Verify_user_able_to_Online_payment_booking"})
	//@Test(priority=9)
	public void TC_0060_Admin_approved_request () throws Exception {
		log.info("***************TC_0060_Admin_approved_request starts*****************");
		
		Browseropen();
		Thread.sleep(3000);
		Robot r = new Robot();
		for(int i=0; i<4; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);r.keyPress(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_CONTROL);
		}
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		WebElement ele4=driver.findElement(By.xpath("//button[@title='Reset']"));library.Custom_click(ele4, "Reset button");
//		WebElement ele1=driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[3]"));library.Custom_click(ele1, "10 user");
//		WebElement ele2=driver.findElement(By.xpath("//li[normalize-space()='50']"));library.Custom_click(ele2, "50 user");
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
		int i=date + 2; //adding 2 days extra to visible 
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
		
		Thread.sleep(1000);
		WebElement ele11=driver.findElement(By.xpath("//div[@id='view-action']"));
		library.Custom_click(ele11, "table search user request view action");
		/////// Upgrade vehicle ////////
		
		WebElement ele91=driver.findElement(By.xpath("//button[text()=' Upgrade Vehicle']"));library.Custom_click(ele91, "Upgrade vehicle");
		WebElement ele92=driver.findElement(By.xpath("//em[text()='Available Vehicles']"));library.Custom_click(ele92, "Available vehicles");
		WebElement ele93=driver.findElement(By.xpath("//li[text()='HF Deluxe']"));library.Custom_click(ele93, "Hf deluxe bike selected");
		WebElement ele94=driver.findElement(By.xpath("//button[@title='Request Upgrade']"));library.Custom_click(ele94, "Request upgrade vehicle");
		
		Thread.sleep(3000);
		
		
		////////////////
		
		
	//	WebElement ele12=driver.findElement(By.xpath("//*[text()='Control Buttons']"));library.Custom_click(ele12, "Control button");
		WebElement ele13=driver.findElement(By.xpath("(//button[text()='Start Ride' or @data-bs-toggle='modal'])[1]"));library.Custom_click(ele13, "Start ride");
		WebElement ele14=driver.findElement(By.xpath("//input[@placeholder='Start Reading']"));library.custom_sendkeys(ele14, config.getstart_km_reading(), "enter bike reading");
		WebElement dropdownbike=driver.findElement(By.xpath("//option[text()='Select Registration']"));library.Custom_click(dropdownbike, "Select bike number");
		WebElement dropdownbike1=driver.findElement(By.xpath("(//option[@value])[2]"));library.Custom_click(dropdownbike1, "bike number is selected");
		
		//////////////////////////////////////////////////////// date as per select bike booking
//		WebElement calendar2=driver.findElement(By.xpath("//input[@type=\"date\"]"));		library.Custom_click(calendar2, "calender click");
//		if(i<=totaldays) {
//			WebElement dateselect=driver.findElement(By.xpath("(//button[normalize-space()="+i+"])[1]"));
//			library.Custom_click(dateselect, "Select date");
//		}else {
//			driver.findElement(By.xpath("//button[@title='Next month']")).click();
//			WebElement dateselect=driver.findElement(By.xpath("(//button[normalize-space()="+nextdate+"])[1]"));
//			library.Custom_click(dateselect, "Select date");
//		}
		///////////////////////////////////////////////////////
		
		
		WebElement ele15=driver.findElement(By.xpath("//button[text()='Start Ride']"));	library.Custom_click(ele15, "Start ride button");
//		WebElement ele16=driver.findElement(By.xpath("//button[text()='Yes']"));library.Custom_click(ele16, "Yes button");
		
		Thread.sleep(3000);
		log.info("Approval is sucessfully Accepted");
		driver.close();

	}
//===================================================================================================================================	
	@Test(dependsOnMethods={"TC_0060_Admin_approved_request"})
	//@Test(priority=10)
	public void TC_0061_Verify_user_able_to_view_booking_status_all_elements() throws Exception {
		log.info("***************TC_0061_Verify_user_able_to_view_booking_status_all_elements starts*****************");
		
		appium_2.Back_button();
		Thread.sleep(1000);
		appium_2.Back_button();
		library.Custom_click(book.getClick_home_page_Bookings_button(), "Bookings button");
		Thread.sleep(3000);
		try {
			driver1.findElement(By.xpath("//android.widget.TextView[@text='View']")).click();
		}catch(Exception e){
			
		}
		//library.Custom_click(book.getClick_booking_page_view_button(), "View button");
		Thread.sleep(4000);
		library.visible_link(book.getClick_show_more_details(), "show more details text");
		library.Custom_click(book.getClick_show_more_details(), "show more details text");
		Thread.sleep(2000);
		appium_2.Scroll_down_page_Action("Down");
		library.visible_link(book.getFBD_Booking_status(), "Booking status");
		library.visible_link(book.getFBD_booking_status_txt(), "Booking status = "+book.getFBD_booking_status_txt().getText());
		Thread.sleep(2000);
		library.visible_link(book.getFBD_Booking_id(), "Booking ID  ");
		library.visible_link(book.getFBD_vehicle_nummber(), "Vehicle number  ");		
		library.visible_link(book.getFBD_pick_up_date(), "Pick Up Date  ");
		library.visible_link(book.getFBD_drop_off_date(), "Drop off date  ");
		library.visible_link(book.getFBD_pick_up_location(), "Pick Up Location  ");
		library.visible_link(book.getFBD_duration(), "Duration  ");
		library.visible_link(book.getFBD_handover_time(), "Handover Time  ");
		library.visible_link(book.getFBD_drop_off_location(), "Drop off Location  ");
		library.visible_link(book.getFBD_planned_drop_off_date(), "Planned drop off date  ");
		library.visible_link(book.getFBD_Actual_drop_off_date(), "Actual Drop-off date  ");
		library.visible_link(book.getFBD_mode_of_pick_up(), "Mode of pick-up  ");
		
		try {
		library.visible_link(book.getFBD_Booking_id(), "Booking ID = "+book.getFBD_Booking_id().getText());
		library.visible_link(book.getFBD_vehicle_nummber(), "Vehicle number = "+book.getFBD_vehicle_nummber().getText());		
		library.visible_link(book.getFBD_pick_up_date(), "Pick Up Date = "+book.getFBD_pick_up_date().getText());
		library.visible_link(book.getFBD_drop_off_date(), "Drop off date = "+book.getFBD_drop_off_date().getText());
		library.visible_link(book.getFBD_pick_up_location(), "Pick Up Location = "+book.getFBD_pick_up_location().getText());
		library.visible_link(book.getFBD_duration(), "Duration = "+book.getFBD_duration().getText());
		library.visible_link(book.getFBD_handover_time(), "Handover Time = "+book.getFBD_handover_time().getText());
		library.visible_link(book.getFBD_drop_off_location(), "Drop off Location = "+book.getFBD_drop_off_location().getText());
		library.visible_link(book.getFBD_planned_drop_off_date(), "Planned drop off date = "+book.getFBD_planned_drop_off_date().getText());
		library.visible_link(book.getFBD_Actual_drop_off_date(), "Actual Drop-off date = "+book.getFBD_Actual_drop_off_date().getText());
		library.visible_link(book.getFBD_mode_of_pick_up(), "Mode of pick-up = "+book.getFBD_mode_of_pick_up().getText());
		}catch(Exception e) {
			log.error("text is not present");
		}
		appium_2.Scroll_UP_page_Action("page up");
		library.Custom_click(book.getClick_show_less_details(), "show less text");
		library.visible_link(book.getClick_Home_booking_tab_extend_ride(), "Extend ride drop down");
		library.visible_link(book.getFBD_end_ride(), "End ride drop down");
		library.visible_link(book.getClick_price_breakup(), "price break up Drop down");
		library.visible_link(book.getFBD_vehicle_documents(), "Vehicle document");
		
	}
//============================================================================================================================
	@Test(dependsOnMethods={"TC_0061_Verify_user_able_to_view_booking_status_all_elements"})
	//@Test(priority=11)
	public void TC_0062_Verify_user_End_ride_request() throws Exception {
		log.info("***************TC_0062_Verify_user_End_ride_request starts*****************");
		
		library.Custom_click(book.getFBD_end_ride(), "End ride drop down");
		library.Custom_click(book.getFBD_end_ride_raised_request_button(), "End ride raised request button");
		
	}
	
//============================================================================================================================	
	@Test(dependsOnMethods={"TC_0062_Verify_user_End_ride_request"})
	//@Test(priority=12)
	public void TC_0063_Verify_user_end_ride_booking_status() throws Exception {
		log.info("***************TC_0063_Verify_user_end_ride_booking_status starts*****************");
		
		Thread.sleep(5000);
		library.visible_link(book.getFBD_Booking_status(), "Booking status");
		library.visible_link(book.getFBD_booking_status_txt(), "Booking status = "+book.getFBD_booking_status_txt().getText());
	}
	
//============================================================================================================================	
	@Test(dependsOnMethods={"TC_0063_Verify_user_end_ride_booking_status"})
	//@Test(priority=13)
	public void TC_0064_Admin_check_End_ride_request () throws Exception {
		log.info("***************TC_0064_Admin_check_End_ride_request starts*****************");
		
		Browseropen();
		Thread.sleep(3000);
		Robot r = new Robot();
		for(int i=0; i<4; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);r.keyPress(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_CONTROL);
		}
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		WebElement ele3=driver.findElement(By.xpath("//h5[normalize-space()='Return Requests Received']"));library.Custom_click(ele3, "Return Requests Received");
		
		Thread.sleep(3000);
		String s=config.getFirst_name();//user name to find web table
		String l=config.getLast_name();
		WebElement ele5=driver.findElement(By.xpath("//text[text()='"+s+" "+l+"']/parent::div/parent::td//following-sibling::td//div[@id='view-action']"));
		library.Custom_click(ele5, "View booking request");
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_CONTROL);r.keyPress(KeyEvent.VK_R);r.keyRelease(KeyEvent.VK_R);r.keyRelease(KeyEvent.VK_CONTROL);
		
		WebElement ViewEditreaidng=driver.findElement(By.xpath("//button[text()=' Update Odometer Reading']"));library.Custom_click(ViewEditreaidng, "Update Odometer Readings");
		WebElement endreading=driver.findElement(By.xpath("//input[@placeholder='Update Reading']"));	library.custom_sendkeys(endreading, config.getend_km_reading(), "End ride km reading");
		Thread.sleep(1000);
		WebElement ele15=driver.findElement(By.xpath("//button[text()='Update Reading']"));	library.Custom_click(ele15, "Update Reading");
		WebElement closepopup=driver.findElement(By.xpath("//a[@id='closeModal2']"));	library.Custom_click(closepopup, "Close Update Reading popup");
		
		Thread.sleep(2000);
		WebElement ele19=driver.findElement(By.xpath("//button[text()=' Complete Ride']"));
		library.Custom_click(ele19, "Complete ride");
//		WebElement extracharge=driver.findElement(By.xpath("//button[text()='Add Extra Charges']"));library.Custom_click(extracharge, "add extra charges");
		WebElement Complete=driver.findElement(By.xpath("//input[@id='checkboxNoLabel']"));		library.Custom_click(Complete, "Complete ride checkbox");
		Thread.sleep(2000);
		WebElement ele16=driver.findElement(By.xpath("//button[text()='Confirm & Complete Ride']"));library.Custom_click(ele16, "Confirm and complete ride button");
		Thread.sleep(2000);
		
		Thread.sleep(3000);
		log.info("Ride  is sucessfully completed");
		driver.close();
	}
//===================================================================================================================================	
	//@Test(dependsOnMethods={"TC_0064_Admin_check_End_ride_request"})
	@Test(priority=14)
	public void TC_0065_Verify_user_Complete_ride_booking_status() throws Exception {
		log.info("***************TC_0065_Verify_user_Complete_ride_booking_status starts*****************");
		
		Thread.sleep(3000);
		library.Custom_click(book.getClick_home_page_button(), "Home button");
		Thread.sleep(3000);
		library.Custom_click(book.getClick_home_page_Bookings_button(), "Bookings button");
		Thread.sleep(3000);
		try {
		//	driver1.findElement(By.xpath("//android.widget.TextView[@text='View']")).click();
		}catch(Exception e) {}
		Thread.sleep(10000);
		
		library.visible_link(book.getFBD_Booking_status(), "Booking status");
		Thread.sleep(2000);
		library.visible_link(book.getFBD_booking_status_txt(), "Booking status = "+book.getFBD_booking_status_txt().getText());
	}
//====================================================================================================================================	
	//@Test(dependsOnMethods={"TC_0065_Verify_user_Complete_ride_booking_status"})
	@Test(priority=15)
	public void TC_0066_Verify_after_Complete_ride_invoice_button() throws Exception {
		log.info("***************TC_0066_Verify_after_Complete_ride_invoice_button starts*****************");
		
		Thread.sleep(2000);
		library.visible_link(book.getFBD_Invoice_button(), "Invoice Button");
	}
//===================================================================================================================================	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
