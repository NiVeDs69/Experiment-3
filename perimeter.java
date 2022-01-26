class perimeter
{
    public static void main(String args[])
    {
        perimeter obj=new perimeter(6);
        perimeter obj1=new perimeter(7,8);
    }
    
    perimeter(int r)
    {
        System.out.println("Perimeter of circle is:"+(3.14*2*r));
    }
  
    
    perimeter(int l,int b)
    {
        int p=2*(l+b);
        System.out.println("Perimeter  of Rectangle is:"+p);
    }
}