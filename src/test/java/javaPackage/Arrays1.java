package javaPackage;

public class Arrays1 {
	int aveg;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays1 a=new Arrays1();
		int arr[]={10,2,30}; //second highest numbers in the array
		
		int j=0;
		
	for(int i=0;i<arr.length;i++) {
		
		
			j=j+arr[i];
			a.aveg=j/arr.length;
		
	}
		
	System.out.println(a.aveg);

	}

}
