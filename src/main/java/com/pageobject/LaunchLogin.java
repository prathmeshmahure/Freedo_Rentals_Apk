package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.utility.Library;

import io.appium.java_client.android.AndroidDriver;

public class LaunchLogin {
	
	
	public WebDriver driver;
	
//=======================app launch page ============ 1 page ===================
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='Select Pickup Location, Date and Packages']")					//Skip Button1
	private WebElement first_page_Select_pickUP_location;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='view_dot_first']")			
	private WebElement first_page_first_slide_indicator;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='view_dot_second']")			
	private WebElement first_page_second_slide_indicator;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='view_dot_third']")			
	private WebElement first_page_third_slide_indicator;
	
	@FindBy(xpath="//android.widget.TextView[@text='Get it Home Delivered or Pickup from location']")			
	private WebElement second_onboarding_tittle;
	
	@FindBy(xpath="//android.widget.TextView[@text='Complete the payment and enjoy the ride']")			
	private WebElement Thirdpage_onboarding_tittle;
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='Skip']/.")					//Skip Button1
	private WebElement Click_Skip_button1;
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='Skip']/.")					//Skip Button2
	private WebElement Click_Skip_button2;
	
	@FindBy(how=How.XPATH,using="(//android.widget.TextView)[@text='Next']/..")					//Next Button1
	private WebElement Click_Next_button1;
	
	@FindBy(how=How.XPATH,using="(//android.widget.TextView)[@text='Next']/..")					//Next Button2
	private WebElement Click_Next_button2;
	
	@FindBy(how=How.XPATH,using="(//android.widget.TextView)[@text='Done']/..")					//Done Button
	private WebElement Click_Done_button;

	//======================== Create Account =========2 page =======================

	@FindBy(xpath="//android.widget.TextView[@content-desc='labelNfirstNLabel']")				 		 
	private WebElement Field_first_name;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='labelNlastNLabel']")				 		 
	private WebElement Field_last_name;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='labelNmobileNLabel']")				 		 
	private WebElement Field_mobile_number;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='labelNemailNLabel']")				 		 
	private WebElement Field_email;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='labelNgenderNLabel']")				 		 
	private WebElement Field_gender;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Terms']")				 		 
	private WebElement Field_terms_and_conditons;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Privacy']")				 		 
	private WebElement Field_privacy_policy;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Login_signup']")				 		 
	private WebElement Field_login;
	
	@FindBy(how=How.XPATH,using="//android.widget.EditText[@text='First name']")				//First name
	private WebElement Click_First_name;		
	
	@FindBy(how=How.XPATH,using="//android.widget.EditText[@text='Last name']")					//Last name
	private WebElement Click_Last_name;
	
	@FindBy(how=How.XPATH,using="//android.widget.EditText[@text='Enter Mobile Number']")		//Create account Enter Mobile Number
	private WebElement Click_Enter_Mobile_Number_C_A;
	
	@FindBy(how=How.XPATH,using="//android.widget.EditText[@text='Email']")						//Email
	private WebElement Click_Enter_Email;  
	
	@FindBy(how=How.XPATH,using="(//android.widget.TextView[@text='Email*']")					//Click_Email_remove_keyboard
	private WebElement Click_Email_remove_keyboard;	
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@content-desc='imgradioBtn_AccountMale']")					////Gender Male
	private WebElement Click_Gender_Male;
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@content-desc='imgradioBtn_AccountFemale']")					////Gender_Female
	private WebElement Click_Gender_Female;
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@content-desc='imgradioBtn_AccountOther']")					////Gender Other
	private WebElement Click_Gender_Other;
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@content-desc='imgcbx_Accept']")								//I accept checkbox
	private WebElement Click_I_accept_checkbox;
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='Terms & Conditions']")		////Terms & Conditions
	private WebElement Click_Terms_and_Conditions;	
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='Privacy Policy']")			////Privacy Policy
	private WebElement Click_Privacy_Policy;	//same xpath in two element unable to find xpath index 21
	
	@FindBy(how=How.XPATH,using="//android.view.ViewGroup[@content-desc='btn_Create']")		//Create My Account
	private WebElement Click_Create_My_Account;
	
	@FindBy(id="android:id/button1") 															////User already registered! Please go to login
	private WebElement Click_User_already_registered_ok;
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='Login']")						////You have an account? Login
	private WebElement Click_Login_button_C_A;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='asteriskNfNRed']")
	private WebElement CA_MF_firstname;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='asteriskNlNRed']")
	private WebElement CA_MF_lastname;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='asteriskNmNRed']")
	private WebElement CA_MF_mobilenumber;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='asteriskNeNRed']")
	private WebElement CA_MF_email;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='asteriskNgNRed']")
	private WebElement CA_MF_gender;
