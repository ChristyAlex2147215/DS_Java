import java.util.Arrays;

//stack with Array
public class StackWithArray {
    int[] stackArray;
    int index;
    StackWithArray(int size)
    {
        stackArray=new int[size];
        index=0;
    }
    public void push(int data)
    {
        stackArray[index++]=data;
    }
    public void pop(int data){
        stackArray[index--]=data;
    }
    public int peek()
    {
        return stackArray[index];
    }
    public boolean isEmpty()
    {
        if(stackArray.length==0)
        {
            return true;
        }
        return false;

    }
    public int size()
    {
        return index;
    }
    public String printAll()
    {
        int[] newaa=Arrays.copyOfRange(stackArray,0,index);
        return Arrays.toString(newaa);
    }


}
