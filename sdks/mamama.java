import java.util.Scanner;
public class mamama{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        for ( int i = 1 ; i <= N ; i++ ){
            
	        for( int x = 1 ; x <= i ; x++ ) {
                System.out.print("*");
            }
            System.out.println();
		  
	    }
        scanner.close();
    }
}