//===========================  Terms_and_Conditions ===============================
	@FindBy(how=How.XPATH,using="//android.view.View[@text='TERMS & CONDITIONS']")						
	private WebElement Terms_and_condition_page_heading;
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='1. GENERAL']")						
	private WebElement T_and_c_page_info_present;
	
	@FindBy(how=How.XPATH,using="//android.widget.Button[@content-desc='SignUp, back']")						
	private WebElement back_button;

//===========================  Privacy_Policy ===============================
	@FindBy(how=How.XPATH,using="//android.view.View[@text='PRIVACY POLICY']")						
	private WebElement privacy_policy_page_heading;
			//=================================================
		@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='Delete Account']")						
		private WebElement delete_account;
		
		@FindBy(how=How.XPATH,using="//android.view.ViewGroup[@content-desc='btn_arrow_delete']")						
		private WebElement delete_account_dropdown;
		
		@FindBy(how=How.XPATH,using="//android.widget.TextView[@content-desc='imgcb_Bad experience on a ride']")						
		private WebElement DA_checkbox_1;
		
		@FindBy(how=How.XPATH,using="(//android.widget.TextView[@index='0'])[4]")						
		private WebElement DA_checkbox_2;
		
		@FindBy(how=How.XPATH,using="//android.widget.TextView[@content-desc='imgcb_Negative support experience']")						
		private WebElement DA_checkbox_3;
		
		@FindBy(how=How.XPATH,using="//android.widget.TextView[@content-desc='imgcb_Issues with my internet']")						
		private WebElement DA_checkbox_4;
		
		@FindBy(how=How.XPATH,using="//android.widget.TextView[@content-desc='imgcb_No longer support company']")						
		private WebElement DA_checkbox_5;
		
		@FindBy(how=How.XPATH,using="//android.widget.TextView[@content-desc='imgcb_Prefer not to say']")						
		private WebElement DA_checkbox_6;
		
		@FindBy(how=How.XPATH,using="//android.widget.TextView[@content-desc='imgcb_Others']")						
		private WebElement DA_checkbox_7;
		///================================================
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='Privacy Policy']")						
	private WebElement privacy_policy;
	
	@FindBy(how=How.XPATH,using="//android.view.ViewGroup[@content-desc='btn_arrow_privacy']")						
	private WebElement privacy_policy_dropdown;
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='In this Privacy Policy, “Services” App and Vehicle respectively means:']")						
	private WebElement privacy_policy_info;
	

	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='Changed Mind? Go back.']")						
	private WebElement privacy_policy_Changed_mind_go_back;
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='Deactivate Account']")						
	private WebElement privacy_policy_Deactivate_account;
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='Confirm Deletion']")						
	private WebElement privacy_policy_confirm_deletion;
	
	
	
	//=======================login page =============== 3 page ===========
	@FindBy(how=How.XPATH,using="(//android.widget.TextView[@text='Login'])[1]")				////Login_heading
	private WebElement Login_heading;	
	
	@FindBy(how=How.XPATH,using="//android.widget.EditText[@content-desc=\"input_MobileLogin\"]")////Enter MObile Number 
	private WebElement Enter_MO_Number;
	
	@FindBy(how=How.XPATH,using="//android.view.ViewGroup[@content-desc=\"btn_login\"]")		////Click on login button ( index )
	private WebElement Click_Login_button;
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='OTP Verification']")								//Enter otp ( index )
	private WebElement Otp_verification_txt;
				
	@FindBy(how=How.XPATH,using="(//android.widget.EditText)[1]")								//Enter otp ( index )
	private WebElement Enter_OTP;
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='Verify Code' or @text='Verify OTP']")				//Verify button
	private WebElement Click_OTP_Verify_button;
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@content-desc='txt_timer']")				//Verify button
	private WebElement Otp_time_slot;
									
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@content-desc='txt_create_account']")	////Create Account
	private WebElement CreateAccount;
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='+91-']")			
	private WebElement indian_code;
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='']")			
	private WebElement mobile_icon;
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@index='4']")			//You don't have an account ?
	private WebElement You_dont_have_an_account;

	
	//=======================select location 4 page============= 4 page ===========
	
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button") //While using this app
	private WebElement While_using_this_app;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_one_time_button")		  //Only this time
	private WebElement Only_this_time;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_deny_button")				  //Don't allow
	private WebElement Dont_allow;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_deny_and_dont_ask_again_button")	 //Don't allow_1
	private WebElement Dont_allow_1;
	//======================= select location 5 page ============ 5 page ============
	@FindBy(id="com.android.permissioncontroller:id/permission_location_accuracy_radio_fine")	//Precise
	private WebElement Precise;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_location_accuracy_radio_coarse")	 //Approximate
	private WebElement Approximate;
	
	
	@FindBy(xpath="//android.widget.TextView[@text='Detect My Location']")				 	 //Detect my location
	private WebElement Detect_my_location;
	
	@FindBy(xpath="//android.widget.TextView[@text='Select Manually']")				 		 //Select Manually
	private WebElement Select_Manually_location;
