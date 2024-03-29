import java.util.Scanner;
class SpyNumber{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a number: ");
		int num=sc.nextInt();
		int sum=0;
		int dup=num;
		int product=1;
		if(num!=0){
			int rem=num%10;
			sum+=rem;
			product*=rem;
			num /=10;
		}
		if(sum==product){
			System.out.println( dup+"number is spy number");
		}
		else{
			System.out.println(dup+ " is not a spy number");
		}
		
	}
}