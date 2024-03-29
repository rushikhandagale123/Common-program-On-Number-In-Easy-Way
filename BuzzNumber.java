import java.util.Scanner;
class BuzzNumber{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		if(num%7==0 || num%10==7){
			System.out.println("number is buzz Number");
		}
		else{
			System.out.println("number is not buzz Number");
		}
	}
}
