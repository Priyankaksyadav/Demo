class LaptopsTester
{
public static void main(String a[]){
    
	 Laptops laptops = new Laptops();
     laptops.Id = 3425;
	 laptops.name = "Dell";
	 laptops.price = 35000;
	 laptops.ram = 4;
	 laptops.windows =7;
	 System.out.println(laptops.Id+" "+laptops.name+" "+laptops.price+" "+laptops.ram+" "+laptops.windows);
     
	 laptops.write();
	 
	 Laptops laptops1 = new Laptops();
     laptops1.Id = 5342;
	 laptops1.name = "HP";
	 laptops1.price = 45000;
	 laptops1.ram = 8;
	 laptops1.windows =10;
	 System.out.println(laptops1.Id+" "+laptops1.name+" "+laptops1.price+" "+laptops1.ram+" "+laptops1.windows);
     
	 laptops1.write();
	 
	 Laptops laptops2 = new Laptops();
     laptops2.Id = 743;
	 laptops2.name = "Acer";
	 laptops2.price = 50000;
	 laptops2.ram = 8;
	 laptops2.windows =10;
	 System.out.println(laptops2.Id+" "+laptops2.name+" "+laptops2.price+" "+laptops2.ram+" "+laptops2.windows);
     
	 laptops2.write();
	 
	 
	 
	 
	 }
	 }