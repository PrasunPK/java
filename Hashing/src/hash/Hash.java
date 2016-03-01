package hash;

public class Hash<K, V> {
    private V[] list;
    private int size = 10;

    public Hash() {
        list = (V[]) new Object[size];
    }

    public boolean addEntry(K key, V value) {
        list[position(key)] = value;
        return true;
    }

    private int position(K key) {
        return 0;
    }

    public V find(K key) {
        return list[position(key)];
    }
}
