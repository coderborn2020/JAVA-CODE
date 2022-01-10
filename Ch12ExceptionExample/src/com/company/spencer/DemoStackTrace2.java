package com.company.spencer;

import java.lang.reflect.Array;

public class DemoStackTrace2 {

        public static void main(String[] args) {
	        methodA();
        }

        public static void methodA(){
            System.out.println("In methodA()");
            methodB();
            /*
            try{
                methodB();
            }
            catch(ArrayIndexOutOfBoundsException error){
                System.out.println("In methodA() - the stack trace:");
                error.printStackTrace();
            }
            System.out.println("methodA( ends normally.");
            System.out.println("Application could continue" +
                    "from this point.");
             */
        }
        public static void methodB(){
            System.out.println("In methodB()");
            try{
                methodC();
            }
            catch(ArrayIndexOutOfBoundsException exc){
                System.out.println(exc.getMessage() + " caught in methodB()");
            }
        }
        public static void methodC(){
            System.out.println("in methodC()");
            int[] array = {0, 1, 2};
            System.out.println(array[3]);
            /*
            try{
                System.out.println(array[3]);
            }
            catch(ArrayIndexOutOfBoundsException exc){
                System.out.println(exc.getMessage() + " caught in methodC");
            }

             */
        }

    }
