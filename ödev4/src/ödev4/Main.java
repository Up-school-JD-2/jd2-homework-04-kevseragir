package ödev4;


	import java.util.ArrayList;
	import java.util.List;

	public class Main {
	    
	
		public static void main(String[] args) {
		Album album = new Album("Gripin Albumu","Gripin", 2007, new String[]{"Dört ","zor geliyor","vazgectim","Durma yagmur durma"},75);
		Album album2 = new Album("Bende Bi Aşk var Albumu","Göksel", 2015, new String[]{"Acıyor ","Denize Bıraksam Kendimi","uzaktan","Rüzgar"},77);

	     Song song = new Song("Denize Bıraksam Kendimi", "Göksel",album2,3.74);
	     Song song2 = new Song ("Durma Yağmur Durma","Gripin", album ,4.58);
	     Song song3 = new Song ("Vazgeçtim","Gripin", album ,5.01);

	     User user= new User("Kevser","kevseragir@gmail.com","Aksaray");
	     User user2 = new User("Emre","emreagir@gmail.com","Aksaray");
	     User user3 = new User("Merve","merveagir@gmail.com","Aksaray");

	     ShoppingCart cart=new ShoppingCart("kevser",77);
	     ShoppingCart cart1=new ShoppingCart("merve",152);
	     ShoppingCart cart2=new ShoppingCart("emre",75);
	     
	     CartSystem CartSystems = new CartSystem();
	 
	 	 

		CartSystems.addSong(song);
		CartSystems.addSong(song2);
	     CartSystems.addSong(song3);
	   
	    CartSystems.listSongs();
	 
	    CartSystems.addAlbum(album);
	    CartSystems.addAlbum(album2);
	    CartSystems.listAlbums();

	    CartSystems.addUser(user);
	    CartSystems.addUser(user2);
	    CartSystems.addUser(user3);
	    CartSystems.listUsers();
	   
		}

	

	}

