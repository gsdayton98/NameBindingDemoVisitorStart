/**
 * 
 */
package pkg.ast;
import pkg.ast.Symbol;
import java.util.Map;
import java.util.HashMap;
import pkg.ast.Token;
/**
 *
 */
public class SymbolTable {
	public Map<String, Symbol> symtable;
	
	public SymbolTable() {
		symtable = new HashMap<String,Symbol>();
	}
	
	public void addDeclaration(Token token) {
		symtable.put(token.getSymbol(), new Symbol(token.getLineNo()));
	}
	
	public void addReference(Token token) {
 		if (token != null  && token.getSymbol() != null) {
 			Symbol symbol = symtable.get(token.getSymbol());
 			if (symbol != null) {
 				symbol.addReference(token.getLineNo());
 			}
 		}
	}
	
	public String toStr() {
		String result = "";
		 
		for (Map.Entry<String, Symbol> entry : symtable.entrySet()) {
			result += entry.getKey() + ":  " + entry.getValue().toStr() + "\n";
		}
		
		return result;
	}
}
