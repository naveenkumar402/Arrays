import java.util.Scanner;

public class ArrayLarSml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int min=a[0];
		for(int i:a) {
			if(i>max) max=i;
			if(i<min) min=i;
		}
		System.out.println("Largest:"+max+"\nSmallest:"+min);

	}

}
