package at.aau.serg.exercises.tdd;

public class MyCollection {
    private String[] list;
    private int cursor = 0;

    public MyCollection(int capacity) {
        list = new String[capacity];
        cursor = 0;
    }

    /**
     * Returns the size of the collection
     *
     * @return The number of instances in the collection
     */
    public int size() {
        return cursor;
    }

    /**
     * Adds the String from to list. If the list is full it throws an IllegalArgumentException
     *
     * @param s String to remove
     */
    public void add(String s) {
        list[cursor++] = s;
    }

    /**
     * Removes the String from the list. If the String is not in the list it throws an
     * IllegalArgumentException. If the list is empty it throws an IllegalArgumentException
     *
     * @param s String to remove
     */
    public void remove(String s) throws IllegalArgumentException {
        if (list.length == 0) {
            throw new IllegalArgumentException("Size of collection is zero.");
        }
        boolean valid = false;
        for (String element : list) {
            if (element.equals(s)) {
                valid = true;
            }


        }
        if(valid==false){
            throw new IllegalArgumentException("Element doesnt exist!");
        }
        list[--cursor]=null;


    }

    /**
     * Removes all items from the list and initializes a new list
     */
    public void empty() {
        list = new String[5];
        cursor = 0;



    }

}