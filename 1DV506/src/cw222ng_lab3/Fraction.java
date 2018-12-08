package cw222ng_lab3;

public class Fraction {
	
	int T;
	int N;
	
	
	public Fraction (int T,int N) {
		
		if(N == 0) {
			throw new ArithmeticException("Can't divide by 0!");
		}
		this.N = N;
		this.T = T;
		
	}
	
	public Fraction () {
		this.N =1;
		this.T =1;
	}
	public int getNumerator() {
		return T;
	}
	
	public int getDenominator() {
		return N;
	}
	
	public boolean isNegative() {
		if(T<0 && N>0) 
			return true;
		else if(T>0 && N<0)
			return true;
		
		return false;	
	}
	public Fraction add (Fraction frac) {
		Fraction result = new Fraction(this.T,this.N);
		Fraction temp = new Fraction(frac.T,frac.N);
		result.T = frac.T;
		result.N = frac.N;
		temp.T = this.T;
		temp.N = this.N;
		if(frac.N > 0 && N >0) { // Kollar som nämnaren inte är 0
		if(frac.N != N) {        // Har de inte samma nämnare, fixar jag så de har det.
			result.T = result.T * N;
			result.N = result.N * N;
			temp.T = frac.T * temp.T;
			temp.N = frac.N * temp.N;
		
		result.T = result.T + temp.T;
		result.N = result.N;
		}else { // Annars bara addera ihop täljarna
			result.T = result.T + temp.T;
			result.N = this.N;
		}
		

		return result;
		}else 
			System.out.println("Cant divide something by 0. new quota will be same as first quota");
		return result;
	}
	
	public Fraction multiply (Fraction frac) {
		Fraction result = new Fraction(this.T,this.N);
		Fraction temp = new Fraction(frac.T,frac.N);
		
		if(frac.T==0 || result.T== 0) {
			result.T =0;
			result.N =0;
		}
		else if(frac.N > 0 && N >0) { 
		result.T = result.T * temp.T;
		result.N = result.N * temp.N;
		
		return result;
		
		
		}else
			System.out.println("Can't divide by zero. Try with a new number.");
		return result;
	}
	
	public Fraction divide (Fraction frac) {
		Fraction result = new Fraction(this.T,this.N);
		Fraction temp = new Fraction(frac.T,frac.N);
		int tempN = temp.N;
		temp.N = temp.T;
		temp.T = tempN;
		
		if(frac.T==0 || result.T== 0) {
			result.T =0;
			result.N =0;
		}
		else if(frac.N > 0 && N >0) { 
		result.T = result.T * temp.T;
		result.N = result.N * temp.N;
		
		return result;
		
		}else 
			System.out.println("Can't divide by zero. Try with a new number.");
		return result;
	}
	
	public Fraction subtract (Fraction frac) {
		Fraction result = new Fraction(this.T,this.N);
		Fraction temp = new Fraction(frac.T,frac.N);
		result.T = frac.T;
		result.N = frac.N;
		temp.T = this.T;
		temp.N = this.N;
		if(frac.N > 0 && N >0) { // Kollar som nämnaren inte är 0
		if(frac.N != N) {        // Har de inte samma nämnare, fixar jag så de har det.
			result.T = result.T * N;
			result.N = result.N * N;
			temp.T = frac.T * temp.T;
			temp.N = frac.N * temp.N;
		
		result.T = temp.T - result.T;
		result.N = result.N;
		}else { // Annars bara addera ihop täljarna
			result.T = temp.T - result.T;
			result.N = this.N;
		}
		
		return result;
		}else 
			System.out.println("Cant divide something by 0. new quota will be same as first quota");
		return result;
	}
	
	public String toString() {
		String result = Integer.toString(T) + "/" + Integer.toString(N) ;
		
		return result;
	}
	
	public boolean isEqualTo(Fraction input) {
		double firstTemp = this.T / this.N;
		double secondTemp = input.T/ input.N;
		
		if(firstTemp == secondTemp) {
			return true;
		}
		return false;
	}
}
