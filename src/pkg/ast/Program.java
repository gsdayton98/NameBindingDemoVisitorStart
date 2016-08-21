package pkg.ast;

public class Program implements IASTNode {
	private IASTNode nodes[];
	int i;

	public Program() {
		super();
		nodes = new IASTNode[10];
		i = 0;
	}

	public IASTNode[] getNodes() {
		return nodes;
	}

	public void setNodes(IASTNode[] nodes) {
		this.nodes = nodes;
	}

	
	public void insert(IASTNode node) {
		nodes[i++] = node;
	}

	@Override
	public String toStr() {
		StringBuilder str = new StringBuilder();
		for (int j = 0; j < i; j++) {
			str.append(nodes[j].toStr());
			str.append("\n");
		}
		return str.toString();
	}
	
	@Override
	public void updateSymbolTable(SymbolTable table) {
		for (IASTNode node : nodes) {
			if (node != null) {
				node.updateSymbolTable(table);
			}
		}
	}
}
