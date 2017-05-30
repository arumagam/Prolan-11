public class main{
		motor<Integer> p = new motor <Integer>(123);
		int y = p.gettype();
		Sytem.out.println("tipe yang digunaka integer" +y);
		
		Sytem.out.println("");
		Sytem.out.println(""---------);
		Sytem.out.println("");
		
		motor<String> p2 = new motor <String>("sds");
		String z = p2.gettype();
		Sytem.out.println("tipe yang digunaka integer" +z);
		
		Sytem.out.println("");
		Sytem.out.println(""---------);
		Sytem.out.println("");
		
		motor p3 = new motor<String>("asd");
		String d = (String) p3.gettype();
		Sytem.out.println("dea"  +d);
	}
}