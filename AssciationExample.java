package array;


import java.util.*;

public class AssciationExample {  
	  public static void main (String[] args)  
	  {  
  }  
} 
class Mobile  
{  
   String brandName;  
   String ram;  
   String rom;
   int price;
  Mobile(String Name, String ram, String rom, int price  )
  {  
    this.brandName = brandName;  
    this.ram = ram;  
    this.rom = rom; 
    this.price = price;
  }
public Mobile() {
	super();
	// TODO Auto-generated constructor stub
}  
}  
class MobileStore extends Mobile{  
  private List<Mobile> mobiles;  
  MobileStore (List<Mobile> mobiles)  
  {  
    this.mobiles = mobiles;  
  }  
  public List<Mobile> getTotalMobileInStore(){  
    return mobiles;  
  }  
}  

class Price extends Mobile{
	void lowEndMobile() {
		
	}
	void highEndMobile(){
		
	}
}
//is a electronic device
//usage battery
//has a memory
//produces phone call
