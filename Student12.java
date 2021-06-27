public class Student12
{  
//instance variables of the class  
int id;  
String name;  
  
Student12()
{  
System.out.println("I am a constructor");  
}  
  
public static void main(String[] args)
{  
//object creation  
	Student12 s = new Student12();  
//printing reference value  
System.out.println(s); // prints object id i.e.,                                        Student@4dc63996  
}  
}  