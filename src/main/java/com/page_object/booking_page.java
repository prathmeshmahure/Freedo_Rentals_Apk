package com.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class booking_page {
	
	public WebDriver driver;

	//==================================city =================================================
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_City']")			////txt_city_front_page
	private WebElement txt_city_front_page;
	
	
//=============================== 1st drop down componenets ============================================================	
	@FindBy(xpath="//android.widget.TextView[@content-desc='HomeId_EnterIcon']")			////Click_1st_location_dropdown
	private WebElement Click_1st_page_enter_button;
	
	@FindBy(xpath = "//android.widget.EditText[@content-desc='input_Location_Home']")  // text get 1st location dropdown
	 private WebElement txt_1st_location_dropdown;
			
	@FindBy(xpath="//android.widget.CheckedTextView[@text='Metro Hospital Sector 12']") //Click_1st_Metro_Hospital_Sector_12
	private WebElement Click_1st_Metro_Hospital_Sector_12;
	
	@FindBy(xpath="//android.widget.CheckedTextView[@text='Automation']")
	private WebElement Click_Autonation_city;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_userName']")
	private WebElement username;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='homeId_cityName']")
	private WebElement home_city_name;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='homeId_differCity']")
	private WebElement different_city_name;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='img_LocationHome']")
	private WebElement location_icon;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='btn_Bike']")
	private WebElement home_bike_tab;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='btn_Scooter']")
	private WebElement home_scooter_tab;


//================================== 2nd drop down componenets ========================================================	
	@FindBy(xpath="//android.widget.EditText[@content-desc='input_Package_Filter']")		////Click_Package_dropdown
	private WebElement Click_Package_dropdown;
	
	@FindBy(xpath="//android.widget.EditText[@content-desc='input_Package_Home']")		////txt_Package_dropdown
	private WebElement txt_Package_dropdown;
	
	@FindBy(xpath="//android.widget.CheckedTextView[@text='1 Days']")					//Click_1_Days_package
	private WebElement Click_1_Days_package;
	
	@FindBy(xpath="//android.widget.CheckedTextView[@text='2 Days']")					//Click_2_Days_package
	private WebElement Click_2_Days_package;
	
	@FindBy(xpath="//android.widget.CheckedTextView[@text='3 Days']")					//Click_3_Days_package
	private WebElement Click_3_Days_package;
	
	@FindBy(xpath="//android.widget.CheckedTextView[@text='4 Days']")					//Click_4_Days_package
	private WebElement Click_4_Days_package;
	
	@FindBy(xpath="//android.widget.CheckedTextView[@text='7 Days']")					//Click_7_Days_package
	private WebElement Click_7_Days_package;
	
	@FindBy(xpath="//android.widget.CheckedTextView[@text='15 Days']")					//Click_15_Days_package
	private WebElement Click_15_Days_package;
	
	@FindBy(xpath="//android.widget.CheckedTextView[@text='30 Days']")					//Click_30_Days_package
	private WebElement Click_30_Days_package;
	
	@FindBy(xpath="//android.widget.CheckedTextView[@text='90 Days']")					//Click_90_Days_package
	private WebElement Click_90_Days_package;

//==================================== 3rd select calender date component ===========================================
	@FindBy(xpath="(//android.widget.TextView[@text=''])[1]")							////Click_calender_date 
	private WebElement Click_calender_date;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='View_DPckr_Date_Home']/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")		////txt_calender_pickup_date
	private WebElement txt_calender_pickup_date;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='View_DropUp_Date_Home']/android.view.ViewGroup/android.view.ViewGroup")		////txt_calender_dropup_date
	private WebElement txt_calender_dropup_date;
	
	@FindBy(xpath="//android.widget.Button[@text='OK']")								//Click_calender_ok_button
	private WebElement Click_calender_ok_button;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='btn_Search_Filter_btn']")
	private WebElement Click_go_freedo_Button;											//Click_Book_now_Button
	
//=====================================4th all Bike only =========================================================
	@FindBy(xpath="//android.view.View[@text='OUR RENTING FLEET']")																			//Click_Bike_Tab
	private WebElement Our_renting_fleet_page_txt;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='renting_bike_available']")																			//Click_Bike_Tab
	private WebElement available_bikes;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='renting_btn_Bike']")																			//Click_Bike_Tab
	private WebElement Click_Bike_Tab;
	
	@FindBy(xpath="(//android.widget.TextView[@text='Book Now'])[1]")																	//select_random_Bike	  
	private WebElement select_random_Bike;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_BookNowYZF R15 V3']")													//Click_YZF_R15_V3_Bike	   // YZF R15 V3
	private WebElement Click_YZF_R15_V3_Bike;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_BookNowSplendor +' or @content-desc='txt_OutOfStockSplendor +']")		////Click_Splendor_Bike    // Splendor +
	private WebElement Click_Splendor_Bike;	
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_BookNowRoadmaster BM']")												////Click_Roadmaster_BM_Bike // Roadmaster BM
	private WebElement Click_Roadmaster_BM_Bike;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_BookNowXtreme 160 R' or @content-desc='txt_OutOfStockXtreme 160 R']")	//Click_Xtreme_160_R_Bike  // Xtreme 160 R
	private WebElement Click_Xtreme_160_R_Bike;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_BookNowGlamour'   or  @content-desc='txt_OutOfStockGlamour']")			////Click_Glamour_Bike     // Glamour
	private WebElement Click_Glamour_Bike;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_BookNowXtreme 200 S' or @content-desc='txt_OutOfStockXtreme 200 S']")	//Click_Xtreme_200_S_Bike  // Xtreme 200 S
	private WebElement Click_Xtreme_200_S_Bike;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_BookNowHF Deluxe' or @content-desc='txt_OutOfStockHF Deluxe']")			//Click_HF_Deluxe_Bike		// HF Deluxe
	private WebElement Click_HF_Deluxe_Bike;
//======================================= All Scooters ============================================
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='renting_btn_Scooter']")							//Click_Scooter_Tab
	private WebElement Click_Scooter_Tab;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_BookNowMagnus EX' or @content-desc='txt_OutOfStockMagnus EX']")						//Click_Magnus_EX_Scooter
	private WebElement Click_Magnus_EX_Scooter;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_BookNowDestini 125' or @content-desc='txt_OutOfStockDestini 125']")						//Click_Destini_125_Scooter
	private WebElement Click_Destini_125_Scooter;
	
//======================================== Booking Details page==========================================================	

	
	@FindBy(xpath="//android.widget.TextView[@content-desc='bookingID_detail_list_text_id']")						
	private WebElement booking_details_page_map_button;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='bookingId_detail_priceTwo']")						//txt_BKD_pickup_city
	private WebElement booking_details_page_price;
	
	@FindBy(xpath="//android.widget.RelativeLayout[@index='2']")						
	private WebElement booking_details_page_map;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='bookingId_detail_totalKmTwo']")						
	private WebElement booking_details_page_KM_limit;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='bookingId_detail_excessPerKmChargeTwo']")						
	private WebElement booking_details_page_excess_km_charges;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='bookingId_detail_excessPerHourTwo']")						
	private WebElement booking_details_page_excess_hourly_charges;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='btn_TimeSlot_Morning']")						
	private WebElement booking_details_page_morning;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='btn_timeslot_afternoon']")						
	private WebElement booking_details_page_afternoon;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='btn_timeslot_evening']")						
	private WebElement booking_details_page_evening;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='bookingID_detail_list_View_click']")						
	private WebElement booking_details_page_list_button;
				//=======================================
	@FindBy(xpath="//android.widget.TextView[@text='BOOKING DETAILS']")						//txt_BKD_pickup_city
	private WebElement booking_details_page_txt;
	
	@FindBy(xpath="//android.widget.EditText[@content-desc='ipt_City_bDetail']")						//txt_BKD_pickup_city
	private WebElement txt_BKD_pickup_city;
	
	@FindBy(xpath="//android.widget.EditText[@content-desc='input_Location_BDetail']")						//txt_BKD_pickup_location
	private WebElement txt_BKD_pickup_location;
	
	@FindBy(xpath="//android.widget.EditText[@content-desc='input_Duration_BDetail']")						//txt_BKD_package_duration
	private WebElement txt_BKD_package_duration;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='View_DPckr_Date_bDetail']/android.view.ViewGroup/android.view.ViewGroup")						//txt_BKD_Start_date
	private WebElement txt_BKD_Start_date;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='View_DropUp_Date_bDetail']/android.view.ViewGroup/android.view.ViewGroup")						//txt_BKD_end_date
	private WebElement txt_BKD_end_date;
		
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='bookingID_detail_address_click']")						//Click_Continue_Tab
	private WebElement Click_Continue_Tab;
	
