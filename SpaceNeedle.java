//Julia Wang
//APCS Period 1

// prints an image of the seattle space needle using for loop basics.

public class SpaceNeedle {
	
	// sets a class constant to make output scalable by factor of x
	public static final int SIZE = 4;

	public static void main(String[] args) {
		bar();
		observatoryTop();
		observatoryBottom();
		bar();
		middle();
		observatoryTop();
	}
	
	public static void bar () {
		for(int i = 1; i <= SIZE; i++) {
			for(int j = 1; j <= 3*SIZE; j++) {
				System.out.print(" ");
			}
			System.out.println("||");
		}
	}
	
	// top half of observatory
	public static void observatoryTop () {		

		for(int i = 1; i <= SIZE; i++) {
			for(int j = 1; j <= -3 * i + 3 * SIZE; j++) {
				System.out.print(" ");
			}
			System.out.print("__/");
			
			for(int k = 1; k <= 3 * i - 3; k++) {
				System.out.print(":");
			}
			System.out.print("||");
			
			for(int m = 1; m <= 3 * i - 3; m++) {
				System.out.print(":");
			}
			System.out.print("\\__");
			System.out.println();
		}
		
		System.out.print("|");
		
		for(int i = 1; i <= 6 * SIZE; i++) {
			System.out.print("\"");
		}
		System.out.println("|");	
	}
		// bottom half of observatory		
		public static void observatoryBottom() {

			for(int i = 0; i < SIZE; i++) {
				for(int j = 0; j < 2 * i; j++) {
					System.out.print(" ");
				}
				System.out.print("\\_/");
				
				for(int k = 0; k < -2 * i + SIZE * 3 - 2; k++ ) {
					System.out.print("\\/");
				}
				System.out.println("\\_/");
			}
		}
		

	public static void middle() {
		for(int i = 1; i <= 4 * SIZE; i++) {
			for(int j = 1; 2 * j + 1 <= 5 * SIZE; j++) {
				System.out.print(" ");
			}
			System.out.print("|");
			
			for(int k = 1; k <= SIZE / 2; k++) {
				System.out.print("%");
			}
			System.out.print("||");
			
			for(int m = 1; m <= SIZE / 2; m++) {
				System.out.print("%");
			}
			System.out.println("|");
		}
	}
}
