import java.util.*;


class exp extends Exception{
	
	public exp(String msg) {
		super(msg);
	}
}

public class Telephone_Directory  {
		
	public static void main(String[] args) {
		     
		Scanner sc = new Scanner(System.in);
		
		 String csname = null;
		 String csphone = null;
		
		System.out.println("Enter any one number  1 or 2");
		int choose = sc.nextInt();
		
		if(choose == 1 ) {
			System.out.println("Enter your name");
		 csname = sc.next();
		}
		
		else if(choose ==2) {
			System.out.println("Enter your phone");
		    csphone = sc.next();
			
		}
		

		customer cs1 = new customer("12345", "john", "[123 anna nagar]");
		customer cs2 = new customer("54321", "deepak", "[13 ashok nagar]");
		customer cs3 = new customer("11223", "kumar", "[21 broadway]");
		
		ArrayList<customer> ar = new ArrayList();
		
		ar.add(cs1);
		ar.add(cs2);
		ar.add(cs3);

	
		if(choose==1) {
		csdetails(ar, csname, csphone );
		}
		
		else if(choose==2) {
			phonedetails(ar, csname, csphone);
			
			
		}
	}
	
	
   public static void csdetails(ArrayList<customer> list, String name, String phone) {
		
		
		try {	
			boolean cusfound = false;
			
			for(customer c : list) 
			{
				if(c.name.equalsIgnoreCase(name)) 
				{
					System.out.println(c.phone + " " + c.name + " " + c.adds);
					 
					cusfound = true;
				}
				
			else if(!cusfound) 
			{
			 throw new exp	("Customer not found");
				
			}
				
			}			
		}
		
		catch (exp e) {
			System.out.println(e.getMessage());
		}
}
		
   public static void phonedetails(ArrayList<customer> list, String name, String phone) {
            
             try {
            	 boolean phonefound = false;
            	 
            	 for(customer c : list) {
            		 if(c.phone.length()==5 && c.phone.equals(phone)) {
            			
            			 System.out.println(c.phone + " " + c.name + " " + c.adds);
            			 phonefound =true;
            			  }
            		 
            		 else if(!phonefound) {
                		  throw new exp ("Invalid Phone Number");
                	 }
            	 }
              }
            
            catch(exp e) {
            	 System.out.println(e.getMessage());
            }
            
            
   }
	
}

