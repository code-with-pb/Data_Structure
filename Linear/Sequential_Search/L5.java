import java.util.*;

class gr{
	public int k;

	void get(int a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Element: ");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println();
		
		System.out.print("Enter Key Element: ");
		k = sc.nextInt();
	}
}
class Ls1 extends gr{
	int find(int a[]) {
		int k = super.k; 
		int i=0;
		int n=a.length;
		while(i<n) {
			if(k == a[i]) {
				return i;
			}
			i++;
		}
		return -1;
	}
}
class Sh1 extends Ls1{
	void show(int a[]) {
		int k = super.k;
		int i = super.find(a);
		if(i == -1) {
			System.out.println("Not Found: ");
		}
		else {
			System.out.println(k+" is Present at index: "+ i);
		}
	}
}
public class L5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("Enter Length: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		Sh1 o = new Sh1();
		o.get(a);
		o.find(a);
		o.show(a);
		
	}

}
