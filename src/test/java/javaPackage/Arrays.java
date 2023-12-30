package javaPackage;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,20};
		
		/*for(int i=0;i<array.length;i++) {
			int j=array[i];
			System.out.println(j);
			
		}
		
		for(int j:array) {
			System.out.println(j);
		}
*/
		//changing array value
		array[0]=40;
		
		for(int j:array) {
			System.out.println(j);
		}
		
	}

}
