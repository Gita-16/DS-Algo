import java.util.Stack;

	public class Tree {
	    
	    private TreeNode root;
	    
	    class TreeNode {
	        private int data;
	        private TreeNode left;
	        private TreeNode right;
	
	        public TreeNode(int data) {
	            this.data = data;
	        }
	    };
	
	     //createTree
	    public void createTree() {
	        root = new TreeNode(5);
	        root.left = new TreeNode(4);
	        root.right = new TreeNode(6);
	        root.left.left = new TreeNode(3);
	        root.left.right = new TreeNode(7);
	        root.right.left = new TreeNode(8);
	    }
	   	    
	    //iterativePreorder
	    public void iterativePreorder() {
	        TreeNode top;
	        if (root == null)
	            return;

	        Stack<TreeNode> st = new Stack<TreeNode>();
	        st.push(root);
	         
	        while (!st.empty()) {
	            top = st.pop();
	            System.out.print(top.data + " " );
	            if (top.right != null)
	                st.push(top.right);
	            if (top.left != null)
	                st.push(top.left);
	        }
	    }
	     
	    public static void main(String args[]) {
	        Tree tree = new Tree();
	        //call createTree()
	        tree.createTree();
	        
	        //call iterativePreorder()
	        tree.iterativePreorder();
	    }
	}