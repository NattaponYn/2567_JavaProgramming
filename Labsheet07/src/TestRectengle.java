
public class TestRectengle {

	public static void main(String[] args) {
		
		Rectengle r1 = new Rectengle();
		System.out.println(r1.showData());
		Spacing();
		System.out.println("Display data using toString() method");
		System.out.println(r1);
		Spacing();
		Rectengle r2 = new Rectengle(1.2f,3.4f);
		System.out.println(r2);
		
		r1.setLength(5.6f);
		r1.setLength(7.8f);
		System.out.println(r1);
		System.out.println("length is "+ r1.getLength());
		System.out.println("width is "+ r1.getWidth());
		
		Spacing();
		System.out.printf("area is %.2f%n", r1.getArea() );
		System.out.printf("perimeter is %.2f",r1.getPerimeter());
		
		System.out.printf("area is %.2f%n", r2.getArea() );
		System.out.printf("perimeter is %.2f",r2.getPerimeter());
		
		
		
		
		
	}
	
	public static void Spacing() {
		System.out.println();
	}

}
