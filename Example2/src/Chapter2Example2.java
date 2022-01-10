public class Chapter2Example2 {
    public static void main(String[] args){
        //primitive data types
        byte b = 0;     //one byte of memory
        short s = 0;    //two bytes of memory
        int i = 0;      //4 bytes in memory
        long l = 0;     //8 bytes in memory
        float f = 0;    //single precision floating-point
        double d = 0;   //double precision
        char c = 'A';   //single character
        boolean bool = true;    //boolean

        //reference data types
        String str = "Hello";
        //Student stu = new Student();

        int ABC_12;
        //int 12abc; numbers dont go first

        int totAmt;
        final double TAX_RATE = .07; //constant

        double rate = .07;
        int qty = 5;

        //.07 is the current tax rate
        double tot = qty / 2.0; //integer division
        System.out.println(tot);
        System.out.println(15!=14);
    }
}
