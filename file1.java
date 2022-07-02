import java.util.*;
class Palindrome
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    String s1;
    s1=scan.next();
    int len,i=0,flag=0;
    len=s1.length;
    while(i<len/2)
    {
      if(s1.charAt(i)==s1.charAt(len-1-i)
         {
            i++;
         }
       else
         {
            flag=1;
            break;
         }
    }
    if(flag==0)
        System.out.println("Palindrome");
    else
         System.out.println("Not palindrome");
  }
}
