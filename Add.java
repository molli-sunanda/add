import java.util.*;
class Add
{
public static void main(String args[])
{
ArrayList<Integer>a=new ArrayList<Integer>();
ArrayList<Integer>a1=new ArrayList<Integer>();
ArrayList<Integer>a2=new
ArrayList<Integer>();
a.add(10);
a.add(20);
a.add(30);
a.add(40);
System.out.println("list a"+a);
a1.add(100);
a1.add(200);
a1.add(300);
a1.add(400);
System.out.println("list a1"+a1);
a2.addAll(a);
a2.addAll(a1);
System.out.println("list a2"+a2);
}
}