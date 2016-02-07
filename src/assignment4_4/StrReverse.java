package assignment4_4;
import java.util.Scanner;
public class StrReverse {

	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		System.out.println("String will be stored in an array and will be printed in reverse order.");
		System.out.println("Enter String: ");
		String inp=scnr.nextLine();
		int inplen=inp.length();
		//System.out.println("Size of Array : "+inplen);
		String[] arr=new String [inplen];
		int k=0;
		for (int i=0; i<inplen; i++){
			k=i+1;
			if(k<=inplen){
			arr[i]=inp.substring(i,k);
			//System.out.println("Entered values (From stored array): "+arr[i]);
			}
		}
		System.out.println("Reverse order");
		for(int j=inplen-1; j>=0; j--){
			System.out.println(arr[j]);
		}
		scnr.close();
	}

}
