import Programmotor.biodata;
import Sourcemotor.motor1;
import sourceinterface.isidata;

public class main {
    private String nama;
	String nama_pemilik;
	byte banyak,banyakisi;
	int harga;
	
public static void main (String[] args){
	motor1 aa = new motor1();
	aa.data();
	aa.overloading1("Beli 1 motor = Rp.12.000.000");
	aa.overloading2("Beli 3 ","Dapat jaket exlusif ");
	
	bio bb = new biodata();
	bb.setnama("Arum Agam Nugraha");
	bb.settempat("Lirik / 26 maret 1997");
	bb.setjeniskl("Laki-Laki");
	bb.setumur(20);
	System.out.println("\n====================Data Nota====================");
	System.out.println("Nama                 :"+bb.getnama());
	System.out.println("Tempat Tanggal Lahir :"+bb.gettempat());
	System.out.println("Jenis Kelamin        :"+bb.getjeniskl());
	System.out.println("Umur                 :"+bb.getumur());
	System.out.println("=================================================");
	
	isidata cc = new isidata();
	System.out.println("\n============================ Biodata ================================");
	System.out.print("Nama Pembeli 			: ");cc.NamaLengkap();
	System.out.print("Tempat Tanggal Lahir 		: ");cc.Ttl();
	System.out.print("Alamat				: ");cc.Alamat();
	System.out.print("Pekerjaan			: ");cc.Pekerjaan();
	System.out.print("Uang Bulanan		 	: ");cc.UangBulanan();
	System.out.println("=====================================================================");
	
	 Generic <String> GenericString = new Generic <> ();
                System.out.print("Sekian dan terima kasih : ");
                GenericString.setTipe("Arum Agam");
                System.out.println(GenericString.getTipe());

	}
}