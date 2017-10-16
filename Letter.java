package word;
//Package is a grouping of related types providing access protection and name
public class Letter {
//public keyword is used in the declaration of a class,method or 
//field;public classes,method and fields can be accessed by the 
//members of any class.
//class defines instance and class fields,methods and inner classes as
//well as specifying the interfaces the class implements and the 
//immediate superclass of the class

		public static void main(String[] args) {
//static is used for memory management
//void is used to define the return type of the method
//String[] args is actually an array of java.lang.String type and it's name is args here

			// TODO Auto-generated method stub
			//Creating a string object 
			 String Str = new String("My-name-is-priya");
		      System.out.println("Output Value :" );      
		      //Applying for each loop
//The string split() method breaks a given string around matches of the given regular expression.
		      for (String retval: Str.split("-")) {
		         System.out.println(retval);
		      }
		      	//Creating another string 
		         String Str1 = new String("M-y-n-a-m-e-i-s-p-r-i-y-a");
		         System.out.println("Output value:");
		         //Applying for each loop
		         for(String s:Str1.split("-")){
//
		        	 System.out.println(s);
		         }
		      }
		   }