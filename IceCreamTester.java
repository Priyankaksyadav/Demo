class IceCreamTester
{
public static void main(String a[]){
    
	IceCream icecream = new IceCream();
	 icecream.name = "Chocobar";
	 icecream.price = 56;
	 icecream.color = "Black";
	
	 System.out.println(icecream.name+" "+icecream.price+" "+icecream.color);
     
	 icecream.write();
	 
	 IceCream icecream1 = new IceCream();
	 icecream1.name = "pista";
	 icecream1.price = 250;
	 icecream1.color = "Pink";
	
	 System.out.println(icecream1.name+" "+icecream1.price+" "+icecream1.color);
     
	 icecream1.write();
	 
	 IceCream icecream2 = new IceCream();
	 icecream2.name = "butterScoch";
	 icecream2.price = 35;
	 icecream2.color = "Brown";
	
	 System.out.println(icecream2.name+" "+icecream2.price+" "+icecream2.color);
     
	 icecream2.write();
	 
	 }
	 }