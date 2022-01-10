import java.io.Serializable;

/*
 *  This is the Pilots class.
 *  Each Pilot has a:
    Certificate Number (String)
    Name (String)
    Cell Phone (String)
 */
public class Pilots implements Serializable {
    private String pilotCertificateNumber;
    private String pilotName;
    private String pilotCellPhone;

    //getters

    public String getPilotCertificateNumber() {
        return pilotCertificateNumber;
    }

    public String getPilotName() {
        return pilotName;
    }

    public String getPilotCellPhone() {
        return pilotCellPhone;
    }

    //setters

    public void setPilotCertificateNumber(String certificateNumber) {
        if(!certificateNumber.isEmpty()) {
            pilotCertificateNumber = certificateNumber;
        }
        else {
            pilotCertificateNumber = "Unknown";
        }
    }

    public void setPilotName(String name) {
        if(!name.isEmpty()) {
            pilotName = name;
        }
        else {
            pilotName = "Unknown";
        }
    }

    public void setPilotCellPhone(String cellPhone) {
        if(!cellPhone.isEmpty()) {
            pilotCellPhone = cellPhone;
        }
        else {
            pilotCellPhone = "Unknown";
        }
    }

    //default constructor
    public Pilots() {
        pilotCellPhone = "Unknown";
        pilotCertificateNumber = "Unknown";
        pilotName = "Unknown";
    }

    //overloaded constructor
    public Pilots(String certificateNumber, String name, String cellPhone) {
        setPilotCertificateNumber(certificateNumber);
        setPilotName(name);
        setPilotCellPhone(cellPhone);
    }

    @Override
    public String toString() {
        return "Pilots{" +
                "pilotCertificateNumber='" + pilotCertificateNumber + '\'' +
                ", pilotName='" + pilotName + '\'' +
                ", pilotCellPhone='" + pilotCellPhone + '\'' +
                '}';
    }
}
