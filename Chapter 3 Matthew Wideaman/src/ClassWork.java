
public class ClassWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = true;
		long s = System.currentTimeMillis();
		System.out.println(s);
		System.out.println(s/1000/60/60/24/365.25);
		if(s%10 == 4 && s%2==0) {
			System.out.println("it ends in 4 or 2");
			
		}
	}

}