//============================= Select City======================= 6 page =======================================
	@FindBy(xpath="//android.widget.EditText[@content-desc='ipt_City']")				 		 //Search city by name
	private WebElement Search_city;
	
	@FindBy(xpath="//android.widget.TextView[@text='Popular Cities']")		 //Select Location  Noida
	private WebElement Popular_cities_txt;
	
	@FindBy(xpath="//android.widget.ImageView[@content-desc='img_NoCIty']")				 		 
	private WebElement Selected_city_not_available;
	
	
	@FindBy(xpath="//android.widget.TextView[@text='Delhi']")				 		 //Select Location Delhi
	private WebElement Select_City_Delhi;
	
	@FindBy(xpath="//android.widget.TextView[@text='Noida']")		 //Select Location  Noida
	private WebElement Select_City_Noida;
	
	@FindBy(xpath="//android.widget.TextView[@text='Bengaluru']")				 		 //Select_City_Greater_Bengaluru Greater Noida
	private WebElement Select_City_Greater_Bengaluru;
	
	@FindBy(xpath="//android.widget.TextView[@text='Automation City']")				 		 //Select_City_Chennai
	private WebElement Select_City_Automation_City;
	
	@FindBy(xpath="")				 		 //Select Location Faridabad
	private WebElement Select_City_Faridabad;
	
	@FindBy(xpath="//android.widget.TextView[@text='Jaipur']")				 		
	private WebElement Select_City_jaipur;
	
	@FindBy(xpath="//android.widget.TextView[@text='Gurugram']")				 	 //Select Location Gurugram
	private WebElement Select_City_Gurugram;

	
	
//=======================================================================================================
		public LaunchLogin(AndroidDriver driver1) 
		{
			driver=driver1;
			PageFactory.initElements(driver1, this);
		}

					public WebDriver getDriver() {
						return (WebDriver) driver;
					}