///////////////////////////////////////////////////  SUMMARY page =================================================
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='btn_Continue']")						//Click_Continue_Tab
	private WebElement Click_SUmmary_page_Continue_Tab;
	
	@FindBy(xpath="//android.widget.TextView[@text='Pick Up City']")					//Pick Up City
	private WebElement Click_Pick_Up_City;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='icon_add_helmet']")			//Click_add_helmet
	private WebElement Click_add_helmet;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Additional Helmet']")	//Click_add_helmet_extra_charges
	private WebElement Click_add_helmet_extra_charges;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='imgcbx_Cash']")									//Click_cash_on_delivery
	private WebElement Click_cash_on_delivery;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='cbx_Accept_summary']")									//Click_cash_on_delivery
	private WebElement click_I_accept_checkbox;
	
	@FindBy(xpath="//android.widget.ImageView[@content-desc='imgcbx_Split']")				//Click_split_payment
	private WebElement Click_split_payment;
	
	@FindBy(xpath="//android.widget.ImageView[@content-desc='imgcbx_Accept']")									//Click_split_payment_i_agree_check_box
	private WebElement Click_split_payment_i_agree_check_box;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='btn_Make_Payment']")				//Click_split_make_payment_button
	private WebElement Click_split_make_payment_button;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='btn_Close']")				//Click_notification_close_button
	private WebElement Click_notification_close_button;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='btn_PayNow']")							//Click_pay_now_button
	private WebElement Click_summary_pay_now_button;
	
	@FindBy(xpath="//android.widget.Button[@text='Pay Now']")							//Click_pay_now_button
	private WebElement Click_pay_now_button;
	
	@FindBy(xpath="//android.widget.TextView[@text='Only one cod is applicable per user for future ride booking']")	//cod_1st_available_text
	private WebElement cod_1st_available_text;
	
	@FindBy(xpath="//android.widget.Button[@text='OK']")							//cod_1st_available_ok_button
	private WebElement click_location_pop_up_ok_button;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='btn_BackBOOKINGDETAILS']")	//Click_back_button
	private WebElement Click_back_button;
	
	@FindBy(xpath="//android.view.View[@text='SUMMARY']")							//summary_page_text
	private WebElement summary_page_text;
	
	@FindBy(xpath="//android.widget.TextView[@text='You are allowed to book only one vehicle at a time.']")			//cod_1st_available_ok_button
	private WebElement booking_1st_only_one_vehicle_at_a_time_text;
	//
	@FindBy(xpath="//android.widget.TextView[@content-desc='summary_model_name_id']")			
	private WebElement summary_bike_name_txt;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='summary_start_date_id']")			
	private WebElement summary_start_date;
	
	@FindBy(xpath="(//android.widget.TextView[@content-desc='summary_end_date_id'])[1]")			
	private WebElement summary_end_date;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='summary_start_time_id']")			
	private WebElement summary_start_time;
	
	@FindBy(xpath="(//android.widget.TextView[@content-desc='summary_end_date_id'])[2]")			
	private WebElement summary_end_time;
	
	@FindBy(xpath="(//android.widget.TextView[@content-desc='summary_value_ans_id'])[1]")			
	private WebElement summary_package_duration;
	
	@FindBy(xpath="(//android.widget.TextView[@content-desc='summary_value_ans_id'])[2]")			
	private WebElement summary_pickup_location;
	
	@FindBy(xpath="(//android.widget.TextView[@content-desc='summary_value_ans_id'])[3]")			
	private WebElement summary_km_limit;
	
	@FindBy(xpath="(//android.widget.TextView[@content-desc='summary_value_ans_id'])[4]")			
	private WebElement summary_excess_km_charges;
	
	@FindBy(xpath="(//android.widget.TextView[@content-desc='summary_value_ans_id'])[5]")			
	private WebElement summary_excess_hourly_charges;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='cbx_Accept_isAdditionalHelmet']")			
	private WebElement summary_rent_additional_helmet_checkbox;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Offers']")			
	private WebElement summary_coupon_code_offers;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Package Charges']")			
	private WebElement summary_package_charges;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Delivery Charges']")			
	private WebElement summary_delivery_charges;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Discount']")			
	private WebElement summary_discount;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_TotalAmount']")			
	private WebElement summary_total_amount;
	
	@FindBy(xpath="(//android.widget.TextView[@content-desc='summary_helmet_category_name_txt'])[1]")			
	private WebElement summary_Half_face_helmet;
	
	@FindBy(xpath="(//android.widget.TextView[@content-desc='summary_helmet_category_name_txt'])[2]")			
	private WebElement summary_Full_face_helmet;
	
	@FindBy(xpath="//android.widget.TextView[@text='APPLY COUPON CODE']")			
	private WebElement summary_coupon_page_title;
	
	@FindBy(xpath="(//android.view.ViewGroup[@content-desc='btn_Apply'])[2]")			
	private WebElement summary_coupon_apply;
	
//========================================= Home delivery element ==============================================
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='imgradioBtn__book_detail_Pickup']")	//Click_home_delivery_radio_button
	private WebElement Click_Pick_up_vehicle_radio_button;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='imgradioBtn_book_detail_Home']")	//Click_home_delivery_radio_button
	private WebElement Click_home_delivery_radio_button;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='bookingID_detail_address_click']")					
	private WebElement Click_home_delivery_add_address;
	
	@FindBy(xpath="//android.widget.EditText[@text='Enter Location Manually']")					
	private WebElement Click_home_delivery_search_address;
	
	@FindBy(xpath="//android.widget.TextView[@text='Udyog Vihar, Sector 19, Gurugram, Haryana, India']")	//android.widget.TextView[@text='Udyog Vihar, Sector 19, Gurugram, Haryana, India']				
	private WebElement Click_home_delivery_search_address_1;
	
	@FindBy(xpath="//android.widget.TextView[@text='Confirm Location']")					
	private WebElement Click_home_delivery_confirm_location;
	
	@FindBy(xpath="//android.widget.EditText[@text='First name']")					
	private WebElement Click_home_delivery_enter_name;
	
	@FindBy(xpath="//android.widget.EditText[@text='Enter complete address']")					
	private WebElement Click_home_delivery_enter_complete_address;
	
	@FindBy(xpath="//android.widget.EditText[@text='Landmark (optional)']")					
	private WebElement Click_home_delivery_landmark_optional;
	
	@FindBy(xpath="//android.widget.TextView[@text='Save Address Details']")					
	private WebElement Click_home_delivery_save_address_details;
	
	@FindBy(xpath="(//android.widget.TextView[@text=''])[2]")					
	private WebElement Click_home_delivery_delete_address;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='btn_Yes_address']")					
	private WebElement Click_home_delivery_yes_address;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='btn_Add_New_Address']")					
	private WebElement Click_home_delivery_add_new_address_;
				//==================================
	
	@FindBy(xpath="//android.widget.EditText[@content-desc='ipt_Address_bDetail']")						//Click_home_delivery_Address
	private WebElement Click_home_delivery_Address;
	
	@FindBy(xpath="//android.widget.EditText[@content-desc='ipt_Landmark_bDetail']")					//Click_home_delivery_landmark
	private WebElement Click_home_delivery_landmark;
	
	@FindBy(xpath="//android.widget.EditText[@text='Noida' or @text='Select City' ]")						//Click_home_delivery_city
	private WebElement Click_home_delivery_city;
	
	@FindBy(xpath="//android.widget.EditText[@content-desc='ipt_Pincode_bDetail']")						//Click_home_delivery_pincode
	private WebElement Click_home_delivery_pincode;
	
	@FindBy(xpath="//android.widget.Button[@content-desc='TabNav, back']")						//
	private WebElement Click_home_delivery_back_button;
	
