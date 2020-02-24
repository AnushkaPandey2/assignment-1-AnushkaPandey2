public class contactlist {
    Node head;

    public contactlist() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public void insert(String dataname, String datacontactno) {
        Node node = new Node(dataname, datacontactno);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            node.setPrevious(temp);
            temp.setNext(node);
        }
    }

    }

