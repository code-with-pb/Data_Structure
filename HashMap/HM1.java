import java.util.*;

public class HM1 {
	public static void main(String args[]) {
		// Hash Map is like python sets i.e [key,value]
		
		HashMap<String, Integer> s = new HashMap<>();
		
		// insertion
		
		s.put("India", 120);
		s.put("US", 20);
		s.put("China", 150);
		
		System.out.println(s);
		
		s.put("China", 180); 	// if key is already exist then value is updated
		System.out.println(s);
		
		// LookUp i.e search
		
		if(s.containsKey("Bharat")) {
			System.out.println("Present");
		}
		else {
			System.out.println("is Not Present");
		}
		
		System.out.println(s.get("India")); // this.will get value as well along with key
		System.out.println(s.get("Bharat")); // this will print null because it is not present in set
		
		// iteration on HashMap
		
		// for iteration we use diff for loop i.e
		
		int arr[] = {12,15,18};
		for(int i=0;i<arr.length;i++) { // this is usualy we use 
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int val : arr) { // this is uses in hashMap for loop
			System.out.print(val+" ");
		}
		System.out.println();
		
		
		
		
		// new for loop implement in HashMap
		for( Map.Entry<String, Integer> e : s.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		// only  for keys
		
		Set<String> keys = s.keySet();
		for(String key : keys) {
			System.out.println(key+" "+s.get(key));
		}
		
		s.remove("China");
		System.out.println(s);
	}
}
