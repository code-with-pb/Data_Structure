import java.util.*;

class Get{
	void get(int a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Element: ");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
}
class Cal extends Get{
	void cal(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}
}
class Show extends Cal{
	void show(int a[]){
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
public class B16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Show s = new Show();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		s.get(a);
		s.cal(a);
		s.show(a);
	}

}
