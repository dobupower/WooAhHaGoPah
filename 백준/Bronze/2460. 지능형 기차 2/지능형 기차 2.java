import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int people=0;
        int max=0;
        
        for(int i=0; i<10; i++){
            int getoff = scan.nextInt();
            int geton = scan.nextInt();
            
            people += geton - getoff;
            if(people>max){
                max=people;
            }
        }
        scan.close();
        
        System.out.println(max);
                
        
    }
}