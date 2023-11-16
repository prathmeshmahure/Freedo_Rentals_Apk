package Include_champion_app;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.pageobject.BookingPage;
import com.pageobject.LaunchLogin;
import com.utility.BaseClass;
import com.utility.Library;

@Listeners(com.utility.listner.class)
public class appium_0 extends BaseClass {
	public BookingPage book;
	public LaunchLogin login;
	public ExtentTest test;
	
	
//=============================================================================================================
		@Test(priority=0)
		public void TC_001_verify_install_apk() throws Exception {
			log.info("***************TC_001_verify_install_apk starts*****************");
		//	login=PageFactory.initElements(driver1, launch_login.class);	
			login = new LaunchLogin(driver1);
			Library.visible_link(login.getFirst_page_Select_pickUP_location(), "Freedo app is Install");
			
		}
	
//============================	Launch Application =============================================================
		@Test(priority=1)
		public void TC_002_verify_select_pickup_location_date_and_packages() {
			
			log.info("***************TC_002_verify_select_pickup_location_date_and_packages starts*****************");
			
			try {
			if(login.getFirst_page_Select_pickUP_location().isDisplayed()) {
			Library.visible_link(login.getFirst_page_Select_pickUP_location(), "Select pickup location date and packages");
			Library.isSelected(login.getfirst_page_first_slide_indicator(), "First slide indicator is ");
			Library.visible_link(login.getfirst_page_first_slide_indicator(), "first slide indicator");
			Library.visible_link(login.getFirst_page_second_slide_indicator(), "second slide indicator");
			Library.visible_link(login.getFirst_page_third_slide_indicator(), "third slide indicator");
			Library.visible_link(login.getClick_Next_button1(), "Next_button static 1st page");
			Library.visible_link(login.getClick_Skip_button1(), "Skip_button static 1st page");
			}	}catch(Exception e) {}
		}
//================================ static_pages_view ============================================================
	//	@Test(dependsOnMethods={"TC_002_verify_select_pickup_location_date_and_packages"})	
		@Test(priority=2)
		public void TC_003_Verify_the_NEXT_button_clicking() throws Exception  {
			log.info("***************TC_003_Verify_the_NEXT_button_clicking starts*****************");
			
			try {
			if(login.getClick_Next_button1().isDisplayed()) {
			Library.Custom_click(login.getClick_Next_button1(), "Next_button1 static 1st page");
			Library.isSelected(login.getFirst_page_second_slide_indicator(), "second slide indicator is ");
			Library.visible_link(login.getSecond_onboarding_tittle()," = "+ login.getSecond_onboarding_tittle().getText());
			Library.visible_link(login.getClick_Skip_button2(), "Skip_button static 2nd page");	
			
			}}catch(Exception e) {}
		}
		
//================================================================================================================
		//@Test(dependsOnMethods={"TC_003_Verify_the_NEXT_button_clicking"})	
		@Test(priority=3)
		public void TC_004_Verify_the_NEXT_button_clicking() throws Exception  {
			log.info("***************TC_004_Verify_the_NEXT_button_clicking starts*****************");
			try {
			if(login.getClick_Next_button2().isDisplayed()) {
			Library.Custom_click(login.getClick_Next_button2(), "Next_button2 static 2nd page");
			Thread.sleep(2000);
			Library.isSelected(login.getFirst_page_third_slide_indicator(), "Third slide indicator is ");
			Library.visible_link(login.getThirdpage_onboarding_tittle()," = "+ login.getThirdpage_onboarding_tittle().getText());
			}}catch(Exception e) {}
		}
		
//================================================================================================================
		//@Test(dependsOnMethods={"TC_004_Verify_the_NEXT_button_clicking"})	
		@Test(priority=4)
		public void TC_005_Verify_the_slide_indicator() throws Exception  {
			log.info("***************TC_005_Verify_the_slide_indicator starts*****************");
			try {
			if(login.getfirst_page_first_slide_indicator().isDisplayed()) {
			Library.isSelectedFalse(login.getfirst_page_first_slide_indicator(), "first slide indicator is ");
			Library.isSelectedFalse(login.getFirst_page_second_slide_indicator(), "Second slide indicator is ");
			Library.isSelected(login.getFirst_page_third_slide_indicator(), "Third slide indicator is ");
		}}catch(Exception e) {}
		}
//================================================================================================================
	//	@Test(dependsOnMethods={"TC_005_Verify_the_slide_indicator"})	
		@Test(priority=5)
		public void TC_006_Verify_the_Done_button_clicking() throws Exception  {
			log.info("***************TC_006_Verify_the_Done_button_clicking starts*****************");
			try {
			if(login.getClick_Done_button().isDisplayed()) {
			Library.visible_link(login.getClick_Done_button(), "Done button");
			Library.Custom_click(login.getClick_Done_button(), "Done_button static 3rd page");
		}}catch(Exception e) {}

		}
//=====================Verify_login_component_login_page =======================================================
		//@Test(dependsOnMethods={"TC_006_Verify_the_Done_button_clicking"})	
		@Test(priority=6)
		public void TC_007_Verify_login_component()  {
			log.info("***************TC_007_Verify_login_component starts*****************");
			try {
			if(login.getLogin_heading().isDisplayed()) {       //Assert
			Library.visible_link(login.getLogin_heading(), "Login heading");
			Library.visible_link(login.getMobile_icon(), "Mobile icon");
			Library.visible_link(login.getIndian_code(), "+91 indian code ");
			Library.visible_link(login.getEnter_MO_Number(), "Enter mobile number");
			Library.visible_link(login.getClick_Login_button(), "login button");
			Library.isEnabledFalse(login.getClick_Login_button(), "Login button is ");
			Library.visible_link(login.getYou_dont_have_an_account(), "You don't have an account ?");
			Library.visible_link(login.getCreateAccount(), "Create an account");
		}}catch(Exception e) {}
		}
//================================== Frontend_login ================================================================
		//@Test(dependsOnMethods={"TC_007_Verify_login_component"})
		@Test(priority=7)
		public void TC_008_Verify_login_functionality_Register_mo_number() throws Exception  {
			log.info("***************TC_008_Verify_login_functionality_Register_mo_number starts*****************");
		try {
			if(login.getEnter_MO_Number().isDisplayed()) {
			Library.custom_sendkeys(login.getEnter_MO_Number(), config.getMobile(), "Enter mobile number");
			appium_1.EnterButton();
			Library.isEnabled(login.getClick_Login_button(), "Login button is ");
		//	library.Custom_click(login.getClick_Login_button(), "login button");
		}}catch(Exception e) {}
		}
//=================================================================================================================		
	//	@Test(dependsOnMethods={"TC_008_Verify_login_functionality_Register_mo_number"})
		@Test(priority=8)
		public void TC_009_verify_login_button_on_create_an_account_page() throws Exception {
			log.info("***************TC_009_verify_login_button_on_create_an_account_page starts*****************");
			try {
			if(login.getCreateAccount().isDisplayed()) {
			Library.Custom_click(login.getCreateAccount(), "Create an account at login page");
			Thread.sleep(1000);
			Library.Custom_click(login.getClick_Login_button_C_A(), "login button on create an account page");
			Thread.sleep(2000);
			}}catch(Exception e) {}
		}	
//=================================================================================================================
	//	@Test(dependsOnMethods={"TC_009_verify_login_button_on_create_an_account_page"})
		@Test(priority=9)
		public void TC_0010_verify_create_an_account_by_clicking_login_page() {
			log.info("***************TC_0010_verify_create_an_account_by_clicking_login_page starts*****************");
			try {
			if(login.getCreateAccount().isDisplayed()) {;
			Library.Custom_click(login.getCreateAccount(), "Create an account at login page");
			Library.visible_link(login.getField_first_name(), "First name");
			Library.visible_link(login.getField_last_name(), "Last name");
			Library.visible_link(login.getField_mobile_number(), "Mobile number");
			Library.visible_link(login.getField_email(), "Email");
			Library.visible_link(login.getField_gender(), "Gender");
			Library.isSelectedFalse(login.getClick_I_accept_checkbox(), " I accept checkbox");
			Library.visible_link(login.getField_terms_and_conditons(), "Terms and condition");
			Library.visible_link(login.getField_privacy_policy(), "Privacy Policy");
			Library.isEnabledFalse(login.getClick_Create_My_Account(), "Create my account button");
			Library.visible_link(login.getField_login(), "Login");			
		}}catch(Exception e) {}
	}
//===================================================================================================================		
	//	@Test(dependsOnMethods={"TC_0010_verify_create_an_account_by_clicking_login_page"})
		@Test(priority=10)
		public void TC_0011_verify_user_able_to_create_an_account() {
			log.info("***************TC_0011_verify_user_able_to_create_an_account starts*****************");
		//	book = PageFactory.initElements(driver1, booking_page.class);
			book = new BookingPage(driver1);
			try {
			if(book.getCA_MF_firstname().isDisplayed()) {
			Library.visible_link(book.getCA_MF_firstname(), "First name mandotary field ( * )");
			Library.custom_sendkeys(login.getClick_First_name(), config.getFirst_name(), "First name");
			Library.visible_link(book.getCA_MF_lastname(), "Last name mandotary field ( * )");
			Library.custom_sendkeys(login.getClick_Last_name(), config.getLast_name(), "Last name");
			BaseClass.EnterButton();
			Library.visible_link(book.getCA_MF_mobilenumber(), "Mobile number mandotary field ( * )");
		//	library.custom_sendkeys(login.getClick_Enter_Mobile_Number_C_A(), config.getMobile(), "Enter number");
			Library.visible_link(book.getCA_MF_email(), "Email ID mandotary field ( * )");
			Library.custom_sendkeys(login.getClick_Enter_Email(), config.getEnter_Email(), "Enter Email");
			BaseClass.EnterButton();
			Library.visible_link(book.getCA_MF_gender(), "Gender mandotary field ( * )");
			Library.Custom_click(login.getClick_Gender_Female(), "Female gender selected");
			Library.Custom_click(login.getClick_Gender_Other(), "Other gender selected");
			Library.Custom_click(login.getClick_Gender_Male(), "Male gender selected");
					if(login.getClick_I_accept_checkbox().isSelected()==false) {
						Library.passmsg("i accept checkbox By default is not = ", "selected");
						Library.Custom_click(login.getClick_I_accept_checkbox(), "I accept checkbox");
					}else {
						Library.failmsg("I accept check box is = ", "Selected");
					}
			Library.visible_link(login.getClick_Terms_and_Conditions(), "Terms and condition ");
			Library.visible_link(login.getClick_Login_button_C_A(), "login button is present");
			Library.isEnabled(login.getClick_Create_My_Account(), "Create my account");
		//	library.Custom_click(login.getClick_Create_My_Account(), "Create my account");		
		}}catch(Exception e) {}
	}
//==================================================================================================================		
	//	@Test(dependsOnMethods={"TC_0011_verify_user_able_to_create_an_account"})
		@Test(priority=11)
		public void TC_0012_verify_Terms_and_condition_link_on_create_an_account_page() throws Exception {
			log.info("***************TC_0012_verify_Terms_and_condition_link_on_create_an_account_page starts*****************");
			try {
			if(login.getClick_Terms_and_Conditions().isDisplayed()) {
			Library.Custom_click(login.getClick_Terms_and_Conditions(), "Terms and condition ");
			Thread.sleep(3000);
			Library.visible_link(login.getTerms_and_condition_page_heading(), "Terms and condition page Heading");
			Thread.sleep(3000);
			Library.visible_link(login.getT_and_c_page_info_present(), "Terms and condition page info");
			Library.Custom_click(login.getBack_button(), "Terms and condition page back button ");		
		}}catch(Exception e) {}
	}
//===================================================================================================================
	//	@Test(dependsOnMethods={"TC_0012_verify_Terms_and_condition_link_on_create_an_account_page"})
		@Test(priority=12)
		public void TC_0013_verify_Privacy_and_policy_link_on_create_an_account_page() {
			log.info("***************TC_0013_verify_Privacy_and_policy_link_on_create_an_account_page starts*****************");
			try {
			if(login.getClick_Privacy_Policy().isDisplayed()) {
			Library.Custom_click(login.getClick_Privacy_Policy(), "Privacy policy");
			Library.visible_link(login.getPrivacy_policy_page_heading(), "Privacy policy page Heaading");
	//		library.visible_link(login.getDelete_account(), "Delete account txt");
			Library.visible_link(login.getPrivacy_policy(), "Privacy policy txt");
			Library.visible_link(login.getBack_button(), " back button ");		
		}}catch(Exception e) {}
	}
//=======================================================================================================================		
	//	@Test(dependsOnMethods={"TC_0013_verify_Privacy_and_policy_link_on_create_an_account_page"})
		@Test(priority=13)
		public void TC_0014_verify_Privacy_policy_under_Privacy_policy_dropdown_all_element() {
			log.info("***************TC_0014_verify_Privacy_policy_under_Privacy_policy_dropdown_all_element starts*****************");
			try {
			if(login.getPrivacy_policy_dropdown().isDisplayed()) {
			Library.Custom_click(login.getPrivacy_policy_dropdown(), "Privacy policy dropdown open");
			Library.visible_link(login.getPrivacy_policy_info(), "Privacy policy information");
			Library.Custom_click(login.getPrivacy_policy_dropdown(), "Privacy policy dropdown Close");	
			Library.Custom_click(login.getBack_button(), " back button ");
		}}catch(Exception e) {}
	}
//================================================================================================================		
		
//=================================================================================================================		
		//@Test(dependsOnMethods={"TC_0014_verify_Privacy_policy_under_Privacy_policy_dropdown_all_element"})
		@Test(priority=14)
		public void TC_0015_Verify_create_my_account_button() throws Exception  {
			log.info("***************TC_0015_Verify_create_my_account_button starts*****************");
		try {
			Library.Custom_click(login.getClick_Create_My_Account(), "Create my account");
		}catch(Exception e) {}
		}
//=================================================================================================================
	//	@Test(dependsOnMethods={"TC_0015_Verify_create_my_account_button"})
		@Test(priority=15 ,dependsOnMethods={"TC_0015_Verify_create_my_account_button"})
		public void TC_0016_Verify_otp_verification_time_slot() throws Exception  {
			log.info("***************TC_0016_Verify_otp_verification_time_slot starts*****************");
			
			Thread.sleep(2000);	
			appium_0.EnterButton();
			Library.visible_link(login.getOtp_time_slot(), " Time duration ");
			Library.visible_link(login.getOtp_time_slot(), " Time duration "+login.getOtp_time_slot().getText());
			
		}
//================================================================================================================
		
		
		
//================================ OTP VERIFYCATION PAGE ==========================================================
	//	@Test(dependsOnMethods={"TC_0016_Verify_otp_verification_time_slot"})
		@Test(priority=16)
		public void TC_0017_Verify_OTP_Verification_Page() throws InterruptedException   {
			log.info("***************TC_0017_Verify_OTP_Verification_Page starts*****************");
			Thread.sleep(5000);	
			try {
			if(login.getOtp_verification_txt().isDisplayed()) {
		Library.isDisplayed(login.getOtp_verification_txt(), "OTP VERIFICATION page tittle");
		Library.visible_link(login.getEnter_OTP(), "OTP Enter field");
		Library.visible_link(login.getClick_OTP_Verify_button(), "Verify otp button");
		
		Library.custom_sendkeys(login.getEnter_OTP(),config.getOTP(),"OTP send 6 digit successfully");
//		library.Custom_click(login.getClick_OTP_Verify_button(), "Otp Verify Button ");
		}}catch(Exception e) {}
		}
//========================= After login select location ===============================================================
	//	@Test(dependsOnMethods={"TC_0017_Verify_OTP_Verification_Page"})
		@Test(priority=17)
		public void TC_0018_Select_location() throws Exception  {
			log.info("***************TC_0018_Select_location starts*****************");
		try {
			if(login.getWhile_using_this_app().isDisplayed()) {
		Library.visible_link(login.getWhile_using_this_app(), "While_using_this_app");
//		library.visible_link(login.getOnly_this_time(), "location page Only_this_time");
		Library.visible_link(login.getDont_allow(), "Dont allow");
		Library.Custom_click(login.getDont_allow(), "Dont allow");					
							//////// 2 nd page ///////
		Thread.sleep(3000);
		Library.visible_link(login.getDetect_my_location(), "Detect_my_location");
		Library.visible_link(login.getSelect_Manually_location(), "Select_Manually_location");
		Library.Custom_click(login.getSelect_Manually_location(), "Select_Manually_location");//click
			}}catch(Exception e) {}
		}
//============================Verify city visible =======================================================================
		
