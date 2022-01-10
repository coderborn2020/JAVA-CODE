public class Table extends Furniture {
    int numLegs;
    boolean extendable;

    public double calcTotal(double taxRate, double discountPct){
        taxRate = (taxRate * discountPct);
        return taxRate;
    }

    public Table() {
        numLegs = 4;
        extendable = true;
    }

    public Table(int numLegs, boolean extendable) {
        this.numLegs = numLegs;
        this.extendable = extendable;
    }


    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public boolean isExtendable() {
        return extendable;
    }

    public void setExtendable(boolean extendable) {
        this.extendable = extendable;
    }


    @Override
    public String toString() {
        return "Table{" +
                "numLegs=" + numLegs +
                ", extendable=" + extendable +
                '}';
    }


}
