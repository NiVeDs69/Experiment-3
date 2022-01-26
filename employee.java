import java.util.*; 
class employee
 { 
  public static void main(String args[])
   {
    Scanner obj=new Scanner(System.in);
    for(int i=1;i<=5;i++)
    { 
      System.out.println("Employee:"+i);
      
      System.out.println("Enter the employee number:");
      String n=obj.next();
     
      System.out.println("Enter the Name:");
      String name=obj.next();
      
      System.out.println("Enter the phone number:");
      long ph=obj.nextLong();
    }

}
}