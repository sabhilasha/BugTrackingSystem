
public class Math {
	public int add(int... numbers) {
		int result=0;
		int counter=0;
		while(counter <numbers.length) {
			result+=numbers[counter++];
		}
		return result;
	}
	/**
	 * takes 2 numbers and multiply them
	 * @author Abhilasha
	 */
	public int multiply(int... numbers) {
		
		int result=1;
		int counter=0;
		while(counter <numbers.length) {
			int currentNumber= numbers[counter++];
			if(currentNumber <0) {
				throw new IllegalArgumentException();
			}
			result*=currentNumber;
		}
		return result;
		/*/using for loop
		 int result = 1;
        int count = 0;
       while (count < numbers.length) {
           result *= numbers[count++];
          
       }
       return result;/*/
		//return 0;
	}

}
