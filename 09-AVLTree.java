package dataStructures;

class Node{

  public int key;
  public int height;
  public Node left;
  public Node right;
  
  Node(int d){
	  key=d;
	  height=1;
  }
}

public class AVLTree {
	Node root;
	int height(Node N) {
		if(N==null)
			return 0;
		
		return N.height;
	}
	
	int max(int a, int b) {
		if (a>b)
		   return a;
		else
		   return b;	
	}
	
	
	 int getBalance(Node N) {
	        if (N == null)
	            return 0;
	 
	        return height(N.left) - height(N.right);
	    }
	 
	
	
	//Rotations 
	Node rightRotate(Node y) {
		Node x=y.left;
		Node T2=x.right;
        System.out.println("y "+y.key);

		//Perform Rotations
        x.right = y;
        y.left = T2;
 
        // Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;
 
        // Return new root
        return x;
   }
		
	Node leftRotate(Node x) {
		    Node y = x.right;
	        Node T2 = y.left;
	        
	        // Perform rotation
	        y.left = x;
	        x.right = T2;
	 
	    
	        //  Update heights
	        x.height = max(height(x.left), height(x.right)) + 1;
	        y.height = max(height(y.left), height(y.right)) + 1;
	 
	        // Return new root
	        return y;

	}
	
	
	  Node insert(Node node, int key) {
		  
	        /* 1.  Perform the normal BST insertion */
	        if (node == null)
	            return (new Node(key));
	 
	        if (key < node.key)
	            node.left = insert(node.left, key);
	        else if (key > node.key)
	            node.right = insert(node.right, key);
	        else // Duplicate keys not allowed
	            return node;
	 
	        /* 2. Update height of this ancestor node */
	        node.height = 1 + max(height(node.left),
	                              height(node.right));
	 
	        /* 3. Get the balance factor of this ancestor
	              node to check whether this node became
	              unbalanced */
	        int balance = getBalance(node);
	 
	        // If this node becomes unbalanced, then there
	        // are 4 cases Left Left Case
	        if (balance > 1 && key < node.left.key) {
	        	System.out.println("Left Left Case");
	            return rightRotate(node);
	        }
	  
	        // Left Right Case
	        if (balance > 1 && key > node.left.key) {
	        	System.out.println("Left Right Case");
	            node.left = leftRotate(node.left);
	            return rightRotate(node);
	        }
	 
	        // Right Right Case
	        if (balance < -1 && key > node.right.key) {
	        	System.out.println("Right Right Case");
	        	return leftRotate(node);
	        }
	 
	        // Right Left Case
	        if (balance < -1 && key < node.right.key) {
	        	System.out.println("Right Left Case");
	        	System.out.println(node.right.key);

	            node.right = rightRotate(node.right);
	            System.out.println("Node right is "+node.right.key);

	            return leftRotate(node);
	        }
	 
	        /* return the (unchanged) node pointer */
	        return node;
	    }
	  
	  
	  
	  Node minValueNode(Node node)
	    {
	        Node current = node;
	 
	        /* loop down to find the leftmost leaf */
	        while (current.left != null)
	        current = current.left;
	 
	        return current;
	    }
	 
	    Node deleteNode(Node root, int key)
	    {
	        // STEP 1: PERFORM STANDARD BST DELETE
	        if (root == null)
	            return root;
	 
	        // If the key to be deleted is smaller than
	        // the root's key, then it lies in left subtree
	        if (key < root.key)
	            root.left = deleteNode(root.left, key);
	 
	        // If the key to be deleted is greater than the
	        // root's key, then it lies in right subtree
	        else if (key > root.key)
	            root.right = deleteNode(root.right, key);
	 
	        // if key is same as root's key, then this is the node
	        // to be deleted
	        else
	        {
	 
	            // node with only one child or no child
	            if ((root.left == null) || (root.right == null))
	            {
	                Node temp = null;
	                if (temp == root.left)
	                    temp = root.right;
	                else
	                    temp = root.left;
	 
	                // No child case
	                if (temp == null)
	                {
	                    temp = root;
	                    root = null;
	                }
	                else // One child case
	                    root = temp; // Copy the contents of
	                                // the non-empty child
	            }
	            else
	            {
	 
	                // node with two children: Get the inorder
	                // successor (smallest in the right subtree)
	                Node temp = minValueNode(root.right);
	 
	                // Copy the inorder successor's data to this node
	                root.key = temp.key;
	 
	                // Delete the inorder successor
	                root.right = deleteNode(root.right, temp.key);
	            }
	        }
	 
	        // If the tree had only one node then return
	        if (root == null)
	            return root;
	 
	        // STEP 2: UPDATE HEIGHT OF THE CURRENT NODE
	        root.height = max(height(root.left), height(root.right)) + 1;
	 
	        // STEP 3: GET THE BALANCE FACTOR OF THIS NODE (to check whether
	        // this node became unbalanced)
	        int balance = getBalance(root);
	 
	        // If this node becomes unbalanced, then there are 4 cases
	        // Left Left Case
	        if (balance > 1 && getBalance(root.left) >= 0)
	            return rightRotate(root);
	 
	        // Left Right Case
	        if (balance > 1 && getBalance(root.left) < 0)
	        {
	            root.left = leftRotate(root.left);
	            return rightRotate(root);
	        }
	 
	        // Right Right Case
	        if (balance < -1 && getBalance(root.right) <= 0)
	            return leftRotate(root);
	 
	        // Right Left Case
	        if (balance < -1 && getBalance(root.right) > 0)
	        {
	            root.right = rightRotate(root.right);
	            return leftRotate(root);
	        }
	        
	        return root;
	 
	    }
	  
	  
	  
	  
	
	
	    void preOrder(Node node) {
	        if (node != null) {
	            System.out.print(node.key + " ");
	            preOrder(node.left);
	            preOrder(node.right);
	        }
	    }
	
	    
	  public static void main(String[] args) {
	        AVLTree tree = new AVLTree();
	 
	        /* Constructing tree given in the above figure */
	        tree.root = tree.insert(tree.root, 10);
	        tree.root = tree.insert(tree.root, 20);
	        tree.root = tree.insert(tree.root, 30);
	        tree.root = tree.insert(tree.root, 40);
	        tree.root = tree.insert(tree.root, 50);
	        System.out.println("Root "+tree.root.key);
	        tree.root = tree.insert(tree.root, 25);
	        //tree.root = tree.deleteNode(tree.root, 25);
	 
	        /* The constructed AVL Tree would be
	             30
	            /  \
	          20   40
	         /  \     \
	        10  25    50
	        */
	        System.out.println("Preorder traversal" +
	                        " of constructed tree is : ");
	        tree.preOrder(tree.root);
	    }
}
	