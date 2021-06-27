class Stu
{  
int rollno;  
String name;  
float fee;  
Stu(int rollno,String name,float fee)
{  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class SuperStudent{  
public static void main(String args[])
{  
Stu s1=new Stu(111,"ankit",5000f);  
Stu s2=new Stu(112,"sumit",6000f);  
s1.display();  
s2.display();  
}
}  