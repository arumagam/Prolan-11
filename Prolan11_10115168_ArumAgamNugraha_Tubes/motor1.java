package Sourcemotor;

public class motor1 extends motor {

    private String nama;
	String nama_pemilik;
	int harga;
	
    @Override
    protected String getNama() {
        return nama;
    }
 
    @Override
    protected void setNama(String nama) {
        this.nama = nama;
    }
 
    @Override
    protected void cetakNama() {
        System.out.println(nama);
    }	
    @Override
	public void overloading(String jum1){
		System.out.println(jum1);
	}	
	
    @Override
	public void overloading1(String jum2){
		System.out.println(jum2);
	}
	
    @Override
	public void overloading2(String jum3, String jum4){
		System.out.println(jum3 + jum4);
	}
	
    @Override
	public void getName () {
		System.out.println("Tugas Pertemuan 6 : " +nama);
	}

	
    @Override
	public void data (){
		System.out.println("========================================");
		System.out.println("Nama Pemilik        : Arum Agam Nugraha");
		System.out.println("Banyak motor        : 3 motor");
		System.out.println("Total Harga         : 150000000");
		System.out.println("Banyak Isi Lemari   : 32");
		System.out.println("========================================");
	}
}