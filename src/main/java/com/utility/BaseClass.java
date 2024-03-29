package com.utility;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.bytebuddy.utility.RandomString;
@Listeners(com.utility.listner.class)
public class BaseClass {
	public static WebDriver driver;
	public static ConfigDataProvider config;
	public static ExcelDataProvider excel;
	public static AppiumDriverLocalService service;
	public static AndroidDriver driver1 ;
	public static Logger log;
	public static DesiredCapabilities capabilities;
	public static UiAutomator2Options cap;
	
	@BeforeSuite
	public void  BS() throws Exception {
		config=new ConfigDataProvider();
		excel=new ExcelDataProvider();
				
	}
	
//=============================================================================================================================
	@BeforeTest		
	  public  void OPEN_AND_INSTALL_APP() throws MalformedURLException, Exception {
		
			String Device_name = config.getPlatform_name();
			if(Device_name.equalsIgnoreCase("emulator")) {
				try {
		 
					// cap = new UiAutomator2Options();
					DesiredCapabilities cap = new DesiredCapabilities();
					cap.setCapability("appium:automationName", "uiautomator2");
					cap.setCapability("platformName", "Android");
					cap.setCapability("appium:deviceName", "pixel_6");//Infinix //pixel_6
					cap.setCapability("appium:udid", "emulator-5554");// 0836731257071990 //emulator-5554 //0526532038000424
					cap.setCapability("appium:avd", "Pixel_6");// if u connect real device comment this line
					cap.setCapability("appium:avdLaunchTimeout", 600000);	
					cap.setCapability("appPackage", "com.heerofreedo");               //Champion
					cap.setCapability("appActivity", "com.heerofreedo.MainActivity"); //Champion
					cap.setCapability("appium:noReset", "false");
					
					cap.setCapability("appium:app",(System.getProperty("user.dir")+"/src/test/resources/apk/FreedoRentals.apk"));
					cap.setCapability("appium:ensureWebviewsHavePages", true);
					cap.setCapability("appium:nativeWebScreenshot", true);
					cap.setCapability("appium:newCommandTimeout", 66000);
				    driver1=new AndroidDriver(new URL(config.getIpAddress()),cap);
				//    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				    log = LogManager.getLogger("FreedoRentalsApk");
				    log.info(" =============== /= Freedo Rentals Mobile App Automation Report =/ ==================  ");
					} 
					catch (Exception e) {
					System.out.println(e);
					}
				
			  }	
			//========================== *******  Pcloudy =========================
			else if(Device_name.equalsIgnoreCase("pcloudy")) {
			 try {
				 String b="SAMSUNG_GalaxyS20Ultra_Android_13.0.0_fbb18";
				 	UiAutomator2Options capabilities = new UiAutomator2Options();					
					//DesiredCapabilities capabilities = new DesiredCapabilities();
					 capabilities.setCapability("pCloudy_Username", "randhir.kumar@heromotocorp.com");
					 capabilities.setCapability("pCloudy_ApiKey", "2gdc5pv55mh54mqtwmvj4xbr");
					 capabilities.setCapability("pCloudy_DurationInMinutes", 25);
					 capabilities.setCapability("newCommandTimeout", 600);
					 capabilities.setCapability("launchTimeout", 90000);
					 capabilities.setCapability("pCloudy_DeviceManufacturer", config.getpCloudy_DeviceManufacturer());
					 capabilities.setCapability("pCloudy_DeviceVersion",config.getpCloudy_DeviceVersion());
					 capabilities.setCapability("platformVersion", config.getpCloudy_DeviceVersion());
					// capabilities.setCapability("pCloudy_DeviceFullName", b);					
					 capabilities.setCapability("platformName", "Android");
					 capabilities.setCapability("automationName", "uiautomator2");
					 capabilities.setCapability("pCloudy_ApplicationName", "FreedoRentals.apk"); //freedo									 
					 capabilities.setCapability("appPackage", "com.heerofreedo");
					 capabilities.setCapability("appActivity", "com.heerofreedo.MainActivity");
					 capabilities.setCapability("pCloudy_WildNet", "false");
					 capabilities.setCapability("pCloudy_EnableVideo", "true");
					 capabilities.setCapability("pCloudy_EnablePerformanceData", "true");
					 capabilities.setCapability("pCloudy_EnableDeviceLogs", "true"); 
					 driver1 = new AndroidDriver(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);
				//		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
					    log = LogManager.getLogger("FreedoRentalsApk");
					    log.info(" =============== /= Freedo Rentals Mobile App Automation Report =/ ==================  ");					
				  }
			 		catch (Exception e) {			 			
						System.out.println("Device not found "+e);
							}
			}
			//========================== *******  Real device =========================
			else if(Device_name.equalsIgnoreCase("realdevice")) {
				try {
					 
					 cap = new UiAutomator2Options();
					//	DesiredCapabilities cap = new DesiredCapabilities();
					cap.setCapability("appium:automationName", "uiautomator2");
					cap.setCapability("platformName", "Android");
					cap.setCapability("appium:deviceName", "Infinix");//Infinix //pixel_6
					cap.setCapability("appium:udid",config.getrealdevice());// 0836731257071990 //emulator-5554 //0526532038000424 //192.168.1.13:5555
					cap.setCapability("appium:avdLaunchTimeout", 600000);		
					cap.setCapability("appPackage", "com.heerofreedo");               //freedo
					cap.setCapability("appActivity", "com.heerofreedo.MainActivity"); //freedo
					cap.setCapability("appium:noReset", "false");
					
					cap.setCapability("appium:app",(System.getProperty("user.dir")+"/src/test/resource/apk/FreedoRentals.apk"));
					cap.setCapability("appium:ensureWebviewsHavePages", true);
					cap.setCapability("appium:nativeWebScreenshot", true);
					cap.setCapability("appium:newCommandTimeout", 660000);
				    driver1=new AndroidDriver(new URL(config.getIpAddress()),cap);
				    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				    log = LogManager.getLogger("FreedoRentalsApk");
				    log.info(" =============== /= Freedo Rentals Mobile App Automation Report =/ ==================  ");
					} 
					catch (Exception e) {
					System.out.println(e);
					}
			  }
			}
	
//==========================================================================================================

