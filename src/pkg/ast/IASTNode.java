package pkg.ast;
import pkg.ast.SymbolTable;

public interface IASTNode {
	public abstract String toStr();
	
	public abstract void updateSymbolTable(SymbolTable table);

}
