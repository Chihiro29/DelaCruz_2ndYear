
public class DelaCruz_SingleLL {
    class Node {
        int data;
        Node next;
        public Node (int d){
            this.data = d;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insert (int data){

        Node newNode = new Node(data);



        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("The data are the following after inserting at last position: ");
    }

    public void displayList(){
        //create the pointer to the head

        Node current = head;
        if (head == null){;
            System.out.println("The list is empty");
            return;
        }
        while(current!= null){
            System.out.println(current.data+" ");
            current = current.next;
        }
        System.out.println(" ");
    }

    public void deleteFirstNode() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        head = head.next;
        System.out.println("After deleting the first element: ");
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (position == 0) {
            deleteFirstNode();
            return;
        }

        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Position out of range.");
            return;
        }

        Node next = current.next.next;
        current.next = next;
    }

    public void deleteLastNode() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void InsertAtBeginning(int data){
        System.out.println("Adding a new element at the beginning of the list");

        Node newNode = new Node(data);

        if (this.head == null){
            this.head = newNode;
        }
        else{
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    public void insertAtPos(int position, int data){
        System.out.println("Insert at the position "+ position+" for "+ data);

        Node newNode = new Node(data);
        Node current = this.head;
        Node previous = this.head;
        if (position == 1){
            newNode.next = this.head;
            this.head = newNode;
            return;
        }

        for (int i = 1; i < position-1; i++) {
            if (current == null){

                return;
            }

            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;

    }

    public static void main(String[] args) {
        //make a reference to the class
        DelaCruz_SingleLL newList= new DelaCruz_SingleLL();
        System.out.println("The Elements: ");
        //add data in the list
        newList.insert(105);
        newList.insert(123);
        newList.insert(143);
        newList.insert(745);
        newList.insert(453);
        newList.insert(324);

        newList.displayList();
        newList.InsertAtBeginning(60);
        newList.displayList();
        newList.InsertAtBeginning(45);
        newList.displayList();
        newList.insertAtEnd(670);
        newList.displayList();
        newList.insertAtPos(4, 489);
        newList.displayList();
        newList.deleteFirstNode();
        newList.displayList();
        newList.deleteAtPosition(6);
        System.out.println("After deleting node at position 6:");
        newList.displayList();
        newList.deleteLastNode();
        System.out.println("After deleting the last node:");
        newList.displayList();

    }

}