//========================================== Home page button =========================================================	
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='home_tab']")					//Click_home_page_button
	private WebElement Click_home_page_button;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='renting_fleet_tab']")		//Click_home_page_bike_rental_button
	private WebElement Click_home_page_bike_rental_button;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='bookings_tab']")				//Click_home_page_Bookings_button
	private WebElement Click_home_page_Bookings_button;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='rental_process_tab']")		//Click_home_page_Rent_button
	private WebElement Click_home_page_Rent_button;
	
	  //==========================================================
			@FindBy(xpath="//android.view.View[@text='RENTAL PROCESS']")		//Click_home_page_Rent_button
			private WebElement Rent_page_heading;
			
			@FindBy(xpath="//android.widget.TextView[@content-desc='txtDatePickup']")		//Click_home_page_Rent_button
			private WebElement rent_select_date_and_pickup_location;
			
			@FindBy(xpath="//android.widget.TextView[@content-desc='txtListBikes']")		//Click_home_page_Rent_button
			private WebElement rent_bikes_and_scooters;
			
			@FindBy(xpath="//android.widget.TextView[@content-desc='txtKyc']")		//Click_home_page_Rent_button
			private WebElement rent_submit_kyc_and_document;
			
			@FindBy(xpath="//android.widget.TextView[@content-desc='txtPay']")		//Click_home_page_Rent_button
			private WebElement rent_pay_and_book_bike;
			
			@FindBy(xpath="//android.widget.TextView[@content-desc='txtRide']")		//Click_home_page_Rent_button
			private WebElement rent_enjoy_ride;
	
	  //==========================================================
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='more_component_tab']")		//Click_home_page_More_button
	private WebElement Click_home_page_More_button;
	//========================================================
					@FindBy(xpath="//android.widget.TextView[@text='Notification']")		//Click_home_page_More_button
					private WebElement More_button_notification;
					
					@FindBy(xpath="//android.widget.TextView[@text='Edit Profile']")		//Click_home_page_More_button
					private WebElement More_button_Edit_Profile;
					
					@FindBy(xpath="//android.widget.TextView[@text='Split Payment']")		//Click_home_page_More_button
					private WebElement More_button_split_payment;
					
					@FindBy(xpath="//android.widget.TextView[@text='Rate Us']")		//Click_home_page_More_button
					private WebElement More_button_rate_us;
					
					@FindBy(xpath="//android.widget.TextView[@content-desc='txt_moreKYC']")		//Click_home_page_More_button
					private WebElement More_button_KYC;
					
					@FindBy(xpath="//android.widget.TextView[@content-desc='txt_moreTerms & Conditions']")		//Click_home_page_More_button
					private WebElement More_button_terms_and_condition;
					
					@FindBy(xpath="//android.widget.TextView[@content-desc='txt_morePrivacy Policy']")		//Click_home_page_More_button
					private WebElement More_button_privacy_policy;
					
					@FindBy(xpath="//android.widget.TextView[@content-desc='txt_moreAddress Book']")		//Click_home_page_More_button
					private WebElement More_button_address_book;
					
					@FindBy(xpath="//android.widget.TextView[@content-desc='txt_moreAbout Us']")		//Click_home_page_More_button
					private WebElement More_button_about_us;
					
					@FindBy(xpath="//android.widget.TextView[@content-desc='txt_moreContact Us']")		//Click_home_page_More_button
					private WebElement More_button_contact_us;
					
					@FindBy(xpath="//android.widget.TextView[@content-desc='txt_moreInvite your friend']")		//Click_home_page_More_button
					private WebElement More_button_invite_your_friend;
					
					@FindBy(xpath="//android.widget.TextView[@content-desc='txt_moreFAQ']")		//Click_home_page_More_button
					private WebElement More_button_faq;
					
					@FindBy(xpath="//android.widget.TextView[@index='11']")		//Click_home_page_More_button
					private WebElement More_button_app_version;
					
					@FindBy(xpath="//android.view.ViewGroup[@content-desc='btn_No']")		//Click_home_page_More_button
					private WebElement More_button_logout_cancel;
					

		//========================================================
					@FindBy(xpath="//android.widget.TextView[@text='Book Now']")		//Click_home_page_More_button
					private WebElement book_now_button;
	
	
	
	

//========================================== Payment page methods ============================================
	@FindBy(xpath="//android.view.View[@text='Pay using UPI ']")				//Click_Pay_using_UPI
	private WebElement Click_Pay_using_UPI;
	
	@FindBy(xpath="//android.view.View[@text='Pay using Card All cards supported ']")	//Click_Pay_using_Card
	private WebElement Click_Pay_using_Card;
	
	@FindBy(xpath="//android.view.View[@text='Pay using Wallet ']")			//Click_Pay_using_Wallet
	private WebElement Click_Pay_using_Wallet;
	
	@FindBy(xpath="//android.widget.TextView[@text='Amazon Pay']")				//Click_Pay_using_amazon_pay
	private WebElement Click_Pay_using_amazon_pay;
	
	@FindBy(xpath="//android.view.View[@text='Pay using Netbanking ']")		//Click_Pay_using_Netbanking
	private WebElement Click_Pay_using_Netbanking;
	
	@FindBy(xpath="//android.widget.TextView[@text='SBI']")						//Click_Pay_using_SBI_bank 
	private WebElement Click_Pay_using_SBI_bank;
	
	@FindBy(xpath="//android.view.View[@text='Pay using Cardless EMI ']")						//Click_Pay_using_SBI_bank 
	private WebElement Click_Pay_using_cardles_EMI;
	
	@FindBy(xpath="//android.widget.Button[@text='Pay Now' or @resource-id='redesign-v15-cta']")					//Click_pay_now_button 
	private WebElement Click_pay_now_button_sbi;
	
	@FindBy(xpath="//android.view.View[@text='Enter your UPI ID']")				//Click_Enter_your_UPI_ID 
	private WebElement Click_Enter_your_UPI_ID;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_ViewBooking']")	//Click_view_booking
	private WebElement Click_view_booking;

	@FindBy(xpath="//android.widget.Button[@text='Success']")					//Click_payment_successful 
	private WebElement Click_payment_successful;
