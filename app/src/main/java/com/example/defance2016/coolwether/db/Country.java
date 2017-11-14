package com.example.defance2016.coolwether.db;

import org.litepal.crud.DataSupport;

/**
 * Created by defance2016 on 2017/11/14.
 */

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private int weatherId;
    private int cityCode;


    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCountryName(){
        return countryName;
    }
    public void setCountryName(String countryName){
        this.countryName = countryName;
    }
    public int getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(int weatherId){
        this.weatherId = weatherId;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode)
    {
        this.cityCode =cityCode;
    }
}
