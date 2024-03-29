import java.util.Scanner;
class DuckNumber{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		String num=sc.next();
		if(num.charAt(0)=='0')
		{
			System.out.println("it is a duck number");
		}
		else{
			System.out.println("is not a duck number");
		}
	}
}

