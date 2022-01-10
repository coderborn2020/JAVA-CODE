import javax.naming.InvalidNameException;

public abstract class Car {
    protected String make, model, color;
    protected int year, weight;
    public abstract double CalcCostPerFill(double pumpCost) throws InvalidCar, Exception;


    public Car() throws InvalidCar, Exception {
        make = "Truck";
        model = "XM20";
        color = "Black";
        year = 2020;
        weight = 2000;
        CalcCostPerFill(10.00);
    }

    /**
     *
     * @param make type of vehicle
     * @param model type of model
     * @param color type of color
     * @param year type of year
     * @param weight amount of weight
     */

    public Car(String make, String model, String color, int year, int weight, double pumpCost) throws InvalidCar, Exception {
        setMake(make);
        setModel(model);
        setColor(color);
        setYear(year);
        setWeight(weight);
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.weight = weight;
        this.CalcCostPerFill(pumpCost);
    }



    public String getMake() {
        return make;
    }

    public void setMake(String make) throws InvalidCar {
        if (make.isEmpty()){
            System.out.println("Make is required");
            throw (new InvalidCar());
        }
        else{
            this.make = make;
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) throws InvalidCar {
        if (model.isEmpty()){
            System.out.println("model is required");
            throw (new InvalidCar());
        }
        else{
            this.model = model;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) throws InvalidCar {
        if (color.isEmpty()){
            System.out.println("color is required");
            throw (new InvalidCar());
        }
        else{
            this.color = color;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws InvalidCar {
        if (year == 0){
            System.out.println("year is incorrect");
            throw (new InvalidCar());
        }
        else{
            this.year = year;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) throws InvalidCar {
        if (weight < 500){
            System.out.println("weight is too low");
            throw (new InvalidCar());
        }
        else{
            this.weight = weight;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", weight=" + weight +
                '}';
    }
}
