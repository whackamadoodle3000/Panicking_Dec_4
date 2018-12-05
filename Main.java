package com.MyWebsite.me.MyWebsite;

import static spark.Spark.*;
import static Kernel32.*;

public class Main{
    public static void main(String[] args) {
    	Kernel32.SYSTEM_POWER_STATUS batteryStatus = new Kernel32.SYSTEM_POWER_STATUS();
    	Kernel32.INSTANCE.GetSystemPowerStatus(batteryStatus);
    	System.out.println(batteryStatus); //Print status of battery
    	String convertedToHTML = "<html><body><h2>" + batteryStatus + "</h2></body></html>"; //makes into html
        get("/batterylife", (req, res) -> convertedToHTML); //Put Battery Life on website
    }
}
