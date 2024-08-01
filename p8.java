import java.util.*;
public class p8 {
 static public void transform()
{
    System.out.println("23DIT006 VIVEK CHAVDA");
    System.out.println("--------------------");
    System.out.println("Enter String");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int n = s.length();
    for(int i=0;i<n;i++)
    {
        System.out.print(s.substring(i,i+1)+s.substring(i,i+1));
    }
}

    public static void main(String[] args) {
     transform(); 
    }
    
}

