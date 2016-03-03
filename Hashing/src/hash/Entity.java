package hash;

public class Entity<K, V> {
    public K key;
    public V value;
    public Entity next;

    public Entity(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
