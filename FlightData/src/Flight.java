/*
This is the Flight Info Class.
Each Flight has a:
  Number (string)
  Destination (String)
  Date (String)
  Departure Time, ex(9:30) (String)
  Arrival Time (String)
  Pilots (List)
  Passengers (List)
Three calculations methods are available:
- Calculate & return the weight of the passengers
- Calculate & return the count of adults
- Calculate & return the count of children
 */

import java.io.Serializable;
import java.util.List;

public class Flight implements Serializable {
    //instance variables
    private String flightNumber;
    private String destination;
    private String flightDate;
    private String departureTime;
    private String arrivalTime;
    private List<Pilots> flightPilots;
    private List<Passengers> flightPassengers;

    //getters

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public List<Pilots> getFlightPilots() {
        return flightPilots;
    }

    public List<Passengers> getFlightPassengers() {
        return flightPassengers;
    }

    //Setters

    public void setFlightNumber(String flightNum) {
        if(!flightNum.isEmpty()) {
            flightNumber = flightNum;
        }
        else {
            flightNumber = "Unknown";
        }
    }

    public void setDestination(String dest) {
        if(!dest.isEmpty()) {
            destination = dest;
        }
        else {
            destination = "Unknown";
        }
    }

    public void setFlightDate(String date) {
        if(!date.isEmpty()) {
            flightDate = date;
        }
        else {
            flightDate = "Unknown";
        }
    }

    public void setDepartureTime(String dTime) {
        if(!dTime.isEmpty()) {
            departureTime = dTime;
        }
        else {
            departureTime = "Unknown";
        }
    }

    public void setArrivalTime(String aTime) {
        if(!aTime.isEmpty()) {
            arrivalTime = aTime;
        }
        else {
            arrivalTime = "Unknown";
        }
    }

    public void setFlightPilots(List<Pilots> fPilots) {
        if (!(fPilots == null)) {
            flightPilots = fPilots;
        }
    }

    public void setFlightPassengers(List<Passengers> fPassengers) {
        if (!(fPassengers == null)) {
            flightPassengers = fPassengers;

        }
    }

    //default constructor (no flights)
    public Flight() {
        flightNumber = "Unknown";
        destination = "Unknown";
        flightDate = "Unknown";
        departureTime = "Unknown";
        arrivalTime = "Unknown";
    }

    //overloaded constructor, with songs

    public Flight(String flightNumber, String destination, String flightDate,
                  String departureTime, String arrivalTime, List<Pilots> flightPilots,
                  List<Passengers> flightPassengers) {
        setFlightDate(flightNumber);
        setDestination(destination);
        setFlightDate(flightDate);
        setDepartureTime(departureTime);
        setArrivalTime(arrivalTime);
        setFlightPilots(flightPilots);
        setFlightPassengers(flightPassengers);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", destination='" + destination + '\'' +
                ", flightDate='" + flightDate + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", flightPilots=" + flightPilots +
                ", flightPassengers=" + flightPassengers +
                '}';
    }

    /**
     * Uses the list of passengers to calculate the total weight of passengers.
      * @return Total weight of all passengers for the flight.
     */
    public double calcPassengerWeight() {
        double weight = 0;

        if(!(flightPassengers == null)) {
            for (Passengers p : flightPassengers) {
                weight += (p.getPassengerWeight());
            }
        }

        return weight;
    }

    /**
     * Uses the list of passengers to calculate the count of adult passengers.
     * adultChild value must be "Adult".
     * @return The count of adult passengers for the flight.
     */
    public int calcAdult() {
        int adultCtr = 0;

        if(!(flightPassengers == null)) {
            for (Passengers p : flightPassengers) {
                if (p.getAdultChild().equals("Adult")) {
                    adultCtr ++;
                }
            }
        }

        return adultCtr;
    }

    /**
     * Uses the list of passengers to calculate the count of child passengers.
     * adultChild value must be "Child".
     * @return The count of child passengers for the flight.
     */
    public int calcChild() {
        int childCtr = 0;

        if(!(flightPassengers == null)) {
            for (Passengers p : flightPassengers) {
                if (p.getAdultChild().equals("Child")) {
                    childCtr ++;
                }
            }
        }

        return childCtr;
    }
}
