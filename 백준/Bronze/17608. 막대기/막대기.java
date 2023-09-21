import java.util.Scanner;
import java.util.Stack;

public class Main
{
	public static void main(String[] args) {
		
		int max,h,next;
		int count=1;
		
		Stack<Integer> stack = new Stack<>();
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for(int i=0; i<N; i++){
		    h = scan.nextInt();
		    stack.push(h);
		}
		
		scan.close();
		
		max = stack.pop();
		
		for(int i=0; i<N-1; i++){
		    next=stack.pop();
		    if(max < next){
		        max = next;
		        count++;
		    }
		}
		System.out.println(count);
	}
}