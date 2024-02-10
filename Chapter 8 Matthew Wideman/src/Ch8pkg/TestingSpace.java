package Ch8pkg;

public class TestingSpace {
	
	public static void main(String[] args) {
		Problem1();
		Problem7();
		Problem9();
	}

	public static void Problem1() {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		Rectangle rectangle2 = new Rectangle();
		rectangle.width = 4;
		rectangle.height = 40;
		rectangle2.width = 3.5;
		rectangle2.height = 35.9;
		System.out.println("The area and perimeter of the rectangle of width " + rectangle.width + " and height " + rectangle.height + " is: " + rectangle.getArea() + " and " + rectangle.getPerimeter() + ".");
		System.out.println("The area and perimeter of the rectangle of width " + rectangle2.width + " and height " + rectangle2.height + " is: " + rectangle2.getArea() + " and " + rectangle2.getPerimeter() + ".");
		System.out.println();
	}
	public static void Problem7() {
		Account act = new Account(1122, 20000.00, 4.5);
		act.withdraw(2500);
		act.deposit(3000);
		
		System.out.println("The account of ID: " + act.getId() + "'s balance is: " + act.getBalance() + ", the monthly interest is " + act.getMonthlyInterest() + ", and was created on " + act.getDateCreated() + ".");
		System.out.println();
	}
	public static void Problem9() {
		RegularPolygon poly = new RegularPolygon();
		RegularPolygon poly2 = new RegularPolygon(6, 4.0);
		RegularPolygon poly3 = new RegularPolygon(10, 4.0, 5.6, 7.8);
		System.out.println("The perimeter of the polygon is " + poly.getPerimeter() + " and the area is " + poly.getArea() + ".");
		System.out.println("The perimeter of the second polygon is " + poly2.getPerimeter() + " and the area is " + poly2.getArea() + ".");
		System.out.println("The perimeter of the third polygon is " + poly3.getPerimeter() + " and the area is " + poly3.getArea() + ".");
	}

}
