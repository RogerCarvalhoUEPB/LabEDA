package atividade04;

/*
 * Interface para implementação da classe "BST".
 */
public interface BST_IF {
	public void insert(Integer element);
	public Integer search(Integer element) throws Exception; //lançar exceção caso não encontre
	public Integer[] preOrder();
	public Integer[] order();
	public Integer[] postOrder();
	public boolean isComplete();
}