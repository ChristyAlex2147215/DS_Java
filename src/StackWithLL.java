import java.util.Arrays;

class Node1
{
    String data;
    Node1 next;
    Node1(String info)
    {
        this.data=info;
    }

}
public class StackWithLL {
    Node1 head=null;
    static int index=0;
    Node1 tail=null;

    boolean isEmpty()
    {
        if (index==0 || head==null)
            return true;
        return false;
    }


    //pushing elements to the stack at the top
    void push(String info)//adding at the last
    {
        var node=new Node1(info);//creating a new node;
        if(head==null)
        {
            head=tail=node;
        }
        tail.next=node;
        tail=node;
        index++;
    }

    Node1 secondLast()
    {
        Node1 temp=head;
        while(temp!=null)
        {
            if (temp.next==tail)
            {
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    void pop()
    {
        if(isEmpty())
        {
            throw new IllegalCallerException();
        }
        Node1 temp=secondLast();
        tail=temp;
        tail.next=null;

    }

    String[] printAll()
    {
        var temp=head;
        String[] sarray=new String[index];
        int loc=0;
        while(temp!=null)
        {
            if(temp.data==null)
            {
               break;
            }
            sarray[loc++]=temp.data;
            temp=temp.next;
        }
        return sarray;
    }

}
