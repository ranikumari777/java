

public class Node{
    int data;
     Node next;

        Node(int data)
        {
            this.data=data;
            
        }
    

    public static void main(String[] args)
    {
        
        Node n=new Node(1);
        Node n1=new Node(2);
        Node n2=new Node(3);
        n.next=n1;
        n1.next=n2;

        //displaying

        // System.out.println(n.data);
        // System.out.println(n1.data);
        // System.out.println(n2.data);

        // System.out.println(n.data);
        // System.out.println(n.next.data);
        // System.out.println(n.next.next.data);

        //Node temp=n;
        // for(int i=0; i<3; i++)
        // {
        //     System.out.print(temp.data+"->");
        //     temp=temp.next;
            
        // }

        Node temp=n;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
}