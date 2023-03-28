package ödev4;

	import java.util.ArrayList;
	import java.util.List;
	public class CartSystem {

		
			private List<Song>  songs ;
		    private List<Album> albums;
		    private List<User> users;
		    private List<ShoppingCart> carts;
			
			
		    public CartSystem() {
			
				songs = new ArrayList<>();
				albums = new ArrayList<>();
				users = new ArrayList<>();
				carts = new ArrayList<>();
			}
			

		    public void addSong(Song song){
		        this.songs.add(song);
		    }

		    //public void removeSong(Song song){
		   //     this.songs.remove(song);
		   // }

		    public void addAlbum(Album album){
		        this.albums.add(album);
		    }
		    //public void removeAlbum(Album album){
		     //   this.albums.remove(album);
		    //}
		    public void addUser(User user){
		        this.users.add(user);
		    }
		    //public void removeUser(User user){
		      //  this.users.remove(user);
		   // }

		  

			public void listSongs(){
		        System.out.println("*****Şarkılar*****");
		        for (Song song : this.songs){
		        	song.printSongInfo();
		        }
		        
		 
			        
		        
		    }
		  
		    public void listUsers(){
		        System.out.println("*****Kullanıcılar*****");
		        for (User user : this.users){
		            user.printUserInfo();
		        }
		    }

			public void listAlbums(){
		        System.out.println("*****Albümler*****");
		        
		        for (Album album : this.albums){
		        	album.printAlbumInfo();
		        	
		        }   
		        
		        
		       
		       
		       
}



				
			}
