import java.util.*;
class revfreq
{
	public static void main(String args[])
	{
        n1 obj=new n1();
        obj.rev();
        obj.freq();
    }
}
class n1
{
    void rev()
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String str=obj.nextLine();
        
        String reverse="";
        
        int size=str.length();
        
        for(int i=size-1,j=0;i>=0;i--,j++)
        {
            reverse=reverse+str.charAt(i);
        }
        System.out.println("Reversed string is:"+reverse);
    }
   
    void freq()
    {
        Scanner sc=new Scanner(System.in); 
        
        System.out.println("Enter the string"); 
         String str=sc.next();
        
        System.out.println("Enter the charcater"); 
         char ch=sc.next().charAt(0);
 
        int count=0;
       
        int size=str.length(); 
 
        for(int i=0;i<size;i++) 
         { 
             char che=str.charAt(i); 
             if(ch==che) 
              count++;
         }  
        System.out.println("Frequency of "+ch+" in the string : "+count); 
    }
}

    