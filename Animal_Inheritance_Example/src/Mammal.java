public class Mammal extends Animal{

    String birthTechnique;
    int numLimbs;

    @Override
    public String toString() {
        String str;
        str = super.toString();
        return str + "birthTechnique='" + birthTechnique + '\'' +
                ", numLimbs=" + numLimbs;
    }

    public Mammal(){
        super();        //calls the default constructor in the Animal class
        birthTechnique = "unknown";
        numLimbs = 4;
    }

    public Mammal(String genus, String bloodType, double bodyLength, String birthTechnique, int numbLimbs) {
        super(genus, bloodType, bodyLength);            //Calls the constructor overload in the class
        this.setBirthTechnique(birthTechnique);
        this.setNumLimbs(numbLimbs);
    }

    public String getBirthTechnique() {
        return birthTechnique;
    }

    public void setBirthTechnique(String birthTechnique) {
        this.birthTechnique = birthTechnique;
    }

    public int getNumLimbs() {
        return numLimbs;
    }

    public void setNumLimbs(int numLimbs) {
        this.numLimbs = numLimbs;
    }
}
