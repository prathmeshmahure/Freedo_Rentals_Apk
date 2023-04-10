package com.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class launch_login {
	
	
	public WebDriver driver;
	
//=======================app launch page ============ 1 page ===================
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
	
	@FindBy(how=How.XPATH,using="//android.widget.ImageView[@content-desc='imgradioBtn_AccountMale']")					////Gender Male
	private WebElement Click_Gender_Male;
	
	@FindBy(how=How.XPATH,using="//android.widget.ImageView[@content-desc='imgradioBtn_AccountFemale']")					////Gender_Female
	private WebElement Click_Gender_Female;
	
	@FindBy(how=How.XPATH,using="//android.widget.ImageView[@content-desc='imgradioBtn_AccountOther']")					////Gender Other
	private WebElement Click_Gender_Other;
	
	@FindBy(how=How.XPATH,using="//android.widget.ImageView[@content-desc='imgcbx_Accept']")								//I accept checkbox
	private WebElement Click_I_accept_checkbox;
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='Terms & Conditions']")		////Terms & Conditions
	private WebElement Click_Terms_and_Conditions;	
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='Privacy Policy']")			////Privacy Policy
	private WebElement Click_Privacy_Policy;	//same xpath in two element unable to find xpath index 21
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@content-desc=\"txt_Create\"]")		//Create My Account
	private WebElement Click_Create_My_Account;
	
	@FindBy(id="android:id/button1") 															////User already registered! Please go to login
	private WebElement Click_User_already_registered_ok;
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='Login']")						////You have an account? Login
	private WebElement Click_Login_button_C_A;

	
	
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
	
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='Verify Code']/.")				//Verify button
	private WebElement Click_OTP_Verify_button;
									
	@FindBy(how=How.XPATH,using="//android.widget.TextView[@text='Create an Account']")	////Create Account
	private WebElement CreateAccount;
	
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

	
	@FindBy(xpath="//android.widget.TextView[@text='Popular Cities']")		 //Select Location  Noida
	private WebElement Popular_cities_txt;
	
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
	
	@FindBy(xpath="//android.widget.TextView[@text='Gurugram']")				 	 //Select Location Gurugram
	private WebElement Select_City_Gurugram;
	
//=======================================================================================================
		public launch_login(WebDriver driver) 
		{
			this.driver=driver;
		}

					public WebDriver getDriver() {
						return driver;
					}

//=======================app launch page ============ 1 page getter method=====================================
					
					public WebElement getClick_Skip_button1() {
						return Click_Skip_button1;
					}
					
					public WebElement getClick_Next_button1() {
						return Click_Next_button1;
					}

					public WebElement getClick_Next_button2() {
						return Click_Next_button2;
					}

					public WebElement getClick_Done_button() {
						return Click_Done_button;
					}
					
////==================== Create Account ============= 2 page getter method===============================
					public WebElement getClick_First_name() {					// First_name
						return Click_First_name;
					}
					
					public WebElement getClick_Last_name() {					//Last_name
						return Click_Last_name;
					}

					public WebElement getClick_Enter_Mobile_Number_C_A() {		//Enter_Mobile_Number_C_A
						return Click_Enter_Mobile_Number_C_A;
					}

					public WebElement getClick_Enter_Email() {					//Enter_Email //
						return Click_Enter_Email;
					}

					public WebElement getClick_Email_remove_keyboard() {		//Click_Email_remove_keyboard
						return Click_Email_remove_keyboard;
					}

					public WebElement getClick_Gender_Male() {					//Gender_Male
						return Click_Gender_Male;
					}

					public WebElement getClick_Gender_Female() {				//Gender_Female
						return Click_Gender_Female;
					}

					public WebElement getClick_Gender_Other() {					//Gender_Other
						return Click_Gender_Other;
					}

					public WebElement getClick_I_accept_checkbox() {			//I_accept_checkbox
						return Click_I_accept_checkbox;
					}

					public WebElement getClick_Terms_and_Conditions() {			//Terms_and_Conditions
						return Click_Terms_and_Conditions;						
					}

					public WebElement getClick_Privacy_Policy() {				//Privacy_Policy
						return Click_Privacy_Policy;							
					}

					public WebElement getClick_Create_My_Account() {			//Click_Create_My_Account
						return Click_Create_My_Account;
					}

					public WebElement getClick_User_already_registered_ok() {			//Click_User_already_registered_ok
						return Click_User_already_registered_ok;
					}

					public WebElement getClick_Login_button_C_A() {				//You have an account? Login
						return Click_Login_button_C_A;
					}
					
					
//=======================verify login page =============== 3 page getter method==================================

					
					public WebElement getLogin_heading() {
						return Login_heading;
					}
					public WebElement getClick_Skip_button2() {
						return Click_Skip_button2;
					}
					
					public WebElement getEnter_MO_Number() {
						return Enter_MO_Number;
					}

					public WebElement getClick_Login_button() {
						return Click_Login_button;
					}

					public WebElement getEnter_OTP() {
						return Enter_OTP;
					}


					public WebElement getClick_OTP_Verify_button() {
						return Click_OTP_Verify_button;
					}

					public WebElement getCreateAccount() {
						return CreateAccount;
					}
					
//======================= select location 4 page ============ 4 page getter method ===============================
					public WebElement getWhile_using_this_app() {
						return While_using_this_app;
					}
					public WebElement getOnly_this_time() {
						return Only_this_time;
					}
					public WebElement getDont_allow() {
						return Dont_allow;
					}
					public WebElement getDont_allow_1() {
						return Dont_allow_1;
					}
					
//=========================	select location 5 page	========= 5 page getter method	=============================	
					
					public WebElement getPrecise() {
						return Precise;
					}
					
					public WebElement getApproximate() {
						return Approximate;
					}
					
					public WebElement getDetect_my_location() {
						return Detect_my_location;
					}
					
					public WebElement getSelect_Manually_location() {
						return Select_Manually_location;
					}
					
//========================== Select City ==================== 6 page getter method =================================					
					
					public WebElement getSelect_City_Delhi() {
						return Select_City_Delhi;
					}
					public WebElement getSelect_City_Noida() {
						return Select_City_Noida;
					}
					public WebElement getSelect_City_Greater_Bengaluru() {
						return Select_City_Greater_Bengaluru;
					}
					public WebElement getSelect_City_Automation_City() {
						return Select_City_Automation_City;
					}
					public WebElement getSelect_City_Faridabad() {
						return Select_City_Faridabad;
					}
					public WebElement getSelect_City_Gurugram() {
						return Select_City_Gurugram;
					}
//======================================================================================================================					

					public WebElement getOtp_verification_txt() {
						return Otp_verification_txt;
					}

					public WebElement getPopular_cities_txt() {
						return Popular_cities_txt;
					}
					
					
					
					
					
					
					
					
					
}
