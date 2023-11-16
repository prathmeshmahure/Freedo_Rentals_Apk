package Store_class;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pageobject.BookingPage;
import com.pageobject.LaunchLogin;
import com.pageobject.WebAdmin;
import com.utility.BaseClass;
import com.utility.Library;

import io.appium.java_client.android.AndroidTouchAction;
@Listeners(com.utility.listner.class)
public class appium_21 extends BaseClass{
	
	public BookingPage book;
	public LaunchLogin login;
	public WebAdmin web;
	@SuppressWarnings("deprecation")
	public AndroidTouchAction action;
	
	
	@Test(priority=3)
	public void appium_2_TC_0016_verify_PickUp_delivery_section_with_valid_data() throws Exception {
		book = PageFactory.initElements(driver1, BookingPage.class);
		log.info("***************appium_2_TC_0016_verify_PickUp_delivery_section_with_valid_data starts*****************");
		
		Thread.sleep(3000);
	//	Assert.assertTrue(book.getClick_1st_location_dropdown().isDisplayed());
		Library.Custom_click(book.getClick_home_page_button(), "home button");
	//	library.Custom_click(book.getClick_1st_location_dropdown(),"1 st location dropdown");
		Library.Custom_click(book.getClick_Autonation_city(), "location Automation");
	//	library.Custom_click(book.getClick_1st_Metro_Hospital_Sector_12(),"location selected");
		Library.Custom_click(book.getClick_Package_dropdown(), "package ");
		Library.Custom_click(book.getClick_1_Days_package(), "package selected");
		Library.date_select();
		
		String city=book.gettxt_city_front_page().getText();
		String location=book.gettxt_1st_location_dropdown().getText();
		String packag=book.gettxt_Package_dropdown().getText();
		String pickupdate=book.gettxt_calender_pickup_date().getText();
		String dropupdate=book.gettxt_calender_dropup_date().getText();
		
	//	library.Custom_click(book.getClick_Book_now_Button(), "book now button");
		Thread.sleep(2000);
		Library.bike_book_page(book.getselect_random_Bike(), "random bike selected");
		Thread.sleep(3000);
		appium_21.Scroll_UP_page_Action("page up");
					String b=book.gettxt_BKD_pickup_location().getText();
					if(b.equalsIgnoreCase("Select Pick Up Location")) {
						Library.Custom_click(book.gettxt_BKD_pickup_location(), "click pickup location ");
					//	driver1.findElement(By.xpath("//android.widget.EditText[@text='Select Pick Up Location']")).click();
						driver1.findElement(By.xpath("(//android.widget.CheckedTextView)[2]")).click();
					}
				
//		driver1.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())"+".scrollIntoView(text(\"Continue\"));"));
		
		String bkd_city =book.gettxt_BKD_pickup_city().getText();
		String bkd_location =book.gettxt_BKD_pickup_location().getText();
		String pick_up_location[]=bkd_location.split(",");
		
		String package_duration=book.gettxt_BKD_package_duration().getText();
		String all[]=package_duration.split(",");
		
		String startdate=book.gettxt_BKD_Start_date().getText();
		String enddate=book.gettxt_BKD_end_date().getText();
		
		try {
		if(city.equalsIgnoreCase(bkd_city)) {
			Library.passmsg("City is = ","verified");
		}}catch(Exception e) {	Library.failmsg("City verification is = ", "Failed");  		}
		
		try {
		if(pickupdate.equalsIgnoreCase(startdate)) {
			Library.passmsg("Pickupdate and startdate is = ","verified");
		}}catch(Exception e) {	Library.failmsg("Pickupdate and startdate verification is = ", "Failed");  		}
		
		try {
		if(dropupdate.equalsIgnoreCase(enddate)) {
			Library.passmsg("dropupdate and enddate is = ","verified");
		}}catch(Exception e) {	Library.failmsg("dropupdate and enddate verification is = ", "Failed");  		}
		
		try {
		if(location.equalsIgnoreCase(pick_up_location[0])) {
			Library.passmsg("Location and pickup location is = ","verified");
		}}catch(Exception e) {	Library.failmsg("Location and pickup location verification is = ", "Failed");  		}
		
		try {
		if(packag.equalsIgnoreCase(all[0])) {
			Library.passmsg("package and package duration is = ","verified");
		}}catch(Exception e) {	Library.failmsg("package and package duration verification is = ", "Failed");  		}
		
		
		
	}
//=======================================================================================================
	@SuppressWarnings("deprecation")
	@Test(dependsOnMethods={"appium_2_TC_0016_verify_PickUp_delivery_section_with_valid_data"})
//	@Test
	public void appium_2_TC_0017_verify_Home_delivery_section_with_fill_valid_data () throws Exception {
		book = PageFactory.initElements(driver1, BookingPage.class);
		log.info("***************appium_2_TC_0017_verify_Home_delivery_section_with_fill_valid_data starts*****************");
		
		Library.Custom_click(book.getClick_home_delivery_radio_button(), "home delivery radio button");
		appium_21.Scroll_UP_page_Action("page up");
//		driver1.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())"+".scrollIntoView(text(\"Continue\"));"));
		Library.custom_sendkeys(book.getClick_home_delivery_Address(),config.getaddress(),"address");
		appium_21.EnterButton();
		Library.custom_sendkeys(book.getClick_home_delivery_landmark(), config.getaddress(), "landmark");
		appium_21.EnterButton();
		driver1.findElement(By.xpath("//android.widget.EditText[@text='Noida' or @text='Select City']")).click();
		driver1.findElement(By.xpath("(//android.widget.CheckedTextView)[3]")).click();
		Library.custom_sendkeys(book.getClick_home_delivery_pincode(), config.getOTP(),"pincode");
		appium_21.EnterButton();
		appium_21.Scroll_UP_page_Action("page up");
//		driver1.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())"+".scrollIntoView(text(\"Continue\"));"));
		Thread.sleep(1000);
		Library.Custom_click(book.getClick_Continue_Tab(), "continue tab");

		String c=book.getsummary_page_text().getText();					
		Assert.assertEquals(c, "SUMMARY");
		appium_21.Scroll_UP_page_Action("page up");
//		driver1.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())"+".scrollIntoView(text(\"Pay Now\"));"));
	
			Library.Custom_click(book.getClick_pay_now_button(), "click pay now button");
	}
	
//======================================================================================================================
	@Test(dependsOnMethods={"appium_2_TC_0017_verify_Home_delivery_section_with_fill_valid_data"})
	public void appium_2_TC_0018_verify_payment_process_methods() throws Exception {
		log.info("***************appium_2_TC_18_verify_payment_process_methods starts*****************");
		
		Thread.sleep(5000);
		Library.Custom_click(book.getClick_Pay_using_Netbanking(), "select netbanking option");
		Library.Custom_click(book.getClick_Pay_using_SBI_bank(),"select bank ");
		Library.Custom_click(book.getClick_pay_now_button_sbi(), "pay now button");	
	}
			
//=======================================================================================================================
	@Test(dependsOnMethods={"appium_2_TC_0018_verify_payment_process_methods"})
	public void appium_2_TC_0019_verify_Booking_confirmation() throws Exception {
		book = PageFactory.initElements(driver1, BookingPage.class);
		log.info("***************appium_2_TC_0019_verify_Booking_confirmation starts*****************");
			
			String g=book.getClick_payment_successful().getText();
			Assert.assertEquals(g, "Success");
			Library.Custom_click(book.getClick_payment_successful(), "payment successful");
			Library.Custom_click(book.getClick_view_booking(), "booking details");
			Thread.sleep(10000);
			Library.visible_link(book.getClick_view_booking(), "booking details");			
			Library.Custom_click(book.getClick_view_booking(), "booking details");
			try {
				driver1.findElement(By.xpath("//android.widget.TextView[@content-desc='txt_ViewBooking']")).click();
			}catch(Exception e){
				
			}
			Thread.sleep(3000);
			Library.Custom_click(book.getClick_show_more_details(), "show more details text");
			Thread.sleep(3000);
			appium_21.Scroll_UP_page_Action("page up");
			Library.Custom_click(book.getClick_show_less_details(), "show less text");
			Library.Custom_click(book.getClick_price_breakup(), "price breakp");
			
	}
//===============================================================================================================		
		@Test(dependsOnMethods={"appium_2_TC_0019_verify_Booking_confirmation"})
		public void appium_2_TC_0020_verify_booking_page_components() throws Exception {
			book = PageFactory.initElements(driver1, BookingPage.class);
			log.info("***************appium_2_TC_0020_verify_booking_page_components starts*****************");
			Thread.sleep(1000);
			Library.Custom_click(book.getClick_Home_booking_tab_back_button(), "back button");
			Thread.sleep(3000);
			Library.visible_link(book.getClick_Home_booking_tab_bike_image(), "bike images");
			Library.visible_link(book.getClick_Home_booking_tab_bike_text(),"bike name ="+ book.getClick_Home_booking_tab_bike_text().getText());
			Library.visible_link(book.getClick_Home_booking_tab_pickup_location_txt(), "pick up Location ="+ book.getClick_Home_booking_tab_pickup_location_txt().getText());
			Library.visible_link(book.getClick_Home_booking_tab_pickup_date_txt(),"pick up date ="+ book.getClick_Home_booking_tab_pickup_date_txt().getText());
			Library.visible_link(book.getClick_Home_booking_tab_package_duration(),"Duration ="+ book.getClick_Home_booking_tab_package_duration().getText());
			Library.visible_link(book.getClick_Home_booking_tab_dropoff_date(),"Drop of date ="+ book.getClick_Home_booking_tab_dropoff_date().getText());
			Library.visible_link(book.getClick_Home_booking_tab_total_amount_paid(), "Total amount ="+ book.getClick_Home_booking_tab_total_amount_paid().getText());
			Library.visible_link(book.getClick_Home_booking_tab_booking_status(),"booking status ="+ book.getClick_Home_booking_tab_booking_status().getText());
			Thread.sleep(1000);
			try {
			Library.Custom_click(book.getClick_booking_page_view_button(), "view button ");
			Library.Custom_click(book.getClick_show_more_details(), "show more details");
			appium_21.Scroll_UP_page_Action("page up");
			Library.Custom_click(book.getClick_show_less_details(), "show less details");
			
			}catch(WebDriverException e) {
				log.info("WebdriverException found ");
			}
			Library.Custom_click(book.getClick_home_page_button(), "home button");
		}

	
//=========================================================================================================	
	@Test(priority=4)
	public void appium_2_TC_0021_verify_profile_edit_data() throws Exception {
		book = PageFactory.initElements(driver1, BookingPage.class);
		log.info("***************appium_2_TC_0021_verify_profile_edit_data starts*****************");
		
//		Assert.assertTrue(book.getClick_home_page_button().isDisplayed());
		Library.Custom_click(book.getClick_home_page_button(), "close method and go to home");
		Library.Custom_click(book.getClick_home_page_More_button(), "more button");
		Library.Custom_click(book.getClick_Edit_profile(), "edit profile");
		
		Library.visible_link(book.getMy_profile_page_title(), "My Profile page title");
		Library.visible_link(book.getUpdate_profile_MF_firstname(), "First name mandotory field ( * )");
		Library.custom_sendkeys(book.getClick_Edit_profile_first_name(),config.getFirst_name(),"first name");
		Library.visible_link(book.getUpdate_profile_MF_lastname(), "Last name mandotory field ( * )");
		Library.custom_sendkeys(book.getClick_Edit_profile_last_name(), config.getLast_name(), "last name");
		appium_21.EnterButton();
		Library.visible_link(book.getUpdate_profile_MF_mobilenumber(), "Mobile number mandotory field ( * )");
		Library.visible_link(book.getUpdate_profile_MF_email(), "Email ID mandotory field ( * )");
		Library.custom_sendkeys(book.getClick_Edit_profile_email(), config.getEnter_Email(), "Enter Email id");
		appium_21.EnterButton();
		Thread.sleep(1000);
		appium_21.Scroll_UP_page_Action("page up");
		Library.visible_link(book.getUpdate_profile_MF_gender(), "Gender mandotory field ( * )");
		Library.visible_link(book.getUpdate_profile_MF_EM_mobilenumber(), "Emergrncy Mobile number mandotory field ( * )");
		Library.custom_sendkeys(book.getClick_Edit_profile_emergency_mobile_number(), config.getemergency_mo(), "Emergency mobile number");
		appium_21.EnterButton();
		Library.visible_link(book.getClick_Edit_profile_emergency_person_name(), "Emergrncy Person name mandotory field ( * )");
		Library.custom_sendkeys(book.getClick_Edit_profile_emergency_person_name(), config.getFirst_name(), "Emergency person name");
		appium_21.EnterButton();
		Library.visible_link(book.getUpdate_profile_MF_EM_relation(), "Relation mandotory field ( * )");
		Library.Custom_click(book.getClick_Edit_profile_relation(),"relation");
		driver1.findElement(By.xpath("(//android.widget.CheckedTextView)[2]")).click();
		Library.Custom_click(book.getClick_Edit_profile_update_button(), "Update profile");
		
		Thread.sleep(1000);
		Library.visible_link(book.getClick_location_pop_up_ok_button(), "Update profile popup");
		Library.Custom_click(book.getClick_location_pop_up_ok_button(), "ok button"); // reuse method
		Library.Custom_click(book.getClick_Edit_profile_back_navigation_button(),"click back button");
		
	}
//==============================================================================================================	
		@Test(dependsOnMethods={"appium_2_TC_0021_verify_profile_edit_data"})
		public void appium_2_TC_0022_verify_app_dark_theme() throws Exception {
			book = PageFactory.initElements(driver1, BookingPage.class);
			log.info("***************appium_2_TC_0022_verify_app_dark_theme starts*****************");
			
			Library.Custom_click(book.getclick_dark_theme(), "dark theme ");
			Library.Custom_click(book.getclick_dark_theme(), "dark theme ");
			Thread.sleep(2000);
			Library.Custom_click(book.getClick_home_page_button(), "home button");
		}
//=================================================================================================================

//=================================================================================================================
		