//======================================================= home booking button bar ======================================
	@FindBy(xpath="//android.widget.TextView[@text='View']")					//Click_booking_view_button 
	private WebElement Click_booking_page_view_button;
	
	@FindBy(xpath="//android.widget.TextView[@text='Show More' or @text='Show Less']")//Click_show_more_details 
	private WebElement Click_show_more_details;
	
	@FindBy(xpath="//android.widget.TextView[@text='Show More' or @text='Show Less']")//Click_show_less_details
	private WebElement Click_show_less_details;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='icon_down_priceBreakUp']")//Click_price_breakup
	private WebElement Click_price_breakup;	
	
	@FindBy(xpath="(//android.widget.ImageView)[1]")							//Click_Home_booking_tab_bike_image
	private WebElement Click_Home_booking_tab_bike_image;
	
	@FindBy(xpath="(//android.widget.TextView[@content-desc='txt_ModelName_History'])[1]")//Click_Home_booking_tab_bike_text
	private WebElement Click_Home_booking_tab_bike_text;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_cityName_History']")//Click_Home_booking_tab_pickup_location_txt
	private WebElement Click_Home_booking_tab_pickup_location_txt;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_PickupDate_History']")//Click_Home_booking_tab_pickup_date_txt
	private WebElement Click_Home_booking_tab_pickup_date_txt;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Duration_History']")//Click_Home_booking_tab_package_duration
	private WebElement Click_Home_booking_tab_package_duration;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_DropOffDate_History']")//Click_Home_booking_tab_dropoff_date
	private WebElement Click_Home_booking_tab_dropoff_date;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_amountPaid_History']")//Click_Home_booking_tab_total_amount_paid
	private WebElement Click_Home_booking_tab_total_amount_paid;
	
	@FindBy(xpath="(//android.widget.TextView[@text,''])[13]")					//Click_Home_booking_tab_booking_status
	private WebElement Click_Home_booking_tab_booking_status;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='icon_down_extendRide']")//Click_Home_booking_tab_extend_ride
	private WebElement Click_Home_booking_tab_extend_ride;
	
	@FindBy(xpath="//android.widget.EditText[@text='Select Package']")	//Click_Home_booking_tab_extend_ride_select_package
	private WebElement Click_Home_booking_tab_extend_ride_select_package;
	
	@FindBy(xpath="//android.widget.CheckedTextView[contains(@text,'1 Days')]")						//Click_Home_booking_tab_extend_ride_1_days_package
	private WebElement Click_Home_booking_tab_extend_ride_1_days_package;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_View_Offers_FBDetail']")	//Click_Home_booking_tab_extend_ride_verify_offers
	private WebElement Click_Home_booking_tab_extend_ride_verify_offers;
	
	@FindBy(xpath="(//android.widget.TextView[@text='APPLY'])[4]")						//Click_Home_booking_tab_extend_ride_save_50_per_offer
	private WebElement Click_Home_booking_tab_extend_ride_save_50_per_offer;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Extend_Ride']")		//Click_Home_booking_tab_extend_ride_extend_button
	private WebElement Click_Home_booking_tab_extend_ride_extend_button;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='btn_BackFULLBOOKINGDETAILS']")	//Click_Home_booking_tab_back_button
	private WebElement Click_Home_booking_tab_back_button;
	
	@FindBy(xpath="//android.widget.TextView[@text='Track Booking Status']")						//
	private WebElement Click_Home_booking_tab_track_booking_status;
	
	@FindBy(xpath="//android.widget.TextView[@text='Booking Status']")						//
	private WebElement Click_Home_booking_tab_booking_status_page_tittle;
//======================================= more button option =================================================	
	@FindBy(xpath="//android.widget.TextView[@text='KYC']")						//Click_more_option_kyc_txt
	private WebElement Click_more_option_kyc_txt;
	
	@FindBy(xpath="//android.widget.TextView[@text='Logout']")					//Click_more_option_logout_txt
	private WebElement Click_more_option_logout_txt;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='btn_Yes']")					//Click_more_option_logout_yes_txt
	private WebElement Click_more_option_logout_yes_txt;
//======================================== Kyc Verification page ====================================================
	@FindBy(xpath="(//android.view.View[@text(),'KYC VERIFICATION'])[1]")			//KYC page tittle
	private WebElement KYC_verification_page_title;	
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='dlkycbtn_Tab']")			//Click_driving_licence
	private WebElement Click_driving_licence_txt;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='dlkycbtn_Ok_Circle']")			
	private WebElement KYC_DL_radio_button;	
	
	@FindBy(xpath="//android.widget.TextView[@text='Driving License Verified']")			
	private WebElement KYC_DL_verified_txt;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_UploadFront']") //Click_DL_upload_front_page
	private WebElement Click_DL_upload_front_page;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_UploadBack']")	//Click_DL_upload_Back_page
	private WebElement Click_DL_upload_Back_page;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='btn_Verify Later']")					//Click_kyc_skip_button
	private WebElement Click_kyc_Verify_later_button;
	
	@FindBy(xpath="//android.widget.TextView[@text='Next']")					//Click_kyc_next_button
	private WebElement Click_kyc_next_button;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='adhaarkycbtn_Tab2']")			//Click_Aadhaar_radio_button
	private WebElement Click_Aadhaar_tab_txt;
	
	@FindBy(xpath="//android.widget.TextView[@text='Aadhaar Card Verified']")			
	private WebElement Click_Aadhaar_card_Verified_txt;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='adhaarkycbtn_Ok_Circle']")			
	private WebElement KYC_Aadhar_radio_button;	
	
	@FindBy(xpath="//android.widget.TextView[@text='Initiate Aadhaar card']")	//Click_initiate_aadhaar_card
	private WebElement Click_initiate_aadhaar_card;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='selfieKycbtn_Tab3']")			//Click_selfi_radio_button
	private WebElement Click_selfi_tab_txt;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='selfieKycbtn_Dot_Circle']")			
	private WebElement KYC_selfi_radio_button;	
	
	@FindBy(xpath="//android.widget.TextView[@text='Successfully captured']")			
	private WebElement KYC_selfi_verified_txt;
	
	@FindBy(xpath="//android.widget.TextView[@text='Open Camera']")				//Click_Take_selfi_camera
	private WebElement Click_Take_selfi_camera;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Drag']")		//Click_upload_photo
	private WebElement Click_upload_photo;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='additionalKycbtn_Tab4']")			//Click_more_radio_button
	private WebElement Click_more_tab_txt;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='additionalKycbtn_Dot_Circle']")			
	private WebElement KYC_more_radio_button;	
	
	@FindBy(xpath="//android.widget.TextView[@text='Voter ID']")				//CLick_voter_id
	private WebElement CLick_voter_id;
	
	@FindBy(xpath="//android.widget.TextView[@text='Bank Detail']")				//Click_Bank_details
	private WebElement Click_Bank_details;
	
	@FindBy(xpath="//android.widget.TextView[@text='Electricity Bill']")		//CLick_electricity_bill
	private WebElement CLick_electricity_bill;
	
	@FindBy(xpath="//android.widget.TextView[@text='Rental Bill']")				//Click_rental_bill
	private WebElement Click_rental_bill;
	
	@FindBy(xpath="//android.widget.TextView[@text='Others']")					//CLick_other_document
	private WebElement CLick_other_document;
	
	@FindBy(xpath="//android.widget.TextView[@text='Submit']")					//CLick_document_submit_button
	private WebElement CLick_document_submit_button;
//================================================== Edit profile =====================================================================	
	@FindBy(xpath="//android.widget.TextView[@text='Edit Profile']")			//Click_Edit_profile
	private WebElement Click_Edit_profile;
	
	@FindBy(xpath="//android.view.View[@text='MY PROFILE']")			//Click_Edit_profile
	private WebElement my_profile_page_title;
	
	@FindBy(xpath="//android.widget.EditText[@content-desc='ipt_FirstName']")	//Click_Edit_profile_first_name
	private WebElement Click_Edit_profile_first_name;
	
	@FindBy(xpath="//android.widget.EditText[@content-desc='ipt_LastName']")	//Click_Edit_profile_last_name
	private WebElement Click_Edit_profile_last_name;
	
	@FindBy(xpath="//android.widget.EditText[@content-desc='ipt_MobileNumber']")//Click_Edit_profile_mobile_number
	private WebElement Click_Edit_profile_mobile_number;
	
	@FindBy(xpath="//android.widget.EditText[@content-desc='ipt_email']")		//Click_Edit_profile_email
	private WebElement Click_Edit_profile_email;
	
	@FindBy(xpath="//android.widget.EditText[@content-desc='ipt_Emergencymobilenumber']")//Click_Edit_profile_emergency_mobile_number
	private WebElement Click_Edit_profile_emergency_mobile_number;
	
	@FindBy(xpath="//android.widget.EditText[@content-desc='ipt_NameofContact']")//Click_Edit_profile_emergency_person_name
	private WebElement Click_Edit_profile_emergency_person_name;
	
	@FindBy(xpath="//android.widget.TextView[@text='Relation With' or @text='Family' or @text='Friend' or @text='Colleague'] ")//Click_Edit_profile_relation
	private WebElement Click_Edit_profile_relation;
	
	@FindBy(xpath="//android.widget.TextView[@text='Update Profile']")			//Click_Edit_profile_update_button
	private WebElement Click_Edit_profile_update_button;
	
	@FindBy(xpath="//android.widget.Button[@content-desc='TabNav, back']")		//Click_Edit_profile_back_navigation_button
	private WebElement Click_Edit_profile_back_navigation_button;
//========================================================== dark theme==================================
	
	@FindBy(xpath="//android.widget.ImageView[@content-desc='img_Switch']")     //click_dark_theme
	private WebElement click_dark_theme;
