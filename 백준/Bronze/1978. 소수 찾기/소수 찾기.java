import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        int i, j;
        int count=0;
        int arr[] = new int[N];
        
        for(i=0; i<N; i++){
            arr[i] = scan.nextInt();
        }
        scan.close();
        
        for(i=0; i<N; i++){
            for(j=2; j<=arr[i]; j++){
                if(j == arr[i]){
                    count++;
                }
                if(arr[i] % j == 0){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}