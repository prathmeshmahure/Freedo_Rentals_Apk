package freedodomain;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.pageobject.BookingPage;
import com.pageobject.LaunchLogin;
import com.utility.BaseClass;

@Listeners(com.utility.listner.class)
public class appium_0 extends BaseClass {
	public BookingPage book;
	public LaunchLogin login;
	public ExtentTest test;
	
	
//=============================================================================================================
		@Test(priority=0)
		public void TC_001_verify_install_apk()  {
		log.info("***************TC_001_verify_install_apk starts*****************");
		login = new LaunchLogin(driver1);
			
			login.verifyInstallApk();	
		}
	
//============================	Launch Application =============================================================
		@Test(priority=1)
		public void TC_002_verify_select_pickup_location_date_and_packages() {
		log.info("***************TC_002_verify_select_pickup_location_date_and_packages starts*****************");
			
			login.verifyPickUpLocation();
			login.verifySlideIndicator();
			login.verifyNextButton1();
			login.verifySkipButton1();
			}	
		
//================================ static_pages_view ============================================================
	//	@Test(dependsOnMethods={"TC_002_verify_select_pickup_location_date_and_packages"})	
		@Test(priority=2)
		public void TC_003_Verify_the_NEXT_button() throws Exception {
		log.info("***************TC_003_Verify_the_NEXT_button starts*****************");
			
			login.clickNextButton1();
			login.verifySlideIndicator2();
			login.verifySecondPageOnboardingTittle();
			login.verifySkipButton2();		
		}
		
//================================================================================================================
		//@Test(dependsOnMethods={"TC_003_Verify_the_NEXT_button_clicking"})	
		@Test(priority=3)
		public void TC_004_Verify_the_NEXT_button_clicking() throws Exception  {
		log.info("***************TC_004_Verify_the_NEXT_button_clicking starts*****************");
			
			login.clickNextButton2();
			login.verifySlideIndicator3();
			login.verifyThirdPageOnboardingTittle();			
		}
		
//================================================================================================================
		//@Test(dependsOnMethods={"TC_004_Verify_the_NEXT_button_clicking"})	
		@Test(priority=4)
		public void TC_005_Verify_the_slide_indicator() {
		log.info("***************TC_005_Verify_the_slide_indicator starts*****************");
			
			login.verifyThirdPageAllSlideIndicatorStatus();
		}
//================================================================================================================
	//	@Test(dependsOnMethods={"TC_005_Verify_the_slide_indicator"})	
		@Test(priority=5)
		public void TC_006_Verify_the_Done_button_clicking(){
		log.info("***************TC_006_Verify_the_Done_button_clicking starts*****************");
			
			login.verifyAndClickDoneButton();
			}
//=====================Verify_login_component_login_page =======================================================
		//@Test(dependsOnMethods={"TC_006_Verify_the_Done_button_clicking"})	
		@Test(priority=6)
		public void TC_007_Verify_login_component()  {
		log.info("***************TC_007_Verify_login_component starts*****************");
			
			login.verifyLoginHeading();
			login.verifyMobileIconAndIndianCode();
			login.verifyLoginComponent();
		}
//================================== Frontend_login ================================================================
		//@Test(dependsOnMethods={"TC_007_Verify_login_component"})
		@Test(priority=7)
		public void TC_008_Verify_login_functionality_Register_mo_number(){
		log.info("***************TC_008_Verify_login_functionality_Register_mo_number starts*****************");
		
			login.enterMobileNumber(config.getMobile());
		}
//=================================================================================================================		
	//	@Test(dependsOnMethods={"TC_008_Verify_login_functionality_Register_mo_number"})
		@Test(priority=8)
		public void TC_009_verify_login_button_on_create_an_account_page() {
		log.info("***************TC_009_verify_login_button_on_create_an_account_page starts*****************");
			
			login.clickCreateAccountLink();
			login.clickLoginButtonOnCreateAccountPage();
		}	
//=================================================================================================================
	//	@Test(dependsOnMethods={"TC_009_verify_login_button_on_create_an_account_page"})
		@Test(priority=9)
		public void TC_0010_verify_create_an_account_page() {
		log.info("***************TC_0010_verify_create_an_account_page starts*****************");
			
			login.clickCreateAccountLink();
			login.verifyCreateAccountAllComponents();		
	}
//===================================================================================================================		
	//	@Test(dependsOnMethods={"TC_0010_verify_create_an_account_by_clicking_login_page"})
		@Test(priority=10)
		public void TC_0011_verify_user_able_to_create_an_account() {
		log.info("***************TC_0011_verify_user_able_to_create_an_account starts*****************");
		book = new BookingPage(driver1);
			
			login.verifyAndEnterFirstName(config.getFirst_name());
			login.verifyAndEnterLastName(config.getLast_name());
			login.verifyMFMobileNumber();
			login.verifyAndEnterEmailId(config.getEnter_Email());
			login.verifyAndClickAllGender();
			login.verifyIAcceptCheckBox();
			login.verifyTermsAndCondition();
			login.verifyLoginButtonLinkOnCAPage();
			login.verifyCreateAnAccountButtonStatus();
	}
//==================================================================================================================		
	//	@Test(dependsOnMethods={"TC_0011_verify_user_able_to_create_an_account"})
		@Test(priority=11)
		public void TC_0012_verify_Terms_and_condition_link_on_create_an_account_page() throws Exception {
		log.info("***************TC_0012_verify_Terms_and_condition_link_on_create_an_account_page starts*****************");
			
			login.clickAndVerifyTermsAndCondition();
			login.verifyTermsAndConditionPageInfo();
			login.clickTermsAndConditionBackButton();	
	}
//===================================================================================================================
	//	@Test(dependsOnMethods={"TC_0012_verify_Terms_and_condition_link_on_create_an_account_page"})
		@Test(priority=12)
		public void TC_0013_verify_Privacy_and_policy_link_on_create_an_account_page() {
		log.info("***************TC_0013_verify_Privacy_and_policy_link_on_create_an_account_page starts*****************");
			
			login.clickAndVerifyPrivacyPolicy();
	}
//=======================================================================================================================		
	//	@Test(dependsOnMethods={"TC_0013_verify_Privacy_and_policy_link_on_create_an_account_page"})
		@Test(priority=13)
		public void TC_0014_verify_Privacy_policy_under_Privacy_policy_dropdown_all_element() {
		log.info("***************TC_0014_verify_Privacy_policy_under_Privacy_policy_dropdown_all_element starts*****************");
			
			login.clickAndVerifyPrivacyPolicyDropDown();
			login.clickPrivacyPolicyBackButton();
	}
//================================================================================================================		
		
//=================================================================================================================		
		//@Test(dependsOnMethods={"TC_0014_verify_Privacy_policy_under_Privacy_policy_dropdown_all_element"})
		@Test(priority=14)
		public void TC_0015_Verify_create_my_account_button() {
		log.info("***************TC_0015_Verify_create_my_account_button starts*****************");
			
			login.clickCreateAnAccountButton();
		}
//=================================================================================================================
	//	@Test(dependsOnMethods={"TC_0015_Verify_create_my_account_button"})
		@Test(priority=15 ,dependsOnMethods={"TC_0015_Verify_create_my_account_button"})
		public void TC_0016_Verify_otp_verification_time_slot() {
		log.info("***************TC_0016_Verify_otp_verification_time_slot starts*****************");
			
			login.verifyOtpVerificationTime();		
		}
//================================================================================================================
		
		
		
//================================ OTP VERIFYCATION PAGE ==========================================================
	//	@Test(dependsOnMethods={"TC_0016_Verify_otp_verification_time_slot"})
		@Test(priority=16)
		public void TC_0017_Verify_OTP_Verification_Page()   {
		log.info("***************TC_0017_Verify_OTP_Verification_Page starts*****************");
			
			login.verifyOtpVerificationComponent();
			login.enterOtp(config.getOTP());
		}
//========================= After login select location ===============================================================
	//	@Test(dependsOnMethods={"TC_0017_Verify_OTP_Verification_Page"})
		@Test(priority=17)
		public void TC_0018_Select_location() throws Exception  {
		log.info("***************TC_0018_Select_location starts*****************");
			
			login.verifyAndClickDontAllowNotification();
			login.verifyAndClicklocationNotification();
		
		}
//============================Verify city visible =======================================================================
		
