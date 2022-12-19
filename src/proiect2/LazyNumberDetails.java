package proiect2;

public class LazyNumberDetails {
	private int number;
	private boolean isPrimeNumberCalculate;
	private boolean isPerfectNumberCalculate;
	private boolean isMagicNumberCalculate;
	private boolean primeNumberResult;
	private boolean perfectNumberResult;
	private boolean magicNumberResult;

	public LazyNumberDetails(int number) {
		updateNumber(number);
	}

	public void updateNumber(int number) {

		this.number = number;
		System.out.println("none");
		isPrimeNumberCalculate = false;
		isPerfectNumberCalculate = false;
		isMagicNumberCalculate = false;

	}

	public boolean isPrime() {
		if (isPrimeNumberCalculate == true) {
			System.out.println("cached ");// + primeNumberResult);
		}
		if (isPrimeNumberCalculate == false) {
			System.out.println("!!intens computation!!");
			primeNumberResult = primeCheck();
			isPrimeNumberCalculate = true;

		}
		// System.out.println("cached " + primeNumberResult);
		return primeNumberResult;
	}

	public boolean isPerfect() {
		if (isPerfectNumberCalculate == true) {
			System.out.println("cached ");// + perfectNumberResult);
		}
		if (isPerfectNumberCalculate == false) {
			System.out.println("!!intens computation!!");
			perfectNumberResult = perfectCheck();
			isPerfectNumberCalculate = true;

		}
		// System.out.println("cached " + perfectNumberResult);
		return perfectNumberResult;
	}

	public boolean isMagic() {
		if (isMagicNumberCalculate == true) {
			System.out.println("cached "); //+ magicNumberResult);
		}
		if (isMagicNumberCalculate == false) {
			System.out.println("!!intens computation!!");
			magicNumberResult = magicCheck();
			isMagicNumberCalculate = true;

		}
		// System.out.println("cached " + magicNumberResult);
		return magicNumberResult;
	}

	public boolean primeCheck() {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean perfectCheck() {
		int sum = 0;
		for (int d = 1; d < number; d++) {
			if (number % d == 0) {
				sum += d;
			}
		}
		return sum == number;
	}

	public boolean magicCheck() {
		int result = reduceNumber(number);
		if ((result == 3) || (result == 7) || (result == 9)) {
			return true;
		}
		return false;
	}

	private int reduceNumber(int n) {
		while (n > 9) {
			n = sumDigit(n);
		}
		return n;
	}

	private int sumDigit(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

}
