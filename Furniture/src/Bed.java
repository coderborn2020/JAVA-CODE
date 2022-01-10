public class Bed extends Furniture{
    char size;
    boolean mattressIncluded;
    String frameType;


    public double calcTotal(double taxRate, double discountPct){
        return .20;
    }

    public Bed() {
        super();
        size = 'L';
        mattressIncluded = false;
        frameType = "unknown";
    }

    public Bed(String material, String design, String color, double height, double length, double width, double price,
               double calcTotal, char size, boolean mattressIncluded, String frameType) {
        super(material, design, color, height, length, width, price, calcTotal);
        this.setSize(size);
        this.setMattressIncluded(mattressIncluded);
        this.setFrameType(frameType);
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public boolean isMattressIncluded() {
        return mattressIncluded;
    }

    public void setMattressIncluded(boolean mattressIncluded) {
        this.mattressIncluded = mattressIncluded;
    }

    public String getFrameType() {
        return frameType;
    }

    public void setFrameType(String frameType) {
        this.frameType = frameType;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "size=" + size +
                ", mattressIncluded=" + mattressIncluded +
                ", frameType='" + frameType + '\'' +
                '}';
    }
}
