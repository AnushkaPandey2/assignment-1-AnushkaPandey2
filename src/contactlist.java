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
    public boolean search(String dataname)
    {
        boolean response=false;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.getDataname().equals(dataname))
            {
                response=true;
                break;
            }
            temp=temp.getNext();
        }
        return response;
    }

    }

