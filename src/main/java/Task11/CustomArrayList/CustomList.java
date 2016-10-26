package Task11.CustomArrayList;

import java.util.Iterator;

public interface CustomList {
    int size();
    boolean isEmpty();
    boolean contains(String element);
    boolean add(String element) throws Exception;
    void add(int index, String element) throws Exception;
    boolean remove(String element) throws Exception;
    String remove(int index) throws Exception;
    void clear();
    String get(int index) throws Exception;
    String get(int index, String element) throws Exception;
    int indexOf(String element) throws Exception;

    Iterator listIterator();
    Iterator backwardIterator();
    Iterator randomIterator();
}
