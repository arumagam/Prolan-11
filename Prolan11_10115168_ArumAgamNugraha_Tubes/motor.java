package Sourcemotor;
public abstract class motor {
    private String nama;
	String nama_pemilik;
	byte banyak,banyakisi;
	int harga;

	protected abstract String getNama();
	protected abstract void setNama(String nama);
	protected abstract void cetakNama();
	protected abstract void overloading(String jum1);
	protected abstract void overloading1(String jum2);
	protected abstract void overloading2(String jum3, String jum4);
	protected abstract void getName();
	protected abstract void data() ;
}