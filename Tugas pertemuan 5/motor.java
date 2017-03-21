public class motor {
    private String nama;
	String nama_pemilik;
	String vario,beat,astrea,megapro,civic;

	
	
	protected String getNama() {
        return nama;
    }
 
    protected void setNama(String nama) {
        this.nama = nama;
    }
 
    protected void cetakNama() {
        System.out.println(nama);
    }
 
    motor (String nama) {
		this.nama = nama;
	}
	
	public void getName () {
		System.out.println("Tugas Pertemuan 5 : " +nama);
	}
	
	public void data (){
		System.out.println("Nama Pemilik        : "+nama_pemilik);
		System.out.println("Banyak Beat     	: "+beat);
		System.out.println("Banyak Vario  		: "+vario);
		System.out.println("Banyak Megapro      : "+megapro);
		System.out.println("Banyak Astra    	: "+astrea);
		System.out.println("Banyak Civic    	: "+civic);
		System.out.println("========================================");
	}
}