		@Test(priority=5)
		public void appium_2_TC_0023_admin_Request_reject () throws InterruptedException, Exception {
			web=PageFactory.initElements(driver, WebAdmin.class);
			log.info("***************appium_2_TC_0023_admin_Request_reject starts*****************");
			
			Browseropen();
			Robot r = new Robot();
			for(int i=0; i<4; i++) {
				r.keyPress(KeyEvent.VK_CONTROL);r.keyPress(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_CONTROL);
			}
			Thread.sleep(3000);
			
			WebElement ele3=driver.findElement(By.xpath("//p[text()='Dashboard']"));Library.Custom_click(ele3, "Dashboard");
			WebElement ele4=driver.findElement(By.xpath("//button[@title='Reset']"));Library.Custom_click(ele4, "Reset button");
			
			Thread.sleep(2000);
			String s=config.getFirst_name();
			WebElement ele5=driver.findElement(By.xpath("//text[text()='"+s+"']/parent::div/parent::td//following-sibling::td//div[@id='reject-action']"));
			Library.Custom_click(ele5, "Reject bike booking");
			WebElement ele6=driver.findElement(By.xpath("//div[@id='demo-simple-select-label']"));Library.Custom_click(ele6, "select drop down");
			
			Thread.sleep(1000);
			WebElement ele7=driver.findElement(By.xpath("//li[@data-value='Booked by mistake']"));Library.Custom_click(ele7, "Booked My Mistake");
			WebElement ele8=driver.findElement(By.xpath("//button[text()='Submit']"));Library.Custom_click(ele8, "Submit button");
			Thread.sleep(2000);
			WebElement ele9=driver.findElement(By.xpath("//button[text()='Yes']"));Library.Custom_click(ele9, "Yes button");
			Thread.sleep(6000);
			try {
				driver.navigate().refresh();
				Thread.sleep(3000);;
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
//================================================================================================================================		

	
	

	
}