//======================================================= Negative scenario ===========================
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='asteriskNfNRedPro']")
	private WebElement Update_profile_MF_firstname;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='asteriskNlNRedPro']")
	private WebElement Update_profile_MF_lastname;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='asteriskNmNRedPro']")
	private WebElement Update_profile_MF_mobilenumber;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='asteriskNeNRedPro']")
	private WebElement Update_profile_MF_email;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='asteriskNgNRedPro']")
	private WebElement Update_profile_MF_gender;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='asteriskNmNRedProEmer']")
	private WebElement Update_profile_MF_EM_mobilenumber;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='asteriskNnRedProEmer']")
	private WebElement Update_profile_MF_EM_name;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='asteriskNrNRedProEmer']")
	private WebElement Update_profile_MF_EM_relation;
	
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
//============================== Booking History page =======================================
	@FindBy(xpath="//android.widget.TextView[@text='Booking Status']//following-sibling::android.widget.TextView")
	private WebElement FBD_booking_status_txt;
	
	@FindBy(xpath="//android.widget.TextView[@text='HERO']//following-sibling::android.widget.TextView")
	private WebElement FBD_bike_txt;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Vehicle number']")
	private WebElement FBD_vehicle_nummber;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Pick Up Date']")
	private WebElement FBD_pick_up_date;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Drop-off Date']")
	private WebElement FBD_drop_off_date;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Odometer Start Reading']")
	private WebElement FBD_odometer_start_reading;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Odometer Ending Reading']")
	private WebElement FBD_odometer_ending_reading;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Pick Up Location']")
	private WebElement FBD_pick_up_location;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Duration']")
	private WebElement FBD_duration;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Handover Time']")
	private WebElement FBD_handover_time;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Drop-off Location']")
	private WebElement FBD_drop_off_location;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Planned Drop-Off Date']")
	private WebElement FBD_planned_drop_off_date;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Actual Drop-off Date']")
	private WebElement FBD_Actual_drop_off_date;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Mode of Pick-Up']")
	private WebElement FBD_mode_of_pick_up;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Address']")
	private WebElement FBD_address;
	
	@FindBy(xpath="//android.widget.TextView[@text='Booking Status']")
	private WebElement FBD_Booking_status;
	
	@FindBy(xpath="//android.widget.TextView[@text='FULL BOOKING DETAILS']")
	private WebElement FBD_page_title;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Booking Id']")
	private WebElement FBD_Booking_id;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='icon_down_endRide']")
	private WebElement FBD_end_ride;
			//============================
	
		@FindBy(xpath="//android.view.ViewGroup[@content-desc='btn_Raise_Request']")
		private WebElement FBD_end_ride_raised_request_button;
	
			//============================
	@FindBy(xpath="//android.widget.TextView[@content-desc='icon_down_vehcileDocuments']")
	private WebElement FBD_vehicle_documents;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='txt_Invoice1']")
	private WebElement FBD_Invoice_button;
//	
//	@FindBy(xpath="")
//	private WebElement FBD_;
//	
//	@FindBy(xpath="")
//	private WebElement FBD_;
//	
//	@FindBy(xpath="")
//	private WebElement FBD_;
//	
//	@FindBy(xpath="")
//	private WebElement FBD_;
//	
//	@FindBy(xpath="")
//	private WebElement FBD_;
//	
//	@FindBy(xpath="")
//	private WebElement FBD_;
	

	
//=============================================================================================================
		public booking_page(WebDriver driver) 
		{
			this.driver=driver;
		}

					public WebDriver getDriver() {
						return driver;
					}
					
//=============================================== city ============================================================					
					public WebElement gettxt_city_front_page() {
						return txt_city_front_page;
					}					
//============================================ 1st drop down componenets getter ======= 1st page ================================					
					public WebElement getClick_1st_page_enter_button() {
						return Click_1st_page_enter_button;
					}
			
					public WebElement getClick_1st_Metro_Hospital_Sector_12() {
						return Click_1st_Metro_Hospital_Sector_12;
					}
					
					public WebElement gettxt_1st_location_dropdown() {
						return txt_1st_location_dropdown;
					}
			
					public WebElement getClick_Autonation_city() {
						return Click_Autonation_city;
					}
//=============================================== 2nd drop down componenets getter ======== 1st page========================			
					public WebElement getClick_Package_dropdown() {
						return Click_Package_dropdown;
					}
			
					public WebElement gettxt_Package_dropdown() {
						return txt_Package_dropdown;
					}
			
					public WebElement getClick_1_Days_package() {
						return Click_1_Days_package;
					}
					
					public WebElement getClick_2_Days_package() {
						return Click_2_Days_package;
					}
			
					public WebElement getClick_3_Days_package() {
						return Click_3_Days_package;
					}
			
					public WebElement getClick_4_Days_package() {
						return Click_4_Days_package;
					}
					
					public WebElement getClick_7_Days_package() {
						return Click_7_Days_package;
					}
			
					public WebElement getClick_15_Days_package() {
						return Click_15_Days_package;
					}
			
					public WebElement getClick_30_Days_package() {
						return Click_30_Days_package;
					}
			
					public WebElement getClick_90_Days_package() {
						return Click_90_Days_package;
					}
//======================================== Select calender date================================= 1st page======================					
										
					public WebElement getClick_calender_date() {
						return Click_calender_date;
					}
					
					public WebElement gettxt_calender_pickup_date() {
						return txt_calender_pickup_date;
					}
					
					public WebElement gettxt_calender_dropup_date() {
						return txt_calender_dropup_date;
					}
					
					public WebElement getClick_calender_ok_button() {
						return Click_calender_ok_button;
					}
					
					public WebElement getClick_go_freedo_Button() {
						return Click_go_freedo_Button;
					}
//========================================= all bike ===================================================== 2nd page=====================
					
					public WebElement getClick_Bike_Tab() {
						return Click_Bike_Tab;
					}
					
					public WebElement getselect_random_Bike() {
						return select_random_Bike;
					}
					
					public WebElement getClick_YZF_R15_V3_Bike() {
						return Click_YZF_R15_V3_Bike;
					}
					
					public WebElement getClick_Splendor_Bike() {
						return Click_Splendor_Bike;
					}
					
					public WebElement getClick_Roadmaster_BM_Bike() {
						return Click_Roadmaster_BM_Bike;
					}
					
					public WebElement getClick_Xtreme_160_R_Bike() {
						return Click_Xtreme_160_R_Bike;
					}
					
					public WebElement getClick_Glamour_Bike() {
						return Click_Glamour_Bike;
					}
					
					public WebElement getClick_Xtreme_200_S_Bike() {
						return Click_Xtreme_200_S_Bike;
					}
					
					public WebElement getClick_HF_Deluxe_Bike() {
						return Click_HF_Deluxe_Bike;
					}
//======================================= All Scooters ============================================
					public WebElement getClick_Scooter_Tab() {
						return Click_Scooter_Tab;
					}
					
					public WebElement getClick_Magnus_EX_Scooter() {
						return Click_Magnus_EX_Scooter;
						
					}
					public WebElement getClick_Destini_125_Scooter() {
						return Click_Destini_125_Scooter;
					}
