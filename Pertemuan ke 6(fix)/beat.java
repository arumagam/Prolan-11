class beat extends motor {
	String nama;

    public void jalan() {
        System.out.println("Beat itu motor");
		super.jalan();
    }
	
	public void busi () {
		System.out.println("Lis Body");
		super.busi();
	}
	public void mesin () {
		System.out.println("Mesin Harley");
		super.mesin();
	}
	public void motor() {
        System.out.println("Permak Body");
		super.motor();
    }
	beat (String nama) {
		super(nama);
		System.out.println("Overide");
	}

    public static void main(String args[]) {
        motor beat = new motor("Moge");
        beat oli = new beat("Moge");
		oli.jalan();
		beat.motor();
		beat.gear();
		oli.motor();
		oli.mesin();
		oli.busi();
		beat.over("Motor Mahal");
		beat.over1("Motor Babe ", "Motor Emak");
    }
}
