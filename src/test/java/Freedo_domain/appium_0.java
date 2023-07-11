package Freedo_domain;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.page_object.booking_page;
import com.page_object.launch_login;
import com.utility.base_class;
import com.utility.library;

@Listeners(com.utility.listner.class)
public class appium_0 extends base_class {
	public booking_page book;
	public launch_login login;
	public static ExtentTest test;
	
	
//=============================================================================================================
		@Test(priority=0)
		public void TC_001_verify_install_apk() throws Exception {
			log.info("***************TC_001_verify_install_apk starts*****************");
			login=PageFactory.initElements(driver1, launch_login.class);	
			
			library.visible_link(login.getFirst_page_Select_pickUP_location(), "Freedo app is Install");
			
		}
	
//============================	Launch Application =============================================================
		@Test(priority=1)
		public void TC_002_verify_select_pickup_location_date_and_packages() {
			login=PageFactory.initElements(driver1, launch_login.class);	
			log.info("***************TC_002_verify_select_pickup_location_date_and_packages starts*****************");
			
			library.visible_link(login.getFirst_page_Select_pickUP_location(), "Select pickup location date and packages");
			library.isSelected(login.getfirst_page_first_slide_indicator(), "First slide indicator is ");
			library.visible_link(login.getfirst_page_first_slide_indicator(), "first slide indicator");
			library.visible_link(login.getFirst_page_second_slide_indicator(), "second slide indicator");
			library.visible_link(login.getFirst_page_third_slide_indicator(), "third slide indicator");
			library.visible_link(login.getClick_Next_button1(), "Next_button static 1st page");
			library.visible_link(login.getClick_Skip_button1(), "Skip_button static 1st page");
				
		}
//================================ static_pages_view ============================================================
	//	@Test(dependsOnMethods={"TC_002_verify_select_pickup_location_date_and_packages"})	
		@Test(priority=2)
		public void TC_003_Verify_the_NEXT_button_clicking() throws Exception  {
			log.info("***************TC_003_Verify_the_NEXT_button_clicking starts*****************");
			
			library.Custom_click(login.getClick_Next_button1(), "Next_button1 static 1st page");
			library.isSelected(login.getFirst_page_second_slide_indicator(), "second slide indicator is ");
			library.visible_link(login.getSecond_onboarding_tittle()," = "+ login.getSecond_onboarding_tittle().getText());
			library.visible_link(login.getClick_Skip_button2(), "Skip_button static 2nd page");	
			
			
		}
		
//================================================================================================================
		//@Test(dependsOnMethods={"TC_003_Verify_the_NEXT_button_clicking"})	
		@Test(priority=3)
		public void TC_004_Verify_the_NEXT_button_clicking() throws Exception  {
			log.info("***************TC_004_Verify_the_NEXT_button_clicking starts*****************");
			
			library.Custom_click(login.getClick_Next_button2(), "Next_button2 static 2nd page");
			Thread.sleep(2000);
			library.isSelected(login.getFirst_page_third_slide_indicator(), "Third slide indicator is ");
			library.visible_link(login.getThirdpage_onboarding_tittle()," = "+ login.getThirdpage_onboarding_tittle().getText());
			
		}
		
//================================================================================================================
		//@Test(dependsOnMethods={"TC_004_Verify_the_NEXT_button_clicking"})	
		@Test(priority=4)
		public void TC_005_Verify_the_slide_indicator() throws Exception  {
			log.info("***************TC_005_Verify_the_slide_indicator starts*****************");
			
			library.isSelectedFalse(login.getfirst_page_first_slide_indicator(), "first slide indicator is ");
			library.isSelectedFalse(login.getFirst_page_second_slide_indicator(), "Second slide indicator is ");
			library.isSelected(login.getFirst_page_third_slide_indicator(), "Third slide indicator is ");
		}
		
//================================================================================================================
	//	@Test(dependsOnMethods={"TC_005_Verify_the_slide_indicator"})	
		@Test(priority=5)
		public void TC_006_Verify_the_Done_button_clicking() throws Exception  {
			log.info("***************TC_006_Verify_the_Done_button_clicking starts*****************");
				
			library.visible_link(login.getClick_Done_button(), "Done button");
			library.Custom_click(login.getClick_Done_button(), "Done_button static 3rd page");
		}


//=====================Verify_login_component_login_page =======================================================
		//@Test(dependsOnMethods={"TC_006_Verify_the_Done_button_clicking"})	
		@Test(priority=6)
		public void TC_007_Verify_login_component()  {
			log.info("***************TC_007_Verify_login_component starts*****************");
			
			Assert.assertTrue(login.getLogin_heading().isDisplayed());       //Assert
			library.visible_link(login.getLogin_heading(), "Login heading");
			library.visible_link(login.getMobile_icon(), "Mobile icon");
			library.visible_link(login.getIndian_code(), "+91 indian code ");
			library.visible_link(login.getEnter_MO_Number(), "Enter mobile number");
			library.visible_link(login.getClick_Login_button(), "login button");
			library.isEnabledFalse(login.getClick_Login_button(), "Login button is ");
			library.visible_link(login.getYou_dont_have_an_account(), "You don't have an account ?");
			library.visible_link(login.getCreateAccount(), "Create an account");
		}
		
//================================== Frontend_login ================================================================
		//@Test(dependsOnMethods={"TC_007_Verify_login_component"})
		@Test(priority=7)
		public void TC_008_Verify_login_functionality_Register_mo_number() throws Exception  {
			log.info("***************TC_008_Verify_login_functionality_Register_mo_number starts*****************");
		
			library.custom_sendkeys(login.getEnter_MO_Number(), config.getMobile(), "Enter mobile number");
			appium_1.EnterButton();
			library.isEnabled(login.getClick_Login_button(), "Login button is ");
		//	library.Custom_click(login.getClick_Login_button(), "login button");
		}
//=================================================================================================================		
	//	@Test(dependsOnMethods={"TC_008_Verify_login_functionality_Register_mo_number"})
		@Test(priority=8)
		public void TC_009_verify_login_button_on_create_an_account_page() throws Exception {
			log.info("***************TC_009_verify_login_button_on_create_an_account_page starts*****************");
			
			library.Custom_click(login.getCreateAccount(), "Create an account at login page");
			Thread.sleep(1000);
			library.Custom_click(login.getClick_Login_button_C_A(), "login button on create an account page");
			Thread.sleep(2000);
			
		}	
//=================================================================================================================
	//	@Test(dependsOnMethods={"TC_009_verify_login_button_on_create_an_account_page"})
		@Test(priority=9)
		public void TC_0010_verify_create_an_account_by_clicking_login_page() {
			log.info("***************TC_0010_verify_create_an_account_by_clicking_login_page starts*****************");

			
			library.Custom_click(login.getCreateAccount(), "Create an account at login page");
			library.visible_link(login.getField_first_name(), "First name");
			library.visible_link(login.getField_last_name(), "Last name");
			library.visible_link(login.getField_mobile_number(), "Mobile number");
			library.visible_link(login.getField_email(), "Email");
			library.visible_link(login.getField_gender(), "Gender");
			library.isSelectedFalse(login.getClick_I_accept_checkbox(), " I accept checkbox");
			library.visible_link(login.getField_terms_and_conditons(), "Terms and condition");
			library.visible_link(login.getField_privacy_policy(), "Privacy Policy");
			library.isEnabledFalse(login.getClick_Create_My_Account(), "Create my account button");
			library.visible_link(login.getField_login(), "Login");			
		}
//===================================================================================================================		
	//	@Test(dependsOnMethods={"TC_0010_verify_create_an_account_by_clicking_login_page"})
		@Test(priority=10)
		public void TC_0011_verify_user_able_to_create_an_account() {
			log.info("***************TC_0011_verify_user_able_to_create_an_account starts*****************");
			book = PageFactory.initElements(driver1, booking_page.class);
			
			library.visible_link(book.getCA_MF_firstname(), "First name mandotary field ( * )");
			library.custom_sendkeys(login.getClick_First_name(), config.getFirst_name(), "First name");
			library.visible_link(book.getCA_MF_lastname(), "Last name mandotary field ( * )");
			library.custom_sendkeys(login.getClick_Last_name(), config.getLast_name(), "Last name");
			library.visible_link(book.getCA_MF_mobilenumber(), "Mobile number mandotary field ( * )");
		//	library.custom_sendkeys(login.getClick_Enter_Mobile_Number_C_A(), config.getMobile(), "Enter number");
			library.visible_link(book.getCA_MF_email(), "Email ID mandotary field ( * )");
			library.custom_sendkeys(login.getClick_Enter_Email(), config.getEnter_Email(), "Enter Email");
			appium_21.EnterButton();
			library.visible_link(book.getCA_MF_gender(), "Gender mandotary field ( * )");
			library.Custom_click(login.getClick_Gender_Female(), "Female gender selected");
			library.Custom_click(login.getClick_Gender_Other(), "Other gender selected");
			library.Custom_click(login.getClick_Gender_Male(), "Male gender selected");
					if(login.getClick_I_accept_checkbox().isSelected()==false) {
						library.passmsg("i accept checkbox By default is not = ", "selected");
						library.Custom_click(login.getClick_I_accept_checkbox(), "I accept checkbox");
					}else {
						library.failmsg("I accept check box is = ", "Selected");
					}
			library.visible_link(login.getClick_Terms_and_Conditions(), "Terms and condition ");
			library.visible_link(login.getClick_Login_button_C_A(), "login button is present");
			library.isEnabled(login.getClick_Create_My_Account(), "Create my account");
		//	library.Custom_click(login.getClick_Create_My_Account(), "Create my account");		
		}
//==================================================================================================================		
	//	@Test(dependsOnMethods={"TC_0011_verify_user_able_to_create_an_account"})
		@Test(priority=11)
		public void TC_0012_verify_Terms_and_condition_link_on_create_an_account_page() throws Exception {
			log.info("***************TC_0012_verify_Terms_and_condition_link_on_create_an_account_page starts*****************");
			
			library.Custom_click(login.getClick_Terms_and_Conditions(), "Terms and condition ");
			Thread.sleep(3000);
			library.visible_link(login.getTerms_and_condition_page_heading(), "Terms and condition page Heaading");
			Thread.sleep(3000);
			library.visible_link(login.getT_and_c_page_info_present(), "page info is present");
			library.Custom_click(login.getBack_button(), "Terms and condition back button ");		
		}
//===================================================================================================================
	//	@Test(dependsOnMethods={"TC_0012_verify_Terms_and_condition_link_on_create_an_account_page"})
		@Test(priority=12)
		public void TC_0013_verify_Privacy_and_policy_link_on_create_an_account_page() {
			log.info("***************TC_0013_verify_Privacy_and_policy_link_on_create_an_account_page starts*****************");
			
			library.Custom_click(login.getClick_Privacy_Policy(), "Privacy policy");
			library.visible_link(login.getPrivacy_policy_page_heading(), "Privacy policy page Heaading");
	//		library.visible_link(login.getDelete_account(), "Delete account txt");
			library.visible_link(login.getPrivacy_policy(), "Privacy policy txt");
			library.visible_link(login.getBack_button(), " back button ");		
		}
//=======================================================================================================================		
	//	@Test(dependsOnMethods={"TC_0013_verify_Privacy_and_policy_link_on_create_an_account_page"})
		@Test(priority=13)
		public void TC_0014_verify_Privacy_policy_under_Privacy_policy_dropdown_all_element() {
			log.info("***************TC_0014_verify_Privacy_policy_under_Privacy_policy_dropdown_all_element starts*****************");
			
			library.Custom_click(login.getPrivacy_policy_dropdown(), "Privacy policy dropdown open");
			library.visible_link(login.getPrivacy_policy_info(), "Privacy policy information");
			library.Custom_click(login.getPrivacy_policy_dropdown(), "Privacy policy dropdown Close");	
			library.Custom_click(login.getBack_button(), " back button ");
		}
//================================================================================================================		
		
//=================================================================================================================		
		//@Test(dependsOnMethods={"TC_0014_verify_Privacy_policy_under_Privacy_policy_dropdown_all_element"})
		@Test(priority=14)
		public void TC_0015_Verify_create_my_account_button() throws Exception  {
			log.info("***************TC_0015_Verify_create_my_account_button starts*****************");
		
			library.Custom_click(login.getClick_Create_My_Account(), "Create my account");
		}
//=================================================================================================================
	//	@Test(dependsOnMethods={"TC_0015_Verify_create_my_account_button"})
		@Test(priority=15)
		public void TC_0016_Verify_otp_verification_time_slot() throws Exception  {
			log.info("***************TC_0016_Verify_otp_verification_time_slot starts*****************");
			
			Thread.sleep(2000);	
			library.visible_link(login.getOtp_time_slot(), " Time duration ");
			library.visible_link(login.getOtp_time_slot(), " Time duration "+login.getOtp_time_slot().getText());
			
		}
//================================================================================================================
		
		
		
//================================ OTP VERIFYCATION PAGE ==========================================================
	//	@Test(dependsOnMethods={"TC_0016_Verify_otp_verification_time_slot"})
		@Test(priority=16)
		public void TC_0017_Verify_OTP_Verification_Page() throws InterruptedException   {
			log.info("***************TC_0017_Verify_OTP_Verification_Page starts*****************");
			Thread.sleep(5000);	
		
		library.isDisplayed(login.getOtp_verification_txt(), "OTP VERIFICATION page tittle");
		library.visible_link(login.getEnter_OTP(), "OTP Enter field");
		library.visible_link(login.getClick_OTP_Verify_button(), "Verify otp button");
		
		library.custom_sendkeys(login.getEnter_OTP(),config.getOTP(),"OTP send 6 digit successfully");
//		library.Custom_click(login.getClick_OTP_Verify_button(), "Otp Verify Button ");
		}

//========================= After login select location ===============================================================
	//	@Test(dependsOnMethods={"TC_0017_Verify_OTP_Verification_Page"})
		@Test(priority=17)
		public void TC_0018_Select_location() throws Exception  {
			log.info("***************TC_0018_Select_location starts*****************");
			
		library.visible_link(login.getWhile_using_this_app(), "While_using_this_app");
//		library.visible_link(login.getOnly_this_time(), "location page Only_this_time");
		library.visible_link(login.getDont_allow(), "Dont allow");
		library.Custom_click(login.getDont_allow(), "Dont allow");					
							//////// 2 nd page ///////
		Thread.sleep(3000);
		library.visible_link(login.getDetect_my_location(), "Detect_my_location");
		library.visible_link(login.getSelect_Manually_location(), "Select_Manually_location");
		library.Custom_click(login.getSelect_Manually_location(), "Select_Manually_location");//click
		
		}
//============================Verify city visible =======================================================================
		
