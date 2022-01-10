import java.util.List;

/*
 * This is the Album class. Each Album will have a title, artist name,
 * date released, and a list of Songs.
 * 
 * Composition is being demonstrated since a Album object is composed of 
 * another object (array of Songs).
 */
public class Album {
	private String albumTitle;
	private String albumArtist;
	private String albumDate;
	private List<Song> albumSongs;
	
	//getters
	public String getAlbumTitle() {
		return albumTitle;
	}
	
	public String getAlbumArtist() {
		return albumArtist;
	}
	
	public String getAlbumDate() {
		return albumDate;
	}
	
	public List<Song> getAlbumSongs() {
		return albumSongs;
	}
	
	//setters
	public void setAlbumTitle(String title) {
		if(!title.isEmpty()) {
			albumTitle = title;
		}
		else {
			albumTitle = "Unknown";
		}
	}
	
	public void setAlbumArtist(String artist) {
		if(!artist.isEmpty()) {
			albumArtist = artist;
		}
		else {
			albumArtist = "Unknown";
		}
	}	
	
	public void setAlbumDate(String date) {
		if(!date.isEmpty()) {
			albumDate = date;
		}
		else {
			albumDate = "Unknown";
		}
	}
	
	public void setAlbumSongs(List<Song> s) {
		if(!(s == null)) {
			albumSongs = s;
		}		
	}
	
	//default constructor (no songs)
	public Album() {
		albumTitle = "Unknown";
		albumArtist = "Unknown";
		albumDate = "Unknown";	
	}
	
	//overloaded constructor, with songs
	public Album(String title, String artist, String date, List<Song> songs) {
		setAlbumTitle(title);
		setAlbumArtist(artist);
		setAlbumDate(date);
		setAlbumSongs(songs);
	}

	@Override
	public String toString() {
		String str = "Album: " + albumTitle + "\n";
		
		if(!(albumSongs == null)) {
			for(Song s : albumSongs) {
				str += (s.toString() + "\n");
			}
		}
		
		return str;
	}
	
	public double CalcAlbumLength() {
		double length = 0;
		
		if(!(albumSongs == null)) {
			for(Song s : albumSongs) {
				length += (s.getSongLength());			
			}
		}
		
		return length;
	}
	
	public Song FindLongestSong() {
		Song longestSong = new Song();
		
		if(!(albumSongs == null)) {
			longestSong = albumSongs.get(0);
			for(int i = 1; i < albumSongs.size(); i++) {
				if(albumSongs.get(i).getSongLength() > longestSong.getSongLength()) {
					longestSong = albumSongs.get(i);
				}
			}
		}
		return longestSong;
	}
}