//======================================= Booking Details page===========================================================		

					
					public WebElement gettxt_BKD_pickup_city() {
						return txt_BKD_pickup_city;
					}
					
					public WebElement gettxt_BKD_pickup_location() {
						return txt_BKD_pickup_location;
					}
					
					public WebElement gettxt_BKD_package_duration() {
						return txt_BKD_package_duration;
					}
					
					public WebElement gettxt_BKD_Start_date() {
						return txt_BKD_Start_date;
					}
					
					public WebElement gettxt_BKD_end_date() {
						return txt_BKD_end_date;
					}
					
					public WebElement getClick_Continue_Tab() {
						return Click_Continue_Tab;
					}
					
					public WebElement getClick_Pick_Up_City() {
						return Click_Pick_Up_City;
					}
					
					public WebElement getClick_add_helmet() {
						return Click_add_helmet;
					}
					
					public WebElement getClick_add_helmet_extra_charges() {
						return Click_add_helmet_extra_charges;
					}
					
					public WebElement getClick_cash_on_delivery() {
						return Click_cash_on_delivery;
					}
				
					public WebElement getClick_split_payment() {
						return Click_split_payment;
					}
					
					public WebElement getClick_split_payment_i_agree_check_box() {
						return Click_split_payment_i_agree_check_box;
					}
					
					public WebElement getClick_split_make_payment_button() {
						return Click_split_make_payment_button;
					}
					
					public WebElement getClick_notification_close_button() {
						return Click_notification_close_button;
					}
					
					public WebElement getClick_pay_now_button() {
						return Click_pay_now_button;
					}
					
					public WebElement getcod_1st_available_text() {
						return cod_1st_available_text;
					}
					
					public WebElement getclick_location_pop_up_ok_button() {
						return click_location_pop_up_ok_button;
					}
					
					public WebElement getClick_back_button() { 
						return Click_back_button;
					}
					
					public WebElement getsummary_page_text() {
						return summary_page_text;
					}
					
					public WebElement getbooking_1st_only_one_vehicle_at_a_time_text() {
						return booking_1st_only_one_vehicle_at_a_time_text;
					}
//============================================= Home delivery radio buttton =======================================

					
					public WebElement getClick_home_delivery_radio_button() {
						return Click_home_delivery_radio_button;
					}
					
					public WebElement getClick_home_delivery_Address() {
						return Click_home_delivery_Address;
					}
					
					public WebElement getClick_home_delivery_landmark() {
						return Click_home_delivery_landmark;
					}
					
					public WebElement getClick_home_delivery_city() {
						return Click_home_delivery_city;
					}
					
					public WebElement getClick_home_delivery_pincode() {
						return Click_home_delivery_pincode;
					}
					
//					public WebElement get() {
//						return Click_;
//					}
//					
//					public WebElement get() {
//						return Click_;
//					}
//					
//					public WebElement get() {
//						return Click_;
//					}
//					
//					public WebElement get() {
//						return Click_;
//					}
					
					
//========================================== Home page Button =======================================================================					
					public WebElement getClick_home_page_button() {
						return Click_home_page_button;
					}
					
					public WebElement getClick_home_page_bike_rental_button() {
						return Click_home_page_bike_rental_button;
					}
					
					public WebElement getClick_home_page_Bookings_button() {
						return Click_home_page_Bookings_button;
					}
					
					public WebElement getClick_home_page_Rent_button() {
						return Click_home_page_Rent_button;
					}
					
					public WebElement getClick_home_page_More_button() {
						return Click_home_page_More_button;
					}

//======================================== Payment page methods ======================================================================
					
					public WebElement getClick_Pay_using_UPI() {
						return Click_Pay_using_UPI;
					}
					
					public WebElement getClick_Pay_using_Card() {
						return Click_Pay_using_Card;
					}
					
					public WebElement getClick_Pay_using_Wallet() {
						return Click_Pay_using_Wallet;
					}
					
					public WebElement getClick_Pay_using_amazon_pay() {
						return Click_Pay_using_amazon_pay;
					}
					
					public WebElement getClick_Pay_using_Netbanking() {
						return Click_Pay_using_Netbanking;
					}
					
					public WebElement getClick_Pay_using_SBI_bank() { 
						return Click_Pay_using_SBI_bank;
					}
					
					public WebElement getClick_pay_now_button_sbi() { 
						return Click_pay_now_button_sbi;
					}
					
					public WebElement getClick_payment_successful() { 
						return Click_payment_successful;
					}
					
					public WebElement getClick_Enter_your_UPI_ID() { 
						return Click_Enter_your_UPI_ID;
					}
					
					public WebElement getClick_view_booking() {
						return Click_view_booking;
					}
//=============================== home page booking tab bar==================================================					
					public WebElement getClick_booking_page_view_button() {
						return Click_booking_page_view_button;
					}
					
					public WebElement getClick_show_more_details() {
						return Click_show_more_details;
					}
					
					public WebElement getClick_show_less_details() {
						return Click_show_less_details;
					}
					
					public WebElement getClick_price_breakup() {
						return Click_price_breakup;
					}
					
					public WebElement getClick_Home_booking_tab_bike_image() {
						return Click_Home_booking_tab_bike_image;
					}
					
					public WebElement getClick_Home_booking_tab_bike_text() {
						return Click_Home_booking_tab_bike_text;
					}
					
					public WebElement getClick_Home_booking_tab_pickup_location_txt() {
						return Click_Home_booking_tab_pickup_location_txt;
					}
					
					public WebElement getClick_Home_booking_tab_pickup_date_txt() {
						return Click_Home_booking_tab_pickup_date_txt;
					}
					
					public WebElement getClick_Home_booking_tab_package_duration() {
						return Click_Home_booking_tab_package_duration;
					}
					
					public WebElement getClick_Home_booking_tab_dropoff_date() {
						return Click_Home_booking_tab_dropoff_date;
					}
					
					public WebElement getClick_Home_booking_tab_total_amount_paid() {
						return Click_Home_booking_tab_total_amount_paid;
					}
					
					public WebElement getClick_Home_booking_tab_booking_status() {
						return Click_Home_booking_tab_booking_status;
					}
					
					public WebElement getClick_Home_booking_tab_extend_ride() {
						return Click_Home_booking_tab_extend_ride;
					}
					
					public WebElement getClick_Home_booking_tab_extend_ride_select_package() {
						return Click_Home_booking_tab_extend_ride_select_package;
					}
					
					public WebElement getClick_Home_booking_tab_extend_ride_1_days_package() {
						return Click_Home_booking_tab_extend_ride_1_days_package;
					}
					
					public WebElement getClick_Home_booking_tab_extend_ride_verify_offers() {
						return Click_Home_booking_tab_extend_ride_verify_offers;
					}
					
					public WebElement getClick_Home_booking_tab_extend_ride_save_50_per_offer() {
						return Click_Home_booking_tab_extend_ride_save_50_per_offer;
					}
					
					public WebElement getClick_Home_booking_tab_extend_ride_extend_button() {
						return Click_Home_booking_tab_extend_ride_extend_button;
					}
					
					public WebElement getClick_Home_booking_tab_back_button() {
						return Click_Home_booking_tab_back_button;
					}
//					
//					public WebElement get() {
//						return Click_;
//					}
//===================================== more option all text method================================================
				
					public WebElement getClick_more_option_kyc_txt() {
						return Click_more_option_kyc_txt;
					}
					
					public WebElement getClick_more_option_logout_txt() {
						return Click_more_option_logout_txt;
					}
					
					public WebElement getClick_more_option_logout_yes_txt() {
						return Click_more_option_logout_yes_txt;
					}
//======================================= KYC verification page ==========================================================================					
					public WebElement getClick_driving_licence_tab() {
						return Click_driving_licence_txt;
					}
					
					public WebElement getClick_DL_upload_front_page() {
						return Click_DL_upload_front_page;
					}
					
					public WebElement getClick_DL_upload_Back_page() {
						return Click_DL_upload_Back_page;
					}
					
					public WebElement getClick_kyc_Verify_later_button() {
						return Click_kyc_Verify_later_button;
					}
					
					public WebElement getClick_kyc_next_button() {
						return Click_kyc_next_button;
					}
					
					public WebElement getClick_Aadhaar_tab_txt() {
						return Click_Aadhaar_tab_txt;
					}
					
					public WebElement getClick_initiate_aadhaar_card() {
						return Click_initiate_aadhaar_card;
					}
					
					public WebElement getClick_selfi_tab_txt() {
						return Click_selfi_tab_txt;
					}
					
					public WebElement getClick_Take_selfi_camera() {
						return Click_Take_selfi_camera;
					}
					
					public WebElement getClick_upload_photo() {
						return Click_upload_photo;
					}
					
					public WebElement getClick_more_tab_txt() {
						return Click_more_tab_txt;
					}
					
					public WebElement getCLick_voter_id() {
						return CLick_voter_id;
					}
					
					public WebElement getClick_Bank_details() {
						return Click_Bank_details;
					}
					
					public WebElement getCLick_electricity_bill() {
						return CLick_electricity_bill;
					}
					
					public WebElement getClick_rental_bill() {
						return Click_rental_bill;
					}
					
					public WebElement getCLick_other_document() {
						return CLick_other_document;
					}
					
					public WebElement getCLick_document_submit_button() {
						return CLick_document_submit_button;
					}
