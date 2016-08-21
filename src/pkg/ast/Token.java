package pkg.ast;
import pkg.ast.SymbolTable;

public class Token implements IExpression {
	private int lineNo;
	private String symbol;
	
	public Token(int lineNo, String symbol) {
		super();
		this.lineNo = lineNo;  // No way here to tell if this is declaration or reference
		this.symbol = symbol;  
	}

	public int getLineNo() {
		return lineNo;
	}

	public void setLineNo(int lineNo) {
		this.lineNo = lineNo;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toStr() {
		StringBuilder str = new StringBuilder();
	    str.append(symbol);
		return str.toString();
	}
	
	@Override
	public void updateSymbolTable(SymbolTable table) {
		// For now just add a reference for every token even if the token is a declaration
		table.addReference(this);
	}
}
