/*
    This is Passengers class.  Each Passenger consists of:
      Ticket Number (String)
      Name (String)
      Birthdate (String)
      Adult/Child (String)
      Weight (Double)
      Baggage (String)
 */

import java.io.Serializable;

public class Passengers implements Serializable {

    //instance variables
    private String ticketNumber;
    private String passengerName;
    private String passengerBirthdate;
    private String adultChild;
    private double passengerWeight;
    private String passengerBaggage;

    //getters


    public String getTicketNumber() {
        return ticketNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPassengerBirthdate() {
        return passengerBirthdate;
    }

    public String getAdultChild() {
        return adultChild;
    }

    public double getPassengerWeight() {
        return passengerWeight;
    }

    public String getPassengerBaggage() {
        return passengerBaggage;
    }

    //Setters

    public void setTicketNumber(String ticketNum) {
        if(!ticketNum.isEmpty()) {
            ticketNumber = ticketNum;
        }
        else {
            ticketNumber = "Unknown";
        }
    }

    public void setPassengerName(String name) {
        if(!name.isEmpty()) {
            passengerName = name;
        }
        else {
            passengerName = "Unknown";
        }
    }

    public void setPassengerBirthdate(String birthdate) {
        if(!birthdate.isEmpty()) {
            passengerBirthdate = birthdate;
        }
        else {
            passengerBirthdate = "Unknown";
        }
    }

    public void setAdultChild(String adCh) {
        if(!adCh.isEmpty()) {
            adultChild = adCh;
        }
        else {
            adultChild = "Adult";
        }
    }

    public void setPassengerWeight(double weight) {
        if (weight > 0){
            passengerWeight = weight;
        }
        else {
            passengerWeight = 1.0;
        }
    }

    public void setPassengerBaggage(String baggage) {
        if(!baggage.isEmpty()) {
            passengerBaggage = baggage;
        }
        else {
            passengerBaggage = "Unknown";
        }
    }

    //default constructor
    public Passengers() {
        ticketNumber = "Unknown";
        passengerName = "Unknown";
        passengerBirthdate = "Unknown";
        adultChild = "Unknown";
        passengerWeight = 1;
        passengerBaggage = "Unknown";
    }

    //overloaded constructor
    public Passengers(String ticketNumber, String passengerName, String passengerBirthdate,
                      String adultChild, double passengerWeight, String passengerBaggage) {
        setTicketNumber(ticketNumber);
        setPassengerName(passengerName);
        setPassengerBirthdate(passengerBirthdate);
        setAdultChild(adultChild);
        setPassengerWeight(passengerWeight);
        setPassengerBaggage(passengerBaggage);
    }

    @Override
    public String toString() {
        return "Passengers{" +
                "ticketNumber='" + ticketNumber + '\'' +
                ", passengerName='" + passengerName + '\'' +
                ", passengerBirthdate='" + passengerBirthdate + '\'' +
                ", adultChild='" + adultChild + '\'' +
                ", passengerWeight=" + passengerWeight +
                ", passengerBaggage='" + passengerBaggage + '\'' +
                '}';
    }
}
