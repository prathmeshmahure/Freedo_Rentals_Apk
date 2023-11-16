package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class WebAdmin {
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='userName']")				 	 //Click_login_username
	private WebElement Click_login_username;
	
	@FindBy(xpath="//input[@id='password']")				 	 //Click_login_password
	private WebElement Click_login_password;
	
	@FindBy(xpath="//button[@title='SUBMIT']")				 	 //Click_login_submit_button
	private WebElement Click_login_submit_button;
	
	@FindBy(xpath="//p[text()='Dashboard']")				 	 //Click_dashboard
	private WebElement Click_dashboard;
	
	@FindBy(xpath="//button[@title='Reset']")				 	 //Click_dashboard_reset_button
	private WebElement Click_dashboard_reset_button;
	
	@FindBy(xpath="//text[contains(text(),'Prathmesh')]/parent::div/parent::td//following-sibling::td//div[@id='reject-action']")				 	 //
	private WebElement Click_dashboard_table_reject_action;
	
	@FindBy(xpath="//div[@id='demo-simple-select-label']")		 //Click_dropdown_reason
	private WebElement Click_dropdown_reason;
	
	@FindBy(xpath="//li[@data-value='Booked by mistake']")		//Click_book_my_mistake
	private WebElement Click_book_my_mistake;
	
	@FindBy(xpath="//button[text()='Submit']")				 	 //Click_submit_button
	private WebElement Click_submit_button;
	
	@FindBy(xpath="//button[text()='Yes']")				 	 	//Click_yes_button
	private WebElement Click_yes_button;
	
	@FindBy(xpath="//text[contains(text(),'Prathmesh')]/parent::div/parent::td//following-sibling::td//div[@id='approve-action']")				 	 //
	private WebElement Click_dashboard_table_approve_request;
	
	@FindBy(xpath="//text[contains(text(),'Prathmesh')]/parent::div/parent::td//following-sibling::td//div[@id='view-action']")				 	 //
	private WebElement Click_dashboard_table_view_request;
	
	@FindBy(xpath="//p[text()='Booking Management']")				 	 //
	private WebElement Click_booking_management;
	
	@FindBy(xpath="//input[@placeholder='Search User' or @value='prathmesh']")				 	 //
	private WebElement Click_search_user;
	
	@FindBy(xpath="//h5[text()='Upcoming']")				 	 //
	private WebElement Click_upcoming_button;
	
	@FindBy(xpath="//text[contains(text(),'Prathmesh')]/parent::td//following-sibling::td//div[@id='view-action']")				 	 //
	private WebElement Click_BM_table_view_action;
	
	@FindBy(xpath="//*[text()='Control Buttons']")				 	 //
	private WebElement Click_control_button;
	
	@FindBy(xpath="//button[text()='Start Ride']")				 	 //
	private WebElement Click_Start_ride;
	
	@FindBy(xpath="//input[@value='0']")				 	 //
	private WebElement Click_start_km_reading;
	
	@FindBy(xpath="//h5[text()='Ongoing']")				 	 //
	private WebElement Click_ongoing_button;
	
	@FindBy(xpath="//button[text()='End Ride' or text()='Premature End Ride']")				 	 //
	private WebElement Click_end_ride;
	
	@FindBy(xpath="//button[text()='Save and End Ride']")				 	 //
	private WebElement Click_save_and_end_ride;
	
	@FindBy(xpath="//button[text()='Add Extra Charges']")				 	 //
	private WebElement Click_add_extra_charges;
	
	@FindBy(xpath="//button[text()='Complete Ride']")				 	 //
	private WebElement Click_complete_ride;
	
//=======================================================================================================
			public WebAdmin(AndroidDriver driver1) 
			{
				driver=driver1;
				PageFactory.initElements(driver1, this);
			}

						public WebDriver getDriver() {
							return (WebDriver) driver;
					}

//=======================app launch page ============ 1 page getter method=====================================
						public WebElement getClick_login_username() {
							return Click_login_username;
						}
						
						public WebElement getClick_login_password() {
							return Click_login_password;
						}
						
						public WebElement getClick_login_submit_button() {
							return Click_login_submit_button;
						}
						
						public WebElement getClick_dashboard() {
							return Click_dashboard;
						}
						
						public WebElement getClick_dashboard_reset_button() {
							return Click_dashboard_reset_button;
						}
						
						public WebElement getClick_dashboard_table_reject_approval_action() {
							return Click_dashboard_table_reject_action;
						}
						
						public WebElement getClick_dropdown_reason() {
							return Click_dropdown_reason;
						}
						
						public WebElement getClick_book_my_mistake() {
							return Click_book_my_mistake;
						}
						
						public WebElement getClick_submit_button() {
							return Click_submit_button;
						}
						
						public WebElement getClick_yes_button() {
							return Click_yes_button;
						}
						
						public WebElement getClick_dashboard_table_approve_request() {
							return Click_dashboard_table_approve_request;
						}
						
						public WebElement getClick_dashboard_table_view_request() {
							return Click_dashboard_table_view_request;
						}
						
						public WebElement getClick_booking_management() {
							return Click_booking_management;
						}
						
						public WebElement getClick_search_user() {
							return Click_search_user;
						}
						
						public WebElement getClick_upcoming_button() {
							return Click_upcoming_button;
						}
						
						public WebElement getClick_BM_table_view_action() {
							return Click_BM_table_view_action;
						}
						
						public WebElement getClick_control_button() {
							return Click_control_button;
						}
						
						public WebElement getClick_Start_ride() {
							return Click_Start_ride;
						}
						
						public WebElement getClick_start_km_reading() {
							return Click_start_km_reading;
						}
						
						public WebElement getClick_ongoing_button() {
							return Click_ongoing_button;
						}
						
						public WebElement getClick_end_ride() {
							return Click_end_ride;
						}
						
						public WebElement getClick_save_and_end_ride() {
							return Click_save_and_end_ride;
						}
						
						public WebElement getClick_add_extra_charges() {
							return Click_add_extra_charges;
						}
						
						public WebElement getClick_complete_ride() {
							return Click_complete_ride;
						}
						
						
}
