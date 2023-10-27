package Store_class;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;

import io.appium.java_client.android.Activity;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Runner {

	AppiumDriverLocalService service;
    AndroidDriver driver;
	String folder_name;
	DateFormat df;
	//static String link;
	
	@BeforeTest
	public void setUpSuite() throws Exception {

	}

	@BeforeMethod
	public void prepareTest() throws IOException, InterruptedException {
       
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium:pCloudy_Username", "randhir.kumar@heromotocorp.com");//smruti.ranjan@sstsinc.com
		capabilities.setCapability("appium:pCloudy_ApiKey", "2gdc5pv55mh54mqtwmvj4xbr");//xdwh5y4kfgr5c9r3nd8ymv3y
		capabilities.setCapability("appium:pCloudy_DurationInMinutes", 10);
		capabilities.setCapability("appium:newCommandTimeout", 600);
		capabilities.setCapability("appium:launchTimeout", 90000);
	    capabilities.setCapability("appium:pCloudy_DeviceFullName", "SAMSUNG_GalaxyA10s_android_11.0.0_2a63e");//ASUS_ZenfonePegasus3_Android_6.0.0_3b209
	    //capabilities.setCapability("pCloudy_DeviceManufacturer", "GOOGLE");
		//capabilities.setCapability("pCloudy_DeviceVersion", "11.0.0");
		capabilities.setCapability("appium:platformVersion", "11.0.0");//SAMSUNG_GalaxyNote8_Android_8.0.0_55634
		capabilities.setCapability("appium:platformName", "Android");
		
		String appPath1 = "Champion.apk";
		String appPath2 =  "10app-release.apk";
		
		JsonArray jsonArray = new JsonArray();
		jsonArray.add(appPath1);
		jsonArray.add(appPath2);
		System.out.println(jsonArray.toString());
	    capabilities.setCapability("otherApps", jsonArray.toString());
		//capabilities.setCapability("pCloudy_MinVersion", "11.0.0");
		//capabilities.setCapability("pCloudy_MaxVersion", "12.0.0");
		capabilities.setCapability("appium:automationName", "uiautomator2");
	   capabilities.setCapability("pCloudy_PreBook",true);
		capabilities.setCapability("appium:pCloudy_EnableDeviceLogs",true);
		capabilities.setCapability("appium:pCloudy_EnableVideo",true);
		capabilities.setCapability("appium:pCloudy_EnablePerformanceData",true);
        capabilities.setCapability("appium:pCloudy_ApplicationName", "Champion.apk");
      //  capabilities.setCapability("pCloudy_ApplicationName", "10app-release.apk");
		capabilities.setCapability("appium:appPackage", "com.heerofreedo");//com.application.zomato
		capabilities.setCapability("appium:appActivity", "com.heerofreedo.MainActivity");//com.application.zomato.activities.Splash
		capabilities.setCapability("appium:uiautomator2ServerLaunchTimeout", 200000);
		capabilities.setCapability("appium:uiautomator2ServerInstallTimeout", 120000);
		//capabilities.setCapability("appPackage", "com.google.zxing.client.android");
		//capabilities.setCapability("appActivity", "com.google.zxing.client.android.CaptureActivity");
		//capabilities.setCapability("pCloudy_WildNet", "true");
		//capabilities.setCapability("teamName", "");
		capabilities.setCapability("appium:noSign", true);
	//	capabilities.setCapability("appiumVersion", "1.21.0");
//		HashMap<String, Object> pcloudyOptions = new HashMap<String, Object>();
//		pcloudyOptions.put("appiumVersion", "2.0.0");
//		
//		capabilities.setCapability("bstack:options", pcloudyOptions);
	driver = new AndroidDriver(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);
	
	
		


	}

	@SuppressWarnings("deprecation")
	@Test//(invocationCount=1)
	public void Test() throws IOException, InterruptedException {
		
		
		
//		Object obj = driver.executeScript("pCloudy_executeAdbCommand", "adb devices");
//	    System.out.println("@Output: " + obj);


	/*	driver.executeScript("pCloudy_enableWifi", false);
		Thread.sleep(10000);
		driver.executeScript("pCloudy_enableWifi", true);
		Thread.sleep(10000);
		driver.executeScript("pCloudy_setAndroidLocation", "48.8566","2.3522");
		 System.out.println("After script");
*/
		//Click on Accept button
		driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.pcloudy.appiumdemo:id/accept']")).click();
        captureScreenShots();//
         System.out.println("1");
         
         driver.startActivity(new Activity("com.androidsample.generalstore", "com.androidsample.generalstore.SplashActivity"));
         System.out.println("app launched");
         Thread.sleep(4000);
         
         driver.terminateApp("com.androidsample.generalstore");
         
         driver.startActivity(new Activity("com.pcloudy.appiumdemo", "com.ba.mobile.LaunchActivity"));
         System.out.println("app launched");
         
         Thread.sleep(20000);   
         
         driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.pcloudy.appiumdemo:id/accept']")).click();
         captureScreenShots();//
          System.out.println("1");
          
          
          
        //Click on Flight button
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.pcloudy.appiumdemo:id/flightButton']")).click();
       // captureScreenShots();
        System.out.println("2");
        
        Thread.sleep(2000);
      
        //Select from location
        driver.findElement(By.xpath("//android.widget.Spinner[@resource-id='com.pcloudy.appiumdemo:id/spinnerfrom']")).click();
       // captureScreenShots();
        System.out.println("3");
        Thread.sleep(2000);
        
	    driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='Bangalore, India (BLR)']")).click();
	   // captureScreenShots();
	    System.out.println("4");
	    Thread.sleep(2000);
	    
	    //Select to location
	    driver.findElement(By.xpath("//android.widget.Spinner[@resource-id='com.pcloudy.appiumdemo:id/spinnerto']")).click();
	   // captureScreenShots();
	    System.out.println("5");
	    
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='Pune, India (PNQ)']")).click();
     //   captureScreenShots();
        System.out.println("6");
        
        //Select one way trip
        driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.pcloudy.appiumdemo:id/singleTrip']")).click();
        System.out.println("7");
       
        //Select departure time
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.pcloudy.appiumdemo:id/txtdepart']")).click();
        //captureScreenShots();
        System.out.println("8");
        
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='android:id/button1' and @text='OK']")).click();
       // captureScreenShots();
        System.out.println("9");
        
        //Click on search flights button
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.pcloudy.appiumdemo:id/searchFlights']")).click();
       // captureScreenShots();
        System.out.println("10");
        
       //driver.executeScript("pCloudy_setAndroidLocation", "48.864716","2.349014");
     //  Thread.sleep(18000);
        //driver.executeScript("Capability_getVideo", true);
		
		/*
		driver.findElement(By.xpath("//*[contains(@text,'Allow')]")).click();
		driver.findElement(By.xpath("//*[contains(@text,'I'll log in later')]")).click();
		driver.findElement(By.xpath("//*[contains(@text,'Skip')]")).click();
		
		driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']")).click();*/
	//	driver.executeScript("pCloudy_injectImage", "pcloudy.png");
	}
	/*@Test
	public void print() {
	String link = (String) driver.executeScript("pCloudy_getReportLink");
	System.out.println(link);
	}
	*/
		
	@Test(enabled=false)
	public void Test2() throws IOException, InterruptedException {

		
/*
			//Click on Accept button
		driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.pcloudy.appiumdemo:id/accept']")).click();
        captureScreenShots();

        //Click on Flight button
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.pcloudy.appiumdemo:id/flightButton']")).click();
        captureScreenShots();

        //Select from location
        driver.findElement(By.xpath("//android.widget.Spinner[@resource-id='com.pcloudy.appiumdemo:id/spinnerfrom']")).click();
        captureScreenShots();
	    driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='Bangalore, India (BLR)']")).click();
	    captureScreenShots();

	    //Select to location
	    driver.findElement(By.xpath("//android.widget.Spinner[@resource-id='com.pcloudy.appiumdemo:id/spinnerto']")).click();
	    captureScreenShots();
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='Pune, India (PNQ)']")).click();
        captureScreenShots();

        //Select one way trip
        driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.pcloudy.appiumdemo:id/singleTrip']")).click();

        //Select departure time
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.pcloudy.appiumdemo:id/txtdepart']")).click();
        captureScreenShots();
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='android:id/button1' and @text='OK']")).click();
        captureScreenShots();

        //Click on search flights button
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.pcloudy.appiumdemo:id/searchFlights']")).click();
        captureScreenShots();

       //driver.executeScript("pCloudy_setAndroidLocation", "48.864716","2.349014");
     //  Thread.sleep(18000);
      *
		*/
		driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']")).click();

      
	}
	
	/*public static File base64StringToMP4(String base64String, String filePath) {
		try {
		long start = System.currentTimeMillis();
		byte[] decodedBytes = Base64.getDecoder().decode(base64String);
		File fileObject = new File(filePath);
		fileObject.createNewFile();
		FileOutputStream out = new FileOutputStream(fileObject);
		out.write(decodedBytes);
		out.close();
		System.out.println("Video Conversion: " + (System.currentTimeMillis() - start) + " ms");
		return fileObject;
		} catch (Exception e) {
		System.err.println("Exception while converting base64String to video file: " + e.getMessage());
		e.printStackTrace();
		}
		return null;
		}*/
	
	@AfterMethod
	public void endTest() throws  IOException {
		/*Object s = driver.executeScript("pCloudy_getVideo", true);
		File video = base64StringToMP4(s.toString(), "/home/radmin/Desktop/video.flv");*/
		//String link = (String) driver.executeScript("pCloudy_getReportLink");
		//System.out.println(link);
		driver.quit();
			}
	


		//Capture screenshot
	public void captureScreenShots() throws IOException {
		folder_name="screenshot";
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Date format for screenshot file name
		df=new  SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		//create dir with given folder name
		new File(folder_name).mkdir();
		//Setting file name
		String file_name=df.format(new Date())+".png";
		//copy screenshot file into screenshot folder.
		FileUtils.copyFile(f, new File(folder_name + "/" + file_name));
		

	}

	public static void main(String[] args) {
		
	}
}
