import java.util.NoSuchElementException;

public class SimpleQueue {
    
    private int size;
    private int capacity;
    private String[] data;
    
    public SimpleQueue(int initialCapacity) {
        if (initialCapacity < 1) {
            throw new IllegalArgumentException();
        }
        
        this.size = 0;
        this.capacity = initialCapacity;
        this.data = new String[initialCapacity];
    }
    
    public boolean add(String s) {
        if (s == null) {
            throw new NullPointerException();
        } else if (size == capacity) {
            throw new IllegalStateException("Queue full");
        }
        
        data[size++] = s;
        
        return true;
    }
    
    public void clear() {
        size = 0;
        data = new String[capacity];
    }
    
    public boolean contains(String s) {
        if (s == null) {
            return false;
        }
        
        for (int i = 0; i < size; i++) {
            if (data[i].equals(s)) {
                return true;
            }
        }
        
        return false;
    }
    
    public String element() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        
        return data[0];
    }
    
    public boolean offer(String s) {
        if (s == null) {
            throw new NullPointerException();
        } else if (size == capacity) {
            return false;
        }
        
        data[size++] = s;
        
        return true;
    }
    
    public String peek() {
        if (size == 0) {
            return null;
        }
        
        return data[0];
    }
    
    public String poll() {
        if (size == 0) {
            return null;
        }
        
        return remove();
    }
    
    public int remainingCapacity() {
        return capacity - size;
    }
    
    public String remove() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        
        String s = data[0];
        for (int i = 0; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null;
        
        return s;
    }
    
    public boolean remove(String s) {
        int index = indexOf(data, size, s);
        
        if (index == -1) {
            return false;
        }
        remove(index);
        
        return true;
    }
    
    public int size() {
        return size;
    }
    
    @Override
    public String toString() {
        String s = "[";
        
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                s = s + data[i];
            } else {
                s = s + data[i] + ", ";
            }
        }
        
        return s + "]";
    }
    
    private static int indexOf(String[] data, int size, String s) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(s)) {
                return i;
            }
        }
        
        return -1;
    }
    
    private void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        
        data[--size] = null;
    }
}
