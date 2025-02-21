//Main class
package dataStructures;
public class Main {
	public static void main(String[] args) {
        Btree tree=new Btree();

        tree.insert(4);
        tree.insert(3);
        tree.insert(5);
        tree.insert(2);
        tree.insert(8);
        tree.insert(7);
 
        tree.inorder();
    }
}

//Btree class
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data=data;
    }
}

public class Btree {
    Node root;
    public void insert(int data){
        root=insertRec(root,data);
    }
    public Node insertRec(Node root,int data){
        if(root ==null)
            root=new node(data);
        else if(data<root.data)
            root.left=insertRec(root.left,data);
        else
            root.right=insertRec(root.right,data);
        return root; 
    }
}

public void inorder(){
    inorderRec(root);
}
public void inoredrRec(Node root){
    if(root!=null){
        inorderRec(root.left);
        System.out.println(root.data+" ");
        inorderRec(root.right);
    }
}

public void preorder(){
    preorderRec(root);
}

public void preorderRec(Node root){
    if(root!=null){
        System.out.println(root.data+" ");
        preorderRec(root.left);
        preorderRec(root.right);
    }
}

public void postorder(){
    postorderRec(root);
}

public void postorderRec(Node root){
    if(root!=null){
        postorderRec(root.left);
        postorderRec(root.right);
        System.out.println(root.data+" ");
    }
}