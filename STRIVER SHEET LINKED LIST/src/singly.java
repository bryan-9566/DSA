class ListNode
{
    int val;
    ListNode next;
    ListNode(int val1,ListNode next1)
    {
        val=val1;
        next=next1;
    }
}
public class singly {
    public static void main(String[] args)
    {
        int[] arr={3,5,7,12};
        ListNode head=create(arr);
        System.out.println("AFTER CREATING A LINKEDLIST");
        printList(head);
        System.out.println();
        System.out.println("LENGTH OF THE LINKED LIST");
        System.out.print(findlength(head));
        System.out.println();
        System.out.println("CHECK FOR VALUE EXIST OR NOT");
        System.out.println(check(head,1));
        head= insertatfirst(head,10);
        System.out.println("AFTER INSERTING AT FIRST");
        printList(head);
        System.out.println();
        head= insertatlast(head,11);
        System.out.println("AFTER INSERTING AT LAST");
        printList(head);
        System.out.println();
        head=deleteatfirst(head);
        System.out.println("AFTER DELETING AT FIRST");
        printList(head);
        System.out.println();
        head=deleteatlast(head);
        System.out.println("AFTER DELETING AT LAST");
        printList(head);



    }
    public static ListNode deleteatlast(ListNode head)
    {
        ListNode temp=head;
        ListNode prev=null;
        while(temp.next!=null)
        {
            prev=temp;
            temp=temp.next;

        }
        prev.next=null;
        return head;
    }
    public static ListNode deleteatfirst(ListNode head)
    {
        return head.next;
    }
    public static ListNode insertatfirst(ListNode head, int val)
    {
        ListNode bry=new ListNode(val,head);
        head=bry;
        return head;
    }
    public static ListNode insertatlast(ListNode head, int val)
    {
        ListNode bry=new ListNode(val,null);
        if(head==null)
        {
            return bry;
        }
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=bry;
        return head;
    }
    public static boolean check(ListNode head,int x)
    {
        ListNode temp=head;
        while(temp!=null)
        {
            if(temp.val==x)
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static int findlength(ListNode head)
    {
        int cnt=0;
        ListNode temp=head;
        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public static void printList(ListNode head)
    {
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val);
            if(temp.next!=null)
            {
                System.out.print("->");
            }
            temp=temp.next;
        }
    }
    public static ListNode create(int[] arr)
    {
        if(arr.length==0)
        {
            return null;
        }
        ListNode head=new ListNode(arr[0],null );
        ListNode temp=head;
        for(int i=1;i< arr.length;i++)
        {
            ListNode bh=new ListNode(arr[i],null );
            temp.next=bh;
            temp=temp.next;
        }
        return head;
    }
}
