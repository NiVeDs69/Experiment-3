import java.util.*;
class sumfact
{
	public static void main(String args[])
	{
    	sumfact obj=new sumfact();
        
        obj.sum();
        
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Enter digit:");
        int n=sc1.nextInt();
        System.out.println("Factorial :" +obj.fact(n));  
    }
     void sum()
     {
     Scanner sc=new Scanner(System.in);
     int sum=0,temp;
     System.out.println("Enter the number:");
     int num=sc.nextInt();
     while(num>0)
     	{
     		temp=num%10;
          	sum=sum+temp;
       		num=num/10;
    	 }
     System.out.println("sum :"+sum);    
     }
     
     int fact(int n)
     {
       if(n==0||n==1)
        return 1; 
     
       return n*fact(n-1);
       
     }
} 