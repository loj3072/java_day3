package edu.skku.java.cms;

public class Test {

	public static void main(String[] args) {
		Car c = new Car();
		Car c1 = new Car("11��1234",5000);
		Bus c2 = new Bus();
		Bus c3 = new Bus("44ȣ6543",8000,45);
		Truck c4 = new Truck("74��3645",9000,3);
		
		c.start();
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

	}

}
