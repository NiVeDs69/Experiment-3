class area
{
    public static void main(String args[])
    {
        area obj=new area();
        obj.areas(7);
        obj.areas(3,2);
        obj.areas(5.6,6.7);
    }
    void areas(int r)
    {
        System.out.println("Area of circle is:"+(3.14*r*r));
    }
    void areas(int a,int b)
    {
        System.out.println("Area of Rectangle is:"+(a*b));
    }
    void areas(double b,double h)
    {
        System.out.println("Area of triangle is:"+(0.5*b*h));
    }
}