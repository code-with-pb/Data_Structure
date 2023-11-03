
public class S8 {
	void cal(int a[]) {
		int i,j,s;
		for(i=0;i<a.length-1;i++) {
			s = i;
			for(j=i+1;j<a.length;j++) {
				if(a[j] < a[s]) {
					s = j;
				}
			}
			int t = a[s];
			a[s] = a[i];
			a[i] = t;
		}
		
		System.out.println(a.length);
		
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int i,j;
		int a[] = {8,9,2,5,7,1,6,4,3};
		S8 o = new S8();
		o.cal(a);
		}
	}
