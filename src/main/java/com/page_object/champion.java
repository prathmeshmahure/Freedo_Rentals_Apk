package com.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class champion {
	
	public WebDriver driver;
	
//================================== Login page =================================================
	
		@FindBy(xpath="//android.widget.EditText[@text='User ID']")			//login_user_id
		private WebElement login_user_id;
	
		@FindBy(xpath="//android.widget.EditText[@text='Password*']")		//login_password
		private WebElement login_password;
	
		@FindBy(xpath="(//android.widget.TextView[@text='Login'])[2]")		//login_Button
		private WebElement login_Button;
	
		@FindBy(xpath="//android.widget.Button[@text='Don’t allow']")		//login_dont_allow notification
		private WebElement login_dont_allow_notification;
	
		@FindBy(xpath="//android.widget.Button[@text='CANCEL']")			//login_cancel_notification
		private WebElement login_cancel_notification;

//================================== Dashboard page =================================================
		
		@FindBy(xpath="//android.widget.TextView[@text='New Booking Received']")			//
		private WebElement DS_new_booking_request;
	
		@FindBy(xpath="//android.widget.EditText[@text='Search']")			//
		private WebElement NBR_search_user;
	
		@FindBy(xpath="//android.view.ViewGroup[@content-desc='crossIcon']")			//
		private WebElement NBR_request_reject_icon;
	
		@FindBy(xpath="//android.view.ViewGroup[@content-desc='RightTickIcon']")			//
		private WebElement NBR_request_approve_icon;
	
		@FindBy(xpath="(//android.widget.TextView[@content-desc='mobile_number']//following-sibling::android.view.ViewGroup)[1]")			//
		private WebElement NBR_request_view_icon;
	
		@FindBy(xpath="(//android.widget.TextView[@text='Select Reason'])[2]")			//
		private WebElement NBR_reject_search_dropdown;
	
		@FindBy(xpath="//android.widget.TextView[@text='Booked by mistake']")			//
		private WebElement NBR_reject_search_dropdown_booked_my_mistake;
	
		@FindBy(xpath="//android.widget.TextView[@text='Submit']")			//
		private WebElement NBR_reject_search_dropdown_booked_my_mistake_submit_button;
	
		@FindBy(xpath="//android.widget.Button[@text='YES']")			//
		private WebElement NBR_Yes_button;
	
		@FindBy(xpath="//android.widget.ImageButton[@content-desc='Navigate up']")			//
		private WebElement NBR_back_button;
	
//		@FindBy(xpath="//android.widget.EditText[@text='User ID']")			//
//		private WebElement txt_city_front_page;
//	
//		@FindBy(xpath="//android.widget.EditText[@text='User ID']")			//
//		private WebElement txt_city_front_page;
//	
//		@FindBy(xpath="//android.widget.EditText[@text='User ID']")			//
//		private WebElement txt_city_front_page;
//	
//		@FindBy(xpath="//android.widget.EditText[@text='User ID']")			//
//		private WebElement txt_city_front_page;
//	
//		@FindBy(xpath="//android.widget.EditText[@text='User ID']")			//
//		private WebElement txt_city_front_page;
//	
//		@FindBy(xpath="//android.widget.EditText[@text='User ID']")			//
//		private WebElement txt_city_front_page;
//	
//		@FindBy(xpath="//android.widget.EditText[@text='User ID']")			//
//		private WebElement txt_city_front_page;
//	
//		@FindBy(xpath="//android.widget.EditText[@text='User ID']")			//
//		private WebElement txt_city_front_page;
//	
//		@FindBy(xpath="//android.widget.EditText[@text='User ID']")			//
//		private WebElement txt_city_front_page;
//	
//		@FindBy(xpath="//android.widget.EditText[@text='User ID']")			//
//		private WebElement txt_city_front_page;
//	
//		@FindBy(xpath="//android.widget.EditText[@text='User ID']")			//
//		private WebElement txt_city_front_page;
//	
//		@FindBy(xpath="//android.widget.EditText[@text='User ID']")			//
//		private WebElement txt_city_front_page;
	
	
//=============================================================================================================
				public champion(AndroidDriver driver1) 
				{
					driver=driver1;
					PageFactory.initElements(driver1, this);
				}

							public WebDriver getDriver() {
								return driver;
							}
							
//=============================================== city ============================================================					

				public WebElement getLogin_user_id() {
					return login_user_id;
				}

				public WebElement getLogin_password() {
					return login_password;
				}

				public WebElement getLogin_Button() {
					return login_Button;
				}

				public WebElement getLogin_dont_allow_notification() {
					return login_dont_allow_notification;
				}

				public WebElement getLogin_cancel_notification() {
					return login_cancel_notification;
				}

				public WebElement getDS_new_booking_request() {
					return DS_new_booking_request;
				}

				public WebElement getNBR_search_user() {
					return NBR_search_user;
				}

				public WebElement getNBR_request_reject_icon() {
					return NBR_request_reject_icon;
				}

				public WebElement getNBR_request_approve_icon() {
					return NBR_request_approve_icon;
				}

				public WebElement getNBR_request_view_icon() {
					return NBR_request_view_icon;
				}

				public WebElement getNBR_reject_search_dropdown() {
					return NBR_reject_search_dropdown;
				}

				public WebElement getNBR_reject_search_dropdown_booked_my_mistake() {
					return NBR_reject_search_dropdown_booked_my_mistake;
				}

				public WebElement getNBR_reject_search_dropdown_booked_my_mistake_submit_button() {
					return NBR_reject_search_dropdown_booked_my_mistake_submit_button;
				}

				public WebElement getNBR_Yes_button() {
					return NBR_Yes_button;
				}

				public WebElement getNBR_back_button() {
					return NBR_back_button;
				}
	
	
	
}