//=======================app launch page ============ 1 page getter method=====================================
//					
//					public WebElement getClick_Skip_button1() {
//						return Click_Skip_button1;
//					}
//					
//					public WebElement getClick_Next_button1() {
//						return Click_Next_button1;
//					}
//
//					public WebElement getClick_Next_button2() {
//						return Click_Next_button2;
//					}
//
//					public WebElement getClick_Done_button() {
//						return Click_Done_button;
//					}
//					
//////==================== Create Account ============= 2 page getter method===============================
//					public WebElement getClick_First_name() {					// First_name
//						return Click_First_name;
//					}
//					
//					public WebElement getClick_Last_name() {					//Last_name
//						return Click_Last_name;
//					}
//
//					public WebElement getClick_Enter_Mobile_Number_C_A() {		//Enter_Mobile_Number_C_A
//						return Click_Enter_Mobile_Number_C_A;
//					}
//
//					public WebElement getClick_Enter_Email() {					//Enter_Email //
//						return Click_Enter_Email;
//					}
//
//					public WebElement getClick_Email_remove_keyboard() {		//Click_Email_remove_keyboard
//						return Click_Email_remove_keyboard;
//					}
//
//					public WebElement getClick_Gender_Male() {					//Gender_Male
//						return Click_Gender_Male;
//					}
//
//					public WebElement getClick_Gender_Female() {				//Gender_Female
//						return Click_Gender_Female;
//					}
//
//					public WebElement getClick_Gender_Other() {					//Gender_Other
//						return Click_Gender_Other;
//					}
//
//					public WebElement getClick_I_accept_checkbox() {			//I_accept_checkbox
//						return Click_I_accept_checkbox;
//					}
//
//					public WebElement getClick_Terms_and_Conditions() {			//Terms_and_Conditions
//						return Click_Terms_and_Conditions;						
//					}
//
//					public WebElement getClick_Privacy_Policy() {				//Privacy_Policy
//						return Click_Privacy_Policy;							
//					}
//
//					public WebElement getClick_Create_My_Account() {			//Click_Create_My_Account
//						return Click_Create_My_Account;
//					}
//
//					public WebElement getClick_User_already_registered_ok() {			//Click_User_already_registered_ok
//						return Click_User_already_registered_ok;
//					}
//
//					public WebElement getClick_Login_button_C_A() {				//You have an account? Login
//						return Click_Login_button_C_A;
//					}
//					
//					
////=======================verify login page =============== 3 page getter method==================================
//
//					
//					public WebElement getLogin_heading() {
//						return Login_heading;
//					}
//					public WebElement getClick_Skip_button2() {
//						return Click_Skip_button2;
//					}
//					
//					public WebElement getEnter_MO_Number() {
//						return Enter_MO_Number;
//					}
//
//					public WebElement getClick_Login_button() {
//						return Click_Login_button;
//					}
//
//					public WebElement getEnter_OTP() {
//						return Enter_OTP;
//					}
//
//
//					public WebElement getClick_OTP_Verify_button() {
//						return Click_OTP_Verify_button;
//					}
//
//					public WebElement getCreateAccount() {
//						return CreateAccount;
//					}
//					
////======================= select location 4 page ============ 4 page getter method ===============================
//					public WebElement getWhile_using_this_app() {
//						return While_using_this_app;
//					}
//					public WebElement getOnly_this_time() {
//						return Only_this_time;
//					}
//					public WebElement getDont_allow() {
//						return Dont_allow;
//					}
//					public WebElement getDont_allow_1() {
//						return Dont_allow_1;
//					}
//					
////=========================	select location 5 page	========= 5 page getter method	=============================	
//					
//					public WebElement getPrecise() {
//						return Precise;
//					}
//					
//					public WebElement getApproximate() {
//						return Approximate;
//					}
//					
//					public WebElement getDetect_my_location() {
//						return Detect_my_location;
//					}
//					
//					public WebElement getSelect_Manually_location() {
//						return Select_Manually_location;
//					}
//					
////========================== Select City ==================== 6 page getter method =================================					
//					
//					public WebElement getSelect_City_Delhi() {
//						return Select_City_Delhi;
//					}
//					public WebElement getSelect_City_Noida() {
//						return Select_City_Noida;
//					}
//					public WebElement getSelect_City_Greater_Bengaluru() {
//						return Select_City_Greater_Bengaluru;
//					}
//					public WebElement getSelect_City_Automation_City() {
//						return Select_City_Automation_City;
//					}
//					public WebElement getSelect_City_Faridabad() {
//						return Select_City_Faridabad;
//					}
//					public WebElement getSelect_City_Gurugram() {
//						return Select_City_Gurugram;
//					}
////======================================================================================================================					
//
//					public WebElement getOtp_verification_txt() {
//						return Otp_verification_txt;
//					}
//
//					public WebElement getPopular_cities_txt() {
//						return Popular_cities_txt;
//					}
//
//					public WebElement getFirst_page_Select_pickUP_location() {
//						return first_page_Select_pickUP_location;
//					}
//
//					public WebElement getfirst_page_first_slide_indicator() {
//						return first_page_first_slide_indicator;
//					}
//
//					public WebElement getSecond_onboarding_tittle() {
//						return second_onboarding_tittle;
//					}
//
//					public WebElement getThirdpage_onboarding_tittle() {
//						return Thirdpage_onboarding_tittle;
//					}
//
//					public WebElement getFirst_page_first_slide_indicator() {
//						return first_page_first_slide_indicator;
//					}
//
//					public WebElement getFirst_page_second_slide_indicator() {
//						return first_page_second_slide_indicator;
//					}
//
//					public WebElement getFirst_page_third_slide_indicator() {
//						return first_page_third_slide_indicator;
//					}
//
//					public WebElement getIndian_code() {
//						return indian_code;
//					}
//
//					public WebElement getMobile_icon() {
//						return mobile_icon;
//					}
//
//					public WebElement getYou_dont_have_an_account() {
//						return You_dont_have_an_account;
//					}
//
//					public WebElement getField_first_name() {
//						return Field_first_name;
//					}
//
//					public WebElement getField_last_name() {
//						return Field_last_name;
//					}
//
//					public WebElement getField_mobile_number() {
//						return Field_mobile_number;
//					}
//
//					public WebElement getField_email() {
//						return Field_email;
//					}
//
//					public WebElement getField_gender() {
//						return Field_gender;
//					}
//
//					public WebElement getField_terms_and_conditons() {
//						return Field_terms_and_conditons;
//					}
//
//					public WebElement getField_privacy_policy() {
//						return Field_privacy_policy;
//					}
//
//					public WebElement getField_login() {
//						return Field_login;
//					}
//
//					public WebElement getTerms_and_condition_page_heading() {
//						return Terms_and_condition_page_heading;
//					}
//
//					public WebElement getT_and_c_page_info_present() {
//						return T_and_c_page_info_present;
//					}
//
//					public WebElement getBack_button() {
//						return back_button;
//					}
//
//					public WebElement getPrivacy_policy_page_heading() {
//						return privacy_policy_page_heading;
//					}
//
//					public WebElement getDelete_account() {
//						return delete_account;
//					}
//
//					public WebElement getPrivacy_policy() {
//						return privacy_policy;
//					}
//
//					public WebElement getDelete_account_dropdown() {
//						return delete_account_dropdown;
//					}
//
//					public WebElement getDA_checkbox_1() {
//						return DA_checkbox_1;
//					}
//
//					public WebElement getDA_checkbox_2() {
//						return DA_checkbox_2;
//					}
//
//					public WebElement getDA_checkbox_3() {
//						return DA_checkbox_3;
//					}
//
//					public WebElement getDA_checkbox_4() {
//						return DA_checkbox_4;
//					}
//
//					public WebElement getDA_checkbox_5() {
//						return DA_checkbox_5;
//					}
//
//					public WebElement getDA_checkbox_6() {
//						return DA_checkbox_6;
//					}
//
//					public WebElement getDA_checkbox_7() {
//						return DA_checkbox_7;
//					}
//
//					public WebElement getPrivacy_policy_dropdown() {
//						return privacy_policy_dropdown;
//					}
//
//					public WebElement getPrivacy_policy_info() {
//						return privacy_policy_info;
//					}

					public WebElement getOtp_time_slot() {
						return Otp_time_slot;
					}
