package pkg.ast;

public class AssignmentExpression implements IExpression {
	private IASTNode leftExpression;
	private IASTNode rightExpression;
	
	
	public AssignmentExpression(IASTNode leftExpression,
			IASTNode rightExpression) {
		super();
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}


	public IASTNode getLeftExpression() {
		return leftExpression;
	}


	public void setLeftExpression(IASTNode leftExpression) {
		this.leftExpression = leftExpression;
	}


	public IASTNode getRightExpression() {
		return rightExpression;
	}


	public void setRightExpression(IASTNode rightExpression) {
		this.rightExpression = rightExpression;
	}


	@Override
	public String toStr() {
		StringBuilder str = new StringBuilder();
	    str.append(leftExpression.toStr() + " = " + rightExpression.toStr());
		return str.toString();
	}
	
	@Override
	public void updateSymbolTable(SymbolTable table) {
		this.leftExpression.updateSymbolTable(table);
		this.rightExpression.updateSymbolTable(table);
	}
}
