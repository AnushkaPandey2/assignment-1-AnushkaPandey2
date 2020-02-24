public class Node {
    private String datacontactno;
    private String dataname;
    private Node next;
    private Node previous;
    public Node(String dataname,String datacontactno)
    {
        this.dataname=dataname;
        this.datacontactno=datacontactno;
        next=null;
        previous=null;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public String getDatacontactno() {
        return datacontactno;
    }

    public void setDatacontactno(String datacontactno) {
        this.datacontactno = datacontactno;
    }

    public String getDataname() {
        return dataname;
    }

    public void setDataname(String dataname) {
        this.dataname = dataname;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
