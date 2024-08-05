import java.util.Scanner;
public class selection {
   public static void main( String [] args) {
       Scanner in=new Scanner(System.in);
       System.out.println("ENTER THE NUM OF ELEMENTS");
       int n=in.nextInt();
       int[] a = new int[n];
       for ( int i=0;i<n;i++) 
          a[i]=in.nextInt();
       selectionSort(a);
       System.out.println("SORTED ELEMENETS::");
       for(int i=0;i<n;i++) 
          System.out.print(a[i]+" ");
     }     
   public static void selectionSort (int[] a) {
          int n= a.length;
          for(int i=0;i<n;i++) {
            int min=i;
            for(int j=i+1;j<n;j++)  
               if(a[min] >a[j]) 
                  min=j;
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
          }
   }
}
