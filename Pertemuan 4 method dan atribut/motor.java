public class motor {
	public String Honda;
	public static void main (int[]args) {
	motor motor = new motor();
	motor.motorTampilkan2("Belajar java yuks");
	System.out.println(motor.kembalikanNilai(3, 5));
}
private void motorTampilkan() {
		System.out.println("Belajar Java yuks 1");
		}
private int kembalikanNilai() {
		return 1;
		}
private void motorTampilkan2(String stang) {
		System.out.println(stang);
		}
private int kembalikanNilai(int stang, int velg) {
		return stang + velg;
		}

	
	
	public void mesin () {
		System.out.println("\tMesin");
	}
	public void gear () {
		System.out.println("\tGear");
	}
	public void busi () {
		System.out.println("\tBusi");
	}
	public static void main (String[]args) {
	
	motor beat = new motor();
	
	beat.Honda = "Honda beat";
	beat.mesin();
	beat.gear();
	beat.busi();
	}
  }