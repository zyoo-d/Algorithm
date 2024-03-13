import java.util.Scanner;
public class Main {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int sum = 0;
				
		num = scan.nextInt();
		sum = num*(num+1)/2;
		System.out.println(sum);
		
	}
}