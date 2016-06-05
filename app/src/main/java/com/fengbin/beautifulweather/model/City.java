package com.fengbin.beautifulweather.model;

/**
 * Created by Administrator on 2016/6/5.
 */
public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int provinceId;

    public City(String cityName, String cityCode, int provinceId) {
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.provinceId = provinceId;
    }

    public City() {

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
