import java.util.Arrays;
import java.util.Scanner;

public class SumofArrayElements {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		System.out.println("Sum of Array elements:"+sum);
		System.out.println("Average:"+(sum/n));
	}

}
