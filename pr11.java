import java.util.*;
public class pr11 {
    public static void main(String[] args) {
        System.out.println("23DIT006 VIVEK CHAVDA");
        System.out.println("--------------------");

        System.out.println("Enter Pounds");
        Scanner sc = new Scanner(System.in);
        Long p = sc.nextLong();
        convert(p);
    }
    public static void convert(Long p) {
        Long r = p*100;
        System.out.println("Converted into " + r + " Rupees");
        
    }
}

