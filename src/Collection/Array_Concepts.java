package Collection;

public class Array_Concepts {

	public static void main(String[] args) {
		 int a[]=new int[5];
		 a[0]=10;
		 a[1]=20;
		 a[2]=30;
		 a[3]=40;
		 a[4]=40;
//		 a[5]=60;   // ArrayIndexOutOfBoundsException
		 
//		 System.out.println(a[0]);
		 
		 for(int i=0; i<a.length;i++) {
			 System.out.println(a[i]);   //10,20,30,40,40
		 }

	}

}
