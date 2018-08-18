package recursion;

public class Main {

	public static void main(String[] args) {
		HeadTailRecursion ht = new HeadTailRecursion();
		
		int n = 5;
		System.out.println("---HEAD---");
		ht.headRecursion(n);
		System.out.println("---TAIL---");
		ht.tailRecursion(n);
	}

}
