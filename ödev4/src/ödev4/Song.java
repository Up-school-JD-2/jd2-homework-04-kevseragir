package ödev4;

public class Song {

	private String name;
	private String artist;
	private Album album;
	private double length;
	public Song(String name, String artist, Album album, double length) {
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.length = length;
	}
	public String getName() {
		return name;
	}
	public String getArtist() {
		return artist;
	}
	public Album getAlbum() {
		return album;
	}
	public double getLength() {
		return length;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setArtis(String artist) {
		this.artist = artist;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void printSongInfo() {
		
	        System.out.println("şarkı : " + name);
	        System.out.println("Album: " + album.getName());
	        System.out.println("şarkıcı: " + artist);
	        System.out.println("uzunlugu: " + length);
	        System.out.println("-------------------------------------------");
	    }


		
	}
