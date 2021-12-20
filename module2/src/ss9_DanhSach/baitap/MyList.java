package ss9_DanhSach.baitap;
import java.util.Arrays;

class MyList <E>{
    private int size=0;
    private final int DEFAULT_CAPACITY=10;
    private Object elements[];


    public MyList()
    {
        elements=new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity)
    {
        elements=new Object[capacity];
    }


    public void ensureCapacity(int minCapacity) {

        if (minCapacity >= elements.length) {
            elements = Arrays.copyOf(elements, minCapacity);
            }
        else
        {
            System.out.println("Array length is longer than you want");
        }
    }

    public int length()
    {
        return elements.length;
    }



    public void add(int index, E element) {
        if (index >= elements.length) {
            ensureCapacity(elements.length+index+1);
            elements[index] = element;
            size++;
        }
        else if(index<0)
        {
            System.out.println("Index is invalid!");
        }
        else
        {
            ensureCapacity(elements.length+1);
            elements[index] = element;
            size++;
        }
    }



    public E remove(int index) {
        E oldValue=null;
        if(index>= elements.length)
        {
            System.out.println("Index is invalid!");
            return oldValue;
        }
        else
        {
            for (int i=index;i<elements.length-1;i++)
            {
                elements[i]=elements[i+1];
            }
            int newSize = elements.length-1;
            elements = Arrays.copyOf(elements, newSize);
            oldValue= (E) elements[index];
            size--;
            return oldValue;
        }
    }


    public int size() {
        return size;
    }



    public Object clone() {
        return this;
    }




    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }


    public int indexOf(Object o) {
        for (int i=0;i<elements.length;i++)
        {
            if (elements[i]==o)
                return i;
        }
        return -1;
    }


    public boolean add(E e) {
        if(size< elements.length)
        elements[size++]=e;
        else
        {
            ensureCapacity(elements.length+1);
            elements[size++]=e;
        }
        return true;
    }




    public E get(int index) {
        if(index>=elements.length)
        {
            return null;
        }
        else
        {
            return (E)elements[index];
        }
    }


    public void clear() {
        for (int i=0;i< elements.length;i++)
        {
            elements[i]=null;
        }
    }













}
