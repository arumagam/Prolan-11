public class motor {
	public String Honda;
	public int hargacicilanbulanan;
	public String alamatdialer;
    	public byte beratmotor;
    	public int hargamotor;	
	
	
	public void mesin () {
		System.out.println("\tMesin");
	}
	public void alamatdialer () {
		System.out.println("\talamatdialerJln.Dipatiukur");
	}
	public void gear () {
		System.out.println("\tGear");
	}
	public void busi () {
		System.out.println("\tBusi");
	}
	public static void main (String[]args) {
	
	motor vario = new motor();
	
	vario.Honda = "Honda vario";
	vario.hargacicilanbulanan = 220000;
	vario.alamatdialer = "Jln.Dipatiukur";
	vario alamatdialer();
	vario.mesin();
	vario.gear();
	vario.busi();
	}
  }