	//	@Test(dependsOnMethods={"TC_0018_Select_location"})
		@Test(priority=18)
		public void TC_0019_verify_user_select_City() {
			log.info("***************TC_0019_verify_user_select_City starts*****************");
			try {
			if(login.getPopular_cities_txt().isDisplayed()) {
			Library.visible_link(login.getPopular_cities_txt(), "Popular cities text");
			Library.visible_link(login.getSelect_City_Delhi(), "Delhi");
			Library.visible_link(login.getSelect_City_Gurugram(), "Gurugram");
			Library.visible_link(login.getSelect_City_Noida(), "Noida");
			Library.visible_link(login.getSelect_City_Greater_Bengaluru(), "Bengaluru");
//			library.visible_link(login.getSelect_City_Automation_City(), "Automation city");
//			library.visible_link(login.getSelect_City_Greater_Noida(), "Greater_Noida");
				}
			}catch(Exception e) {}
		}
//================================ Search city name =====================================================================
	//	@Test(dependsOnMethods={"TC_0019_verify_user_select_City"})
		@Test(priority=19)
		public void TC_0020_Search_wrong_city_name() throws Exception  {
				log.info("***************TC_0020_Search_wrong_city_name starts*****************");
			try {
				if(login.getSearch_city().isDisplayed()) {	
			Library.visible_link(login.getSearch_city(), "Please select your city");
			Library.custom_sendkeys(login.getSearch_city(), "Aurangabad", "Search city by city name");
			appium_0.EnterButton();
			Library.visible_link(login.getSelected_city_not_available(), "Selected city not available");
				}}catch(Exception e) {}
				}
//================================ Search city name =====================================================================
	//	@Test(dependsOnMethods={"TC_0020_Search_wrong_city_name"})
		@Test(priority=20)
		public void TC_0021_Search_city_name() throws Exception  {
			log.info("***************TC_0021_Search_city_name starts*****************");
		try {
			if(login.getSearch_city().isDisplayed()) {
		Library.visible_link(login.getSearch_city(), "Please select your city");
		Library.custom_sendkeys(login.getSearch_city(), config.getcity_name(), "Search city by city name");
		appium_0.EnterButton();
		Library.visible_link(login.getSelect_City_Noida(), config.getcity_name()+" city");
		}}catch(Exception e) {}
		}		
//===========================Select city =============================================================================
		
	//	@Test(dependsOnMethods={"TC_0021_Search_city_name"})
		@Test(priority=21 , dependsOnMethods={"TC_0021_Search_city_name"})
		public void TC_0022_Select_all__City() {
			log.info("***************TC_0022_Select_all__City starts*****************");
			
			Library.Custom_click(login.getSelect_City_Noida(), config.getcity_name()+" city");

		}
//=========================================================================================================================
		//@Test(dependsOnMethods={"TC_0022_Select_all__City"})
		@Test(priority=22)
		public void TC_0023_Verify_location_popup() {
			log.info("***************TC_0023_Verify_location_popup starts*****************");
			try {
			if(login.getWhile_using_this_app().isDisplayed()) {
			Library.visible_link(login.getWhile_using_this_app(), "location page While_using_this_app");
//			library.visible_link(login.getOnly_this_time(), "location page Only_this_time");
			Library.visible_link(login.getDont_allow_1(),"Dont allow 1");
			Library.Custom_click(login.getDont_allow_1(), "Dont allow 1");
			}}catch(Exception e) {}
		}
	
	
}
