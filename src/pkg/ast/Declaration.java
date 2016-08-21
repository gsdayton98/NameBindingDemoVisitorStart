package pkg.ast;

public class Declaration implements IDeclaration {
	private IASTNode token;

	public Declaration(IASTNode token) {
		super();
		this.token = token;
	}

	public IASTNode getToken() {
		return token;
	}

	public void setToken(IASTNode token) {
		this.token = token;
	}

	@Override
	public String toStr() {
		StringBuilder str = new StringBuilder();
	    str.append("int " + token.toStr());
		return str.toString();
	}

	@Override
	public void updateSymbolTable(SymbolTable table) {				
		// Defines a new entry
		
		table.addDeclaration((Token) this.token);
		table.addReference((Token) this.token);
	}
}
