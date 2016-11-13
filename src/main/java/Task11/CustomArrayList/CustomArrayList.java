package Task11.CustomArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class CustomArrayList implements CustomList {

    public static final int SIZE = 10;

    private String[] array;
    private int size = 0;


    public CustomArrayList() {
        //this(SIZE);
        array = new String[SIZE];
    }

    public void receiverOfExceptions(){
        try {
            add("something");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public CustomArrayList(int size) {
if ( size <= 0) receiverOfExceptions("Chosen size of array is invalid");
        array = new String[size];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(String element) {
        return false;
    }

        public boolean add(String element) {
        if (element == null) throw new ElementHasntGotAnObjectException("Sent element hasn`t got an object");
        if (size >= array.length)
            resizeArray();

        array[size] = element;
        size++;

        return true;
    } //

    private void resizeArray() {
        String[] arrayExt = new String[array.length * 2];
        for (int i = 0; i < size; i++) {
            arrayExt[i] = array[i];
        }
        array = arrayExt;
    }

        public void add(int index, String element) {
    if (index>size  || index<=0) throw new IndexOutOfBoundsException("Index is out of array indexes range");
    if (element == null) throw new ElementHasntGotAnObjectException("Sent element hasn`t got an object");
        array[index] = element;

    } //

        public boolean remove(String element) {
        if (element == null) throw new ElementHasntGotAnObjectException("Sent element hasn`t got an object");
        return false;
    }

        public String remove(int index) {
        if (index<=0 || index>size)throw new IndexOutOfBoundsException ("Index is out of array indexes range");
        return null;
    }

    public void clear() {}

        public String get(int index)  {
        if (index<=0 || index>size)throw new IndexOutOfBoundsException("Index is out of array indexes range");
        return null;
    }

        public String get(int index, String element) {
        if (index>size  || index<=0) throw new IndexOutOfBoundsException("Index is out of array indexes range");
        if (element == null) throw new ElementHasntGotAnObjectException("Sent element hasn`t got an object");
        return null;
    }

        public int indexOf(String element)  {
        if (element == null) throw new ElementHasntGotAnObjectException("Sent element hasn`t got an object");
        return 0;
    }


    public String toString() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            if (i != 0)
                result += ", ";
            result += array[i];
        }
        result += "]";
        return result;
    }


    public Iterator listIterator() {
        return new ListIterator();
    }


    public Iterator backwardIterator() {
        return new BackwardIterator();
    }


    public Iterator randomIterator() {
        RandomIterator object =  new RandomIterator();
        object.mixArray();
        return object;
    }

    private class RandomIterator implements Iterator{

        String [] arrayExt = new String[size];
        int [] indexArray = new int [size];
        int current = 0;

        public void mixArray(){
            int index;
            for (int i = 0; i < indexArray.length ; i++) {
                indexArray[i] = size;
                index = index();
                if (indexNotSame(i, index)) {
                    indexArray[i] = index;
                } else i--;
            }
                for (int j = 0; j < size ; j++) {
                    int index2 = indexArray[j];
                    arrayExt[j] = array[index2];

                }

            }


        private boolean indexNotSame(int i, int index) {
            for (int j = i; j >= 0 ; j--) {

                if (indexArray[j] == index){
                    return false;
                }
            }
            return true;
        }

        public int index() {
          Random rn = new Random();
            int index = rn.nextInt(size);
            return index;
        }


        @Override
        public boolean hasNext() {
            return current < size;
        }

        @Override
        public Object next() {
            String element = arrayExt[current];
            current++;
            return element;
        }
    }

    private class ListIterator implements Iterator {

        int current = 0;

        public boolean hasNext() {
            return current < size;
        }

        public Object next() {
            String element = array[current];
            current++;
            return element;
        }
    }

    private class BackwardIterator implements Iterator {

        int current = size - 1;


        public boolean hasNext() {
            return current >= 0;
        }


        public Object next() {
            String element = array[current];
            current--;
            return element;
        }
    }


}
