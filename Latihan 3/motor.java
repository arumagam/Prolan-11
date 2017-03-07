public class motor {
	public String Honda;
	
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