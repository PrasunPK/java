package hash;

public class Hash<K, V> {
    private int size = 10;

    private Entity[] list = new Entity[size];

    public void put(K key, V value) {
        Entity<K, V> entity = new Entity<>(key, value);
        int position = position(key);
        if (list[position] == null) {
            list[position] = entity;
        } else {
            list[position].next = entity;
        }
    }

    private int position(K key) {
        String givenKey;
        if (key == null)
            givenKey = "" + key;
        else
            givenKey = key.toString();
        long hash = hash(givenKey);
        return (int) hash % size;
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
        V value = null;
        int position = position(key);
        Entity<K, V> currentEntity = list[position];
        while (currentEntity != null) {
            if (currentEntity.key == key)
                value = currentEntity.value;
            currentEntity = currentEntity.next;
        }

        return value;
    }
}
