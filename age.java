import java.util.Scanner;
public class age {
	public static void main(String []args) {
	     Scanner in = new Scanner(System.in);
	     String name=in.nextLine();
	     System.out.println("ENTER THE AGE");
	     int age=in.nextInt();
	     System.out.print("ENTER THE PRESENT YEAR ="); 
	     int year=in.nextInt();
	     int birthyear=year-age;
	     System.out.println("HII " +name.toUpperCase());
	     System.out.println("YOU ARE BORN IN "+birthyear);
	}
}	     
