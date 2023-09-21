import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        int count=0;
        
        for(int i=1; i<s.length(); i++){
            
            if(s.charAt(i) == ' '){
                count++;
            }
        }
        
        if(s.charAt(s.length()-1) == ' '){
            count--;
        } 
           
        System.out.println(count+1);
    }
}