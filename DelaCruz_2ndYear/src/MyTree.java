public class MyTree {
    private node root;

    public MyTree() {
        root = null;

    }

    public void insert(int mydata) {
        node tempNode = new node();
        tempNode.data = mydata;

        //check if the tree is empty

        if (root == null) {
            root = tempNode;
        } else {
            node current = root;
            node parent = null;
            while (true) {
                parent = current;
                if (mydata < parent.data) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = tempNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = tempNode;
                        return;
                    }
                }// end of
            }//while
        }//not empty
    }//insert method

    public void traverse(int traversalType) {
        switch (traversalType) {
            case 1:
                System.out.println("\nPre-Order traversal: ");
                preOrder(root);
                break;
            case 2:
                System.out.println("\nIn-Order traversal: ");
                inOrder(root);
                break;
            case 3:
                System.out.println("\nPost-Order traversal: ");
                postOrder(root);
                break;
        }
    }//end of traverse

    private void preOrder(node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }

    }

    private void inOrder(node root) {
        if (root != null) {
            inOrder(root.leftChild);
            System.out.print(root.data + " ");
            inOrder(root.rightChild);
        }
    }

    private void postOrder(node root) {
        if (root != null) {
            postOrder(root.leftChild);
            postOrder(root.rightChild);
            System.out.print(root.data + " ");
        }
    }
}
