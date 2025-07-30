import java.util.*;

public class CRC {
    public static int[] computeCRC(int[] data, int[] poly) {
        int[] dividend = data.clone(); 
        int polyLen = poly.length;
        for (int i = 0; i <= data.length - polyLen; i++) {
            if (dividend[i] == 1) {
                for (int j = 0; j < polyLen; j++) {
                    dividend[i + j] ^= poly[j]; 
                }
            }
        }
        int[] remainder = new int[polyLen - 1];
        for (int i = 0; i < polyLen - 1; i++) {
            remainder[i] = dividend[data.length - (polyLen - 1) + i];
        }
        return remainder;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter data");
        String data=in.nextLine();
        System.out.println("Enter Poly");
        String poly=in.nextLine();
        int length=data.length() + poly.length()-1;
        int data1[]= new int[length];
        int poly1[]=new int[poly.length()];
        for (int i=0;i<data.length();i++)
            data1[i] =data.charAt(i)-'0';
        for (int i=0;i<poly.length();i++)
            poly1[i] =poly.charAt(i)-'0';
    
        System.out.println(data1.length);
        for(int i=0;i<data1.length;i++)
            System.out.print(data1[i]+ " ");
        int rem[]=computeCRC(data1, poly1);
        System.out.print("remainder : ");
        for(int i=0;i<rem.length;i++)
            System.out.print(rem[i]+ " ");
    }
}