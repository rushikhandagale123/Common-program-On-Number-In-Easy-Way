import java.util.Scanner;
class SqureRoot{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a number: ");
		int num=sc.nextInt();
		boolean flag=false;
		int sqrt=0;
		for(int i=1;i<=num/2;i++)
		{
			if(i*i==num)
			{
               flag=true;
               sqrt=i;
               break;
			}

		}
		if(flag){
			System.out.println(sqrt+  " is a perfecct SqureRoot of num " +num);
		}
		else{
			System.out.println(num+ " do not have a perfect sqr rt");
		}
	}
}