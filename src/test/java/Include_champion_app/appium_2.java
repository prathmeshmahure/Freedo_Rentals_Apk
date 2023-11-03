package Include_champion_app;

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
	public Champion_test ct;
	public static ExtentTest test;
//============================================================================================================
//	@Test(dependsOnMethods={"TC_0051_Verify_user_able_to_view_booking_status_all_elements"})
	@Test(priority=1)
	public void TC_0052_admin_Request_reject () throws Exception  {
		ct = new Champion_test();
		log.info("***************TC_0052_admin_Request_reject starts*****************");

		championapp_activity();
		Thread.sleep(2000);
		ct.Verify_login_champion_app();
		ct.admin_rejest_booking();
	}

//=============================================================================================================
	//@Test(dependsOnMethods={"TC_0052_admin_Request_reject"})
	@Test(priority=2)
	public void TC_0053_Track_booking_status () throws Exception  {
		//book = PageFactory.initElements(driver1, booking_page.class);
		book = new booking_page(driver1);
		log.info("***************TC_0053_Track_booking_status starts*****************");
		
		freedoapp_activity();
		Thread.sleep(2000);
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
		base_class.scrollByText("Pay Now");
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
		
		championapp_activity();
		Thread.sleep(2000);
		//ct.Verify_login_champion_app();
		ct.admin_rejest_booking();
		
	}
//===========================================================================================================================

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}