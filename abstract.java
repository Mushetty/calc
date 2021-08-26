class printer
{
public void show(Number i)
{
System.out.println(i);
}
}
public class Abstract
{
public static void main(String args[])
{
printer obj=new printer();
obj.show(5.4);
}
}