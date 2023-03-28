package ödev4;

	import java.util.Arrays;

	public class Album {
		
		private String name;
		private String artistName;
		private int releaseDate;
		private String[] songs;
		public int price;
		
		public Album(String name, String artistName, int releaseDate, String[] songs, int price) {
			
			this.name = name;
			this.artistName = artistName;
			this.releaseDate = releaseDate;
			this.songs = songs;
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public String getArtistName() {
			return artistName;
		}
		public int getReleaseDate() {
			return releaseDate;
		}
		public String[] getSongs() {
			return songs;
		}
		public int getPrice() {
			return price;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setArtistName(String artistName) {
			this.artistName = artistName;
		}
		public void setReleaseDate(int releaseDate) {
			this.releaseDate = releaseDate;
		}
		public void setSongs(String[] songs) {
			this.songs = songs;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public void printAlbumInfo() {
			System.out.println("Albüm Adı: " + name);
		     System.out.println("Şarkıcı Adı: " + artistName);
		       System.out.println("yayın zamanı:"+releaseDate);
		        System.out.println("Sarkılar:"+Arrays.toString(songs));
		       System.out.println("Fiyat:"+price);
		        System.out.println("---------------------------");
		   
		   
		      
		        
		}
	
		}
		

		



