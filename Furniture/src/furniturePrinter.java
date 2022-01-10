import java.util.ArrayList;
import java.util.List;

public class furniturePrinter {
    static List<Furniture> objList = new ArrayList<Furniture>();

    public static void main(String[] args){
        Table table1 = new Table();
        Bed bed1 = new Bed();
        Furniture furniture1 = new Furniture() {
            @Override
            public double calcTotal(double taxRate, double discountPct) {
                return 0;
            }
        };


        objList.add(table1);
        objList.add(bed1);
        objList.add(furniture1);
        displayTable((Table) objList.get(0));
        displayBed((Bed) objList.get(1));
        displayFurniture(objList.get(2));

    }
    public static void displayTable(Table t){
        System.out.println(t.toString());
    }

    public static void displayBed(Bed b){
        System.out.println(b.toString());
    }

    public static void displayFurniture(Furniture f){
        System.out.println(f.toString());
    }

}
