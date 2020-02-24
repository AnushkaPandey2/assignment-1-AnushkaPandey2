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


}
