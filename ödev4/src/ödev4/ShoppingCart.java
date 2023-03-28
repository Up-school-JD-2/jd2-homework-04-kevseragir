package ödev4;

public class ShoppingCart {


	private int toplam;
	private String name;
	private int price;
	
	public ShoppingCart( String name, int price) {
		
		this.name = name;
		this.price = price;
	}

	public String getName(){
	  return name;
	}

	public void setName( String name){
	  this.name= name;
	
  
	}
public int getPrice(){
	  return price;
	}

	public void setPrice( int price){
	  this.price= price;

	}

	public void printCartInfo() {
	
		 System.out.println(price+"ücret");
		  System.out.println(name+"kullanıcı");
	}
	
public void toplam() {
	for(int i=0;i<5;i++);
	toplam+=price;
	System.out.println("toplam ucret: "+price);
}
	
}

