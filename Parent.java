public abstract class Parent
{
public Parent(){
System.out.println("Parent Constructor");
}
public void grow()
{
System.out.println("Growing"); 
}
Parent(int no){
System.out.println("single arugment constructor in parent");
}
public abstract void study(); 

public static void main(String[] args)
{
//Parent pa = new Parent();
//pa.study();

}


} 
//abstraction:hiding unwanted and showing only the necessary ... 

//if at least one method in class is abstract ,then the entire class is abstract .. 

// parent is abstract and cannot be intailized 

//11 code: if abstract 

//We cannot create a object for abstract class .. line no 13  because 


//final keyword : declare the final 


// can we have final class?
// no. Reason:abstract class definitely needs child class 
//final class ... 
