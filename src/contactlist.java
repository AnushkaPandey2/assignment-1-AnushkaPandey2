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
    public void printlist()
    {
        System.out.println("printing contact list");
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.getDataname()+" : "+temp.getDatacontactno()+" \n");
            temp=temp.getNext();
        }
        System.out.println();
    }
    public int delete(String dataname) {
        int response = 0;
        int c = 0;
        if (head != null) {
            Node temp = head;
            Node temp2;
            // Node previous=null;
            while (temp != null) {
                if (temp.getDataname().equals(dataname) && temp == head && temp.getNext() != null) {
                    head = temp.getNext();
                    head.setPrevious(null);
                    response = 1;
                    c = 1;
                    break;
                } else if (temp.getDataname().equals(dataname) && temp != head && temp.getNext() == null) {
                    temp = temp.getPrevious();
                    temp.setNext(null);
                    response = 1;
                    c = 1;
                    break;
                } else if (temp.getDataname().equals(dataname) && temp == head && temp.getNext() == null) {
                    head = null;
                    response = 1;
                    c = 1;
                    break;
                } else if (temp.getDataname().equals(dataname) && temp != head && temp.getNext() != null) {
                    temp2 = temp;
                    temp = temp.getPrevious();
                    temp.setNext(temp2.getNext());
                    temp2.getNext().setPrevious(temp);
                    response = 1;
                    c = 1;
                    break;
                }
                temp = temp.getNext();
            }
            if (c == 0) {
                System.out.println("element not found");
            }
        }
        return response;

    }}

