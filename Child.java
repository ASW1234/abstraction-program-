public final class Child extends Parent
{
Child(){
//super();
System.out.println("child constructor");
}
Child(int no){
super(no);
System.out.println("single arugment constructor");
}
public void study(){

System.out.println("studying ");
}

public static void main(String[] args)
{
Child ch = new Child(100);
//ch.grow();
//ch.study();

}

}


// inheritance : child object and parent object is corret on parent.java.. 


