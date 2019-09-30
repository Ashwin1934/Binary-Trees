public class TreeSet<Object>{

	TreeNode<Object> root;
	int nums;
	String string = "";

	public TreeSet(){
		root = null;
		nums = 0;

	}


	public void add(Character num){

		TreeNode<Object> tNode = new TreeNode<Object>(num);
		if(root == null){
			root = tNode;
			nums = 1;
		}else{

			TreeNode<Object> temp = root;
			boolean traverse = true;
			while(!temp.getValue().equals(num) && traverse){
				if(tNode.getValue() instanceof Character){
					if(((Character)tNode.getValue()).compareTo(((Character)temp.getValue()))>0){
						if(temp.getRight() == null){
							traverse = false;
							temp.setRight(tNode);
							nums++;
						}else
							temp = temp.getRight();
					}else if(((Character)tNode.getValue()).compareTo(((Character)temp.getValue()))<0){

						if(temp.getLeft()==null){
							traverse = false;
							temp.setLeft(tNode);
							nums++;
						}else
							temp = temp.getLeft();

					}

				}

			}

		}
	}

	public TreeNode<Object> getRoot(){
		return root;
	}
	public int numsSize(){
		return nums;
	}
	//preOrder
	public String preOrder(){
		string = "(";
		preOrder2(root);
		if(string.length()>1)
			return string.substring(0,string.length()-1)+")";
		return string + ")";
	}
	public void preOrder2(TreeNode<Object> tNode){
		if(tNode != null){
			string+=tNode.getValue()+"| ";
			preOrder2(tNode.getLeft());
			preOrder2(tNode.getRight());
		}
	}
	//inOrder
	public String inOrder(){
		string = "(";
		inOrder2(root);
		if(string.length()>1)
			return string.substring(0,string.length()-2)+")";
		return string + ")";
	}
	public void inOrder2(TreeNode<Object> tNode){
		if(tNode != null){
			inOrder2(tNode.getLeft());
			string+=tNode.getValue()+"| ";
			inOrder2(tNode.getRight());
		}
	}
	//postOrder
	public String postOrder() {
		string = "(";
		postOrder2(root);
		if (string.length()>1)
			return string.substring(0,string.length()-2) + ")";
		return string + ")";
	}

	private void postOrder2 (TreeNode<Object> tNode){
		if (tNode != null) {
			postOrder2(tNode.getLeft());
			postOrder2(tNode.getRight());
			string+= tNode.getValue()+"| ";
		}
	}


	///node class

	public class TreeNode<Object> {

		private TreeNode<Object> left;
		private TreeNode<Object> right;
		private Character num;

		public TreeNode(Character a) {
			num = a;
		}

		public TreeNode<Object> getRight() {
			return right;
		}

		public TreeNode<Object> getLeft() {
			return left;
		}

		public void setRight(TreeNode<Object> right) {
			this.right = right;
		}

		public void setLeft(TreeNode<Object> left) {
			this.left = left;
		}

		public Character getValue() {
			return num;
		}

		public String toString() {
			return "" + num;
	}


}
}