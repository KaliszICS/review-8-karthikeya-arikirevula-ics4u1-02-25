public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static String pluralize(String word) {
		if (word.toLowerCase().endsWith("ey")) {
			return "eys";
		} else if (word.toLowerCase().endsWith("y")) {
			return "ies";
		} else if (word.toLowerCase().endsWith("ife")) {
			return "ives";
		} else {
			return "s";
		}
	}

	public static int min(int num1, int num2, int num3) {
		if (num1 < num2 && num1 < num3) {
			return num1;
		} else if (num2 < num1 && num2 < num3) {
			return num2;
		} else {
			return num3;
		}
	}

	public static boolean isLeapYear(int number) {
		if (number % 4 == 0) {
			if (number % 100 == 0) {
				if (number % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
}
