package hash;

public class Hash<K, V> {
    private int size = 10;

    private V[] list = (V[]) new Object[size];

    public void put(K key, V value) {
        list[position(key)] = value;
    }

    private int position(K key) {
        String givenKey = key.toString();
        long hash = hash(givenKey);
        return (int)hash % size;
    }


    public long hash(String str) {
        long seed = 131;
        long hash = 0;
        for (int i = 0; i < str.length(); i++) {
            hash = (hash * seed) + str.charAt(i);
        }
        return hash;
    }

    public V get(K key) {
        return list[position(key)];
    }
}
