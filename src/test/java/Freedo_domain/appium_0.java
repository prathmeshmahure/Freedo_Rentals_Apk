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
	
	//============================	Launch Application =============================================================
		@Test(priority=1)
		public void appium_1_TC_001_On_boarding_screen() {
			login=PageFactory.initElements(driver1, launch_login.class);	
			log.info("***************appium_1_TC_001_On_boarding_screen starts*****************");
			
			library.visible_link(login.getClick_Next_button1(), "Next_button static 1st page");
			library.visible_link(login.getClick_Skip_button1(), "Skip_button static 1st page");
				
		}
	//================================ static_pages_view ============================================================
		@Test(dependsOnMethods={"appium_1_TC_001_On_boarding_screen"})	
		public void appium_1_TC_002_static_pages_view() throws Exception  {
			log.info("***************appium_1_TC_002_static_pages_view starts*****************");
			
			library.Custom_click(login.getClick_Next_button1(), "Next_button1 static 1st page");
			library.visible_link(login.getClick_Skip_button2(), "Skip_button static 2nd page");	
			library.Custom_click(login.getClick_Next_button2(), "Next_button2 static 2nd page");
			library.Custom_click(login.getClick_Done_button(), "Done_button static 3rd page");
		}

	//=====================Verify_login_component_login_page =======================================================
		@Test(dependsOnMethods={"appium_1_TC_002_static_pages_view"})	
		public void appium_1_TC_003_Verify_login_component()  {
			log.info("***************appium_1_TC_003_Verify_login_component starts*****************");
			
			Assert.assertTrue(login.getLogin_heading().isDisplayed());       //Assert
			library.visible_link(login.getLogin_heading(), "Login heading");
			library.visible_link(login.getCreateAccount(), "CreateAccount");	 
			library.visible_link(login.getEnter_MO_Number(), "Enter mobile number");
			library.visible_link(login.getClick_Login_button(), "login button");
			library.isEnabledFalse(login.getClick_Login_button(), "Login button is ");
		}
		
		//================================== Frontend_login ================================================================
		@Test(dependsOnMethods={"appium_1_TC_003_Verify_login_component"})
		public void appium_1_TC_004_1_Verify_login_functionality_Register_mo_number() throws Exception  {
			log.info("***************appium_1_TC_004_1_Verify_login_functionality_Register_mo_number starts*****************");
		
			library.custom_sendkeys(login.getEnter_MO_Number(), config.getMobile(), "Enter mobile number");
			appium_1.EnterButton();
			library.isEnabled(login.getClick_Login_button(), "Login button is ");
			library.Custom_click(login.getClick_Login_button(), "login button");
		}
	//================================ OTP VERIFYCATION PAGE ==========================================================
		@Test(dependsOnMethods={"appium_1_TC_004_1_Verify_login_functionality_Register_mo_number"})
		public void appium_1_TC_004_2_Verify_OTP_Verification_Page() throws InterruptedException   {
			log.info("***************appium_1_TC_004_2_Verify_OTP_Verification_Page starts*****************");
			Thread.sleep(5000);	
		
		library.isDisplayed(login.getOtp_verification_txt(), "OTP VERIFICATION page tittle");
		library.visible_link(login.getEnter_OTP(), "OTP Enter field");
		library.visible_link(login.getClick_OTP_Verify_button(), "Verify otp button");
		library.custom_sendkeys(login.getEnter_OTP(),config.getOTP(),"OTP send successfully");
//		library.Custom_click(login.getClick_OTP_Verify_button(), "Otp Verify Button ");
		}

	//========================= After login select location ===============================================================
		@Test(dependsOnMethods={"appium_1_TC_004_2_Verify_OTP_Verification_Page"})
		public void appium_1_TC_004_3_Select_location() throws Exception  {
			log.info("***************appium_1_TC_004_3_Select_location starts*****************");
			
		library.visible_link(login.getWhile_using_this_app(), "location page While_using_this_app");
//		library.visible_link(login.getOnly_this_time(), "location page Only_this_time");
		library.visible_link(login.getDont_allow(), "Dont allow");
		library.Custom_click(login.getDont_allow(), "location page Dont allow"); 					
							//////// 2 nd page ///////
		Thread.sleep(3000);
		library.visible_link(login.getDetect_my_location(), "location page Detect_my_location");
		library.visible_link(login.getSelect_Manually_location(), "location page Select_Manually_location");
		library.Custom_click(login.getSelect_Manually_location(), "location page Select_Manually_location");//click
		
		}
	//============================Verify city visible =======================================================================
		
		@Test(dependsOnMethods={"appium_1_TC_004_3_Select_location"})
		public void appium_1_TC_005_verify_all__City() {
			log.info("***************appium_1_TC_005_verify_all__City starts*****************");
			
			library.visible_link(login.getPopular_cities_txt(), "Popular cities text");
			library.visible_link(login.getSelect_City_Delhi(), "Delhi");
			library.visible_link(login.getSelect_City_Gurugram(), "Gurugram");
			library.visible_link(login.getSelect_City_Noida(), "Noida");
			library.visible_link(login.getSelect_City_Greater_Bengaluru(), "Bengaluru");
			library.visible_link(login.getSelect_City_Automation_City(), "Automation city");
//			library.visible_link(login.getSelect_City_Greater_Noida(), "Greater_Noida");
		}
		
	//===========================Select city =============================================================================
		
		@Test(dependsOnMethods={"appium_1_TC_005_verify_all__City"})
		public void appium_1_TC_006_Select_all__City() {
			log.info("***************appium_1_TC_006_Select_all__City starts*****************");
			
			library.Custom_click(login.getSelect_City_Automation_City(), "Automation city");
			
			library.visible_link(login.getWhile_using_this_app(), "location page While_using_this_app");
//			library.visible_link(login.getOnly_this_time(), "location page Only_this_time");
			library.visible_link(login.getDont_allow_1(),"Dont allow 1");
			library.Custom_click(login.getDont_allow_1(), "Dont allow 1");

		}

	
	
	
}
