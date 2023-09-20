public class Polynomial {
    public double[] coefficients;

    public Polynomial() {;
	this.coefficients = new double[0];
    }

    public Polynomial(double[] coefficients) {;
	this.coefficients = coefficients;
    }
    
    public Polynomial add(Polynomial added) {
    	int maxLength = Math.max(this.coefficients.length, added.coefficients.length);
        double[] newpoly = new double[maxLength];

        for (int i = 0; i < this.coefficients.length; i++) {
        	newpoly[i] += this.coefficients[i];
        }

        for (int i = 0; i < added.coefficients.length; i++) {
        	newpoly[i] += added.coefficients[i];
        }

        return new Polynomial(newpoly);
    }
    
    public double evaluate(double x) {
        double result = 0.0;

        for (int i = 0; i < coefficients.length; i++) {
            result += coefficients[i] * Math.pow(x, i);
        }

        return result;
    }

    public boolean hasRoot(double x) {
        return evaluate(x) == 0.0;
    }
}
