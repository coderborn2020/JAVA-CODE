        /*
 * This program demonstrates how to serialize (output)
 * objects from an instantiable class stored in a List *
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestObjectSerialization {

	public static void main(String[] args) {
		String filename = "album_data.ser";
		FileInputStream inFile;
        ObjectInputStream inStream;
        FileOutputStream outFile;
        ObjectOutputStream outStream;
        
        //create a list of Albums
  		List<Album> albumList = new ArrayList<Album>();

  		//create the first Album as a default, add to the list
  		Album a = new Album();
        albumList.add(a);

  		//create the second Album, add to the list
  		String title = "Clapton Live";
        String artist = "Clapton";
        String date = "07/31/1992";
  		Album b = new Album(title, artist,date);
        albumList.add(b);

        //instantiate and add an album to the list
  		albumList.add(new Album("Foreigner Alive", "Foreigner", "07/31/1977"));

		// write the list of albums to the file using Serialization
        try{    
            //Saving of object in a file 
            outFile = new FileOutputStream(filename); 
            outStream = new ObjectOutputStream(outFile);
            
            // write the objects as an entire list
            outStream.writeObject(albumList);
            
            outStream.close(); 
            outFile.close();               
          
         } 
        catch(Exception ex){ 
            System.out.println("Error writing album file" + ex.getMessage());
        }


  
	}

}
