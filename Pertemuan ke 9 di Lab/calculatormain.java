import java.util.*;
import java.io.*;

public class calculatormain {
	public static void main(String[] args) {
		double operan1, operan2;
		arum cal = new arum();
		
		Scanner input = new Scanner (System.in);
		operan1 = input.nextDouble();
		operan2 = input.nextDouble();
		
		System.out.println("Hasil pertambahan adalah:"+cal.hasilTambah(operan1, operan2));
		System.out.println("Hasil pengurangan adalah:"+cal.hasilKurang(operan1, operan2));
		System.out.println("Hasil pertambahan adalah:"+cal.hasilKali(operan1, operan2));
		System.out.println("Hasil pertambahan adalah:"+cal.hasilBagi(operan1, operan2));
	}
}