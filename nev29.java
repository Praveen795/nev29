
package nev29;






class Vehicle{
	String name;
	int price;
	int avg;
	
	String name1;
	int price1;
	
	

	
	
	
	public void colour() {
		System.out.print("sky blue ");
		
	}
	public void speed(int speed) {
		if(speed==0) {
			System.out.print("vehicle is stoped");
			
		}else if(speed>0 && speed<=40) {
			System.out.print("vehicle speeed is slow");
			
		}else {
			System.out.print("vehicle speed is very fast");
		}
		
	}
	
	public String getname1() {
		return this.name1;
		
	}
	public int getprice1() {
		return this.price1;
	}
	
	public void setname1(String name) {
		this.name1=name1;
	}
	
	public void setprice1(int price1) {
		this.price1=price1;
	}
	
	
	
  	
}

public class nev29 {
	public static void main(String[] args) {
		Vehicle car=new Vehicle();
		Vehicle bike=new Vehicle();
		Vehicle car1=new Vehicle();
		
		
		//______________________________________
		car.name="BMW ";
		car.price=2000000000;
		car.avg=222;
	    bike.name="hero ";
		bike.price=500000;
		bike.avg=70;
		//___________________________
		System.out.println("name of the car :"+car.name);
		System.out.println("car price"+car.price);
		System.out.println("avgs of car"+car.avg);
		car.colour();
		System.out.println();
		car.speed(20);
		System.out.println();
		System.out.println("name of the bike :"+bike.name);
		System.out.println("vehicle bike"+bike.price);
		System.out.println("avgs of bike"+bike.avg);
		bike.colour();
		
		System.out.println();
		bike.speed(20);
		System.out.println();
		car1.setname1("odi");
		car1.setprice1(20000000);
		System.out.println("name"+car1.getname1());
		System.out.println("price"+car1.getprice1());
		
		
		
	}


}