//
//					public WebElement getSearch_city() {
//						return Search_city;
//					}
//
//					public WebElement getSelected_city_not_available() {
//						return Selected_city_not_available;
//					}
//
//					public WebElement getSelect_City_jaipur() {
//						return Select_City_jaipur;
//					}
//
//					public WebElement getPrivacy_policy_Changed_mind_go_back() {
//						return privacy_policy_Changed_mind_go_back;
//					}
//
//					public WebElement getPrivacy_policy_Deactivate_account() {
//						return privacy_policy_Deactivate_account;
//					}
//
//					public WebElement getPrivacy_policy_confirm_deletion() {
//						return privacy_policy_confirm_deletion;
//					}
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			public void verifyInstallApk() {
				Library.visible_link(first_page_Select_pickUP_location,"Freedo app is Install");
			}
					
			public void verifyPickUpLocation() {
				Library.visible_link(first_page_Select_pickUP_location,"Select pickup location date and packages");
			}		
			public void verifySlideIndicator() {
				Library.isSelected(first_page_first_slide_indicator, "First slide indicator is ");
				Library.visible_link(first_page_first_slide_indicator, "first slide indicator");
				Library.visible_link(first_page_second_slide_indicator, "second slide indicator");
				Library.visible_link(first_page_third_slide_indicator, "third slide indicator");
			}		
			public void verifyNextButton1() {
				Library.visible_link(Click_Next_button1, "1st Next button static page");
			}		
			public void verifySkipButton1() {
				Library.visible_link(Click_Skip_button1, "1st Skip button static page");
			}		
			public void clickNextButton1() {
				Library.Custom_click(Click_Next_button1, "1st Next button static page");
			}		
			public void verifySlideIndicator2() throws Exception {
				Thread.sleep(1000);
				Library.isSelected(first_page_second_slide_indicator, "second page slide indicator is ");
			}		
			public void verifySecondPageOnboardingTittle() {
				Library.visible_link(second_onboarding_tittle,"Second page onboarding tittle");
			}	
			public void verifySkipButton2() {
				Library.visible_link(Click_Skip_button2, "2nd page Skip_button2 ");
			}
			public void clickNextButton2() {
				Library.visible_link(Click_Next_button2, "2nd page Next_button2");
				Library.Custom_click(Click_Next_button2, "2nd page Next_button2");
			}
			public void verifySlideIndicator3() throws Exception {
				Thread.sleep(1000);
				Library.isSelected(first_page_third_slide_indicator, "Third slide indicator is ");
			}
			public void verifyThirdPageOnboardingTittle() {
				Library.visible_link(Thirdpage_onboarding_tittle,"Third page onboarding tittle");
			}
			public void verifyThirdPageAllSlideIndicatorStatus() {
				Library.isSelectedFalse(first_page_first_slide_indicator, "first slide indicator is ");
				Library.isSelectedFalse(first_page_second_slide_indicator, "Second slide indicator is ");
				Library.isSelected(first_page_third_slide_indicator, "Third slide indicator is ");
			}
			public void verifyAndClickDoneButton() {
				Library.visible_link(Click_Done_button, "Done button");
				Library.Custom_click(Click_Done_button, "Done button");
			}
			public void verifyLoginHeading() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Library.waitForVisibilityOf(Login_heading);
				Library.visible_link(Login_heading, "Login heading");
			}
			public void verifyMobileIconAndIndianCode() {
				Library.visible_link(mobile_icon, "Mobile icon");
				Library.visible_link(indian_code, "+91 indian code ");
			}
			public void verifyLoginComponent() {
				Library.visible_link(Enter_MO_Number, "Enter mobile number");
				Library.visible_link(Click_Login_button, "login button");
				Library.isEnabledFalse(Click_Login_button, "Login button is ");
				Library.visible_link(You_dont_have_an_account, "You don't have an account ?");
				Library.visible_link(CreateAccount, "Create an account");
			}
			public void enterMobileNumber(String MobileNumber) {
				Library.custom_sendkeys(Enter_MO_Number, MobileNumber, "Enter mobile number");
				Library.EnterButton();
				Library.isEnabled(Click_Login_button, "Login button is ");
			}
			public void clickCreateAccountLink() {
				Library.Custom_click(CreateAccount, "Create an account at login page");
			}
			public void clickLoginButtonOnCreateAccountPage() {
				Library.waitAndClick(Click_Login_button_C_A, "login button on create an account page",1000);
			}
			public void verifyCreateAccountAllComponents() {
				Library.visible_link(Field_first_name, "First name");
				Library.visible_link(Field_last_name, "Last name");
				Library.visible_link(Field_mobile_number, "Mobile number");
				Library.visible_link(Field_email, "Email");
				Library.visible_link(Field_gender, "Gender");
				Library.isSelectedFalse(Click_I_accept_checkbox, " I accept checkbox");
				Library.visible_link(Field_terms_and_conditons, "Terms and condition");
				Library.visible_link(Field_privacy_policy, "Privacy Policy");
				Library.isEnabledFalse(Click_Create_My_Account, "Create my account button");
				Library.visible_link(Field_login, "Login");	
			}
		    public void verifyAndEnterFirstName(String FirstName) {
		    	Library.visible_link(CA_MF_firstname, "First name mandotary field ( * )");
				Library.custom_sendkeys(Click_First_name, FirstName, "First name");
		    }

		    public void verifyAndEnterLastName(String LastName) {
		    	Library.visible_link(CA_MF_lastname, "Last name mandotary field ( * )");
				Library.custom_sendkeys(Click_Last_name, LastName, "Last name");
				Library.EnterButton();
		    }
		    public void verifyMFMobileNumber() {
		    	Library.visible_link(CA_MF_mobilenumber, "Mobile number mandotary field ( * )");
		    }
		    public void verifyAndEnterEmailId(String EmailId) {
		    	Library.visible_link(CA_MF_email, "Email ID mandotary field ( * )");
				Library.custom_sendkeys(Click_Enter_Email, EmailId, "Enter Email");
				Library.EnterButton();
		    }
		    public void verifyAndClickAllGender() {
		    	Library.visible_link(CA_MF_gender, "Gender mandotary field ( * )");
				Library.Custom_click(Click_Gender_Female, "Female gender selected");
				Library.Custom_click(Click_Gender_Other, "Other gender selected");
				Library.Custom_click(Click_Gender_Male, "Male gender selected");
		    }
			public void verifyIAcceptCheckBox() {
				if(Click_I_accept_checkbox.isSelected()==false) {
					Library.passmsg("i accept checkbox By default is not = ", "selected");
					Library.Custom_click(Click_I_accept_checkbox, "I accept checkbox");
				}else {
					Library.failmsg("I accept check box is = ", "Selected");
				}
			}
			public void verifyTermsAndCondition() {
				Library.visible_link(Click_Terms_and_Conditions, "Terms and condition ");
			}
			public void verifyLoginButtonLinkOnCAPage() {
				Library.visible_link(Click_Login_button_C_A, "login button is present");
			}
			public void verifyCreateAnAccountButtonStatus() {
				Library.isEnabled(Click_Create_My_Account, "Create my account");
			}
			public void clickAndVerifyTermsAndCondition() throws Exception {
				Library.Custom_click(Click_Terms_and_Conditions, "Terms and condition ");
				Thread.sleep(1000);
				Library.visible_link(Terms_and_condition_page_heading, "Terms and condition page Heading");
			}
			public void verifyTermsAndConditionPageInfo() {
				Library.waitForVisibilityOf(T_and_c_page_info_present);
				Library.visible_link(T_and_c_page_info_present, "Terms and condition page info");
			}
			public void clickTermsAndConditionBackButton() {
				Library.Custom_click(back_button, "Terms and condition page back button ");
			}
			public void clickAndVerifyPrivacyPolicy() {
				Library.Custom_click(Click_Privacy_Policy, "Privacy policy");
				Library.visible_link(privacy_policy_page_heading, "Privacy policy page Heaading");
				Library.visible_link(privacy_policy, "Privacy policy txt");
				Library.visible_link(back_button, " back button ");
			}
			public void clickAndVerifyPrivacyPolicyDropDown() {
				Library.Custom_click(privacy_policy_dropdown, "Privacy policy dropdown open");
				Library.visible_link(privacy_policy_info, "Privacy policy information");
				Library.Custom_click(privacy_policy_dropdown, "Privacy policy dropdown Close");	
			}
			public void clickPrivacyPolicyBackButton() {
				Library.Custom_click(back_button, " back button ");
			}
			public void clickCreateAnAccountButton() {
				Library.Custom_click(Click_Create_My_Account, "Create my account");
			}
			public void verifyOtpVerificationTime() {
				Library.visible_link(Otp_time_slot, " Time duration ");
				try{ String otp =getOtp_time_slot().getText(); 
				Library.visible_link(Otp_time_slot, " Time duration "+otp);
				}catch(Exception e) {  }
				
			}
			public void verifyOtpVerificationComponent() {
				Library.visible_link(Otp_verification_txt, "OTP VERIFICATION page tittle");
				Library.visible_link(Enter_OTP, "OTP Enter field");
				Library.visible_link(Click_OTP_Verify_button, "Verify otp button");
			}
			public void enterOtp(String otp) {
				Library.custom_sendkeys(Enter_OTP,otp,"OTP send 6 digit successfully");
			}
			public void verifyAndClickDontAllowNotification() {
				Library.visible_link(While_using_this_app, "While_using_this_app");
				Library.visible_link(Dont_allow, "Dont allow");
				Library.Custom_click(Dont_allow, "Dont allow");	
			}
			public void verifyAndClicklocationNotification() throws Exception {
				Thread.sleep(1000);
				Library.visible_link(Detect_my_location, "Detect_my_location");
				Library.visible_link(Select_Manually_location, "Select_Manually_location");
				Library.Custom_click(Select_Manually_location, "Select_Manually_location");//click
			}
			public void verifyUserSelectCityPage() {
				Library.visible_link(Popular_cities_txt, "Popular cities text");
				Library.visible_link(Select_City_Delhi, "Delhi");
				Library.visible_link(Select_City_Gurugram, "Gurugram");
				Library.visible_link(Select_City_Noida, "Noida");
				Library.visible_link(Select_City_Greater_Bengaluru, "Bengaluru");
			}
			public void verifyAndEnterSearchCity() {
				Library.visible_link(Search_city, "Please select your city");
				Library.custom_sendkeys(Search_city, "Aurangabad", "Search city by city name");
				Library.EnterButton();
			}
			public void verifySelectedCityNotAvailable() {
				Library.visible_link(Selected_city_not_available, "Selected city not available");
			}
			public void verifyAndEnterValidSearchCity(String city_name) {
				Library.visible_link(Search_city, "Please select your city");
				Library.custom_sendkeys(Search_city, city_name, "Search city by city name");
				Library.EnterButton();
			}
			public void verifySelectedCityName(String city_name) {
				Library.visible_link(Select_City_Noida, city_name+" city");
			}
			public void clickSelectedCityName() {
				Library.Custom_click(Select_City_Noida," city");
			}
			public void verifyAndClickDontAllowLocation() {
				Library.visible_link(While_using_this_app, "location page While_using_this_app");
				Library.visible_link(Dont_allow_1,"Dont allow 1");
				Library.Custom_click(Dont_allow_1, "Dont allow 1");
			}
			public void clickOnLoginButton() {
				Library.Custom_click(Click_Login_button, "login button");
			}
			public void enterOtp2(String otp) throws Exception {
				Thread.sleep(4000);
				Library.custom_sendkeys(Enter_OTP,otp,"OTP send");
			}
			public void clickAndVerifyPrivacyPolicyPage() {
				Library.Custom_click(delete_account_dropdown, "Delete account");
				Library.Custom_click(DA_checkbox_1, "Bad experiance on ride");
				Library.visible_link(DA_checkbox_1, "Bad experiance on a ride");
				Library.visible_link(DA_checkbox_2, "it's too experiance");
				Library.visible_link(DA_checkbox_3, "Negative support experiance");
				Library.visible_link(DA_checkbox_4, "Issues with my internet");
				Library.visible_link(DA_checkbox_5, "No longer support company");
				Library.visible_link(DA_checkbox_6, "Prefer not to say");
				Library.visible_link(DA_checkbox_7, "Others");
				Library.visible_link(privacy_policy_Changed_mind_go_back, "Changed mind go back");
				Library.visible_link(privacy_policy_Deactivate_account, "Deactivate account");
				Library.visible_link(privacy_policy_confirm_deletion,"Confirm deletion");
			}
			
			
			
			
			
			
			
			
			
}