	//	@Test(dependsOnMethods={"TC_0018_Select_location"})
		@Test(priority=18)
		public void TC_0019_verify_user_select_City_Page() {
		log.info("***************TC_0019_verify_user_select_City starts*****************");
			
			login.verifyUserSelectCityPage();
		}
//================================ Search city name =====================================================================
	//	@Test(dependsOnMethods={"TC_0019_verify_user_select_City"})
		@Test(priority=19)
		public void TC_0020_Search_wrong_city_name() {
		log.info("***************TC_0020_Search_wrong_city_name starts*****************");
			
			login.verifyAndEnterSearchCity();
			login.verifySelectedCityNotAvailable();
		}
//================================ Search city name =====================================================================
	//	@Test(dependsOnMethods={"TC_0020_Search_wrong_city_name"})
		@Test(priority=20)
		public void TC_0021_Search_city_name() {
		log.info("***************TC_0021_Search_city_name starts*****************");
			
			login.verifyAndEnterValidSearchCity(config.getcity_name());
			login.verifySelectedCityName(config.getcity_name());	
		}		
//===========================Select city =============================================================================
		
	//	@Test(dependsOnMethods={"TC_0021_Search_city_name"})
		@Test(priority=21 , dependsOnMethods={"TC_0021_Search_city_name"})
		public void TC_0022_Select_all__City() {
		log.info("***************TC_0022_Select_all__City starts*****************");
			
			login.clickSelectedCityName();
		}
//=========================================================================================================================
		//@Test(dependsOnMethods={"TC_0022_Select_all__City"})
		@Test(priority=22)
		public void TC_0023_Verify_location_popup() {
		log.info("***************TC_0023_Verify_location_popup starts*****************");
			
			login.verifyAndClickDontAllowLocation();
		}
		
}
