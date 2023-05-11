package com.utility;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class base_class {
	public static WebDriver driver;
	public static config_data_provider config;
	public static excel_data_provider excel;
	public static AppiumDriverLocalService service;
	public static AndroidDriver driver1 ;
	public static Logger log;
	
	@BeforeSuite
	public void  BS() throws Exception {
		config=new config_data_provider();
		excel=new excel_data_provider();
				
	}
	@BeforeTest	//(dependsOnMethods="Champion_app_install") 
	  public  void OPEN_AND_INSTALL_APP() throws MalformedURLException, Exception {
		 UiAutomator2Options cap=new UiAutomator2Options();
//		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("appium:automationName", "uiautomator2");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:deviceName", "pixel_6");//Infinix //pixel_6
		cap.setCapability("appium:udid", "emulator-5554");// 0836731257071990 //emulator-5554 //0526532038000424
		cap.setCapability("appium:avd", "Pixel_6");// if u connect real device comment this line
		cap.setCapability("appium:avdLaunchTimeout", 600000);		
		cap.setCapability("appPackage", "com.heerofreedo");
		cap.setCapability("appActivity", "com.heerofreedo.MainActivity");
		cap.setCapability("appium:noReset", "true");
		
//		cap.setCapability("appium:app",(System.getProperty("user.dir")+"\\apk\\10app-release.apk"));
//		cap.setChromedriverExecutable(System.getProperty("user.dir")+"\\apk\\chromedriver.exe");
		cap.setCapability("appium:ensureWebviewsHavePages", true);
		cap.setCapability("appium:nativeWebScreenshot", true);
		cap.setCapability("appium:newCommandTimeout", 66000);
	    
//	    URL remoteUrl = new URL("http://127.0.0.1:4723/");

	    driver1=new AndroidDriver(new URL(config.getIpAddress()),cap);
	    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    log = LogManager.getLogger("Freedo_Rentals_Apk");
	  }	

//==========================================================================================================
//	@BeforeTest
/*	public  void Champion_app_install() throws MalformedURLException {
		 UiAutomator2Options cap=new UiAutomator2Options();
		 	cap.setCapability("appium:automationName", "uiautomator2");
			cap.setCapability("platformName", "Android");
			cap.setCapability("appium:deviceName", "pixel_6");//Infinix //pixel_6
			cap.setCapability("appium:udid", "emulator-5554");// 0836731257071990 //emulator-5554 //0526532038000424
			cap.setCapability("appium:avd", "Pixel_6");// if u connect real device comment this line
			cap.setCapability("appium:avdLaunchTimeout", 600000);		
//		 	cap.setCapability("appPackage", "com.heerofreedo");
//			cap.setCapability("appActivity", "com.heerofreedo.MainActivity");
//			cap.setCapability("appium:noReset", "true");
			cap.setCapability("appium:app",(System.getProperty("user.dir")+"\\apk\\Champion-app.apk"));
			cap.setCapability("appium:ensureWebviewsHavePages", true);
			cap.setCapability("appium:nativeWebScreenshot", true);
			cap.setCapability("appium:newCommandTimeout", 66000);
			driver1=new AndroidDriver(new URL(config.getIpAddress()),cap);
		    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    log = LogManager.getLogger("Freedo_Rentals_Apk");
	}
	*/
//	@AfterTest
	public void teardown() {
//		driver1.quit();
//		service.stop();
	}	
	
//===============================================================================================================================================	
//================================================================================================================================================
    @SuppressWarnings({ "deprecation", "rawtypes" })
	public static void Scroll_UP_page_Action(String fieldname) {  	
	    try {
	    	Dimension dim = driver1.manage().window().getSize();	    	
	    	int startx = (int) (dim.width*0.5);
	    	int starty = (int) (dim.height*0.8);	    	
	    	int endx   =  (int) (dim.width*0.2);  	
	    	int endy   = (int) (dim.height*0.2);
	    	TouchAction action = new TouchAction(driver1);
	    	for(int i=0;i<=1;i++) {
	    	action.press(PointOption.point(startx ,starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(endx ,endy))
	    		.release().perform();
	    	}
	    			log.info("Successfully  Scroll up page Action "+fieldname);
	    	
	    }catch(Exception e) {		    	
					log.error("==NOT==Unable To Scroll up page Action "+fieldname);
		}	    
    }
//======================================================================================================================================================	    
    @SuppressWarnings({ "deprecation", "rawtypes" })
	public static void Scroll_down_page_Action(String fieldname) {  	
	    try {
	    	Dimension dim = driver1.manage().window().getSize();	    	
	    	int startx = (int) (dim.width*0.5);
	    	int starty = (int) (dim.height*0.2);	    	
	    	int endx   =  (int) (dim.width*0.2);  	
	    	int endy   = (int) (dim.height*0.8);
	    	TouchAction action = new TouchAction(driver1);
	    	for(int i=0;i<=1;i++) {
	    	action.press(PointOption.point(startx ,starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(endx ,endy))
	    		.release().perform();
	    	}
//	    	test.log(Status.PASS, "Successfully Scroll page Action =="+ fieldname);
	    	log.info("Successfully  Scroll page down Action "+fieldname);
	    	
	    }catch(Exception e) {		    	
//			test.log(Status.FAIL,fieldname+ "Unable To Scroll page Action =="+e);
	    	log.error("==NOT==Unable To Scroll page down Action "+fieldname);
		}	    
    }
//======================================================================================================================================================
    @SuppressWarnings({ "rawtypes", "deprecation" })
	public static void swipe_page_direction(int startx,int starty,int endx,int endy,String fieldname ) {
    	try {
    		TouchAction action = new TouchAction(driver1);
        	action.press(PointOption.point(startx ,starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(endx ,endy))
    		.release().perform();
      //  	log.info("Successfully  Swipe page direction Action "+fieldname);
    	}catch(Exception e) {		    	
    	//	log.error("==NOT==Unable To Swipe page direction Action "+fieldname);
		}	
    }
////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void android_home(String fieldname) {
		try {driver1.pressKey(new KeyEvent(AndroidKey.HOME));
			log.info("OK==Successfully click Android home "+fieldname);	
			}
		catch(Exception e) {
			log.error("==NOT==Unable To Click Android home "+fieldname);
			}
			}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////    
	public static void android_switch_app (String fieldname) 	{
		try {driver1.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
			log.info("OK==Successfully click Android switch_app "+fieldname);	
			}
		catch(Exception e) {
			log.error("==NOT==Unable To Click Android switch_app "+fieldname);
			}
			}		
///////////////////////////////////////////Android keys //////////////////////////////////////////////////////////////  	
		    public static void EnterButton() {
		    	try {
		    	driver1.pressKey(new KeyEvent(AndroidKey.ENTER));
		    	}
		    	catch(Exception e) {
		    		
		    	}
		    	
		    }
///////////////////////////////////////////Android keys //////////////////////////////////////////////////////////////  	
			public static void Back_button() {
			try {
			driver1.pressKey(new KeyEvent(AndroidKey.BACK));
			}
			catch(Exception e) {
			
			}
			
			}
	 ///////////////////////////////////////////Explicit Wait //////////////////////////////////////////////////////////////  	
    public static void Explicit_wait_for_APK(WebElement element) {
    	
    	WebDriverWait wait=new WebDriverWait(driver1,Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void Explicit_wait_for_Web(WebElement element) {
    	
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOf(element));
    }
    //====================================================================================
    public static void Browseropen() throws Exception {
    	ChromeOptions co = new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get(config.getadmin_url());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//input[@id='userName']"));	library.custom_sendkeys(ele, config.getweb_credential(), "username");
		WebElement ele1=driver.findElement(By.xpath("//input[@id='password']"));library.custom_sendkeys(ele1, config.getweb_credential(), "password");
		WebElement ele2=driver.findElement(By.xpath("//button[@title='SUBMIT']"));library.Custom_click(ele2, "Submit");
		
		Thread.sleep(1000);
    }
  
	

}



/*  Pcloudy

DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability("pCloudy_Username", "randhir.kumar@heromotocorp.com");
		 capabilities.setCapability("pCloudy_ApiKey", "2gdc5pv55mh54mqtwmvj4xbr");
		 capabilities.setCapability("pCloudy_DurationInMinutes", 15);
		 capabilities.setCapability("newCommandTimeout", 600);
		 capabilities.setCapability("launchTimeout", 90000);
		 capabilities.setCapability("pCloudy_DeviceManufacturer", "GOOGLE");
		 capabilities.setCapability("pCloudy_DeviceVersion", "13.0.0");
		 capabilities.setCapability("platformVersion", "13.0.0");
		 capabilities.setCapability("platformName", "Android");
		 capabilities.setCapability("automationName", "uiautomator2");
		 capabilities.setCapability("pCloudy_ApplicationName", "app-release.apk");
		 capabilities.setCapability("appPackage", "com.heerofreedo");
		 capabilities.setCapability("appActivity", "com.heerofreedo.MainActivity");
		 capabilities.setCapability("pCloudy_WildNet", "false");
		 capabilities.setCapability("pCloudy_EnableVideo", "true");
		 capabilities.setCapability("pCloudy_EnablePerformanceData", "true");
		 capabilities.setCapability("pCloudy_EnableDeviceLogs", "true");
		 
		 driver1 = new AndroidDriver(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);

*/
//===============================================================================================================================
/*Emulator

UiAutomator2Options cap=new UiAutomator2Options();
//DesiredCapabilities cap = new DesiredCapabilities();
cap.setCapability("appium:automationName", "uiautomator2");
cap.setCapability("platformName", "Android");
cap.setCapability("appium:deviceName", "pixel_6");//Infinix //pixel_6
cap.setCapability("appium:udid", "emulator-5554");// 0836731257071990 //emulator-5554
cap.setCapability("appium:avd", "Pixel_6");// if u connect real device comment this line
cap.setCapability("appium:avdLaunchTimeout", 600000);
cap.setCapability("appPackage", "com.heerofreedo");
cap.setCapability("appActivity", "com.heerofreedo.MainActivity");
cap.setCapability("appium:noReset", "true");
//cap.setCapability("appium:app",(System.getProperty("user.dir")+"\\apk\\app-release.apk"));
cap.setChromedriverExecutable(System.getProperty("user.dir")+"\\apk\\chromedriver.exe");
cap.setCapability("appium:ensureWebviewsHavePages", true);
cap.setCapability("appium:nativeWebScreenshot", true);
cap.setCapability("appium:newCommandTimeout", 6600);


*/


//================================================================================================================================
//@AfterClass
//public void OnlyOpenApp() throws MalformedURLException, Exception {
//	 
////	 UiAutomator2Options cap=new UiAutomator2Options();
//   DesiredCapabilities cap = new DesiredCapabilities();
//   cap.setCapability("appium:automationName", "uiautomator2");
//   cap.setCapability("platformName", "Android");
//   cap.setCapability("appium:deviceName", "pixel_4");
//   cap.setCapability("appium:udid", "emulator-5554");
////   cap.setCapability("appium:app",(System.getProperty("user.dir")+"\\apk\\app-release.apk"));
//   cap.setCapability("appium:ensureWebviewsHavePages", true);
//   cap.setCapability("appium:nativeWebScreenshot", true);
//   cap.setCapability("appium:newCommandTimeout", 3600);
//   cap.setCapability("appium:connectHardwareKeyboard", true);
//   cap.setCapability("appPackage", "com.heerofreedo");
//   cap.setCapability("appActivity", "com.heerofreedo.MainActivity");
//   cap.setCapability("appium:noReset", "true");

////   URL remoteUrl = new URL("http://127.0.0.1:4723/");
//
//   Thread.sleep(3000);
//   driver1=new AndroidDriver(new URL(config.getIpAddress()),cap);
//   driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
// }

///     Automatic Start appium server

//@BeforeTest
//public void appiumTest() throws Exception {
//	
//	Thread.sleep(2000);
//	service =new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Prathmesh\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//			.withIPAddress("127.0.0.1").usingPort(4723).build();
//	service.start();
//	
//	UiAutomator2Options opt=new UiAutomator2Options();
//	opt.setDeviceName("pixel_4");
//	opt.setApp(System.getProperty("user.dir")+"\\apk\\freedo_rentals_test.apk");
//	
//	Thread.sleep(2000);
//	driver1=new AndroidDriver(new URL("http://127.0.0.1:4723"),opt);
//	driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	
//	
//}