//============================================= Edit profile ===============================================================================
					
					public WebElement getClick_Edit_profile() {
						return Click_Edit_profile;
					}
					
					public WebElement getClick_Edit_profile_first_name() {
						return Click_Edit_profile_first_name;
					}
					
					public WebElement getClick_Edit_profile_last_name() {
						return Click_Edit_profile_last_name;
					}
					
					public WebElement getClick_Edit_profile_mobile_number() {
						return Click_Edit_profile_mobile_number;
					}
					
					public WebElement getClick_Edit_profile_email() {
						return Click_Edit_profile_email;
					}
					
					public WebElement getClick_Edit_profile_emergency_mobile_number() {
						return Click_Edit_profile_emergency_mobile_number;
					}
					
					public WebElement getClick_Edit_profile_emergency_person_name() {
						return Click_Edit_profile_emergency_person_name;
					}
					
					public WebElement getClick_Edit_profile_relation() {
						return Click_Edit_profile_relation;
					}
					
					public WebElement getClick_Edit_profile_update_button() {
						return Click_Edit_profile_update_button;
					}
					
					public WebElement getClick_Edit_profile_back_navigation_button() {
						return Click_Edit_profile_back_navigation_button;
					}
//============================================================dark theme =========================================================================

					
					public WebElement getclick_dark_theme() {
						return click_dark_theme;
					}
