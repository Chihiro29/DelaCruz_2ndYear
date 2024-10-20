public class MainTree {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        tree.insert(50);
        tree.insert(40);
        tree.insert(55);
        tree.insert(30);
        tree.insert(45);
        tree.insert(53);
        tree.insert(60);
        tree.insert(20);
        tree.insert(32);
        tree.insert(41);
        tree.insert(48);
        tree.insert(57);
        tree.insert(58);
        tree.insert(90);
        tree.insert(10);
        tree.insert(15);
        tree.traverse(1);
        tree.traverse(2);
        tree.traverse(3);

    }

}