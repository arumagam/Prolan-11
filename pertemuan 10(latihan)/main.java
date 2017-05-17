public class main {
	public static void main (String[] args) {
	
	motor mtr = new motor();

	mtr.setnama("Beat");
	mtr.getbanyak();
	mtr.setbanyak(1000);
	mtr.getgear();
	mtr.setgear(123);
	mtr.getrantai();
	mtr.setrantai(123);
	System.out.println("nama	:"+mtr.getnama());
	System.out.println("banyak	:"+mtr.getbanyak());
	System.out.println("gear	:"+mtr.getgear());
	}
}