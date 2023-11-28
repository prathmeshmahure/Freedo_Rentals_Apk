package freedodomain;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.pageobject.BookingPage;
import com.pageobject.LaunchLogin;
import com.utility.BaseClass;

@Listeners(com.utility.listner.class)
public class appium_1 extends BaseClass{
	public BookingPage book;
	public LaunchLogin login;
	public static ExtentTest test;
	
//========================================== Booking page =========================================================
		@Test(priority=1)
		public void TC_0024_Verify_home_page_all_elements()  {
		book = new BookingPage(driver1);
		log.info("***************TC_0024_Verify_home_page_all_elements starts*****************");		
		
			book.verifyHomePageCityNameAndUsername();
			book.verifyHomePageLocationIcon();
			book.verifyEnterAerrowAndDifferentCity();
			book.verifyBikeAndScooterTab();
			book.verifyAllFooterElements();
		}	
//===================================================================================================================	
	//@Test(dependsOnMethods={"TC_0024_Verify_home_page_all_elements"})
		@Test(priority=2)
		public void TC_0025_Verify_available_all_bikes() throws Exception {
		log.info("***************TC_0025_Verify_available_all_bikes starts*****************");
			
			book.clickOnEnterAerrowButton();
			book.clickDatePackageAndGoFreedoButton();
			book.verifyOurRentingFleetPageTitle();	
			book.clickBikeTabAndGetAvailableBikes();
	}
//=================================================================================================================
	//@Test(dependsOnMethods={"TC_0025_Verify_available_all_bikes"})
		@Test(priority=3)
		public void TC_0026_Verify_available_all_Scooters() throws Exception {
		log.info("***************TC_0026_Verify_available_all_Scooters starts*****************");
		
			book.clickScooterTabAndGetAvailableScooters();
	}
//================================================================================================================	
//	@Test(dependsOnMethods={"TC_0026_Verify_available_all_Scooters"})
		@Test(priority=4)
		public void TC_0027_Verify_homepage_bike_rentals_tab_available_bike() throws Exception {
		log.info("***************TC_0027_Verify_homepage_bike_rentals_tab_available_bike starts*****************");
		
			book.clickOnHomeButton();
			book.clickOnBikeRentalButton();
			book.clickBikeTabAndGetAvailableBikes();
			book.clickScooterTabAndGetAvailableScooters();
	}
//================================================================================================================	
	//@Test(dependsOnMethods={"TC_0027_Verify_homepage_bike_rentals_tab_available_bike"})
		@Test(priority=5)
		public void TC_0028_Verify_Rent_tab_all_elements()  {
		log.info("***************TC_0028_Verify_Rent_tab_all_elements starts*****************");
			
			book.clickOnHomeButton();
			book.clickHomePageRentButton();
			book.verifyRentalProcess();
		}
//===============================================================================================================	
	//@Test(dependsOnMethods={"TC_0028_Verify_Rent_tab_all_elements"})
		@Test(priority=6)
		public void TC_0029_Verify_freedo_rental_icon() throws Exception {
		log.info("***************TC_0029_Verify_freedo_rental_icon starts*****************");
		
			book.clickOnHomeButton();
	}
//==================================================================================================================
	//@Test(dependsOnMethods={"TC_0029_Verify_freedo_rental_icon"})
		@Test(priority=7)
		public void TC_0030_Verify_more_button_all_elements() throws Exception {
		log.info("***************TC_0030_Verify_more_button_all_elements starts*****************");

			book.clickOnHomePageMoreButton();
			book.verifyMoreButtonAllElements();
		}
//====================================================================================================================
	//@Test(dependsOnMethods={"TC_0030_Verify_more_button_all_elements"})
		@Test(priority=8)
		public void TC_0031_Verify_Booking_elements() throws Exception {
		log.info("***************TC_0031_Verify_Booking_elements starts*****************");
		
			book.clickOnHomeButton();
			book.clickOnHomePageBookingsButton();
			book.verifyBookingHistory();
		}
//======================================================================================================================	
	//@Test(dependsOnMethods={"TC_0031_Verify_Booking_elements"})
		@Test(priority=9)
		public void TC_0032_Verify_change_city() throws Exception {
		login = new LaunchLogin(driver1);
		log.info("***************TC_0032_Verify_change_city starts*****************");
		
			book.clickOnHomeButton();
			book.clickOnDifferentCity();
			login.verifyAndClicklocationNotification();
			login.clickSelectedCityName();
	}
//======================================================================================================================
	//@Test(dependsOnMethods={"TC_0032_Verify_Booking_elements"})
		@Test(priority=10)
		public void TC_0033_Verify_Bike_button_on_homepage() {
		log.info("***************TC_0033_Verify_Bike_button_on_homepage starts*****************");
		
			book.verifyBikeTabStatus();			
			book.verifyBikeImagesScroll();
			}
//======================================================================================================================	
	//@Test(dependsOnMethods={"TC_0033_Verify_Bike_button_on_homepage"})
		@Test(priority=11)
		public void TC_0034_Verify_scooter_button_on_homepage()  {
		log.info("***************TC_0034_Verify_scooter_button_on_homepage starts*****************");
		
			book.clickOnScooterTabAndCheckStatus();
			book.verifyScooterImagesScroll();
	}
//=====================================================================================================================	
	//@Test(dependsOnMethods={"TC_0034_Verify_scooter_button_on_homepage"})
		@Test(priority=12)
		public void TC_0035_Verify_user_able_to_select_date_and_package_under_booking()  {
		log.info("***************TC_0035_Verify_user_able_to_select_date_and_package_under_booking starts*****************");
		
			book.clickOnHomeBikeTab();
			book.clickOnBookNowButton();
			book.clickDatePackageAndGoFreedoButton();
			book.clickOnLocationPopUpOkButton();
			book.verifyBikePrice();
	}
//======================================================================================================================
	//@Test(dependsOnMethods={"TC_0035_Verify_user_able_to_select_date_and_package_under_booking"})
		@Test(priority=13)
		public void TC_0036_Verify_booking_details_page_all_elements()  {
		log.info("***************TC_0036_Verify_booking_details_page_all_elements starts*****************");
		
			book.verifyBookingDetailsPage();
	}
//===========================================================================================================================
	//@Test(dependsOnMethods={"TC_0036_Verify_booking_details_page_all_elements"})
		@Test(priority=14)
		public void TC_0037_Verify_user_able_to_select_home_delivery() throws Exception {
		log.info("***************TC_0037_Verify_user_able_to_select_home_delivery starts*****************");
		
			book.clickOnHomeDeliveryRadioButton();
			book.homeDeliveryPageScroll();
			book.clickOnAddAddress();
			book.enterHomeDeliveryAddress(config.getgpsaddress(), config.getFirst_name(), config.getPort());
			book.clickOnDeleteAddress();
			book.clickOnAddNewAddress();
	}
//=========================================================================================================================	
	//@Test(dependsOnMethods={"TC_0037_Verify_user_able_to_select_date_and_package_under_booking_all_elements_using_home_delivery"})
		@Test(priority=15)
		public void TC_0038_Verify_user_able_to_select_time_slot_afternoon() throws Exception {
		log.info("***************TC_0038_Verify_user_able_to_select_time_slot_afternoon starts*****************");
		
			book.clickOnHomeButton();
			book.clickOnEnterAerrowButton();
			book.clickDatePackageAndGoFreedoButton();
			book.clickOnBookNowButton();
			book.clickOnLocationPopUpOkButton();
			book.clickOnAfternoonTimeSlot();
	}
//==============================================================================================================================	
	//@Test(dependsOnMethods={"TC_0038_Verify_user_able_to_select_time_slot_afternoon"})
		@Test(priority=16)
		public void TC_0039_Verify_user_able_to_select_time_slot_Evening() throws Exception {
		log.info("***************TC_0039_Verify_user_able_to_select_time_slot_Evening starts*****************");
		
			book.clickOnEveningTimeSlot();
	}
//========================================================================================================================
	//@Test(dependsOnMethods={"TC_0039_Verify_user_able_to_select_time_slot_Evening"})
		@Test(priority=17)
		public void TC_0040_Verify_user_able_to_select_time_slot_Morning() throws Exception {
		log.info("***************TC_0040_Verify_user_able_to_select_time_slot_Morning starts*****************");
		
			book.clickOnMorningTimeSlot();
		}
//=================================================================================================================================
	//@Test(dependsOnMethods={"TC_0040_Verify_user_able_to_select_time_slot_Morning"})
		@Test(priority=18)
		public void TC_0041_Verify_user_able_to_click_list_button() throws Exception {
		log.info("***************TC_0041_Verify_user_able_to_click_list_button starts*****************");
		
			book.clickOnListButton();
			book.verifyMapButton();
	}
//==================================================================================================================================	
//	@Test(dependsOnMethods={"TC_0041_Verify_user_able_to_click_list_button"})
		@Test(priority=19)
		public void TC_0042_Verify_select_city() throws Exception {
		log.info("***************TC_0042_Verify_select_city starts*****************");
		
			book.clickOnHomeButton();
			book.clickOnDifferentCity();
			login.verifyAndClicklocationNotification();
			login.clickSelectedCityName();
	}
//==================================================================================================================
	//@Test(dependsOnMethods={"TC_0042_Verify_select_automation_city"})
		@Test(priority=20)
		public void TC_0043_Verify_continue_button_and_summary_page() throws Exception {
		log.info("***************TC_0043_Verify_continue_button_and_summary_page starts*****************");
		
			book.clickOnEnterAerrowButton();
			book.clickDatePackageAndGoFreedoButton();
			book.clickOnBookNowButton();
			book.clickOnLocationPopUpOkButton();
			book.clickOnContinueButton();
			book.verifySummaryPageDetails();
			book.verifyPackageChargesDetails();
			book.verifyCODCheckboxStatusAndPaynowButton();	
		}
//===================================================================================================================	
	//@Test(dependsOnMethods={"TC_0043_Verify_continue_button_and_summary_page"})
		@Test(priority=21)
		public void TC_0044_Verify_summary_page_additional_helmet_charges() throws Exception {
		log.info("***************TC_0044_Verify_summary_page_additional_helmet_charges starts*****************");
		
			book.verifyAdditionalHelmetCharges();
			book.verifyPackageChargesDetails();	
		}
//======================================================================================================================
	//@Test(dependsOnMethods={"TC_0044_Verify_summary_page_additional_helmet_charges"})
		@Test(priority=22)
		public void TC_0045_Verify_summary_page_coupon_code() throws Exception {
		log.info("***************TC_0045_Verify_summary_page_coupon_code starts*****************");
		
			book.verifyApplyCouponCode();
			book.verifyPackageChargesDetails();	
		}
//=========================================================================================================================	
	//@Test(dependsOnMethods={"TC_0045_Verify_summary_page_coupon_code"})
		@Test(priority=23)
		public void TC_0046_Verify_summary_page_cash_on_delivery_method() throws Exception {
		log.info("***************TC_0046_Verify_summary_page_cash_on_delivery_method starts*****************");
		
			book.clickOnCODBooking();
		}
//===========================================================================================================================	
	//@Test(dependsOnMethods={"TC_0046_Verify_summary_page_cash_on_delivery_method"})
		@Test(priority=24)
		public void TC_0047_Verify_summary_page_pay_now_button_status() throws Exception {
		log.info("***************TC_0047_Verify_summary_page_pay_now_button_status starts*****************");
		
			book.verifySummaryPagePaynowButton();
	}
//============================================================================================================================	
	//@Test(dependsOnMethods={"TC_0047_Verify_summary_page_i_accept_checkbox"})
		@Test(priority=25)
		public void TC_0048_Verify_summary_page_pay_now_button() throws Exception {
		log.info("***************TC_0048_Verify_summary_page_pay_now_button starts*****************");
		
			book.clickOnSummaryPagePaynowButton();
			book.verifyWalletPaymentOption();
	}
//============================================================================================================================
	//@Test(dependsOnMethods={"TC_0048_Verify_summary_page_pay_now_button"})
		@Test(priority=26)
		public void TC_0049_Verify_user_able_to_make_payment() throws Exception {
		log.info("***************TC_0049_Verify_user_able_to_make_payment starts*****************");
		
			book.clickOnNetbankingPaymentOption();
			book.clickOnBankAndDoPayment();
			book.clickOnPaymentSuccessful();	
		}
//=============================================================================================================================
	//@Test(dependsOnMethods={"TC_0049_Verify_user_able_to_make_payment"})
		@Test(priority=27)
		public void TC_0050_Verify_user_able_to_view_booking_status() throws Exception {
		log.info("***************TC_0050_Verify_user_able_to_view_booking_status starts*****************");
		
			book.verifyBookingStatus();
		
	}
//=============================================================================================================================	
	//@Test(dependsOnMethods={"TC_0050_Verify_user_able_to_view_booking_status"})
		@Test(priority=28)
		public void TC_0051_Verify_user_able_to_view_booking_status_all_elements() throws Exception {
		log.info("***************TC_0051_Verify_user_able_to_view_booking_status_all_elements starts*****************");
	
			book.verifyFullBookingDetails();
			book.clickOnShowLessText();
			book.verifyPriceBreakup();
	}
//============================================================================================================================	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
