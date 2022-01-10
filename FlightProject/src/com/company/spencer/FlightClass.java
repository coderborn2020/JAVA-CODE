package com.company.spencer;

import java.util.Arrays;

public class FlightClass {
    private String flightNum;
    private String destination;
    private String flightDate;
    private String departTime;
    private String arrivalTime;




    public FlightClass(String flightNum, String destination, String flightDate, String departTime, String arrivalTime) {
        this.flightNum = flightNum;
        this.destination = destination;
        this.flightDate = flightDate;
        this.departTime = departTime;
        this.arrivalTime = arrivalTime;
    }

    public FlightClass(){
        flightNum = "112233";
        destination = "SanFranSisco";
        flightDate = "10/22/2022";
        departTime = "10/21/2022";
        arrivalTime = "10/23/2022";

    }


    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        if(flightNum.isEmpty()){
            this.flightNum = flightNum;
        }
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }


    @Override
    public String toString() {
        return "FlightClass{" +
                "flightNum='" + flightNum + '\'' +
                ", destination='" + destination + '\'' +
                ", flightDate='" + flightDate + '\'' +
                ", departTime='" + departTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                '}';
    }
}