import java.util.*;

class Gst{
	void get(int a[]) {
		int i,n=a.length;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Element: ");
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println();
	}
}

class Bb1 extends Gst{
	void cal(int a[]) {
		System.out.println("Before Bubble sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int i,j;
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}
	void show(int a[]) {
		System.out.println("After Bubble sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}

class Ss1 extends Gst{
	void cal(int a[]) {
		System.out.println("Before Selection Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int i,j,n=a.length;
		for(i=0;i<n;i++) {
			int t = i;
			for(j=i+1;j<n-1;j++) {
				if(a[j] < a[t]) {
					t = j;
				}
			}
			int s = a[t];
			a[t] = a[i];
			a[i] = s;
		}
	}
	void show(int a[]) {
		System.out.println("After Selection sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Is1 extends Gst{
	void cal(int a[]) {
		System.out.println("Before Selection sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int i,j,n=a.length;
		for(i=0;i<n;i++) {
			int t = a[i];
			j=i-1;
			while(j>=0 && a[j] > t) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
		}
	}
	void show(int a[]) {
		System.out.println("After Selection sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
public class HI1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Length: ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		int no;
		
		Gst o3 = new Gst();
		o3.get(a);
		
		System.out.println("Enter Number 1}bubble sort");
		System.out.println("Enter Number 2)selection sort");
		System.out.println("Enter Number 3)insertion sort");
		
		
		Ss1 o = new Ss1();
		Bb1 o1 = new Bb1();
		Is1 o2 = new Is1();
		
		int i = 0;
		
		do {
			no = sc.nextInt();
			switch(no) {
				case 1: o1.cal(a);
						o1.show(a);
						break;
				case 2: o.cal(a);
						o.show(a);
						break;
				case 3: o.cal(a);
						o.show(a);
						break;
				default:
					System.out.println("Wrong Number......");
					break;
			}
		i++;
		}while(i < 3);
	}

}
