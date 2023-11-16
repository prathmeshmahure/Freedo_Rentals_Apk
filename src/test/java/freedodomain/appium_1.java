package freedodomain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.pageobject.BookingPage;
import com.pageobject.LaunchLogin;
import com.utility.BaseClass;
import com.utility.Library;

@Listeners(com.utility.listner.class)
public class appium_1 extends BaseClass{
	public BookingPage book;
	public LaunchLogin login;
	public static ExtentTest test;
	
//========================================== Booking page =========================================================
	@Test(priority=1)
	public void TC_0024_Verify_home_page_all_elements() throws Exception {
		//book = PageFactory.initElements(driver1, booking_page.class);
		book = new BookingPage(driver1);
		log.info("***************TC_0024_Verify_home_page_all_elements starts*****************");		
		try {
		if(book.getTxt_city_front_page().isDisplayed()) {
			Library.visible_link(book.getTxt_city_front_page(), "Selected city name is visible");
			Library.visible_link(book.getUsername(), "Username");
			Library.visible_link(book.getUsername(), book.getUsername().getText());
			Library.visible_link(book.getHome_city_name(),"City name" );
			Library.visible_link(book.getHome_city_name(),book.getHome_city_name().getText() );
			Library.visible_link(book.getLocation_icon(), "Location icon");
			Library.visible_link(book.getClick_1st_page_enter_button(), "Enter button(Arrow)");
			Library.visible_link(book.getDifferent_city_name(), "Different city ?");
			BaseClass.scrollByText("Why Freedo");
			Library.visible_link(book.getHome_bike_tab(), "Bike button");
			Library.visible_link(book.getHome_scooter_tab(), "Scooter button");
			BaseClass.scrollByText("Search in");
			Library.visible_link(book.getClick_home_page_bike_rental_button(),  "Bike Rental");
			Library.visible_link(book.getClick_home_page_Bookings_button(), "Bookings");
			Library.visible_link(book.getClick_home_page_button(), "Home button");
			Library.visible_link(book.getClick_home_page_Rent_button(), "Rent");
			Library.visible_link(book.getClick_home_page_More_button(), "More");
			}}catch(Exception e) {	}
		}	
//===================================================================================================================	
	//@Test(dependsOnMethods={"TC_0024_Verify_home_page_all_elements"})
	@Test(priority=2)
	public void TC_0025_Verify_available_all_bikes() throws Exception {
		
		log.info("***************TC_0025_Verify_available_all_bikes starts*****************");
		try {
		if(book.getClick_1st_page_enter_button().isDisplayed()) {
		Library.Custom_click(book.getClick_1st_page_enter_button(), "Enter button(Arrow)");
		Library.date_select();
		Library.Custom_click(book.getClick_Package_dropdown(), "package dropdown");
		Library.Custom_click(book.getClick_1_Days_package(),"Selected package");
		Library.Custom_click(book.getClick_go_freedo_Button(), "Go Freedo button");
		Thread.sleep(2000);
		Library.isDisplayed(book.getOur_renting_fleet_page_txt(), "Our Renting fleet Page tittle is ");	
		Library.Custom_click(book.getClick_Bike_Tab(), "Bike tab");
		Library.isSelected(book.getClick_Bike_Tab(), "Bike tab by default is ");
		Library.visible_link(book.getAvailable_bikes(), book.getAvailable_bikes().getText());
	}}catch(Exception e) {	}
	}
//=================================================================================================================
	//@Test(dependsOnMethods={"TC_0025_Verify_available_all_bikes"})
	@Test(priority=3)
	public void TC_0026_Verify_available_all_Scooters() throws Exception {
		log.info("***************TC_0026_Verify_available_all_Scooters starts*****************");
		try {
		if(book.getClick_Scooter_Tab().isDisplayed()) {
		Library.Custom_click(book.getClick_Scooter_Tab(), "Scooter tab");
		Thread.sleep(1000);
		Library.visible_link(book.getAvailable_bikes(), "Available bike quantity");
		Library.visible_link(book.getAvailable_bikes(), book.getAvailable_bikes().getText());
	}}catch(Exception e) {	}
	}
//================================================================================================================	
//	@Test(dependsOnMethods={"TC_0026_Verify_available_all_Scooters"})
	@Test(priority=4)
	public void TC_0027_Verify_homepage_bike_rentals_tab_available_bike() throws Exception {
		log.info("***************TC_0027_Verify_homepage_bike_rentals_tab_available_bike starts*****************");
		try {
		Thread.sleep(1000);
		if(book.getClick_home_page_button().isDisplayed()) {
		Thread.sleep(1000);
		Library.Custom_click(book.getClick_home_page_button(), "Home button ");
		Thread.sleep(2000);
		Library.Custom_click(book.getClick_home_page_bike_rental_button(), "Bike Rental button ");
		Library.Custom_click(book.getClick_Bike_Tab(), "Bike tab");
		Thread.sleep(1000);
		Library.visible_link(book.getAvailable_bikes(),"Available bikes");
		Library.visible_link(book.getAvailable_bikes(), book.getAvailable_bikes().getText());
		Library.Custom_click(book.getClick_Scooter_Tab(), "Scooter tab");
		Thread.sleep(1000);
		Library.visible_link(book.getAvailable_bikes(),"Available Scooters");
		Library.visible_link(book.getAvailable_bikes(), book.getAvailable_bikes().getText());
	}}catch(Exception e) {	}}
//================================================================================================================	
	//@Test(dependsOnMethods={"TC_0027_Verify_homepage_bike_rentals_tab_available_bike"})
	@Test(priority=5)
	public void TC_0028_Verify_Rent_tab_all_elements() throws Exception {
		log.info("***************TC_0028_Verify_Rent_tab_all_elements starts*****************");
		try {
		if(book.getClick_home_page_Rent_button().isDisplayed()) {
		Thread.sleep(1000);
		Library.Custom_click(book.getClick_home_page_button(), "Home button ");
		Thread.sleep(1000);
		Library.Custom_click(book.getClick_home_page_Rent_button(), "Rent tab ");
		Library.visible_link(book.getRent_page_heading(), "Rental Process page heading");
		Library.visible_link(book.getRent_select_date_and_pickup_location(), "Select date & pickup location");
		Library.visible_link(book.getRent_bikes_and_scooters(), "Select from the list of Bikes/Scooters");
		Library.visible_link(book.getRent_submit_kyc_and_document(), "Submit kyc and documents");
		Library.visible_link(book.getRent_pay_and_book_bike(), "Pay & book the bike");
		Library.visible_link(book.getRent_enjoy_ride(), "Enjoy the ride");
		}}catch(Exception e) {	}
		}
//===============================================================================================================	
	//@Test(dependsOnMethods={"TC_0028_Verify_Rent_tab_all_elements"})
	@Test(priority=6)
	public void TC_0029_Verify_freedo_rental_icon() throws Exception {
		log.info("***************TC_0029_Verify_freedo_rental_icon starts*****************");
		try {
		Thread.sleep(1000);
		Library.visible_link(book.getClick_home_page_button(), "Home button ");
		try {
			driver1.findElement(By.xpath("//android.view.ViewGroup[@content-desc='home_tab']")).click();
		}catch(Exception e) {
			
		}
		Thread.sleep(1000);
		Library.visible_link(book.getDifferent_city_name(), "Home page icon");
		}catch(Exception e) {	}}
//==================================================================================================================
	//@Test(dependsOnMethods={"TC_0029_Verify_freedo_rental_icon"})
	@Test(priority=7)
	public void TC_0030_Verify_more_button_all_elements() throws Exception {
		log.info("***************TC_0030_Verify_more_button_all_elements starts*****************");
		try {
			if(book.getClick_home_page_More_button().isDisplayed()) {
			Library.Custom_click(book.getClick_home_page_More_button(), "More button ");
			Thread.sleep(1000);
			BaseClass.scrollByText("Prathmesh");
			Library.visible_link(book.getclick_dark_theme(), "Dark theme mode");
			Library.visible_link(book.getMore_button_notification(), "Notification");
			Library.visible_link(book.getMore_button_my_Profile(), "My profile");
			Library.visible_link(book.getMore_button_split_payment(), "Split payment");
			Library.visible_link(book.getMore_button_rate_us(), "Rate us");
			Library.visible_link(book.getMore_button_KYC(), "KYC");
			Library.visible_link(book.getMore_button_terms_and_condition(), "Terms & condition");
			Library.visible_link(book.getMore_button_privacy_policy(), "Privacy policy");
			BaseClass.scrollByText("Logout");
			Library.visible_link(book.getMore_button_address_book(), "Address book");
			
			Library.visible_link(book.getMore_button_about_us(), "About us");
			Library.visible_link(book.getMore_button_contact_us(), "Contact us");
			Library.visible_link(book.getMore_button_invite_your_friend(), "Invite your friend");
			Library.visible_link(book.getMore_button_faq(), "FAQ");
			Library.visible_link(book.getClick_more_option_logout_txt(), "Logout");
			Library.visible_link(book.getMore_button_app_version(), "App version ");
			Library.visible_link(book.getMore_button_app_version(), "App "+book.getMore_button_app_version().getText());
		}}catch(Exception e) {	}}
//====================================================================================================================
	//@Test(dependsOnMethods={"TC_0030_Verify_more_button_all_elements"})
	@Test(priority=8)
	public void TC_0031_Verify_Booking_elements() throws Exception {
		log.info("***************TC_0031_Verify_Booking_elements starts*****************");
		try {
		if(book.getClick_home_page_Bookings_button().isDisplayed()) {
		Library.Custom_click(book.getClick_home_page_button(), "Home button ");
		Thread.sleep(1000);
		Library.Custom_click(book.getClick_home_page_Bookings_button(), "home page booking button");
		Thread.sleep(2000);
	//	library.visible_link(book.getClick_Home_booking_tab_bike_image(), "bike images");
		Library.visible_link(book.getClick_Home_booking_tab_bike_text(),"bike name ");
		Library.visible_link(book.getClick_Home_booking_tab_pickup_location_txt(), "pick up Location");
		Library.visible_link(book.getClick_Home_booking_tab_pickup_date_txt(),"pick up date ");
		Library.visible_link(book.getClick_Home_booking_tab_package_duration(),"Duration ");
		Library.visible_link(book.getClick_Home_booking_tab_dropoff_date(),"Drop of date ");
		Library.visible_link(book.getClick_Home_booking_tab_total_amount_paid(), "Total amount ");
		
		
		Library.visible_link(book.getClick_Home_booking_tab_bike_text(),"bike name ="+ book.getClick_Home_booking_tab_bike_text().getText());
		Library.visible_link(book.getClick_Home_booking_tab_pickup_location_txt(), "pick up Location ="+ book.getClick_Home_booking_tab_pickup_location_txt().getText());
		Library.visible_link(book.getClick_Home_booking_tab_pickup_date_txt(),"pick up date ="+ book.getClick_Home_booking_tab_pickup_date_txt().getText());
		Library.visible_link(book.getClick_Home_booking_tab_package_duration(),"Duration ="+ book.getClick_Home_booking_tab_package_duration().getText());
		Library.visible_link(book.getClick_Home_booking_tab_dropoff_date(),"Drop of date ="+ book.getClick_Home_booking_tab_dropoff_date().getText());
		Library.visible_link(book.getClick_Home_booking_tab_total_amount_paid(), "Total amount ="+ book.getClick_Home_booking_tab_total_amount_paid().getText());
	//	library.visible_link(book.getClick_Home_booking_tab_booking_status(),"booking status ="+ book.getClick_Home_booking_tab_booking_status().getText());
		Library.visible_link(book.getClick_booking_page_view_button(), "view booking");
	}}catch(Exception e) {	}
		}
//======================================================================================================================	
	//@Test(dependsOnMethods={"TC_0031_Verify_Booking_elements"})
	@Test(priority=9)
	public void TC_0032_Verify_change_city() throws Exception {
		//login=PageFactory.initElements(driver1, launch_login.class);
		login = new LaunchLogin(driver1);
		log.info("***************TC_0032_Verify_change_city starts*****************");
		try {
		if(book.getClick_home_page_button().isDisplayed()) {
		Library.Custom_click(book.getClick_home_page_button(), "Home button ");
		Thread.sleep(1000);
		Library.Custom_click(book.getDifferent_city_name(), "Different city");
		Library.visible_link(login.getDetect_my_location(), "Detect my location");
		Library.visible_link(login.getSelect_Manually_location(), "Select manually location");
		Library.Custom_click(login.getSelect_Manually_location(), "Select manually location");
		Library.Custom_click(login.getSelect_City_Noida(), config.getcity_name()+" city");	
	}}catch(Exception e) {	}}
//======================================================================================================================
	//@Test(dependsOnMethods={"TC_0032_Verify_Booking_elements"})
	@Test(priority=10)
	public void TC_0033_Verify_Bike_button_on_homepage() throws Exception {
		log.info("***************TC_0033_Verify_Bike_button_on_homepage starts*****************");
		try {
			BaseClass.scrollByText("Why Freedo");
			Library.isSelected(book.getHome_bike_tab(), "Bike button by default is ");			
			
			Library.horizontal_scroll_image(book.getBike_1st_imageScroll(), book.getBike_2nd_imageScroll(), "Bike Horizontal scroll");
			Library.passmsg("bike is ", "Available");
		    BaseClass.scrollByText("Why Freedo");
		}catch(Exception e) {	}}
//======================================================================================================================	
	//@Test(dependsOnMethods={"TC_0033_Verify_Bike_button_on_homepage"})
	@Test(priority=11)
	public void TC_0034_Verify_scooter_button_on_homepage() throws Exception {
		log.info("***************TC_0034_Verify_scooter_button_on_homepage starts*****************");
		try {
			BaseClass.scrollByText("Why Freedo");
		if(book.getHome_scooter_tab().isDisplayed()) {
		Library.Custom_click(book.getHome_scooter_tab(), "Scooter button");
		Library.isSelected(book.getHome_scooter_tab(), "Scooter button is ");
		Library.horizontal_scroll_image(book.getBike_1st_imageScroll(), book.getBike_2nd_imageScroll(), "Scooter Horizontal scroll");
		Library.passmsg("Scooter is ", "Available");
	}}catch(Exception e) {	}}
//=====================================================================================================================	
	//@Test(dependsOnMethods={"TC_0034_Verify_scooter_button_on_homepage"})
	@Test(priority=12)
	public void TC_0035_Verify_user_able_to_select_date_and_package_under_booking() throws Exception {
		log.info("***************TC_0035_Verify_user_able_to_select_date_and_package_under_booking starts*****************");
		try {
		if(book.getHome_bike_tab().isDisplayed()) {
		Library.Custom_click(book.getHome_bike_tab(), "Bike button");
		Thread.sleep(1000);
		Library.Custom_click(book.getBook_now_button(), "Booknow button");
		Library.date_select();
		Library.Custom_click(book.getClick_Package_dropdown(), "package dropdown");
		Library.Custom_click(book.getClick_1_Days_package(),"Selected package");
		Library.Custom_click(book.getClick_go_freedo_Button(), "Go Freedo button");
		Thread.sleep(2000);
		Library.Custom_click(book.getclick_location_pop_up_ok_button(), "ok button");
		Library.visible_link(book.getBooking_details_page_price(), "Price is ="+book.getBooking_details_page_price().getText());
	}}catch(Exception e) {	}}
//======================================================================================================================
	//@Test(dependsOnMethods={"TC_0035_Verify_user_able_to_select_date_and_package_under_booking"})
	@Test(priority=13)
	public void TC_0036_Verify_user_able_to_select_date_and_package_under_booking_all_elements() throws Exception {
		log.info("***************TC_0036_Verify_user_able_to_select_date_and_package_under_booking_all_elements starts*****************");
		try {
			if(book.getClick_Pick_up_vehicle_radio_button().isDisplayed()) {
			Library.visible_link(book.getClick_Pick_up_vehicle_radio_button(), "Pick-up vehicle radio button");
			Library.isSelected(book.getClick_Pick_up_vehicle_radio_button(), "Pick-up vehicle radio button");
			Library.visible_link(book.getClick_home_delivery_radio_button(), "Home delivery radio button");
			Library.Vertical_scroll_image(book.getBooking_details_page_city(), book.getClick_home_delivery_radio_button(), "Page scroll");
			BaseClass.scrollByText("Select Time Slot");
			Library.visible_link(book.getBooking_details_page_price(), "Bike Price ");				
			Library.visible_link(book.getBooking_details_page_KM_limit(), "Km reading");
			Library.visible_link(book.getBooking_details_page_excess_km_charges(), "Excess km charges Price");
			Library.visible_link(book.getBooking_details_page_excess_hourly_charges(), "Excess hourly charges Price ");
		
			Library.visible_link(book.getBooking_details_page_price(), "Price is ="+book.getBooking_details_page_price().getText());
			Library.visible_link(book.getBooking_details_page_KM_limit(), "Price is ="+book.getBooking_details_page_KM_limit().getText());
			Library.visible_link(book.getBooking_details_page_excess_km_charges(), "Price is ="+book.getBooking_details_page_excess_km_charges().getText());
			Library.visible_link(book.getBooking_details_page_excess_hourly_charges(), "Price is ="+book.getBooking_details_page_excess_hourly_charges().getText());
			Library.visible_link(book.getBooking_details_page_map(), "Map");
			Library.visible_link(book.getBooking_details_page_morning(), "Time slot Morning");
			Library.visible_link(book.getBooking_details_page_afternoon(), "Time slot Afternoon");
			Library.visible_link(book.getBooking_details_page_evening(), "Time slot Evening");
			Library.visible_link(book.getBooking_details_page_list_button(), "List button");
			Library.visible_link(book.getClick_Continue_Tab(), "Continue button");
			Library.Vertical_scroll_image(book.getBooking_details_page_list_button(), book.getBooking_details_page_price(), "Page scroll");
			}}catch(Exception e) {	}
	}
//===========================================================================================================================
	//@Test(dependsOnMethods={"TC_0036_Verify_user_able_to_select_date_and_package_under_booking_all_elements"})
	@Test(priority=14)
	public void TC_0037_Verify_user_able_to_select_date_and_package_under_booking_all_elements_using_home_delivery() throws Exception {
		log.info("***************TC_0037_Verify_user_able_to_select_date_and_package_under_booking_all_elements_using_home_delivery starts*****************");
		try {
			Library.Custom_click(book.getClick_home_delivery_radio_button(), "Home delivery radio button");
			Library.Vertical_scroll_image(book.getBooking_details_page_city(), book.getClick_home_delivery_radio_button(), "Page scroll by elements");	
			Library.Vertical_scroll_image(book.getClick_home_delivery_radio_button(), book.getBooking_details_page_price(), "Page scroll by elements");
			BaseClass.scrollByText("Select Time Slot");
			Library.Custom_click(book.getClick_home_delivery_add_address(), "Add Address");
			try {
			Library.Custom_click(book.getCod_1st_available_ok_button(), "Location on device ok");
			}catch(Exception e) {		}
			Library.custom_sendkeys(book.getClick_home_delivery_search_address(), config.getgpsaddress(), "Searching address");
			appium_1.EnterButton();
			Thread.sleep(1000);
			Library.Custom_click(book.getClick_home_delivery_search_address_1(), "Random 1 option is selected address");
			Library.Custom_click(book.getClick_home_delivery_confirm_location(), "Confirm location");
			Library.custom_sendkeys(book.getClick_home_delivery_enter_name(), config.getFirst_name(), "Prathmesh");
			Library.custom_sendkeys(book.getClick_home_delivery_enter_complete_address(), config.getPort(), "Dummy address");
			Library.custom_sendkeys(book.getClick_home_delivery_landmark_optional(), config.getPort(), "Dummy address");
			appium_1.EnterButton();
			BaseClass.scrollByText("Save Address Details");
			Library.Custom_click(book.getClick_home_delivery_save_address_details(), "Save address details");
			Library.Custom_click(book.getClick_home_delivery_delete_address(), "delete address");
			Library.Custom_click(book.getClick_home_delivery_yes_address(), "delete confirm Yes ");
			Thread.sleep(3000);
			Library.Custom_click(book.getClick_home_delivery_add_new_address_(), "Add new address");
			Thread.sleep(2000);
			appium_1.Back_button();
			Thread.sleep(1000);
			appium_1.Back_button();
			Thread.sleep(3000);
			try {
				WebElement element=driver1.findElement(By.xpath("//android.widget.Button[@content-desc='TabNav, back']"));
				if(element.isDisplayed() || element.isEnabled()==true) {
					element.click();
					driver1.findElement(By.xpath("//android.view.ViewGroup[@content-desc='home_tab']")).click();
				}
			}catch(Exception e) {
				driver1.findElement(By.xpath("//android.view.ViewGroup[@content-desc='home_tab']")).click();
			}
			Thread.sleep(1000);
			BaseClass.scrollByText("Search in");
			}catch(Exception e) {	}
	}
//=========================================================================================================================	
	//@Test(dependsOnMethods={"TC_0037_Verify_user_able_to_select_date_and_package_under_booking_all_elements_using_home_delivery"})
	@Test(priority=15)
	public void TC_0038_Verify_user_able_to_select_time_slot_afternoon() throws Exception {
		log.info("***************TC_0038_Verify_user_able_to_select_time_slot_afternoon starts*****************");
		try {
//		Assert.assertTrue(book.getClick_home_page_button().isDisplayed());
		Library.Custom_click(book.getClick_home_page_button(), "Home button ");
		Thread.sleep(1000);
		Library.Custom_click(book.getDifferent_city_name(), "Different city");
		Library.visible_link(login.getDetect_my_location(), "Detect my location");
		Library.Custom_click(login.getSelect_Manually_location(), "Select manually location");
		Library.Custom_click(login.getSelect_City_Noida(),config.getcity_name()+" city");
		Library.Custom_click(book.getClick_1st_page_enter_button(), "Enterbutton");
		Thread.sleep(500);
		Library.date_select();
		Library.Custom_click(book.getClick_Package_dropdown(), "package dropdown");
		Library.Custom_click(book.getClick_1_Days_package(),"Selected package");
		Library.Custom_click(book.getClick_go_freedo_Button(), "Go Freedo button");
		Thread.sleep(2000);
		Library.Custom_click(book.getBook_now_button(), "Booknow button");
		Thread.sleep(1000);
		Library.Custom_click(book.getclick_location_pop_up_ok_button(), "ok button");
		Library.Vertical_scroll_image(book.getBooking_details_page_city(), book.getClick_home_delivery_radio_button(), "Page scroll");
		BaseClass.scrollByText("Select Time Slot");
		BaseClass.scrollByText("Afternoon");
		Library.Custom_click(book.getBooking_details_page_afternoon(), "Afternoon");
		Thread.sleep(1000);
		Library.isSelected(book.getBooking_details_page_afternoon(), "Afternoon is");
		}catch(Exception e) {	}
	}
//==============================================================================================================================	
	//@Test(dependsOnMethods={"TC_0038_Verify_user_able_to_select_time_slot_afternoon"})
	@Test(priority=16)
	public void TC_0039_Verify_user_able_to_select_time_slot_Evening() throws Exception {
		log.info("***************TC_0039_Verify_user_able_to_select_time_slot_Evening starts*****************");
		
		if(book.getBooking_details_page_evening().isDisplayed()) {
		Library.Custom_click(book.getBooking_details_page_evening(), "Evening");
		Thread.sleep(1000);
		Library.isSelected(book.getBooking_details_page_evening(), "Evening is");
	}}
//========================================================================================================================
	//@Test(dependsOnMethods={"TC_0039_Verify_user_able_to_select_time_slot_Evening"})
	@Test(priority=17)
	public void TC_0040_Verify_user_able_to_select_time_slot_Morning() throws Exception {
		log.info("***************TC_0040_Verify_user_able_to_select_time_slot_Morning starts*****************");
		try {
		if(book.getBooking_details_page_morning().isDisplayed()) {
		Library.Custom_click(book.getBooking_details_page_morning(), "Morning");
		Thread.sleep(1000);
		Library.isSelected(book.getBooking_details_page_morning(), "Morning is");
	}}catch(Exception e) {	}}
//=================================================================================================================================
	//@Test(dependsOnMethods={"TC_0040_Verify_user_able_to_select_time_slot_Morning"})
	@Test(priority=18)
	public void TC_0041_Verify_user_able_to_list_button() throws Exception {
		log.info("***************TC_0041_Verify_user_able_to_list_button starts*****************");
		try {
		if(book.getBooking_details_page_list_button().isDisplayed()) {
		Library.Custom_click(book.getBooking_details_page_list_button(), "List");
		Thread.sleep(1000);
		try {
			
		//	driver1.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		}catch(Exception e) {}
		Library.visible_link(book.getBooking_details_page_map_button(), "Maps");
		appium_1.Back_button();
	}}catch(Exception e) {	}}
//==================================================================================================================================	
//	@Test(dependsOnMethods={"TC_0041_Verify_user_able_to_list_button"})
	@Test(priority=19)
	public void TC_0042_Verify_select_city() throws Exception {
		
		log.info("***************TC_0042_Verify_select_city starts*****************");
		try {
		appium_1.Back_button();
		Thread.sleep(2000);
	//	Assert.assertTrue(book.getClick_home_page_button().isDisplayed());
		Library.Custom_click(book.getClick_home_page_button(), "Home button ");
		Thread.sleep(1000);
		Library.Custom_click(book.getDifferent_city_name(), "Different city");
		Library.visible_link(login.getDetect_my_location(), "Detect my location");
		Library.Custom_click(login.getSelect_Manually_location(), "Select manually location");
		Library.Custom_click(login.getSelect_City_Noida(), config.getcity_name()+" city");
		Library.Custom_click(book.getClick_1st_page_enter_button(), "Enterbutton");
		Thread.sleep(500);
		Library.date_select();
		Library.Custom_click(book.getClick_Package_dropdown(), "package dropdown");
		Library.Custom_click(book.getClick_1_Days_package(),"Selected package");
		Library.Custom_click(book.getClick_go_freedo_Button(), "Go Freedo button");
		Thread.sleep(2000);
		Library.Custom_click(book.getBook_now_button(), "Booknow button");
		Thread.sleep(1000);
//		try {if(book.getBook_now_button().isDisplayed()==true) {
//			driver1.findElement(By.xpath("//android.widget.TextView[@text='Book Now']")).click();}
//		}catch(Exception e) {}
		
		Library.Custom_click(book.getclick_location_pop_up_ok_button(), "ok button");
		appium_1.Scroll_UP_page_Action("up");
		}catch(Exception e) {	}
	}
//==================================================================================================================
	//@Test(dependsOnMethods={"TC_0042_Verify_select_automation_city"})
	@Test(priority=20)
	public void TC_0043_Verify_continue_button_and_summary_page() throws Exception {
		log.info("***************TC_0043_Verify_continue_button_and_summary_page starts*****************");
		
		try {
		if(book.getClick_Continue_Tab().isDisplayed()) {
		Library.Custom_click(book.getClick_Continue_Tab(), "Continue button");
		Thread.sleep(1000);
		Library.isDisplayed(book.getsummary_page_text(), "SUMMARY page title is ");
		Library.visible_link(book.getSummary_bike_name_txt(),"bike name ");
		Library.visible_link(book.getSummary_start_date(), "Start date  ");
		Library.visible_link(book.getSummary_end_date(), " End date ");
		Library.visible_link(book.getSummary_start_time(), " Start time  ");
		Library.visible_link(book.getSummary_end_time(), " End Time  ");
		Library.visible_link(book.getSummary_package_duration(),"Duration  ");
		Library.visible_link(book.getSummary_pickup_location(),"Pick up Location  ");
		Library.visible_link(book.getSummary_km_limit(), "KM LIMIT ");
		Library.visible_link(book.getSummary_excess_km_charges(), "Excess Km Charges  ");
		Library.visible_link(book.getSummary_excess_hourly_charges(),"Excess hourly charges  ");
		
		Library.visible_link(book.getSummary_bike_name_txt(),"bike name = "+ book.getSummary_bike_name_txt().getText());
		Library.visible_link(book.getSummary_start_date(), "Start date = "+ book.getSummary_start_date().getText());
		Library.visible_link(book.getSummary_end_date(), " End date ="+ book.getSummary_end_date().getText());
		Library.visible_link(book.getSummary_start_time(), " Start time = "+ book.getSummary_start_time().getText());
		Library.visible_link(book.getSummary_end_time(), " End Time = "+ book.getSummary_end_time().getText());
		Library.visible_link(book.getSummary_package_duration(),"Duration = "+ book.getSummary_package_duration().getText());
		Library.visible_link(book.getSummary_pickup_location(),"Pick up Location = "+ book.getSummary_pickup_location().getText());
		Library.visible_link(book.getSummary_km_limit(), "KM LIMIT ="+book.getSummary_km_limit().getText());
		Library.visible_link(book.getSummary_excess_km_charges(), "Excess Km Charges = "+book.getSummary_excess_km_charges().getText());
		Library.visible_link(book.getSummary_excess_hourly_charges(),"Excess hourly charges = "+ book.getSummary_excess_hourly_charges().getText());
		Thread.sleep(1000);
		//appium_1.Scroll_UP_page_Action("page up");
		Library.visible_link(book.getSummary_rent_additional_helmet_checkbox(), "Rent additonal helmet checkbox");
		BaseClass.scrollByText("Pay Now");
		Library.visible_link(book.getSummary_coupon_code_offers(), "View Offers");
		Library.visible_link(book.getSummary_package_charges(),"Package charges  ");
		Library.visible_link(book.getClick_add_helmet_extra_charges(), "Additonal helmet  ");
		Library.visible_link(book.getSummary_delivery_charges(),"Delivery charges  ");
		Library.visible_link(book.getSummary_discount(),"Discount  ");
		Library.visible_link(book.getSummary_total_amount(), "Total Amount  ");		
		
		Library.visible_link(book.getSummary_package_charges(),"Package charges = "+ book.getSummary_package_charges().getText());
		Library.visible_link(book.getClick_add_helmet_extra_charges(), "Additonal helmet = "+book.getClick_add_helmet_extra_charges().getText());
		Library.visible_link(book.getSummary_delivery_charges(),"Delivery charges = "+ book.getSummary_delivery_charges().getText());
		Library.visible_link(book.getSummary_discount(),"Discount = "+ book.getSummary_discount().getText());
		Library.visible_link(book.getSummary_total_amount(), "Total Amount = "+ book.getSummary_total_amount().getText());
		Library.isSelectedFalse(book.getClick_cash_on_delivery(), "Before select Cod check box is ");
		Library.Custom_click(book.getClick_cash_on_delivery(), "cash on delivery");
		Library.isSelected(book.getClick_cash_on_delivery(), "After select Cod check box is ");
	//	library.Custom_click(book.getClick_I_accept_checkbox(), "I Accept the Terms & Conditions checkbox");
		Library.visible_link(book.getClick_summary_pay_now_button(), "click pay now button");
	//	library.Custom_click(book.getClick_cash_on_delivery(), "cash on delivery");
	}}catch(Exception e) {	}}
//===================================================================================================================	
	//@Test(dependsOnMethods={"TC_0043_Verify_continue_button_and_summary_page"})
	@Test(priority=21)
	public void TC_0044_Verify_summary_page_additional_helmet_charges() throws Exception {
		log.info("***************TC_0044_Verify_summary_page_additional_helmet_charges starts*****************");
		try {
			BaseClass.scrollByText("Helmet");
		if(book.getSummary_rent_additional_helmet_checkbox().isDisplayed()) {
		Library.visible_link(book.getSummary_rent_additional_helmet_checkbox(), "Rent additonal helmet checkbox");
		Thread.sleep(1000);
		Library.Custom_click(book.getSummary_rent_additional_helmet_checkbox(), "Rent additonal helmet checkbox");
		Library.visible_link(book.getSummary_Half_face_helmet(), "Full face helmet");
	//	library.visible_link(book.getSummary_Full_face_helmet(), "half face helmet");
		BaseClass.scrollByText("Pay Now");
		Library.visible_link(book.getSummary_package_charges(),"Package charges  ");
		Library.visible_link(book.getClick_add_helmet_extra_charges(), "Additonal helmet ");
		Library.visible_link(book.getSummary_delivery_charges(),"Delivery charges  ");
		Library.visible_link(book.getSummary_discount(),"Discount  ");
		Library.visible_link(book.getSummary_total_amount(), "Total Amount ");
		
		Library.visible_link(book.getSummary_package_charges(),"Package charges = "+ book.getSummary_package_charges().getText());
		Library.visible_link(book.getClick_add_helmet_extra_charges(), "Additonal helmet = "+book.getClick_add_helmet_extra_charges().getText());
		Library.visible_link(book.getSummary_delivery_charges(),"Delivery charges = "+ book.getSummary_delivery_charges().getText());
		Library.visible_link(book.getSummary_discount(),"Discount = "+ book.getSummary_discount().getText());
		Library.visible_link(book.getSummary_total_amount(), "Total Amount = "+ book.getSummary_total_amount().getText());
	}}catch(Exception e) {	}}
//======================================================================================================================
	//@Test(dependsOnMethods={"TC_0044_Verify_summary_page_additional_helmet_charges"})
	@Test(priority=22)
	public void TC_0045_Verify_summary_page_coupon_code() throws Exception {
		log.info("***************TC_0045_Verify_summary_page_coupon_code starts*****************");
		try {
		if(book.getSummary_coupon_code_offers().isDisplayed()) {
		Library.visible_link(book.getSummary_coupon_code_offers(), "View offers ");
		Library.Custom_click(book.getSummary_coupon_code_offers(), "View offers ");
		Thread.sleep(3000);
		Library.visible_link(book.getSummary_coupon_page_title(), "APPLY COUPON CODE");
		Library.Custom_click(book.getSummary_coupon_apply(), "Apply coupon");
		Thread.sleep(2000);
		BaseClass.scrollByText("Pay Now");
		Library.visible_link(book.getSummary_package_charges(),"Package charges  ");
		Library.visible_link(book.getClick_add_helmet_extra_charges(), "Additonal helmet  ");
		Library.visible_link(book.getSummary_delivery_charges(),"Delivery charges  ");
		Library.visible_link(book.getSummary_discount(),"Discount  ");
		Library.visible_link(book.getSummary_total_amount(), "Total Amount  ");
		
		Library.visible_link(book.getSummary_package_charges(),"Package charges = "+ book.getSummary_package_charges().getText());
		Library.visible_link(book.getClick_add_helmet_extra_charges(), "Additonal helmet = "+book.getClick_add_helmet_extra_charges().getText());
		Library.visible_link(book.getSummary_delivery_charges(),"Delivery charges = "+ book.getSummary_delivery_charges().getText());
		Library.visible_link(book.getSummary_discount(),"Discount = "+ book.getSummary_discount().getText());
		Library.visible_link(book.getSummary_total_amount(), "Total Amount = "+ book.getSummary_total_amount().getText());
	}}catch(Exception e) {	}}
//=========================================================================================================================	
	//@Test(dependsOnMethods={"TC_0045_Verify_summary_page_coupon_code"})
	@Test(priority=23)
	public void TC_0046_Verify_summary_page_cash_on_delivery_method() throws Exception {
		log.info("***************TC_0046_Verify_summary_page_cash_on_delivery_method starts*****************");
		try {
			BaseClass.scrollByText("Pay Now");
		Library.isSelectedFalse(book.getClick_cash_on_delivery(), "Before select Cod check box is ");
		Library.Custom_click(book.getClick_cash_on_delivery(), "cash on delivery");
		Library.isSelected(book.getClick_cash_on_delivery(), "After select Cod check box is ");
		Thread.sleep(500);
	//	library.Custom_click(book.getClick_cash_on_delivery(), "cash on delivery");
	//	library.Custom_click(book.getClick_I_accept_checkbox(), "I accept Checkbox");
		Thread.sleep(500);
		}catch(Exception e) {	}
	}
//===========================================================================================================================	
	//@Test(dependsOnMethods={"TC_0046_Verify_summary_page_cash_on_delivery_method"})
	@Test(priority=24)
	public void TC_0047_Verify_summary_page_pay_now_button_status() throws Exception {
		log.info("***************TC_0047_Verify_summary_page_pay_now_button_status starts*****************");
		try {
		Thread.sleep(2000);
		Library.isEnabled(book.getClick_summary_pay_now_button(), "Pay now button");
		
		}catch(Exception e) {}
	}
//============================================================================================================================	
	//@Test(dependsOnMethods={"TC_0047_Verify_summary_page_i_accept_checkbox"})
	@Test(priority=25)
	public void TC_0048_Verify_summary_page_pay_now_button() throws Exception {
		log.info("***************TC_0048_Verify_summary_page_pay_now_button starts*****************");
		try {
		if(book.getClick_summary_pay_now_button().isDisplayed()) {
		Library.Custom_click(book.getClick_summary_pay_now_button(), "Pay now button");
		Thread.sleep(10000);
		Library.visible_link(book.getClick_Pay_using_UPI(), "Pay using UPI");
		Library.visible_link(book.getClick_Pay_using_Card(), "Pay using card");
		Library.visible_link(book.getClick_Pay_using_Wallet(), "pay using wallet");
		Library.visible_link(book.getClick_Pay_using_Netbanking(), "Pay using Netbanking");
//		library.visible_link(book.getClick_Pay_using_cardles_EMI(), "Pay using cardless EMI");
		Library.visible_link(book.getClick_pay_now_button(), "Pay now button");
	}}catch(Exception e) {	}}
//============================================================================================================================
	//@Test(dependsOnMethods={"TC_0048_Verify_summary_page_pay_now_button"})
	@Test(priority=26)
	public void TC_0049_Verify_user_able_to_make_payment() throws Exception {
		log.info("***************TC_0049_Verify_user_able_to_make_payment starts*****************");
		try {
		if(book.getClick_Pay_using_Netbanking().isDisplayed()) {
		Library.Custom_click(book.getClick_Pay_using_Netbanking(), "Pay using Netbanking");
		Library.Custom_click(book.getClick_Pay_using_SBI_bank(), "Select SBI bank");
		Library.Custom_click(book.getClick_pay_now_button_sbi(), "Pay Now button");
		
		Library.Custom_click(book.getClick_payment_successful(), "payment successful");
		Library.Custom_click(book.getClick_view_booking(), "booking details");
		Thread.sleep(10000);
		Library.visible_link(book.getClick_view_booking(), "booking details");			
		Library.Custom_click(book.getClick_view_booking(), "booking details");
		Thread.sleep(7000);
		try {
			if(book.getClick_view_booking().isDisplayed()) {
			driver1.findElement(By.xpath("//android.widget.TextView[@content-desc='txt_ViewBooking']")).click();
			}
		}catch(Exception e){		}	
	}}catch(Exception e) {	}}
//=============================================================================================================================
	//@Test(dependsOnMethods={"TC_0049_Verify_user_able_to_make_payment"})
	@Test(priority=27)
	public void TC_0050_Verify_user_able_to_view_booking_status() throws Exception {
		log.info("***************TC_0050_Verify_user_able_to_view_booking_status starts*****************");
		Thread.sleep(3000);
		Library.visible_link(book.getFBD_Booking_status(), "Booking status");
		
	}
//=============================================================================================================================	
	//@Test(dependsOnMethods={"TC_0050_Verify_user_able_to_view_booking_status"})
	@Test(priority=28)
	public void TC_0051_Verify_user_able_to_view_booking_status_all_elements() throws Exception {
		log.info("***************TC_0051_Verify_user_able_to_view_booking_status_all_elements starts*****************");
	
		try {
		Library.visible_link(book.getClick_show_more_details(), "show more details text");
		
		Thread.sleep(2000);
		if(book.getFBD_Booking_status().isDisplayed()) {
		Library.visible_link(book.getFBD_Booking_status(), "Booking status");
		Library.visible_link(book.getFBD_Booking_id(), "Booking ID ");
		Library.visible_link(book.getFBD_vehicle_nummber(), "Vehicle number ");		
		Library.visible_link(book.getFBD_pick_up_date(), "Pick Up Date =");
		Library.visible_link(book.getFBD_drop_off_date(), "Drop off date ");
		Library.Custom_click(book.getClick_show_more_details(), "show more details text");
		Library.visible_link(book.getFBD_pick_up_location(), "Pick Up Location ");
		Library.visible_link(book.getFBD_duration(), "Duration ");
		Library.visible_link(book.getFBD_handover_time(), "Handover Time ");
		Library.visible_link(book.getFBD_drop_off_location(), "Drop off Location  ");
		Library.visible_link(book.getFBD_planned_drop_off_date(), "Planned drop off date ");
		Library.visible_link(book.getFBD_Actual_drop_off_date(), "Actual Drop-off date ");
		BaseClass.scrollByText("Show Less");
		Library.visible_link(book.getFBD_mode_of_pick_up(), "Mode of pick-up ");

		
		BaseClass.scrollByText("Booking Status");
		Library.visible_link(book.getFBD_booking_status_txt(), "Booking status = "+book.getFBD_booking_status_txt().getText());
		Thread.sleep(2000);
		
		Library.visible_link(book.getFBD_Booking_id(), "Booking ID = "+book.getFBD_Booking_id().getText());
		Library.visible_link(book.getFBD_vehicle_nummber(), "Vehicle number = "+book.getFBD_vehicle_nummber().getText());		
		Library.visible_link(book.getFBD_pick_up_date(), "Pick Up Date = "+book.getFBD_pick_up_date().getText());
		Library.visible_link(book.getFBD_drop_off_date(), "Drop off date = "+book.getFBD_drop_off_date().getText());
		Library.visible_link(book.getFBD_pick_up_location(), "Pick Up Location = "+book.getFBD_pick_up_location().getText());
		Library.visible_link(book.getFBD_duration(), "Duration = "+book.getFBD_duration().getText());
		Library.visible_link(book.getFBD_handover_time(), "Handover Time = "+book.getFBD_handover_time().getText());
		Library.visible_link(book.getFBD_drop_off_location(), "Drop off Location = "+book.getFBD_drop_off_location().getText());
		Library.visible_link(book.getFBD_planned_drop_off_date(), "Planned drop off date = "+book.getFBD_planned_drop_off_date().getText());
		Library.visible_link(book.getFBD_Actual_drop_off_date(), "Actual Drop-off date = "+book.getFBD_Actual_drop_off_date().getText());
		BaseClass.scrollByText("Show Less");
		Library.visible_link(book.getFBD_mode_of_pick_up(), "Mode of pick-up = "+book.getFBD_mode_of_pick_up().getText());
	
		
		Library.Custom_click(book.getClick_show_less_details(), "show less text");
		Library.visible_link(book.getClick_price_breakup(), "price break up Drop down");
	}}catch(Exception e) {System.out.println(e);	}}
//============================================================================================================================	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
