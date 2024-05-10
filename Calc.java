class Calc
{
 //Global var
 int a=34;
 int b=67;
 int c=a+b;

void square()
{
 //Local var
 int s=5;
 int area;
 area=s*s;
 System.out.println("The area of square: "+ area);
}

void display()
{
  System.out.println("The value of a: "+ a);
  System.out.println("The value of b: "+b);
  System.out.println("The sum of a and b: "+c);
  //System.out.println("The area of square in display method: "+ area);
}

public static void main(String args[])
{
Calc c=new Calc();
c.square();
c.display();
}
}
 