	@BeforeMethod
	public void logger() {
		 log.info(" ===================================================================================  ");
		 log.info(" =================================================================================== ");
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
    @SuppressWarnings("deprecation")
	public static void scrollByText(String menuText) {

    	 try {
    		 Thread.sleep(1000);
    	 driver1.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + menuText + "\").instance(0));")); 
    	 } catch (Exception e) {
    		 log.error("==NOT==Unable To Scroll By text "+menuText);
        	 driver1.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + menuText + "\").instance(0));")); 

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
		WebElement ele=driver.findElement(By.xpath("//input[@id='userName']"));	Library.custom_sendkeys(ele, config.getweb_credential(), "username");
		WebElement ele1=driver.findElement(By.xpath("//input[@id='password']"));Library.custom_sendkeys(ele1, config.getweb_credential_password(), "password");
		WebElement ele2=driver.findElement(By.xpath("//button[normalize-space()='Login']"));Library.Custom_click(ele2, "Login");
		
		Thread.sleep(1000);
    }
  //==========================================================================================
    public void Basecapture(String filename) {
    	String str = RandomString.make(3);
		TakesScreenshot ts=(TakesScreenshot)driver ;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshots/Fail/"+str+filename);
		try {
			FileUtils.copyFile(source, destination);
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
	//================================================================================================
   public static void chromeapp_launchreset() throws MalformedURLException {
	   
	   DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("appium:automationName", "uiautomator2");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:deviceName", "pixel_6");//Infinix //pixel_6
		cap.setCapability("appium:udid", "emulator-5554");// 0836731257071990 //emulator-5554 //0526532038000424
		cap.setCapability("appium:avd", "Pixel_6");// if u connect real device comment this line
		cap.setCapability("appium:avdLaunchTimeout", 600000);
		cap.setCapability("appium:adbExecTimeout", "60000");
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		cap.setCapability("appium:noReset", "false");   
		
		driver1=new AndroidDriver(new URL(config.getIpAddress()),cap);
	   
   }
   //=====================================================================================================
   @SuppressWarnings("deprecation")
public static void championapp_activity() throws MalformedURLException {
	   
	   try {
		   Activity activity = new Activity("com.freedoadmin", "com.freedoadmin.MainActivity");
       activity.setStopApp(false);
       ((AndroidDriver) driver1).startActivity(activity);
       log.info("Champion app activity start");
	   }
	   catch(Exception e) {
		   log.error("Unable to start Champion app activity");
	   }
   }
 //=====================================================================================================
   @SuppressWarnings("deprecation")
public static void freedoapp_activity() throws MalformedURLException {
	   
	   try {
		   Activity activity = new Activity("com.heerofreedo", "com.heerofreedo.MainActivity");
       activity.setStopApp(false);
       ((AndroidDriver) driver1).startActivity(activity);
       log.info("Freedo app activity start");
	   }
	   catch(Exception e) {
		   log.error("Unable to start Freedo app activity");
	   }
   }
   
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////




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