//========================================================================================================================					
//					public WebElement get() {
//						return Cljijij;
//					}
//					
//					public WebElement get() {
//						return Cljijij;
//					}
//					
//					public WebElement get() {
//						return Cljijij;
//					}
//					
//					public WebElement get() {
//						return Cljijij;
//					}
//					
//					public WebElement get() {
//						return Cljijij;
//					}
//					
//					public WebElement get() {
//						return Cljijij;
//					}
//					
//					public WebElement get() {
//						return Cljijij;
//					}
//					
//					public WebElement get() {
//						return Cljijij;
//					}
//					
//					public WebElement get() {
//						return Cljijij;
//					}
//					
//					public WebElement get() {
//						return Cljijij;
//					}
//					
//					public WebElement get() {
//						return Cljijij;
//					}
//					
//					public WebElement get() {
//						return Cljijij;
//					}
//					
//					public WebElement get() {
//						return Cljijij;
//					}
//					
//					public WebElement get() {
//						return Cljijij;
//					}

					public WebElement getTxt_city_front_page() {
						return txt_city_front_page;
					}

					public WebElement getTxt_1st_location_dropdown() {
						return txt_1st_location_dropdown;
					}

					public WebElement getTxt_Package_dropdown() {
						return txt_Package_dropdown;
					}

					public WebElement getTxt_calender_pickup_date() {
						return txt_calender_pickup_date;
					}

					public WebElement getTxt_calender_dropup_date() {
						return txt_calender_dropup_date;
					}

					public WebElement getOur_renting_fleet_page_txt() {
						return Our_renting_fleet_page_txt;
					}

					public WebElement getSelect_random_Bike() {
						return select_random_Bike;
					}

					public WebElement getTxt_BKD_pickup_city() {
						return txt_BKD_pickup_city;
					}

					public WebElement getTxt_BKD_pickup_location() {
						return txt_BKD_pickup_location;
					}

					public WebElement getTxt_BKD_package_duration() {
						return txt_BKD_package_duration;
					}

					public WebElement getTxt_BKD_Start_date() {
						return txt_BKD_Start_date;
					}

					public WebElement getTxt_BKD_end_date() {
						return txt_BKD_end_date;
					}

					public WebElement getCod_1st_available_text() {
						return cod_1st_available_text;
					}

					public WebElement getCod_1st_available_ok_button() {
						return click_location_pop_up_ok_button;
					}

					public WebElement getSummary_page_text() {
						return summary_page_text;
					}

					public WebElement getBooking_1st_only_one_vehicle_at_a_time_text() {
						return booking_1st_only_one_vehicle_at_a_time_text;
					}

					public WebElement getClick_dark_theme() {
						return click_dark_theme;
					}

					public WebElement getBooking_details_page_txt() {
						return booking_details_page_txt;
					}

					public WebElement getClick_Pick_up_vehicle_radio_button() {
						return Click_Pick_up_vehicle_radio_button;
					}

					public WebElement getClick_SUmmary_page_Continue_Tab() {
						return Click_SUmmary_page_Continue_Tab;
					}

					public WebElement getKYC_verification_page_title() {
						return KYC_verification_page_title;
					}

					public WebElement getUpdate_profile_MF_firstname() {
						return Update_profile_MF_firstname;
					}

					public WebElement getUpdate_profile_MF_lastname() {
						return Update_profile_MF_lastname;
					}

					public WebElement getUpdate_profile_MF_mobilenumber() {
						return Update_profile_MF_mobilenumber;
					}

					public WebElement getUpdate_profile_MF_email() {
						return Update_profile_MF_email;
					}

					public WebElement getUpdate_profile_MF_gender() {
						return Update_profile_MF_gender;
					}

					public WebElement getUpdate_profile_MF_EM_mobilenumber() {
						return Update_profile_MF_EM_mobilenumber;
					}

					public WebElement getUpdate_profile_MF_EM_name() {
						return Update_profile_MF_EM_name;
					}

					public WebElement getUpdate_profile_MF_EM_relation() {
						return Update_profile_MF_EM_relation;
					}

					public WebElement getCA_MF_firstname() {
						return CA_MF_firstname;
					}

					public WebElement getCA_MF_lastname() {
						return CA_MF_lastname;
					}

					public WebElement getCA_MF_mobilenumber() {
						return CA_MF_mobilenumber;
					}

					public WebElement getCA_MF_email() {
						return CA_MF_email;
					}

					public WebElement getCA_MF_gender() {
						return CA_MF_gender;
					}

					public WebElement getMy_profile_page_title() {
						return my_profile_page_title;
					}

					public WebElement getClick_driving_licence_txt() {
						return Click_driving_licence_txt;
					}

					public WebElement getKYC_DL_radio_button() {
						return KYC_DL_radio_button;
					}

					public WebElement getKYC_Aadhar_radio_button() {
						return KYC_Aadhar_radio_button;
					}

					public WebElement getKYC_selfi_radio_button() {
						return KYC_selfi_radio_button;
					}

					public WebElement getKYC_more_radio_button() {
						return KYC_more_radio_button;
					}

					public WebElement getFBD_booking_status_txt() {
						return FBD_booking_status_txt;
					}

					public WebElement getFBD_bike_txt() {
						return FBD_bike_txt;
					}

					public WebElement getFBD_vehicle_nummber() {
						return FBD_vehicle_nummber;
					}

					public WebElement getFBD_pick_up_date() {
						return FBD_pick_up_date;
					}

					public WebElement getFBD_drop_off_date() {
						return FBD_drop_off_date;
					}

					public WebElement getFBD_odometer_start_reading() {
						return FBD_odometer_start_reading;
					}

					public WebElement getFBD_odometer_ending_reading() {
						return FBD_odometer_ending_reading;
					}

					public WebElement getFBD_pick_up_location() {
						return FBD_pick_up_location;
					}

					public WebElement getFBD_duration() {
						return FBD_duration;
					}

					public WebElement getFBD_handover_time() {
						return FBD_handover_time;
					}

					public WebElement getFBD_drop_off_location() {
						return FBD_drop_off_location;
					}

					public WebElement getFBD_planned_drop_off_date() {
						return FBD_planned_drop_off_date;
					}

					public WebElement getFBD_Actual_drop_off_date() {
						return FBD_Actual_drop_off_date;
					}

					public WebElement getFBD_mode_of_pick_up() {
						return FBD_mode_of_pick_up;
					}

					public WebElement getFBD_address() {
						return FBD_address;
					}

					public WebElement getKYC_DL_verified_txt() {
						return KYC_DL_verified_txt;
					}

					public WebElement getClick_Aadhaar_card_Verified_txt() {
						return Click_Aadhaar_card_Verified_txt;
					}

					public WebElement getKYC_selfi_verified_txt() {
						return KYC_selfi_verified_txt;
					}

					public WebElement getClick_I_accept_checkbox() {
						return click_I_accept_checkbox;
					}

					public WebElement getClick_location_pop_up_ok_button() {
						return click_location_pop_up_ok_button;
					}

					public WebElement getUsername() {
						return username;
					}

					public WebElement getHome_city_name() {
						return home_city_name;
					}

					public WebElement getDifferent_city_name() {
						return different_city_name;
					}

					public WebElement getLocation_icon() {
						return location_icon;
					}

					public WebElement getHome_bike_tab() {
						return home_bike_tab;
					}

					public WebElement getHome_scooter_tab() {
						return home_scooter_tab;
					}

					public WebElement getAvailable_bikes() {
						return available_bikes;
					}

					public WebElement getRent_page_heading() {
						return Rent_page_heading;
					}

					public WebElement getRent_select_date_and_pickup_location() {
						return rent_select_date_and_pickup_location;
					}

					public WebElement getRent_bikes_and_scooters() {
						return rent_bikes_and_scooters;
					}

					public WebElement getRent_submit_kyc_and_document() {
						return rent_submit_kyc_and_document;
					}

					public WebElement getRent_pay_and_book_bike() {
						return rent_pay_and_book_bike;
					}

					public WebElement getRent_enjoy_ride() {
						return rent_enjoy_ride;
					}

					public WebElement getMore_button_notification() {
						return More_button_notification;
					}

					public WebElement getMore_button_Edit_Profile() {
						return More_button_Edit_Profile;
					}

					public WebElement getMore_button_split_payment() {
						return More_button_split_payment;
					}

					public WebElement getMore_button_rate_us() {
						return More_button_rate_us;
					}

					public WebElement getMore_button_KYC() {
						return More_button_KYC;
					}

					public WebElement getMore_button_terms_and_condition() {
						return More_button_terms_and_condition;
					}

					public WebElement getMore_button_privacy_policy() {
						return More_button_privacy_policy;
					}

					public WebElement getMore_button_address_book() {
						return More_button_address_book;
					}

					public WebElement getMore_button_about_us() {
						return More_button_about_us;
					}

					public WebElement getMore_button_contact_us() {
						return More_button_contact_us;
					}

					public WebElement getMore_button_invite_your_friend() {
						return More_button_invite_your_friend;
					}

					public WebElement getMore_button_faq() {
						return More_button_faq;
					}

					public WebElement getMore_button_app_version() {
						return More_button_app_version;
					}

					public WebElement getBook_now_button() {
						return book_now_button;
					}

					public WebElement getBooking_details_page_price() {
						return booking_details_page_price;
					}

					public WebElement getBooking_details_page_KM_limit() {
						return booking_details_page_KM_limit;
					}

					public WebElement getBooking_details_page_excess_km_charges() {
						return booking_details_page_excess_km_charges;
					}

					public WebElement getBooking_details_page_excess_hourly_charges() {
						return booking_details_page_excess_hourly_charges;
					}

					public WebElement getBooking_details_page_morning() {
						return booking_details_page_morning;
					}

					public WebElement getBooking_details_page_afternoon() {
						return booking_details_page_afternoon;
					}

					public WebElement getBooking_details_page_evening() {
						return booking_details_page_evening;
					}

					public WebElement getBooking_details_page_list_button() {
						return booking_details_page_list_button;
					}

					public WebElement getBooking_details_page_map() {
						return booking_details_page_map;
					}

					public WebElement getClick_home_delivery_add_address() {
						return Click_home_delivery_add_address;
					}

					public WebElement getClick_home_delivery_search_address() {
						return Click_home_delivery_search_address;
					}

					public WebElement getClick_home_delivery_confirm_location() {
						return Click_home_delivery_confirm_location;
					}

					public WebElement getClick_home_delivery_enter_name() {
						return Click_home_delivery_enter_name;
					}

					public WebElement getClick_home_delivery_enter_complete_address() {
						return Click_home_delivery_enter_complete_address;
					}

					public WebElement getClick_home_delivery_landmark_optional() {
						return Click_home_delivery_landmark_optional;
					}

					public WebElement getClick_home_delivery_save_address_details() {
						return Click_home_delivery_save_address_details;
					}

					public WebElement getClick_home_delivery_delete_address() {
						return Click_home_delivery_delete_address;
					}

					public WebElement getClick_home_delivery_yes_address() {
						return Click_home_delivery_yes_address;
					}

					public WebElement getClick_home_delivery_add_new_address_() {
						return Click_home_delivery_add_new_address_;
					}

					public WebElement getClick_home_delivery_search_address_1() {
						return Click_home_delivery_search_address_1;
					}

					public WebElement getBooking_details_page_map_button() {
						return booking_details_page_map_button;
					}

					public WebElement getSummary_bike_name_txt() {
						return summary_bike_name_txt;
					}

					public WebElement getSummary_start_date() {
						return summary_start_date;
					}

					public WebElement getSummary_end_date() {
						return summary_end_date;
					}

					public WebElement getSummary_start_time() {
						return summary_start_time;
					}

					public WebElement getSummary_end_time() {
						return summary_end_time;
					}

					public WebElement getSummary_package_duration() {
						return summary_package_duration;
					}

					public WebElement getSummary_pickup_location() {
						return summary_pickup_location;
					}

					public WebElement getSummary_km_limit() {
						return summary_km_limit;
					}

					public WebElement getSummary_excess_km_charges() {
						return summary_excess_km_charges;
					}

					public WebElement getSummary_excess_hourly_charges() {
						return summary_excess_hourly_charges;
					}

					public WebElement getSummary_rent_additional_helmet_checkbox() {
						return summary_rent_additional_helmet_checkbox;
					}

					public WebElement getSummary_coupon_code_offers() {
						return summary_coupon_code_offers;
					}

					public WebElement getSummary_package_charges() {
						return summary_package_charges;
					}

					public WebElement getSummary_delivery_charges() {
						return summary_delivery_charges;
					}

					public WebElement getSummary_discount() {
						return summary_discount;
					}

					public WebElement getSummary_total_amount() {
						return summary_total_amount;
					}

					public WebElement getSummary_Half_face_helmet() {
						return summary_Half_face_helmet;
					}

					public WebElement getSummary_Full_face_helmet() {
						return summary_Full_face_helmet;
					}

					public WebElement getSummary_coupon_page_title() {
						return summary_coupon_page_title;
					}

					public WebElement getSummary_coupon_apply() {
						return summary_coupon_apply;
					}

					public WebElement getClick_Pay_using_cardles_EMI() {
						return Click_Pay_using_cardles_EMI;
					}

					public WebElement getFBD_Booking_status() {
						return FBD_Booking_status;
					}

					public WebElement getFBD_page_title() {
						return FBD_page_title;
					}

					public WebElement getFBD_Booking_id() {
						return FBD_Booking_id;
					}

					public WebElement getClick_Home_booking_tab_track_booking_status() {
						return Click_Home_booking_tab_track_booking_status;
					}

					public WebElement getClick_Home_booking_tab_booking_status_page_tittle() {
						return Click_Home_booking_tab_booking_status_page_tittle;
					}

					public WebElement getMore_button_logout_cancel() {
						return More_button_logout_cancel;
					}

					public WebElement getFBD_end_ride() {
						return FBD_end_ride;
					}

					public WebElement getFBD_vehicle_documents() {
						return FBD_vehicle_documents;
					}

					public WebElement getFBD_end_ride_raised_request_button() {
						return FBD_end_ride_raised_request_button;
					}

					public WebElement getFBD_Invoice_button() {
						return FBD_Invoice_button;
					}

					public WebElement getClick_summary_pay_now_button() {
						return Click_summary_pay_now_button;
					}

					public WebElement getClick_home_delivery_back_button() {
						return Click_home_delivery_back_button;
					}
					

}
