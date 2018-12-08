package cw222ng_lab3;

public class FractionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fraction frac = new Fraction(1,1);
		Fraction secondFrac = new Fraction(2,1);
		Fraction thirdFrac = new Fraction();
		
		System.out.println("Is frac and secondFrac equal? " + frac.isEqualTo(secondFrac));
		System.out.println("Nemurator of frac is: " +Integer.toString(frac.getNumerator()));
		System.out.println("Denominator of secondFrac is: " +Integer.toString(secondFrac.getDenominator()));
		thirdFrac = frac.add(secondFrac);
		System.out.println("Frac + secondFrac = " + thirdFrac.toString());
		thirdFrac = frac.subtract(secondFrac);
		System.out.println("Frac - secondFrac = " +thirdFrac.toString());
		thirdFrac = frac.multiply(secondFrac);
		System.out.println("Frac * secondFrac = " +thirdFrac.toString());
		thirdFrac = frac.divide(secondFrac);
		System.out.println("Frac / secondFrac = " +thirdFrac.toString());

		
	}

}
