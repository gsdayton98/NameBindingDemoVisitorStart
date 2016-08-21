package pkg.client;

import pkg.ast.AssignmentExpression;
import pkg.ast.ConstantExpression;
import pkg.ast.Declaration;
import pkg.ast.ForStatement;
import pkg.ast.Program;
import pkg.ast.Token;
import pkg.ast.SymbolTable;

public class Client {

	/**
	 * int i; 
	 * int j; 
	 * for (i=0; ;) 
	 *    i = j;
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program p = new Program();
		p.insert(new Declaration(new Token(1, "i")));
		p.insert(new Declaration(new Token(2, "j")));
		p.insert(new ForStatement(new AssignmentExpression(new Token(3, "i"),
				new ConstantExpression(3, "0")), null, null,
				new AssignmentExpression(new Token(4, "i"), new Token(4, "j"))));
		System.out.println(p.toStr());
		
		SymbolTable symtable = new SymbolTable();
		p.updateSymbolTable(symtable);
		System.out.println("\nCross Reference");
		System.out.println(symtable.toStr());
	}
}
