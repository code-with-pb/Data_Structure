import java.util.*;

class gd{
	public static int k;
	void get(int a[]) {
		int i,n=a.length;
		System.out.print("Enter Element: ");
		Scanner sc = new Scanner(System.in);
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println();
		
		System.out.print("Enter Key: ");
		k = sc.nextInt();
	}
	
	void show(int a[]) {
		System.out.println("Before Searching: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Key index we have to find is: "+k);
	}
}
class Ls extends gd{
	int Ss(int a[]) {
		
		int k = super.k;
		
		//System.out.println(k);
		
		int i=0;
		int n = a.length;
		while(i<n){
			if(k == a[i]) {
				return i;
			}
			i++;
		}
		return -1;
	}
	void show(int a[]) {
		int k = super.k;
		int i = Ss(a);
		if(i == -1) {
			System.out.println("Not Found: ");
		}
		else {
			System.out.println(k+" is Present at index: "+ i);
		}
	}
}
class Bj extends gd{
	
	int k = super.k;
	
	int bs(int a[]) {
		
	
		
		//System.out.println(k);
		
		int s = 0,e = a.length-1;
		
		while(s <= e ) {
			int m = (s+e)/2;
			
			if(k == a[m]) {
				return m;
			}
			else if(k > a[m]) {
				s = m+1;
			}
			else {
				e = m-1;
			}
		}
		return -1;
	}
	/*void show(int a[]) {
		int k = super.k;
		int i = bs(a);
		if(i == -1) {
			System.out.println("Not Found: ");
		}
		else {
			System.out.println(k+" is Present at index: "+ i);
		}
	}*/
}
public class HI3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		j = sc.nextInt();
		
		int a[] = new int[j];
		
		int k;
		
		gd o = new gd();
		o.get(a);
		o.show(a);
		
		Ls o1 = new Ls();
		Bj o2 = new Bj();
		
		i=0;
		
		System.out.println("1)Linear Search 2)Binary Search");
		
		
		do {
			System.out.print("Enter No: ");
			n = sc.nextInt();
			
			switch(n) {
				case 1 : o1.Ss(a);
						 o1.show(a);
						/*int s = o1.Ss(a);
						if(s == -1) {
							System.out.println("Not Found...");
						}
						else {
							System.out.println("Found at index no: "+ s);
						}*/
						break;
				case 2 : /*o2.bs(a);
						 o2.show(a);*/
						  int s = o2.bs(a);
						  if(s == -1) {
							System.out.println("Not Found...");
						   }
						  else {
							System.out.println("Found at index no: "+ s);
						  }
						break;
				default :
					 System.out.println("Invalid input....");
					 break;	
			}
			i++;
		}while(i<2);
		
		
	}

}
