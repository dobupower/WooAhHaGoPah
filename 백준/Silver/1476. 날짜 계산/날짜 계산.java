import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int e,s,m,count;
        e = s = m = count = 1;
        int E = scan.nextInt();
        int S = scan.nextInt();
        int M = scan.nextInt();
        scan.close();
        
        
        while(true){
            if(e==E && s==S && m==M) break;
            e++;
            s++;
            m++;
            count++;
            if(e>15){
                e=1;
            }
            if(s>28){
                s=1;
            }
            if(m>19){
                m=1;
            }
        }
        System.out.println(count);
    }
}