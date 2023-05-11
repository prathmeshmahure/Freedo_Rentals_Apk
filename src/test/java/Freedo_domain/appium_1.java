package Freedo_domain;

import org.openqa.selenium.support.PageFactory;
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
		
		library.Custom_click(book.getClick_home_page_button(), "Home button ");
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
		library.visible_link(book.getClick_Home_booking_tab_bike_text(),"bike name ="+ book.getClick_Home_booking_tab_bike_text().getText());
		library.visible_link(book.getClick_Home_booking_tab_pickup_location_txt(), "pick up Location ="+ book.getClick_Home_booking_tab_pickup_location_txt().getText());
		library.visible_link(book.getClick_Home_booking_tab_pickup_date_txt(),"pick up date ="+ book.getClick_Home_booking_tab_pickup_date_txt().getText());
		library.visible_link(book.getClick_Home_booking_tab_package_duration(),"Duration ="+ book.getClick_Home_booking_tab_package_duration().getText());
		library.visible_link(book.getClick_Home_booking_tab_dropoff_date(),"Drop of date ="+ book.getClick_Home_booking_tab_dropoff_date().getText());
		library.visible_link(book.getClick_Home_booking_tab_total_amount_paid(), "Total amount ="+ book.getClick_Home_booking_tab_total_amount_paid().getText());
		library.visible_link(book.getClick_Home_booking_tab_booking_status(),"booking status ="+ book.getClick_Home_booking_tab_booking_status().getText());
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
		library.Custom_click(book.getClick_home_delivery_add_new_address_(), "Add new address");
		appium_1.Back_button();
	}
//=========================================================================================================================	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
