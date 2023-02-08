import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        
        int n = scanner.nextInt();
        int max = -1000001;
        int min = 1000001;
        
        for(int i=1; i<=n; i++){
            int x = scanner.nextInt();
            if(x > max){
                max = x;
            }
            if(x < min){
                min = x;
            }
        }
        System.out.println(min + " " + max);
		
        
        
        
    }
}
