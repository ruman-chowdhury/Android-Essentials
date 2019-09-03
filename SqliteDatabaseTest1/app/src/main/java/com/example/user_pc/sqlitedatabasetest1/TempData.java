package com.example.user_pc.sqlitedatabasetest1;

import java.io.Serializable;

/**
 * Created by USER-PC on 8/15/2018.
 */

public class TempData{

    private String stdId;
    private String stdName;
    private String stdEmail;



//    //empty constructor
    public TempData(){

    }

    public TempData(String stdId, String stdName, String stdEmail){
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdEmail = stdEmail;
    }



    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdEmail(){
        return stdEmail;
    }

    public void setStdEmail(String stdEmail) {
        this.stdEmail = stdEmail;
    }


}
