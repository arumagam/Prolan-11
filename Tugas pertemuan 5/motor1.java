public class motor1 extends motor {
	
    @Override
    public void cetakNama() {
        System.out.println("         " + super.getNama()); //Super Dan Override
    }
	
	public motor1 (String name) { // Super Pada Konstruktor
		super(name);
	}
	
	
	public void data_pemilik () { // Super Pada Method
		nama_pemilik = "Arum Agam Nugraha";
		megapro = "13";
		vario = "20";
		beat = "23";
		vario = "12";
		astrea = "18";
		civic = "22";
		super.data();
	}
	
	public static void main(String[] args) {
        motor1 pemilik = new motor1("Tugas Pertemuan 5");
        pemilik.setNama("Tugas Pertemuan 5");
        pemilik.cetakNama();
		pemilik.data_pemilik();
		pemilik.getName();
    }
}