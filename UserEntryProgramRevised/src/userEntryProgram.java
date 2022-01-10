import java.io.FileNotFoundException;

/**
 * This program will take account information and other data inputted by the user and
 * write it to a .dat file. This will keep functions from the previous assignment for
 * testing purposes.
 */

public class userEntryProgram {

    public static void main(String[] args) throws FileNotFoundException {
        int accessor;
        int exit;

        userInfo userinfo = new userInfo();



        System.out.println(userinfo.getOpening());
        userinfo.getOpening2();
        accessor = userInfo.access;
        exit = userInfo.exit;

        if (accessor == 1){
            userinfo.init();
            userinfo.getPassword();
            userinfo.getUserId();
            System.out.println(userinfo.getString());
            userinfo.loginAttemptUserName();
            userinfo.loginAttemptPassword();
            System.out.println(userinfo.getLoggedIn());
            userinfo.getUserInfo1();
            userinfo.getUserInfo2();
            userinfo.output();
            userinfo.closeDat();
        }

        if (accessor == 2){
            userinfo.readDatFile();
            System.out.println(userinfo.getEarlyClosing());
        }


        if (exit == 1){
            System.out.println(userinfo.getEarlyClosing());
        }





    }
}