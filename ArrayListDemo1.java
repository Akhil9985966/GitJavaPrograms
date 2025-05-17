
import java.util.*;



public class ArrayListDemo1
{
    public static void main(String args[])
{
    ArrayList<Integer> al1=new ArrayList<Integer>();
    al1.add(100);
    al1.add(200);
    al1.add(300);
    System.out.println(al1);
    ArrayList<Integer> al2=new ArrayList<Integer>();
    al2.add(1000);
    al2.add(2000);
    al2.add(3000);
    System.out.println(al2);
    al1.addAll(al2);
    System.out.println(al1);
    



}}