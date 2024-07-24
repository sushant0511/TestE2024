import java.util.Scanner;

public class TestCall {

	public static void main(String[] args) {
	
		int a,b;
		System.out.println("ENter your numbers");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		
			if(a+b>30)
		{
				TestCall.main(args);
		}
		else
		{
			System.out.println(a+b);
		}
		
		
	}
	
}
