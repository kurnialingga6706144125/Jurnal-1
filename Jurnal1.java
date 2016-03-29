package jurnal;


import java.util.Scanner;

public class Jurnal1 {
        public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		System.out.print("Inputan: ");
		int n= a.nextInt();
                int hasil=0;
		for(int i=1;i<=n;i++){
                   hasil=hasil+jun(i);
                }	
		System.out.println(hasil);
        }
	private static int jun(int n){
		int f;
		if(n==1 || n==2){
                    f=1;
                }
                else{
                    f = jun(n-1) + jun(n-2);
                }
		return f;
        }
}
