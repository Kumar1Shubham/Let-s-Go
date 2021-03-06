package com.example.letsgo.common;

import com.example.letsgo.model.firebase.User;
import com.example.letsgo.interfaces.IFCMService;
import com.example.letsgo.interfaces.googleAPIInterface;
import com.example.letsgo.model.firebase.User;
import com.example.letsgo.retrofit.FCMClient;
import com.example.letsgo.retrofit.RetrofitClient;

public class Common {
    public static final String driver_tbl = "Drivers";
    public static final String user_driver_tbl = "DriversInformation";
    public static final String history_driver = "DriverHistory";
    public static final String history_rider = "RiderHistory";
    public static final String user_rider_tbl = "RidersInformation";
    public static final String pickup_request_tbl = "PickupRequest";
    public static final String token_tbl = "Tokens";

    public static User currentUser;
    public static String userID;

    public static Double currentLat;
    public static Double currentLng;


    public static double formulaPrice(double km, double min){
        return ConfigApp.baseFare + (ConfigApp.distanceRate * km) + (ConfigApp.timeRate * min);
    }

}
