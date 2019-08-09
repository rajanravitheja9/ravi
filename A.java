import java.util.*;
class A
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
   String []r=s.split(" ");
   int []a=new int[r.length];
   for(int i=0;i<r.length;i++)
   {
    a[i]=Integer.parseInt(r[i]);
   }
   int n=a[0];
   int m=a[1];
   int count=0;
   if(m>0)
   {
     b=n-(n*(m/100));
     if(b==0)
      break;
     else
     {
      n=b;
      count=count+1;
      }
   }
   System.out.println(count);
 }
}
