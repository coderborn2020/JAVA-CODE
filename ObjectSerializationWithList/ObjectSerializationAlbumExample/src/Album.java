import java.io.Serializable;

public class Album implements Serializable {
	private String albumTitle;
	private String albumArtist;
	private String albumDate;
	
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

	//default constructor
	public Album() {
		albumTitle = "Unknown";
		albumArtist = "Unknown";
		albumDate = "Unknown";	
	}
	
	//overloaded constructor
	public Album(String title, String artist, String date) {
		setAlbumTitle(title);
		setAlbumArtist(artist);
		setAlbumDate(date);
	}

	@Override
	public String toString() {
		return "Album{" +
				"albumTitle='" + albumTitle + '\'' +
				", albumArtist='" + albumArtist + '\'' +
				", albumDate='" + albumDate + '\'' +
				'}';
	}

}
