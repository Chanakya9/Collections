import java.util.Arrays;
import java.util.Scanner;

public class PureArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		/*	int[] a = new int[3]; 
		int b[] = new int[5];
		int c[] = {97,98,99};
		b[0]=4;
		b[4]=1;
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
        for (int j : a){
	        System.out.println(j);
        }	
    	for (int k : b)
		System.out.println(k);
		for (int l : c)
		System.out.println(l);  */
		int[] c = new int[] {97,98,99};
		
		
		System.out.println(Arrays.toString(c));
String[] s1 = new String[4];


for(int i=0;i<s1.length;i++)
	s1[i]=sc.nextLine();

for(String s : s1)
	System.out.println(s);
sc.close();}
}
