import java.util.Scanner;
public class nilaimaxmin{
	public static void main (String[] args ) {
	Scanner input = new Scanner (System.in);
	int Bilangan[] = new int [9999];
	int max=0, A=0, B=0, Max = 0, Min = 10000000;
	
	System.out.print ("Masukan Angka : ");
	
	int in = input.nextInt();
	System.out.println("======================================");	
	
	for (int y=1; y<=in; y++){
		System.out.print("Bilangan ke-"+y+" = ");
		Bilangan[y] = input.nextInt();
		
		
	}
	System.out.println("======================================");
	System.out.print("\nBilangan = ");
	for(int y=1; y<=in; y++) {
		System.out.print(Bilangan[y]+"  ");
	}
	for(int y=1; y<=in; y++){
		if(Bilangan[y]>Max){
			Max=Bilangan[y];
		}
	}
	for(int y=1; y<=in; y++){
		if(Bilangan[y]<Min){
			Min=Bilangan[y];
		}
	}
	System.out.println("\n======================================");	
	System.out.println("\nBilangan Max adalah : "+ Max);
	System.out.println("\nBilangan Min adalah : "+ Min);	
	System.out.println("======================================");
}
}