	//	@Test(dependsOnMethods={"TC_0018_Select_location"})
		@Test(priority=18)
		public void TC_0019_verify_user_select_City() {
			log.info("***************TC_0019_verify_user_select_City starts*****************");
				
			library.visible_link(login.getPopular_cities_txt(), "Popular cities text");
			library.visible_link(login.getSelect_City_Delhi(), "Delhi");
			library.visible_link(login.getSelect_City_Gurugram(), "Gurugram");
			library.visible_link(login.getSelect_City_Noida(), "Noida");
			library.visible_link(login.getSelect_City_Greater_Bengaluru(), "Bengaluru");
			library.visible_link(login.getSelect_City_Automation_City(), "Automation city");
//			library.visible_link(login.getSelect_City_Greater_Noida(), "Greater_Noida");
				}
		
//================================ Search city name =====================================================================
	//	@Test(dependsOnMethods={"TC_0019_verify_user_select_City"})
		@Test(priority=19)
		public void TC_0020_Search_wrong_city_name() throws Exception  {
				log.info("***************TC_0020_Search_wrong_city_name starts*****************");
					
			library.visible_link(login.getSearch_city(), "Please select your city");
			library.custom_sendkeys(login.getSearch_city(), "Aurangabad", "Search city by city name");
			appium_0.EnterButton();
			library.visible_link(login.getSelected_city_not_available(), "Selected city not available");
				}
//================================ Search city name =====================================================================
	//	@Test(dependsOnMethods={"TC_0020_Search_wrong_city_name"})
		@Test(priority=20)
		public void TC_0021_Search_city_name() throws Exception  {
			log.info("***************TC_0021_Search_city_name starts*****************");
			
		library.visible_link(login.getSearch_city(), "Please select your city");
		library.custom_sendkeys(login.getSearch_city(), config.getcity_name(), "Search city by city name");
		appium_0.EnterButton();
		library.visible_link(login.getSelect_City_Automation_City(), "Automation city");
		}			
//===========================Select city =============================================================================
		
	//	@Test(dependsOnMethods={"TC_0021_Search_city_name"})
		@Test(priority=21)
		public void TC_0022_Select_all__City() {
			log.info("***************TC_0022_Select_all__City starts*****************");
			
			library.Custom_click(login.getSelect_City_Automation_City(), "Automation city");

		}
//=========================================================================================================================
		//@Test(dependsOnMethods={"TC_0022_Select_all__City"})
		@Test(priority=22)
		public void TC_0023_Verify_location_popup() {
			log.info("***************TC_0023_Verify_location_popup starts*****************");
			
			
			library.visible_link(login.getWhile_using_this_app(), "location page While_using_this_app");
//			library.visible_link(login.getOnly_this_time(), "location page Only_this_time");
			library.visible_link(login.getDont_allow_1(),"Dont allow 1");
			library.Custom_click(login.getDont_allow_1(), "Dont allow 1");

		}
	
	
}
