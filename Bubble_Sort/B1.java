import java.util.*;

public class B1 {		
	public static void printA(int a[]) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int []a = {6,5,9,2,8,1};
		
		//Bubble Sort
		for(int i=0;i<a.length-1;i++) {
			for(int j=0; j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					//Swap
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		printA(a);
	}
}
