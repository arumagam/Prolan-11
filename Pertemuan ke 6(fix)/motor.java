class motor {
	String nama;
	
	motor (String nama) {
		this.nama=nama;
	}

    public void motor() {
        System.out.println("Motor Merk Honda");
    }
	public void mesin () {
		System.out.println("Mesin");
	}
	public void gear () {
		System.out.println("Gear");
	}
	public void busi () {
		System.out.println("Busi");
	}
	public void over(String rantai){
		System.out.println(rantai);
	}
	public void over1(String rantai1, String rantai2){
		System.out.println(rantai1+ rantai2);
	}
	public void jalan () {
		System.out.println("Sekeloa");
	}
}