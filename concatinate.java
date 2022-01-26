class concatinate
{ 
  public static void main(String args[])
   {
   concatinate Obj=new concatinate();
   Obj.con("8"+"9");
   Obj.con("Nived"+" "+"Krishna");
   }
  void con(int a)
  {
   System.out.println("Concated number:" +a);
  }
  void con(String a)
   {
    System.out.println("Concated String=" +a);
   }
}