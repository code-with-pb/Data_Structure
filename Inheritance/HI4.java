import java.util.*;

class Gtrs{
    void get(int a[]){
        System.out.print("Enter Element: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
    }
}
class Call extends Gtrs{
    void cal(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j] > a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
    }
    void show(int a[]){
        System.out.println("after bubble sort: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
class Sss extends Gtrs{
    void cal(int a[]){
        for(int i=0;i<a.length;i++){
            int t = i;
            for(int j=i+1;j<a.length;j++){
                if(a[j] < a[t]){
                    t = j;
                }
            }
            int s = a[t];
            a[t] = a[i];
            a[i] = s;
        }
    }
    void show(int a[]){
        System.out.println("before Selection sort: ");
        for(int  i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
class Is extends Gtrs{
    void cal(int a[]){
        for(int i=0;i<a.length;i++){
            int t = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > t){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = t;
        }
    }
    void show(int a[]){
        System.out.println("After Insertion sort: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}

public class HI4
{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		int i = 0;
		
		Gtrs o;
		o = new Gtrs();
		
		o.get(a);
		
		Call o1 = new Call();
		Sss o2 = new Sss();
		Is o3 = new Is();
		
		do{
		    System.out.print("Enter No: ");
		    int s = sc.nextInt();
		    
		    switch(s){
		        case 1: o1.cal(a);
		                o1.show(a);
		                break;
		        case 2: o2.cal(a);
		                o2.show(a);
		                break;
		        case 3: o3.cal(a);
		                o3.show(a);
		                break;
		        default : 
		                System.out.println("Invalid Input....");
		    }
		  i++;  
		}while(i<=2);
		
	}
}