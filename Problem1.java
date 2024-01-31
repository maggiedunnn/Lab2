package Lab2;

public class Problem1 {

	public static void main(String[] args) {
		String[] friends  = {"Jenna", "Ellie", "Haley", "Hannah"};
		String[] names = {"Alice", "Bob", "Charlie", "David"};
		
	for (int i = 0; i < friends.length; i++) {
		if (friends[i] == names[0]) {
			System.out.println("There is a common name");
		} if (friends[i] == names[1]) {
			System.out.println("There is a common name");
		} if (friends[i] == names[2]) {
			System.out.println("There is a common name");
		} if (friends[i] == names[3]) {
			System.out.println("There is a common name");
		} else {
			System.out.println("There is not a common name");
		}
	}

	}

}
