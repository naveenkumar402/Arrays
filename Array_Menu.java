import java.util.Arrays;
import java.util.Scanner;

public class Array_Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("1.Find Maximum\n2.Find Minimum\n3.Find Second Maximum"
				+ "\n4.Find Sum and average of all numbers\n5.Ascending order of array"
				+"\n6.Descending order of array");
		int ch=sc.nextInt();
		switch(ch) {
		case 1: 
			int max=a[0];
			for(int i=1;i<n;i++) {
				if(a[i]>max) max=a[i];
			}
			System.out.println("Maximum Element:"+max);
			break;
		case 2:
			int min=a[0];
			for(int i=1;i<n;i++) {
				if(a[i]<min) max=a[i];
			}
			System.out.println("Minimum Element:"+min);
			break;
		case 3:
			Arrays.sort(a);
			System.out.println("Second Largest:"+a[1]);
			break;
		case 4:
			int sum=0;
			for(int i=0;i<n;i++) {
				sum+=a[i];
			}
			System.out.println("Sum of all elements:"+sum+"\nAverage:"+(sum/n));
			break;
		case 5:
			Arrays.sort(a);
			for(int i:a)
			System.out.print(i+" ");
			break;
		case 6:
			Arrays.sort(a);
			for(int i=n-1;i>=0;i--) {
				System.out.print(a[i]+" ");
			}
			break;
		default: 
			System.out.println("Invalid Choice");
			break;	
		}

	}

}
