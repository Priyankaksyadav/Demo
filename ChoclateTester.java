class ChoclateTester
{
public static void main(String a[]){
    
	 Choclate choclate = new Choclate();
	 choclate.name = "DairyMilk";
	 choclate.price = 100;
	 choclate.color = "Brown";
	 
	 System.out.println(choclate.name +" "+choclate.price+" "+choclate.color);
     
	 choclate.write();
	 
	 Choclate choclate1 = new Choclate();
	 choclate1.name = "MilkyBar";
	 choclate1.price = 50;
	 choclate1.color = "White";
	 
	 System.out.println(choclate1.name +" "+choclate1.price+" "+choclate1.color);
     
	 choclate1.write();
	 
     Choclate choclate2 = new Choclate();
	 choclate2.name = "Snacker";
	 choclate2.price = 25;
	 choclate2.color = "Black";
	 
	 System.out.println(choclate2.name +" "+choclate2.price+" "+choclate2.color);
     
	 choclate2.write();
}




}