import java.util.ArrayList;
import java.util.List;

/*
 * This class tests the Album and Song classes.
 */
public class TestAlbumAndSong {

	public static void main(String[] args) {
			
		//create an list of Albums
		List<Album> albumList = new ArrayList<Album>();
		
		//create an list of songs
		List<Song> songList = new ArrayList<Song>();
		List<Song> songList2 = new ArrayList<Song>();

		//add songs to the song list
		songList.add( new Song("Cold as Ice", 3.23));
		songList.add(new Song("Feels Like the First Time", 4.0));
		songList.add( new Song("Starrider", 3.34));
		songList.add( new Song("Double Vision", 6.27));

		songList2.add( new Song("Ten Years Gone", 22.37));
		songList2.add( new Song("Give Me The Rover", 8.33));


		
		//add an album to album list, including songs
		albumList.add( new Album("Foreigner Alive", "Foreigner",
				"07/31/1977", songList));

		//albumList.add( new Album("Physical Graffiti", "Led Zepplin",
		//		"07/31/1970", songList2));
		albumList.add(new Album());
		albumList.get(1).setAlbumTitle("Physical Graffiti");
		albumList.get(1).setAlbumArtist("Led Zeppelin");
		albumList.get(1).setAlbumSongs(songList2);
						
		//print the albums and its songs using foreach loop
		for(Album a : albumList) {
			System.out.println(a.toString());
		}
		
		//print the albums and its songs using for loop
		for(int i = 0; i < albumList.size() - 1; i++) {
			System.out.println(albumList.get(i).toString());
		}

		int choice = 0;
		//print album title and length of first album
		System.out.println("Length of " + albumList.get(choice).getAlbumTitle() + ": " +
				albumList.get(choice).CalcAlbumLength());
		
		//print album title, and title and length of longest song of first album
		try {
			System.out.println("Longest song of " + albumList.get(choice).getAlbumTitle() + ": " +
					albumList.get(choice).FindLongestSong().getSongTitle() + " " +
					albumList.get(choice).FindLongestSong().getSongLength());
		}
		catch(Exception e) {
			System.out.println("Error processing longest song " + e.toString());
		}
		

	}

}
