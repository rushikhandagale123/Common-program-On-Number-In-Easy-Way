import java.util.Scanner;
class SqureRoot{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a number: ");
		int num=sc.nextInt();
		int newNum=num+1;
		boolean flag=false;
		int sqrt=0;
		for(int i=1;i<=newNum/2;i++)
		{
			if(i*i==newNum)
			{
               flag=true;
               sqrt=i;
               break;
			}

		}
		if(flag){
			System.out.println(sqrt+  " is a Sunny Number");
		}
		else{
			System.out.println(num+ " is not a sunny number");
		}
	}
}