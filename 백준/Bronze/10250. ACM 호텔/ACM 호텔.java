import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int T = scan.nextInt();
        int floor;
        int ho;
        
        // 모든 사람은 호텔에 들어오면 1호 방부터 배정받는다 ex) 101->201->301->401-> 102->202->302
        
        for(int i=0; i<T; i++){
            
            int H = scan.nextInt(); //층의 개수
            int W = scan.nextInt(); //방의 개수
            int N = scan.nextInt(); //들어온 사람수 
            
            floor = N % H; // 층 
            ho = N / H; // 호 
            
            if(floor == 0){ 
                floor = H;  // 6 % 6 = 0 으로 0층을 배정 받는다. 
                            // 그런데 실제로는 가장 높은 층인 H층을 배정 받아야 하기 때문에 예외 처리를 한다. ex)601호
                ho--;       // 6 / 6 = 1 으로 2호를 배정 받는다. 
                            // 그런데 실제로는 601호를 배정 받아야 하기 때문에 -1을  해준다.
                            
            }
            floor *= 100;
            
            floor = floor + ho + 1; //호는 1호부터 시작하기 때문에 1을 더해준다.
            System.out.println(floor);
        }
        
        scan.close();
        
    }
}