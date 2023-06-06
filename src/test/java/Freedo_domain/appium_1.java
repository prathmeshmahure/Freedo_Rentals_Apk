package Freedo_domain;

import org.openqa.selenium.By;
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
public class appium_1 extends base_class{
	public booking_page book;
	public launch_login login;
	public static ExtentTest test;
	
//========================================== Booking page =========================================================
	@Test
	public void TC_0024_Verify_home_page_all_elements() throws Exception {
		book = PageFactory.initElements(driver1, booking_page.class);
		log.info("***************TC_0024_Verify_home_page_all_elements starts*****************");		
			
		library.visible_link(book.getTxt_city_front_page(), "Selected city name is visible");
		library.visible_link(book.getUsername(), book.getUsername().getText());
		library.visible_link(book.getHome_city_name(),book.getHome_city_name().getText() );
		library.visible_link(book.getLocation_icon(), "Location icon");
		library.visible_link(book.getClick_1st_page_enter_button(), "Enter button(Arrow)");
		library.visible_link(book.getDifferent_city_name(), "Different city ?");
		appium_1.Scroll_UP_page_Action("up");
		library.visible_link(book.getHome_bike_tab(), "Bike button");
		library.visible_link(book.getHome_scooter_tab(), "Scooter button");
		appium_1.Scroll_down_page_Action("Down");
		library.visible_link(book.getClick_home_page_bike_rental_button(),  "Bike Rental");
		library.visible_link(book.getClick_home_page_Bookings_button(), "Bookings");
		library.visible_link(book.getClick_home_page_button(), "Home button");
		library.visible_link(book.getClick_home_page_Rent_button(), "Rent");
		library.visible_link(book.getClick_home_page_More_button(), "More");
		
		}	
//===================================================================================================================	
	@Test(dependsOnMethods={"TC_0024_Verify_home_page_all_elements"})
	public void TC_0025_Verify_available_all_bikes() throws Exception {
		book = PageFactory.initElements(driver1, booking_page.class);
		log.info("***************TC_0025_Verify_available_all_bikes starts*****************");
		
		library.Custom_click(book.getClick_1st_page_enter_button(), "Enter button(Arrow)");
		library.date_select();
		library.Custom_click(book.getClick_Package_dropdown(), "package dropdown");
		library.Custom_click(book.getClick_1_Days_package(),"Selected package");
		library.Custom_click(book.getClick_go_freedo_Button(), "Go Freedo button");
		Thread.sleep(2000);
		library.isDisplayed(book.getOur_renting_fleet_page_txt(), "Our Renting fleet Page tittle is ");	
		library.Custom_click(book.getClick_Bike_Tab(), "Bike tab");
		library.isSelected(book.getClick_Bike_Tab(), "Bike tab by default is ");
		library.visible_link(book.getAvailable_bikes(), book.getAvailable_bikes().getText());
	}
//=================================================================================================================
	@Test(dependsOnMethods={"TC_0025_Verify_available_all_bikes"})
	public void TC_0026_Verify_available_all_Scooters() throws Exception {
		log.info("***************TC_0026_Verify_available_all_Scooters starts*****************");
		
		library.Custom_click(book.getClick_Scooter_Tab(), "Scooter tab");
		Thread.sleep(1000);
		library.visible_link(book.getAvailable_bikes(), book.getAvailable_bikes().getText());
	}
//================================================================================================================	
	@Test(dependsOnMethods={"TC_0026_Verify_available_all_Scooters"})
	public void TC_0027_Verify_homepage_bike_rentals_tab_available_bike() throws Exception {
		log.info("***************TC_0027_Verify_homepage_bike_rentals_tab_available_bike starts*****************");
		
		library.Custom_click(book.getClick_home_page_button(), "Home button ");
		Thread.sleep(2000);
		library.Custom_click(book.getClick_home_page_bike_rental_button(), "Bike Rental button ");
		library.Custom_click(book.getClick_Bike_Tab(), "Bike tab");
		Thread.sleep(1000);
		library.visible_link(book.getAvailable_bikes(), book.getAvailable_bikes().getText());
		library.Custom_click(book.getClick_Scooter_Tab(), "Scooter tab");
		Thread.sleep(1000);
		library.visible_link(book.getAvailable_bikes(), book.getAvailable_bikes().getText());
	}
//================================================================================================================	
	@Test(dependsOnMethods={"TC_0027_Verify_homepage_bike_rentals_tab_available_bike"})
	public void TC_0028_Verify_Rent_tab_all_elements() throws Exception {
		log.info("***************TC_0028_Verify_Rent_tab_all_elements starts*****************");
		
		library.Custom_click(book.getClick_home_page_button(), "Home button ");
		Thread.sleep(1000);
		library.Custom_click(book.getClick_home_page_Rent_button(), "Rent tab ");
		library.visible_link(book.getRent_page_heading(), "Rental Process page heading");
		library.visible_link(book.getRent_select_date_and_pickup_location(), "Select date & pickup location");
		library.visible_link(book.getRent_bikes_and_scooters(), "Select from the list of Bikes/Scooters");
		library.visible_link(book.getRent_submit_kyc_and_document(), "Submit kyc and documents");
		library.visible_link(book.getRent_pay_and_book_bike(), "Pay & book the bike");
		library.visible_link(book.getRent_enjoy_ride(), "Enjoy the ride");
	}
//===============================================================================================================	
	@Test(dependsOnMethods={"TC_0028_Verify_Rent_tab_all_elements"})
	public void TC_0029_Verify_freedo_rental_icon() throws Exception {
		log.info("***************TC_0029_Verify_freedo_rental_icon starts*****************");
		
		library.visible_link(book.getClick_home_page_button(), "Home button ");
		try {
			driver1.findElement(By.xpath("//android.view.ViewGroup[@content-desc='home_tab']")).click();
		}catch(Exception e) {
			
		}
		Thread.sleep(1000);
		library.visible_link(book.getDifferent_city_name(), "Home page");
	}
//==================================================================================================================
	@Test(dependsOnMethods={"TC_0029_Verify_freedo_rental_icon"})
	public void TC_0030_Verify_more_button_all_elements() throws Exception {
		log.info("***************TC_0030_Verify_more_button_all_elements starts*****************");
		
		library.Custom_click(book.getClick_home_page_More_button(), "More button ");
		Thread.sleep(1000);
		library.visible_link(book.getclick_dark_theme(), "Dark theme mode");
		library.visible_link(book.getMore_button_notification(), "Notification");
		library.visible_link(book.getMore_button_Edit_Profile(), "Edit profile");
		library.visible_link(book.getMore_button_split_payment(), "Split payment");
		library.visible_link(book.getMore_button_rate_us(), "Rate us");
		library.visible_link(book.getMore_button_KYC(), "KYC");
		library.visible_link(book.getMore_button_terms_and_condition(), "Terms & condition");
		library.visible_link(book.getMore_button_privacy_policy(), "Privacy policy");
		library.visible_link(book.getMore_button_address_book(), "Address book");
		appium_1.Scroll_UP_page_Action("up");
		library.visible_link(book.getMore_button_about_us(), "About us");
		library.visible_link(book.getMore_button_contact_us(), "Contact us");
		library.visible_link(book.getMore_button_invite_your_friend(), "Invite your friend");
		library.visible_link(book.getMore_button_faq(), "FAQ");
		library.visible_link(book.getClick_more_option_logout_txt(), "Logout");
		library.visible_link(book.getMore_button_app_version(), "App version ");
		library.visible_link(book.getMore_button_app_version(), "App "+book.getMore_button_app_version().getText());
	}
//====================================================================================================================
	@Test(dependsOnMethods={"TC_0030_Verify_more_button_all_elements"})
	public void TC_0031_Verify_Booking_elements() throws Exception {
		log.info("***************TC_0031_Verify_Booking_elements starts*****************");
		
		library.Custom_click(book.getClick_home_page_button(), "Home button ");
		Thread.sleep(1000);
		library.Custom_click(book.getClick_home_page_Bookings_button(), "home page booking button");
		Thread.sleep(2000);
	//	library.visible_link(book.getClick_Home_booking_tab_bike_image(), "bike images");
		library.visible_link(book.getClick_Home_booking_tab_bike_text(),"bike name ");
		library.visible_link(book.getClick_Home_booking_tab_pickup_location_txt(), "pick up Location");
		library.visible_link(book.getClick_Home_booking_tab_pickup_date_txt(),"pick up date ");
		library.visible_link(book.getClick_Home_booking_tab_package_duration(),"Duration ");
		library.visible_link(book.getClick_Home_booking_tab_dropoff_date(),"Drop of date ");
		library.visible_link(book.getClick_Home_booking_tab_total_amount_paid(), "Total amount ");
		
		
		library.visible_link(book.getClick_Home_booking_tab_bike_text(),"bike name ="+ book.getClick_Home_booking_tab_bike_text().getText());
		library.visible_link(book.getClick_Home_booking_tab_pickup_location_txt(), "pick up Location ="+ book.getClick_Home_booking_tab_pickup_location_txt().getText());
		library.visible_link(book.getClick_Home_booking_tab_pickup_date_txt(),"pick up date ="+ book.getClick_Home_booking_tab_pickup_date_txt().getText());
		library.visible_link(book.getClick_Home_booking_tab_package_duration(),"Duration ="+ book.getClick_Home_booking_tab_package_duration().getText());
		library.visible_link(book.getClick_Home_booking_tab_dropoff_date(),"Drop of date ="+ book.getClick_Home_booking_tab_dropoff_date().getText());
		library.visible_link(book.getClick_Home_booking_tab_total_amount_paid(), "Total amount ="+ book.getClick_Home_booking_tab_total_amount_paid().getText());
	//	library.visible_link(book.getClick_Home_booking_tab_booking_status(),"booking status ="+ book.getClick_Home_booking_tab_booking_status().getText());
		library.visible_link(book.getClick_booking_page_view_button(), "view booking");
	}
//======================================================================================================================	
	@Test(dependsOnMethods={"TC_0031_Verify_Booking_elements"})
	public void TC_0032_Verify_Booking_elements() throws Exception {
		login=PageFactory.initElements(driver1, launch_login.class);
		log.info("***************TC_0032_Verify_Booking_elements starts*****************");
		
		library.Custom_click(book.getClick_home_page_button(), "Home button ");
		Thread.sleep(1000);
		library.Custom_click(book.getDifferent_city_name(), "Different city");
		library.visible_link(login.getDetect_my_location(), "Detect my location");
		library.visible_link(login.getSelect_Manually_location(), "Select manually location");
		library.Custom_click(login.getSelect_Manually_location(), "Select manually location");
		library.Custom_click(login.getSelect_City_Automation_City(), "Automation city");	
	}
//======================================================================================================================
	@Test(dependsOnMethods={"TC_0032_Verify_Booking_elements"})
	public void TC_0033_Verify_Bike_button_on_homepage() throws Exception {
		log.info("***************TC_0033_Verify_Bike_button_on_homepage starts*****************");
		
		appium_1.Scroll_UP_page_Action("up");
		library.isSelected(book.getHome_bike_tab(), "Bike button by default is ");
		appium_1.swipe_page_direction(1237, 1637, 153, 1577, "Available bike");
		appium_1.swipe_page_direction(1237, 1637, 153, 1577, "Available bike");
		library.passmsg("bike is ", "Available");
		appium_1.Scroll_UP_page_Action("up");
	}
//======================================================================================================================	
	@Test(dependsOnMethods={"TC_0033_Verify_Bike_button_on_homepage"})
	public void TC_0034_Verify_scooter_button_on_homepage() throws Exception {
		log.info("***************TC_0034_Verify_scooter_button_on_homepage starts*****************");
		
		library.Custom_click(book.getHome_scooter_tab(), "Scooter button");
		library.isSelected(book.getHome_scooter_tab(), "Scooter button is ");
		appium_1.swipe_page_direction(1237, 1637, 153, 1577, "Available bike");
		appium_1.swipe_page_direction(1237, 1637, 153, 1577, "Available bike");
		library.passmsg("Scooter is ", "Available");
	}
//=====================================================================================================================	
	@Test(dependsOnMethods={"TC_0034_Verify_scooter_button_on_homepage"})
	public void TC_0035_Verify_user_able_to_select_date_and_package_under_booking() throws Exception {
		log.info("***************TC_0035_Verify_user_able_to_select_date_and_package_under_booking starts*****************");
		
		library.Custom_click(book.getHome_bike_tab(), "Bike button");
		Thread.sleep(1000);
		library.Custom_click(book.getBook_now_button(), "Booknow button");
		library.date_select();
		library.Custom_click(book.getClick_Package_dropdown(), "package dropdown");
		library.Custom_click(book.getClick_1_Days_package(),"Selected package");
		library.Custom_click(book.getClick_go_freedo_Button(), "Go Freedo button");
		Thread.sleep(2000);
		library.Custom_click(book.getclick_location_pop_up_ok_button(), "ok button");
		library.visible_link(book.getBooking_details_page_price(), "Price is ="+book.getBooking_details_page_price().getText());
	}
//======================================================================================================================
	@Test(dependsOnMethods={"TC_0035_Verify_user_able_to_select_date_and_package_under_booking"})
	public void TC_0036_Verify_user_able_to_select_date_and_package_under_booking_all_elements() throws Exception {
		log.info("***************TC_0036_Verify_user_able_to_select_date_and_package_under_booking_all_elements starts*****************");
		
		library.visible_link(book.getClick_Pick_up_vehicle_radio_button(), "Pick-up vehicle radio button");
		library.isSelected(book.getClick_Pick_up_vehicle_radio_button(), "Pick-up vehicle radio button");
		library.visible_link(book.getClick_home_delivery_radio_button(), "Home delivery radio button");
		appium_1.Scroll_UP_page_Action("up");
		library.visible_link(book.getBooking_details_page_price(), "Price is ="+book.getBooking_details_page_price().getText());
		library.visible_link(book.getBooking_details_page_KM_limit(), "Price is ="+book.getBooking_details_page_KM_limit().getText());
		library.visible_link(book.getBooking_details_page_excess_km_charges(), "Price is ="+book.getBooking_details_page_excess_km_charges().getText());
		library.visible_link(book.getBooking_details_page_excess_hourly_charges(), "Price is ="+book.getBooking_details_page_excess_hourly_charges().getText());
		library.visible_link(book.getBooking_details_page_map(), "Map");
		library.visible_link(book.getBooking_details_page_morning(), "Time slot Morning");
		library.visible_link(book.getBooking_details_page_afternoon(), "Time slot Afternoon");
		library.visible_link(book.getBooking_details_page_evening(), "Time slot Evening");
		library.visible_link(book.getBooking_details_page_list_button(), "List button");
		library.visible_link(book.getClick_Continue_Tab(), "Continue button");
		
	}
//===========================================================================================================================
	@Test(dependsOnMethods={"TC_0036_Verify_user_able_to_select_date_and_package_under_booking_all_elements"})
	public void TC_0037_Verify_user_able_to_select_date_and_package_under_booking_all_elements_using_home_delivery() throws Exception {
		log.info("***************TC_0037_Verify_user_able_to_select_date_and_package_under_booking_all_elements_using_home_delivery starts*****************");
		
		
		library.Custom_click(book.getClick_home_delivery_radio_button(), "Home delivery radio button");
		appium_1.Scroll_UP_page_Action("up");
		library.Custom_click(book.getClick_home_delivery_add_address(), "Add Address");
		try {
		library.Custom_click(book.getCod_1st_available_ok_button(), "Location on device ok");
		}catch(Exception e) {		}
		library.custom_sendkeys(book.getClick_home_delivery_search_address(), config.getgpsaddress(), "Searching address");
		appium_1.EnterButton();
		Thread.sleep(1000);
		library.Custom_click(book.getClick_home_delivery_search_address_1(), "Random 1 option is selected address");
		library.Custom_click(book.getClick_home_delivery_confirm_location(), "Confirm location");
		library.custom_sendkeys(book.getClick_home_delivery_enter_name(), config.getFirst_name(), "Prathmesh");
		library.custom_sendkeys(book.getClick_home_delivery_enter_complete_address(), config.getPort(), "Dummy address");
		library.custom_sendkeys(book.getClick_home_delivery_landmark_optional(), config.getPort(), "Dummy address");
		appium_1.EnterButton();
		library.Custom_click(book.getClick_home_delivery_save_address_details(), "Save address details");
		library.Custom_click(book.getClick_home_delivery_delete_address(), "delete address");
		library.Custom_click(book.getClick_home_delivery_yes_address(), "delete confirm Yes ");
		Thread.sleep(2000);
		library.Custom_click(book.getClick_home_delivery_add_new_address_(), "Add new address");
		Thread.sleep(1000);
		appium_1.Back_button();
		appium_1.Back_button();
		Thread.sleep(3000);
		library.Custom_click(book.getClick_home_page_button(), "Home button");
		Thread.sleep(1000);
		appium_1.Scroll_down_page_Action("Down");
	}
//=========================================================================================================================	
	@Test(dependsOnMethods={"TC_0037_Verify_user_able_to_select_date_and_package_under_booking_all_elements_using_home_delivery"})
	public void TC_0038_Verify_user_able_to_select_time_slot_afternoon() throws Exception {
		log.info("***************TC_0038_Verify_user_able_to_select_time_slot_afternoon starts*****************");
		
		
		library.Custom_click(book.getClick_home_page_button(), "Home button ");
		Thread.sleep(1000);
		library.Custom_click(book.getDifferent_city_name(), "Different city");
		library.visible_link(login.getDetect_my_location(), "Detect my location");
		library.Custom_click(login.getSelect_Manually_location(), "Select manually location");
		library.Custom_click(login.getSelect_City_jaipur(), "Jaipur");
		library.Custom_click(book.getClick_1st_page_enter_button(), "Enterbutton");
		Thread.sleep(500);
		library.date_select();
		library.Custom_click(book.getClick_Package_dropdown(), "package dropdown");
		library.Custom_click(book.getClick_1_Days_package(),"Selected package");
		library.Custom_click(book.getClick_go_freedo_Button(), "Go Freedo button");
		Thread.sleep(2000);
		library.Custom_click(book.getBook_now_button(), "Booknow button");
		Thread.sleep(1000);
		library.Custom_click(book.getclick_location_pop_up_ok_button(), "ok button");
		appium_1.Scroll_UP_page_Action("up");
		library.Custom_click(book.getBooking_details_page_afternoon(), "Afternoon");
		Thread.sleep(1000);
		library.isSelected(book.getBooking_details_page_afternoon(), "Afternoon is");
	}
//==============================================================================================================================	
	@Test(dependsOnMethods={"TC_0038_Verify_user_able_to_select_time_slot_afternoon"})
	public void TC_0039_Verify_user_able_to_select_time_slot_Evening() throws Exception {
		log.info("***************TC_0039_Verify_user_able_to_select_time_slot_Evening starts*****************");
		
		
		library.Custom_click(book.getBooking_details_page_evening(), "Evening");
		Thread.sleep(1000);
		library.isSelected(book.getBooking_details_page_evening(), "Evening is");
	}
//========================================================================================================================
	@Test(dependsOnMethods={"TC_0039_Verify_user_able_to_select_time_slot_Evening"})
	public void TC_0040_Verify_user_able_to_select_time_slot_Morning() throws Exception {
		log.info("***************TC_0040_Verify_user_able_to_select_time_slot_Morning starts*****************");
		
		library.Custom_click(book.getBooking_details_page_morning(), "Morning");
		Thread.sleep(1000);
		library.isSelected(book.getBooking_details_page_morning(), "Morning is");
	}
//=================================================================================================================================
	@Test(dependsOnMethods={"TC_0040_Verify_user_able_to_select_time_slot_Morning"})
	public void TC_0041_Verify_user_able_to_list_button() throws Exception {
		log.info("***************TC_0041_Verify_user_able_to_list_button starts*****************");
		
		library.Custom_click(book.getBooking_details_page_list_button(), "List");
		Thread.sleep(1000);
		try {
			
		//	driver1.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		}catch(Exception e) {}
		library.visible_link(book.getBooking_details_page_map_button(), "Maps");
		appium_1.Back_button();
	}
//==================================================================================================================================	
//	@Test(dependsOnMethods={"TC_0041_Verify_user_able_to_list_button"})
	@Test(priority=2)
	public void TC_0042_Verify_select_automation_city() throws Exception {
		login=PageFactory.initElements(driver1, launch_login.class);
		log.info("***************TC_0042_Verify_select_automation_city starts*****************");
		
		appium_1.Back_button();
		Thread.sleep(1000);
		library.Custom_click(book.getClick_home_page_button(), "Home button ");
		Thread.sleep(1000);
		library.Custom_click(book.getDifferent_city_name(), "Different city");
		library.visible_link(login.getDetect_my_location(), "Detect my location");
		library.Custom_click(login.getSelect_Manually_location(), "Select manually location");
		library.Custom_click(login.getSelect_City_Automation_City(), "Automation city");
		library.Custom_click(book.getClick_1st_page_enter_button(), "Enterbutton");
		Thread.sleep(500);
		library.date_select();
		library.Custom_click(book.getClick_Package_dropdown(), "package dropdown");
		library.Custom_click(book.getClick_1_Days_package(),"Selected package");
		library.Custom_click(book.getClick_go_freedo_Button(), "Go Freedo button");
		Thread.sleep(2000);
		library.Custom_click(book.getBook_now_button(), "Booknow button");
		Thread.sleep(1000);
		try {if(book.getBook_now_button().isDisplayed()==true) {
			driver1.findElement(By.xpath("//android.widget.TextView[@text='Book Now']")).click();}
		}catch(Exception e) {}
		
		library.Custom_click(book.getclick_location_pop_up_ok_button(), "ok button");
		appium_1.Scroll_UP_page_Action("up");
	}
//==================================================================================================================
	@Test(dependsOnMethods={"TC_0042_Verify_select_automation_city"})
//	@Test
	public void TC_0043_Verify_continue_button_and_summary_page() throws Exception {
		log.info("***************TC_0043_Verify_continue_button_and_summary_page starts*****************");
		book = PageFactory.initElements(driver1, booking_page.class);

		library.Custom_click(book.getClick_Continue_Tab(), "Continue button");
		Thread.sleep(1000);
		library.isDisplayed(book.getsummary_page_text(), "SUMMARY page title is ");
		library.visible_link(book.getSummary_bike_name_txt(),"bike name = "+ book.getSummary_bike_name_txt().getText());
		library.visible_link(book.getSummary_start_date(), "Start date = "+ book.getSummary_start_date().getText());
		library.visible_link(book.getSummary_end_date(), " End date ="+ book.getSummary_end_date().getText());
		library.visible_link(book.getSummary_start_time(), " Start time = "+ book.getSummary_start_time().getText());
		library.visible_link(book.getSummary_end_time(), " End Time = "+ book.getSummary_end_time().getText());
		library.visible_link(book.getSummary_package_duration(),"Duration = "+ book.getSummary_package_duration().getText());
		library.visible_link(book.getSummary_pickup_location(),"Pick up Location = "+ book.getSummary_pickup_location().getText());
		library.visible_link(book.getSummary_km_limit(), "KM LIMIT ="+book.getSummary_km_limit().getText());
		library.visible_link(book.getSummary_excess_km_charges(), "Excess Km Charges = "+book.getSummary_excess_km_charges().getText());
		library.visible_link(book.getSummary_excess_hourly_charges(),"Excess hourly charges = "+ book.getSummary_excess_hourly_charges().getText());
		Thread.sleep(1000);
		appium_1.Scroll_UP_page_Action("page up");
		library.visible_link(book.getSummary_rent_additional_helmet_checkbox(), "Rent additonal helmet checkbox");
		library.visible_link(book.getSummary_coupon_code_offers(), "View Offers");
		library.visible_link(book.getSummary_package_charges(),"Package charges = "+ book.getSummary_package_charges().getText());
		library.visible_link(book.getClick_add_helmet_extra_charges(), "Additonal helmet = "+book.getClick_add_helmet_extra_charges().getText());
		library.visible_link(book.getSummary_delivery_charges(),"Delivery charges = "+ book.getSummary_delivery_charges().getText());
		library.visible_link(book.getSummary_discount(),"Discount = "+ book.getSummary_discount().getText());
		library.visible_link(book.getSummary_total_amount(), "Total Amount = "+ book.getSummary_total_amount().getText());
		library.isSelectedFalse(book.getClick_cash_on_delivery(), "Before select Cod check box is ");
		library.Custom_click(book.getClick_cash_on_delivery(), "cash on delivery");
		library.isSelected(book.getClick_cash_on_delivery(), "After select Cod check box is ");
	//	library.Custom_click(book.getClick_I_accept_checkbox(), "I Accept the Terms & Conditions checkbox");
		library.visible_link(book.getClick_pay_now_button(), "click pay now button");
		library.Custom_click(book.getClick_cash_on_delivery(), "cash on delivery");
	}
//===================================================================================================================	
	@Test(dependsOnMethods={"TC_0043_Verify_continue_button_and_summary_page"})
	public void TC_0044_Verify_summary_page_additional_helmet_charges() throws Exception {
		log.info("***************TC_0044_Verify_summary_page_additional_helmet_charges starts*****************");
		
		library.visible_link(book.getSummary_rent_additional_helmet_checkbox(), "Rent additonal helmet checkbox");
		Thread.sleep(1000);
		library.Custom_click(book.getSummary_rent_additional_helmet_checkbox(), "Rent additonal helmet checkbox");
		library.visible_link(book.getSummary_Half_face_helmet(), "Half face helmet");
		library.visible_link(book.getSummary_Full_face_helmet(), "Full face helmet");
		library.visible_link(book.getSummary_package_charges(),"Package charges = "+ book.getSummary_package_charges().getText());
		library.visible_link(book.getClick_add_helmet_extra_charges(), "Additonal helmet = "+book.getClick_add_helmet_extra_charges().getText());
		library.visible_link(book.getSummary_delivery_charges(),"Delivery charges = "+ book.getSummary_delivery_charges().getText());
		library.visible_link(book.getSummary_discount(),"Discount = "+ book.getSummary_discount().getText());
		library.visible_link(book.getSummary_total_amount(), "Total Amount = "+ book.getSummary_total_amount().getText());
	}
//======================================================================================================================
	@Test(dependsOnMethods={"TC_0044_Verify_summary_page_additional_helmet_charges"})
	public void TC_0045_Verify_summary_page_coupon_code() throws Exception {
		log.info("***************TC_0045_Verify_summary_page_coupon_code starts*****************");
		
		library.visible_link(book.getSummary_coupon_code_offers(), "Veiw offers ");
		library.Custom_click(book.getSummary_coupon_code_offers(), "Veiw offers ");
		Thread.sleep(3000);
		library.visible_link(book.getSummary_coupon_page_title(), "APPLY COUPON CODE");
		library.Custom_click(book.getSummary_coupon_apply(), "Apply coupon");
		Thread.sleep(2000);
		appium_1.Scroll_UP_page_Action("up");
		library.visible_link(book.getSummary_package_charges(),"Package charges = "+ book.getSummary_package_charges().getText());
		library.visible_link(book.getClick_add_helmet_extra_charges(), "Additonal helmet = "+book.getClick_add_helmet_extra_charges().getText());
		library.visible_link(book.getSummary_delivery_charges(),"Delivery charges = "+ book.getSummary_delivery_charges().getText());
		library.visible_link(book.getSummary_discount(),"Discount = "+ book.getSummary_discount().getText());
		library.visible_link(book.getSummary_total_amount(), "Total Amount = "+ book.getSummary_total_amount().getText());
	}
//=========================================================================================================================	
	@Test(dependsOnMethods={"TC_0045_Verify_summary_page_coupon_code"})
	public void TC_0046_Verify_summary_page_cash_on_delivery_method() throws Exception {
		log.info("***************TC_0046_Verify_summary_page_cash_on_delivery_method starts*****************");
		
		appium_1.Scroll_UP_page_Action("up");
		library.isSelectedFalse(book.getClick_cash_on_delivery(), "Before select Cod check box is ");
		library.Custom_click(book.getClick_cash_on_delivery(), "cash on delivery");
		library.isSelected(book.getClick_cash_on_delivery(), "After select Cod check box is ");
		Thread.sleep(500);
		library.Custom_click(book.getClick_cash_on_delivery(), "cash on delivery");
	//	library.Custom_click(book.getClick_I_accept_checkbox(), "I accept Checkbox");
		Thread.sleep(500);

	}
//===========================================================================================================================	
	@Test(dependsOnMethods={"TC_0046_Verify_summary_page_cash_on_delivery_method"})
	public void TC_0047_Verify_summary_page_i_accept_checkbox() throws Exception {
		log.info("***************TC_0047_Verify_summary_page_i_accept_checkbox starts*****************");
		
		Thread.sleep(2000);
	//	library.isSelectedFalse(book.getClick_I_accept_checkbox(), "Before select I accept check box is ");
	//	library.Custom_click(book.getClick_I_accept_checkbox(), "I accept Checkbox");
		Assert.assertFalse(book.getClick_pay_now_button().isSelected(),"Pay now button enabled");
	//	library.isSelected(book.getClick_I_accept_checkbox(), "After select I accept check box is ");
		library.isEnabled(book.getClick_pay_now_button(), "Pay now button");
		Thread.sleep(2000);
		
	}
//============================================================================================================================	
	@Test(dependsOnMethods={"TC_0047_Verify_summary_page_i_accept_checkbox"})
	public void TC_0048_Verify_summary_page_pay_now_button() throws Exception {
		log.info("***************TC_0048_Verify_summary_page_pay_now_button starts*****************");
		
		library.Custom_click(book.getClick_pay_now_button(), "Pay now button");
		Thread.sleep(10000);
		library.visible_link(book.getClick_Pay_using_UPI(), "Pay using UPI");
		library.visible_link(book.getClick_Pay_using_Card(), "Pay using card");
		library.visible_link(book.getClick_Pay_using_Wallet(), "pay using wallet");
		library.visible_link(book.getClick_Pay_using_Netbanking(), "Pay using Netbanking");
//		library.visible_link(book.getClick_Pay_using_cardles_EMI(), "Pay using cardless EMI");
		library.visible_link(book.getClick_pay_now_button(), "Pay now button");
	}
//============================================================================================================================
	@Test(dependsOnMethods={"TC_0048_Verify_summary_page_pay_now_button"})
	public void TC_0049_Verify_user_able_to_make_payment() throws Exception {
		log.info("***************TC_0049_Verify_user_able_to_make_payment starts*****************");
		
		library.Custom_click(book.getClick_Pay_using_Netbanking(), "Pay using Netbanking");
		library.Custom_click(book.getClick_Pay_using_SBI_bank(), "Select SBI bank");
		library.Custom_click(book.getClick_pay_now_button_sbi(), "Pay Now button");
		
		library.Custom_click(book.getClick_payment_successful(), "payment successful");
		library.Custom_click(book.getClick_view_booking(), "booking details");
		Thread.sleep(10000);
		library.visible_link(book.getClick_view_booking(), "booking details");			
		library.Custom_click(book.getClick_view_booking(), "booking details");
		Thread.sleep(7000);
		try {
			if(book.getClick_view_booking().isDisplayed()) {
			driver1.findElement(By.xpath("//android.widget.TextView[@content-desc='txt_ViewBooking']")).click();
			}
		}catch(Exception e){		}	
	}
//=============================================================================================================================
	@Test(dependsOnMethods={"TC_0049_Verify_user_able_to_make_payment"})
	public void TC_0050_Verify_user_able_to_view_booking_status() throws Exception {
		log.info("***************TC_0050_Verify_user_able_to_view_booking_status starts*****************");
		
		library.visible_link(book.getFBD_Booking_status(), "Booking status");
		
	}
//=============================================================================================================================	
	@Test(dependsOnMethods={"TC_0050_Verify_user_able_to_view_booking_status"})
	public void TC_0051_Verify_user_able_to_view_booking_status_all_elements() throws Exception {
		log.info("***************TC_0051_Verify_user_able_to_view_booking_status_all_elements starts*****************");
		
		library.visible_link(book.getClick_show_more_details(), "show more details text");
		library.Custom_click(book.getClick_show_more_details(), "show more details text");
		Thread.sleep(2000);
		library.visible_link(book.getFBD_Booking_status(), "Booking status");
		library.visible_link(book.getFBD_booking_status_txt(), "Booking status = "+book.getFBD_booking_status_txt().getText());
		Thread.sleep(2000);
		library.visible_link(book.getFBD_Booking_id(), "Booking ID = "+book.getFBD_Booking_id().getText());
		library.visible_link(book.getFBD_vehicle_nummber(), "Vehicle number = "+book.getFBD_vehicle_nummber().getText());
		
		library.visible_link(book.getFBD_pick_up_date(), "Pick Up Date = "+book.getFBD_pick_up_date().getText());
		library.visible_link(book.getFBD_drop_off_date(), "Drop off date = "+book.getFBD_drop_off_date().getText());
		library.visible_link(book.getFBD_pick_up_location(), "Pick Up Location = "+book.getFBD_pick_up_location().getText());
		library.visible_link(book.getFBD_duration(), "Duration = "+book.getFBD_duration().getText());
		library.visible_link(book.getFBD_handover_time(), "Handover Time = "+book.getFBD_handover_time().getText());
		library.visible_link(book.getFBD_drop_off_location(), "Drop off Location = "+book.getFBD_drop_off_location().getText());
		library.visible_link(book.getFBD_planned_drop_off_date(), "Planned drop off date = "+book.getFBD_planned_drop_off_date().getText());
		library.visible_link(book.getFBD_Actual_drop_off_date(), "Actual Drop-off date = "+book.getFBD_Actual_drop_off_date().getText());
		library.visible_link(book.getFBD_mode_of_pick_up(), "Mode of pick-up = "+book.getFBD_mode_of_pick_up().getText());
		appium_21.Scroll_UP_page_Action("page up");
		library.Custom_click(book.getClick_show_less_details(), "show less text");
		library.visible_link(book.getClick_price_breakup(), "price break up Drop down");
	}
//============================================================================================================================	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
