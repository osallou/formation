package formation.code;

import fit.ColumnFixture;

public class PockerFixture extends ColumnFixture {

	public float numerator;
	public float denominator;
	
	public float quotient() {
        return (float)(Math.round(numerator/denominator*10.0)/10.0);
   }
	
}
