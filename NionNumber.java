import java.util.Scanner;
class NeonNumber
{
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a number");
	int num=sc.nextInt();
	int sum=0;
	int sqr=num*num;
	while(sqr!=0)
		{
			int rem =sqr%10;
			 sum +=rem;
			sqr/=10;

		}
		System.out.println(sum==num ?num+" neon number": +num+ " not a neon number");

}
}