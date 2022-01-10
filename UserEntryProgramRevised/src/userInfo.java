import java.util.Scanner;
import javax.swing.*;
import java.io.*;

class userInfo
{
        static Scanner scanner = new Scanner(System.in);
        private String userPassword;
        private String userId;
        private final String[] mealPlan = new String[]{"Commuter no meal plan", "Commuter with meal plan", "Dorm"};
        private final String[] userProgram = new String[]{"Business program", "Lasers program", "Networking program",
                                        "Programming classes", "Robotics program", "Social Media program"};
        private boolean valid;
        private int setMealPlan;
        private int setUserProgram;
        public static int access;
        public static int exit;
        private int Psctr;
        private int Usctr;

        static PrintWriter pw;

        public userInfo(){
                Psctr = 0;
                Usctr = 0;
                }


        public void init(){
        scanner = new Scanner(System.in);
        try {
                pw = new PrintWriter(new FileOutputStream(new File("myFile.dat"), false));
        }
        catch(FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "File Error");
        }
}


        public String getOpening() {

                return "Welcome, in this program you can make an account, type [1] if you would like to create an account" + '\n'
                        + "If you would like to review created accounts type [2] " + '\n'
                        + "If you do not wish to create an account or review, press [3] if you would like to exit";
        }

        public <access, exit> int getOpening2(){
                Psctr = 0;
                while (Psctr == 0){
                        System.out.println("Type here: ");
                        String iData = scanner.nextLine();
                        if (iData.matches("1")){
                                access = access + 1;
                                Psctr = Psctr + 1;
                                return access;
                        }
                        else
                                if (iData.matches("2")){
                                        access = access + 2;
                                        Psctr = Psctr + 2;
                                        return access;
                                }
                                else
                                        if (iData.matches("3")){
                                                exit = exit + 1;
                                                Psctr = Psctr + 1;
                                                return exit;
                                        }
                                        else
                                                if (!iData.matches("1")|!iData.matches("3")|!iData.matches("2")){
                                                        System.out.println("Input is wrong, please choose 1,2 or 3");
                                         }

                        }
                return access;
        }

        public String getEarlyClosing(){
                return "Thank you for using this program, have a nice day";
        }

        public void setUserId(String username)
                {
                userId = username;
                }

        public String getUserId(){
                Usctr = 0;
                while (Usctr == 0){
                System.out.println("Enter Username: ");
                String iData = scanner.nextLine();
                try{
                        if (iData.matches("[a-zA-Z]{6,10}[0-9]{2}")){
                                if (iData.matches(".*[a-z].*") && iData.matches(".*[A-Z].*") && iData.matches(".*[0-9].*")){
                                        System.out.println("User name is valid");
                                        Usctr = Usctr + 1;
                                        userId = String.valueOf(iData);
                                }
                        }
                        if (!iData.matches("[a-zA-Z]{6,10}[0-9]{2}")){
                                System.out.println("invalid, please re-enter ");
                        }
                }
                        catch (Exception e){
                                System.out.println("invalid");
                        }

                }
                return userId;
        }

        public void setPassword(String password)
                {
                userPassword = password;
                }

        public String getPassword(){
                Psctr = 0;
                while (Psctr == 0){
                System.out.println("Enter password: ");
                String iData = scanner.nextLine();
                        try{
                                if (iData.matches("[a-zA-Z0-9]{6,12}")){
                                        if (iData.matches(".*[a-z].*") && iData.matches(".*[A-Z].*") && iData.matches(".*[0-9].*")) {
                                                System.out.println("Password is valid");
                                                Psctr = Psctr + 1;
                                                userPassword = iData;
                                        }
                                }
                                if (!iData.matches("[a-zA-Z0-9]{6,12}")){
                                        System.out.println("password invalid, please re enter");
                                }
                        }
                        catch (Exception e){
                                System.out.println("invalid");
                        }
                }

                return userPassword;
        }




        public String getString() {
                return "Account info{" +
                "user name='" +  userId + '\'' +
                " password ='" + userPassword + '\'' +
                '}';
                }


                public void  loginAttemptUserName(){
                        Usctr = 0;
                        while (Usctr == 0){
                                String userNameValidation = userId;
                                System.out.println("Please enter your username:");
                                String iData = scanner.nextLine();
                                try{
                                        if (iData.matches(userNameValidation)){
                                                System.out.println("Username is correct");
                                                Usctr = Usctr + 1;
                                        }
                                        if (!iData.matches(userNameValidation)){
                                                System.out.println("Username is incorrect");
                                        }
                        }
                                catch (Exception e){
                                        System.out.println("Username is wrong, try again");
                                }


                }

        }

        public void  loginAttemptPassword(){
                Psctr = 0;
                while (Psctr == 0){
                        String passwordValidation = userPassword;
                        System.out.println("Please enter your password:");
                        String iData = scanner.nextLine();
                        try{
                                if (iData.matches(passwordValidation)){
                                        System.out.println("password is correct");
                                        Psctr = Psctr + 1;
                                }
                                if (!iData.matches(passwordValidation)){
                                        System.out.println("password is incorrect");
                                }
                        }
                        catch (Exception e){
                                System.out.println("password is wrong, try again");
                        }


                }

        }


        public String getLoggedIn() {
                return "You have logged into your account";
        }

        public int getUserInfo1() {
                valid = false;

                System.out.println("Please enter what meal plan you have (Enter 1-3) \n" +
                        "enter 1 if you are a Commuter no meal plan \n" +
                        "enter 2 if you are a Commuter with meal plan \n" +
                        "enter 3 if you are in a dorm \n");
                while (!valid) {
                        String iData = scanner.nextLine();

                        try {
                                if (iData.equals("1")) {
                                        setMealPlan = 0;
                                        System.out.println("valid number");
                                        valid = true;
                                } else if (iData.matches("2")) {
                                        setMealPlan = 1;
                                        valid = true;
                                } else if (iData.matches("3")) {
                                        setMealPlan = 2;
                                        valid = true;
                                }
                                else {
                                        System.out.println("Invalid number");
                                }
                        } catch (Exception e) {
                                System.out.println("Invalid number");
                        }

                }
                return setMealPlan;
        }

        public int getUserInfo2() {
                valid = false;

                System.out.println("Please enter what program you are in \n" +
                        "enter B if you are apart of the Business program  \n" +
                        "enter L if you are apart of the Lasers program \n" +
                        "enter N if you are apart of the Networking program\n" +
                        "Enter P if you are apart of the Programming program\n" +
                        "Enter R if you are apart of the Robotics program\n" +
                        "Enter S if you are apart of the Social Media program\n");

                while (!valid) {
                        char iData = scanner.nextLine().toUpperCase().charAt(0);
                        switch (iData) {
                                case 'B':
                                        valid = true;
                                        setUserProgram = 0;
                                        break;
                                case 'L':
                                        valid = true;
                                        setUserProgram = 1;
                                        break;
                                case 'N':
                                        valid = true;
                                        setUserProgram = 2;
                                        break;
                                case 'P':
                                        valid = true;
                                        setUserProgram = 3;
                                        break;
                                case 'R':
                                        valid = true;
                                        setUserProgram = 4;
                                        break;
                                case 'S':
                                        valid = true;
                                        setUserProgram = 5;
                                        break;
                                default:
                                        System.out.println("Error in loop entry. Class assigned is 'B'.");
                                        iData = 'B';

                        }

                }
                return setUserProgram;
        }

        public void output(){
                String record;
                record = String.format("%-25s", userPassword) + String.format("%-25s", userId)
                + String.format("%-25s", mealPlan[setMealPlan]) + String.format("%-25s", userProgram[setUserProgram]);
                pw.println(record);
        }

        public void readDatFile() throws FileNotFoundException {
                Scanner file = new Scanner(new File ("myFile.dat"));
                String open = file.nextLine();
                System.out.println(open);
        }

        public void closeDat() {
                pw.close();
        }
}
