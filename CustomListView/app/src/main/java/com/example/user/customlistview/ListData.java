package com.example.user.customlistview;

/**
 * It's a model class.
 * It will hold data for displaying in the list
 */

public class ListData {

    String countryName;
    int countryFlag;

    public ListData(String cName, int cFlag) {
        this.countryName=cName;
        this.countryFlag=cFlag;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCountryFlag() {
        return countryFlag;
    }

    public void setCountryFlag(int countryFlag) {
        this.countryFlag = countryFlag;
    }
}
