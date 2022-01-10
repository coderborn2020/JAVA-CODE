//abstract class cannot be instantiated with new

public abstract class Animal {
    private String genus, bloodType;
    private double bodyLength;


    @Override
    public String toString() {
        return "genus='" + genus + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", bodyLength=" + bodyLength;
    }

    public Animal(){
        this.genus = "unknown";
        this.bloodType = "unknown";
        this.bodyLength = 1;
    }

    public Animal(String genus, String bloodType, double bodyLength) {
        this.setGenus(genus);
        this.setBloodType(bloodType);
        this.setBodyLength(bodyLength);
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setBodyLength(double bodyLength) {
        this.bodyLength = bodyLength;
    }

    public String getGenus() {
        return genus;
    }

    public String getBloodType() {
        return bloodType;
    }

    public double getBodyLength() {
        return bodyLength;
    }
}
