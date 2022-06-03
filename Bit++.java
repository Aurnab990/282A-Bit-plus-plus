import java.util.Scanner;
import java.util.*;

public class ProjectDetails {
   
    public static void main(String[] args) {
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x =0;
        
        
        for(int i=0; i<n; i++) {
        	String s = sc.next();
        	
        	 if(s.charAt(1) == '+') {
        		 x++;
        	 }
        	 else {
        		 x--;
        	 }
        	
        }
        System.out.println(x);
        
        
    }
}
