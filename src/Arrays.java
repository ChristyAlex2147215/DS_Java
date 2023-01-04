public class Arrays {
    int[] newarray;
    int count=0;
    //constructor to initialuze the array with size defines
    public Arrays(int size)
    {
        newarray=new int[size];
    }

    //printing all the array elements
    public void print()
    {
        for(int i=0;i<count;i++)
        {
            System.out.print(newarray[i]);
        }
        System.out.println(" ");
    }

    //inserting to the array
    public void append(int item)
    {
        if (newarray.length==count)
        {
            //new array with double size
            int[] latestarry=new int[count*2];
            //copy
            for(int j=0;j<count;j++)
                latestarry[j]=newarray[j];
            //insertion
            latestarry[count++]=item;
            //reassign
            newarray=latestarry;
        }
        else
            newarray[count++]=item;
    }

    //item at
    public void itemat(int index)
    {
        if (index<count) {
            System.out.println("item at " + index + " is " + newarray[index]);
        }

    }

    public void delete()
    {
        newarray[count--]=0;
        System.out.println(count);
    }

    public void removeat(int pos)
    {
        if(pos<0 || pos>=count)
        {
            throw new IllegalArgumentException();
        }
        newarray[pos]=0;
        //realigning
        for(int i=pos;i<count;i++)
        {
            newarray[i]=newarray[i+1];
        }

    }

    //

}
