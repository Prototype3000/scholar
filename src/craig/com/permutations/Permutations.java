package craig.com.permutations;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Permutations {

	public static void main(String[] args) {
		Table to = new Table();
		//String permutations = "abcdefgh";
		int base = 2;
		int columns = 10;
		int rows =(int)Math.pow(base, columns);
		System.out.println("Base: "+base+" Columns: "+columns+ " Rows: "+rows);
		to.doBaseXTable(base, columns,rows);
	}

}
