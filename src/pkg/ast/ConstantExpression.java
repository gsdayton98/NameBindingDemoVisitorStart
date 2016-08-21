package pkg.ast;

public class ConstantExpression implements IExpression {
	private int lineNo;
	private String symbol;
	
	public ConstantExpression(int lineNo, String symbol) {
		super();
		this.lineNo = lineNo;
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
		if (this.symbol != null) {
			table.addReference(new Token(this.lineNo, this.symbol));
		}
	}

}
