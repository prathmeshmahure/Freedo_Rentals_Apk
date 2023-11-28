package freedodomain;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.pageobject.BookingPage;
import com.pageobject.ChampionApp;
import com.pageobject.LaunchLogin;
import com.pageobject.WebAdmin;
import com.utility.BaseClass;
@Listeners(com.utility.listner.class)
public class TEST extends BaseClass {
	public LaunchLogin login;
	public BookingPage book;
	public ChampionApp champ;
	public WebAdmin admin;
	public static ExtentTest test;

		
	@Test(priority=0)
	public void TC_002_verify_select_pickup_location_date_and_packages() throws Exception {
		login = new LaunchLogin(driver1);
		book = new BookingPage(driver1);
		admin = new WebAdmin(driver1);
		
		
		admin.verifyAdminLogin(config.getweb_credential(), config.getweb_credential_password(), null);
		
		
		
		
		
}
}
			//login.verifyInstallApk();
			//login.verifyPickUpLocation();
			//login.verifySlideIndicator();
			//login.verifyNextButton1();
			//login.verifySkipButton1();
			//login.clickNextButton1();
			//login.verifySlideIndicator2();
			//login.verifySecondPageOnboardingTittle();
			//login.verifySkipButton2();
			//login.clickNextButton2();
			//login.verifySlideIndicator3();
			//login.verifyThirdPageOnboardingTittle();
			//login.verifyThirdPageAllSlideIndicatorStatus();
			//login.verifyAndClickDoneButton();
			//login.verifyLoginHeading();
			//login.verifyMobileIconAndIndianCode();
			//login.verifyLoginComponent();
			//login.enterMobileNumber(config.getMobile());
			//login.clickCreateAccountLink();
			//login.clickLoginButtonOnCreateAccountPage();
			//login.clickCreateAccountLink();
			//login.verifyCreateAccountAllComponents();
			//login.verifyAndEnterFirstName(config.getFirst_name());
			//login.verifyAndEnterLastName(config.getLast_name());
			//login.verifyMFMobileNumber();
			//login.verifyAndEnterEmailId(config.getEnter_Email());
			//login.verifyAndClickAllGender();
			//login.verifyIAcceptCheckBox();
			//login.verifyTermsAndCondition();
			//login.verifyLoginButtonLinkOnCAPage();
			//login.verifyCreateAnAccountButtonStatus();
			//login.clickAndVerifyTermsAndCondition();
			//login.verifyTermsAndConditionPageInfo();
			//login.clickTermsAndConditionBackButton();
			//login.clickAndVerifyPrivacyPolicy();
			//login.clickAndVerifyPrivacyPolicyDropDown();
			//login.clickPrivacyPolicyBackButton();
			//login.clickCreateAnAccountButton();
			//login.verifyOtpVerificationTime();
			//login.verifyOtpVerificationComponent();
			//login.enterOtp(config.getOTP());
			//login.verifyAndClickDontAllowNotification();
			//login.verifyAndClicklocationNotification();
			//login.verifyUserSelectCityPage();
			//login.verifyAndEnterSearchCity();
			//login.verifySelectedCityNotAvailable();
			//login.verifyAndEnterValidSearchCity(config.getcity_name());
			//login.verifySelectedCityName(config.getcity_name());
			//login.clickSelectedCityName();
			//login.verifyAndClickDontAllowLocation();