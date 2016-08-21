package pkg.ast;
import pkg.ast.SymbolTable;
import pkg.ast.Declaration;

public class ForStatement implements IStatement {
	private IASTNode initExpression;
	private IASTNode testExpression;
	private IASTNode loopExpression;
	private IASTNode forBlockExpression;

	public ForStatement(IASTNode initExpression, IASTNode testExpression,
			IASTNode loopExpression, IASTNode forBlockExpression) {
		super();
		this.initExpression = initExpression;
		this.testExpression = testExpression;
		this.loopExpression = loopExpression;
		this.forBlockExpression = forBlockExpression;
	}

	public IASTNode getInitExpression() {
		return initExpression;
	}

	public void setInitExpression(IASTNode initExpression) {
		this.initExpression = initExpression;
	}

	public IASTNode getTestExpression() {
		return testExpression;
	}

	public void setTestExpression(IASTNode testExpression) {
		this.testExpression = testExpression;
	}

	public IASTNode getLoopExpression() {
		return loopExpression;
	}

	public void setLoopExpression(IASTNode loopExpression) {
		this.loopExpression = loopExpression;
	}

	public IASTNode getForBlockExpression() {
		return forBlockExpression;
	}

	public void setForBlockExpression(IASTNode forBlockExpression) {
		this.forBlockExpression = forBlockExpression;
	}

	@Override
	public String toStr() {
		StringBuilder str = new StringBuilder();
		str.append("for (" + initExpression.toStr() + ";;)\n    "
				+ forBlockExpression.toStr());
		return str.toString();
	}
	
	@Override
	public void updateSymbolTable(SymbolTable table) {
		initExpression.updateSymbolTable(table);
		this.forBlockExpression.updateSymbolTable(table);
	}
}
