public static Node reverseDLL(Node  head)
{
    //Your code here
    if(head==null  || head.next==null){
        return head;
    }
    Node temp=null;
    Node curr=head;
    Node forw=head;
    while(forw!=null){
        forw=curr.next;
        curr.next=temp;
        curr.prev=forw;
        temp=curr;
        curr=forw;
    }
    return temp;
}