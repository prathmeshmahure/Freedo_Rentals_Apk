package com.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class config_data_provider {
	  
	Properties pro;
	
		public config_data_provider() throws Exception {
			String path=System.getProperty("user.dir")+"\\config_data\\config.properties";
			
			FileInputStream fis=new FileInputStream(path); 
			pro=new Properties();
			pro.load(fis);
//			String IpAddress=pro.getProperty("IpAddress");
//			String port = pro.getProperty("port");
		}

				public  String getIpAddress() {
					return pro.getProperty("IpAddress");
			}
				public  String getPort() {
					return pro.getProperty("Port");
				}	
				public  String getMobile() {
					return pro.getProperty("mobile");
				}
				public  String getOTP() {
					return pro.getProperty("otp");
				}
				public  String getDeviceName() {
					return pro.getProperty("DeviceName");/////////////////
				}
				public  String getEnter_Email() {
					return pro.getProperty("Enter_Email");
				}	
				public  String getFirst_name() {
					return pro.getProperty("First_name");
				}
				public  String getLast_name() {
					return pro.getProperty("Last_name");
				}
				public  String getGender() {
					return pro.getProperty("Gender");
				}
				public  String getupi_id() {
					return pro.getProperty("upi_id");
				}
				public  String getaddress() {
					return pro.getProperty("address");
				}
				public  String getemergency_mo() {
					return pro.getProperty("emergency_mo");
				}
				public  String getadmin_url() {
					return pro.getProperty("admin_url");
				}
				public  String getweb_credential() {
					return pro.getProperty("web_credential");
				}
				public  String getweb_credential_password() {
					return pro.getProperty("web_credential_password");
				}
				public  String getstart_km_reading() {
					return pro.getProperty("start_km_reading");
				}
				public  String getend_km_reading() {
					return pro.getProperty("end_km_reading");
				}
				public  String getdate() {
					return pro.getProperty("date");
				}
				public  String getadmin_booking_check() {
					return pro.getProperty("admin_booking_check");
				}
				public  String getcity_name() {
					return pro.getProperty("CityName");
				}
				public  String getgpsaddress() {
					return pro.getProperty("gpsaddress");
				}
				public  String getPlatform_name() {
					return pro.getProperty("Platform_name");
				}
				public  String getrealdevice() {
					return pro.getProperty("realdevice");
				}
				public  String getpCloudy_DeviceManufacturer() {
					return pro.getProperty("pCloudy_DeviceManufacturer");
				}
				public  String getpCloudy_DeviceVersion() {
					return pro.getProperty("pCloudy_DeviceVersion");
				}
				
				

}
