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
	
	
	
}
