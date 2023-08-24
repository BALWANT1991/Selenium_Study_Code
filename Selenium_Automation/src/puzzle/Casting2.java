package puzzle;

public class Casting2 extends puzzle.Casting1 {

	public void b() {
		System.out.println("bye");
	}
	
	public static void main(String[] args) {
		Casting1 a1=new Casting1();
		a1.a();

		Casting2 b1=new Casting2();
		b1.b();
		b1.a();

		Casting1 c1=new Casting2();
		c1.a();
		
//		Casting2 d1= new Casting1();
//		d1.b();
		

	}

}
