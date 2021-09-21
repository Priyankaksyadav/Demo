class AmusementParksTester
{
public static void main(String a[]){
    
	  AmusementParks  amusementparks = new  AmusementParks();
	 amusementparks.name = "FunWorld";
	 amusementparks.opensAt = 8;
	 amusementparks.closeAt = 9;
	 amusementparks.price = 500;
	 System.out.println(amusementparks.name+" "+amusementparks.opensAt+" "+amusementparks.closeAt+" "+amusementparks.price);
     
	 amusementparks.write();
	 
	 
	 AmusementParks  amusementparks1 = new  AmusementParks();
	 amusementparks1.name = "ChildrenPark";
	 amusementparks1.opensAt = 8;
	 amusementparks1.closeAt = 9;
	 amusementparks1.price = 600;
	 System.out.println(amusementparks1.name+" "+amusementparks1.opensAt+" "+amusementparks1.closeAt+" "+amusementparks1.price);
     
	 amusementparks1.write();
	 
	 AmusementParks  amusementparks2 = new  AmusementParks();
	 amusementparks2.name = "WaterWorld";
	 amusementparks2.opensAt = 8;
	 amusementparks2.closeAt = 9;
	 amusementparks2.price = 350;
	 System.out.println(amusementparks2.name+" "+amusementparks2.opensAt+" "+amusementparks2.closeAt+" "+amusementparks2.price);
     
	 amusementparks2.write();
	 
	 
	 
	 }
	 }