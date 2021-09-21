class SweetsTester
{
public static void main(String a[]){
    
	 Sweets sweets = new Sweets();
	 sweets.name = "jangeer";
	 sweets.price = 100;
	 sweets.color = "Red";
	 
	 System.out.println(sweets.name +" "+sweets.price+" "+sweets.color);
     
	 sweets.write();
	 
	 Sweets sweets1 = new Sweets();
	 sweets1.name = "peda";
	 sweets1.price = 50;
	 sweets1.color = "Cream";
	 
	 System.out.println(sweets1.name +" "+sweets1.price+" "+sweets1.color);
     
	 sweets1.write();
	 
	 Sweets sweets2 = new Sweets();
	 sweets2.name = "mysorePack";
	 sweets2.price = 100;
	 sweets2.color = "Brown";
	 
	 System.out.println(sweets2.name +" "+sweets2.price+" "+sweets2.color);
     
	 sweets2.write();
	 
}




}