package MetroBank.colletions;

import java.util.Arrays;

public class MyArrayList<E> implements MyArrayListInterface<E> {

//    private String message;
    private int size;
    private int maxSize;
    private Object[] array;



    public MyArrayList() {
        initialize();
    }

    public String MyArrayList(String menuList) {
       return menuList;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E e) {
        if (maxSize == array.length) {
            int newSize = array.length * 2;
            array = Arrays.copyOf(array, newSize);
            maxSize = newSize;
            array[size++] = e;
        }
    }

    @Override
    public void add(E e, int index) {

    }

    @Override
    public E get(int index) {
        if (index < size) {
            return (E) array[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public void remove(int index) {

        if (index < size) {
            array[index] = null;
            int i = index;
            while (i < size) {
                array[i] = array[i + 1];
                array[i + 1] = null;
                i++;
            }
            size--;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public void clear() {
        initialize();

    }

    private void initialize() {
        maxSize = 2;
        size = 0;
        array = new Object[maxSize];
    }

    @Override
    public int contains(E e) {
        for (Object arr : array) {
            if (arr == e) {
                return 1;
            }
        }
        return -1;
    }

    private void growArray() {
        //initialize a new array > than old - lets do x2 max size.
        //copy the old array into the new array
        //set the array reference to the new array - discarding the old one for garbage collection
        //update max size with the new array size.


        /* This is a manual copy by looping and copying each element. We can also just use Arrays.copyOf(), which under the good does the same thing.
        Object[] temp = new Object[maxSize];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        */

        maxSize *= 2;
        array = Arrays.copyOf(array, maxSize);
    }

//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
}
