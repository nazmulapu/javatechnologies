package exercise1;

public class DigitSum {
	
	public static int sum(int number) {
		int sum = 0;
		
		String text = String.valueOf(number);
		
		for (int i =0; i < text.length(); i++){
			int digit = Character.digit(text.charAt(i), 10);
			sum += digit;
		}
		
		return sum;
	}
	
	public static int sum2(int number) {
		int sum = 0;
				while (number > 0){
					
					int digit = number % 10;
					sum += digit;
					number = number / 10;
				}
		return sum;
		
	}
	
	public static void main(String[] args){
		System.out.println(sum(123));
		System.out.println(sum2(123));
	}

}
