import java.util.Scanner;
public class Day27 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    	
    	System.out.print("Masukkan nilai pertama: ");
    	int nilai1 = in.nextInt();
    	
    	System.out.print("Masukkan nilai kedua: ");
    	int nilai2 = in.nextInt();
    	
    	boolean sama = (nilai1 == nilai2);
    	boolean beda = (nilai1 != nilai2);
    	
    	System.out.println("Nilai1 sama dengan nilai2 : " + sama);
    	System.out.println("Nilai1 berbeda dengan nilai2 : " + beda);
    	
}
}
