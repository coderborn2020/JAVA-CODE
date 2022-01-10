/*
 * This program demonstrates how to deserialize (input)
 * objects from an instantiable class stored in a List *
 */

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestObjectDeserialization {

    public static void main(String[] args){
        String filename = "album_data.ser";
        FileInputStream inFile;
        ObjectInputStream inStream;

        //create list of Albums
        List<Album> albumList = new ArrayList<Album>();
        // Deserialization
        try
        {
            inFile = new FileInputStream(filename);
            inStream = new ObjectInputStream(inFile);

            // read the objects as an entire list
            albumList = (List<Album>) inStream.readObject();

            inStream.close();
            inFile.close();

        }

        catch(Exception ex)
        {
            System.out.println("Error reading Song file");
            System.exit(1);
        }

        //print the list of Albums
        for(Album o : albumList) {
            System.out.println(o.toString());
        }


    }
}
