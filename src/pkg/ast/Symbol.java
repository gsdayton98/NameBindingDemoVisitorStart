/**
 * 
 */
package pkg.ast;
import java.util.ArrayList;

/**
 *  A symbol can have only one declaration.  If more than one declaration for a symbol is found,
 *  presume the new declaration shadows or overrides the old one.
 *  
 *  Tokens contain both a string and a line reference number.  This associates just the line numbers.
 *
 *  @TODO:  For now assume a single declaration with no shadowing, i.e., all symbols are unique.
 */
public class Symbol {
	public int declarationLine;
	public ArrayList<Integer> referenceLine;

	public Symbol(int declLine) {
		declarationLine = declLine;
		referenceLine = new ArrayList<Integer>();
	}
	
	public void addReference(int line) {
		referenceLine.add(line);
	}
	
	public String toStr() {
		String result = "";
		
		for (Integer ref : referenceLine) {
			result += "   [" + this.declarationLine + ", " + ref + "]\n";
		}
		
		return result;
	}
}
