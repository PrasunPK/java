package hash;

/**
 * Created by prasunkp on 29/02/16.
 */
public class Hash {
    private int[] list;
    private int size = 10;

    public Hash() {
        list = new int[size];
    }

    private int doKMod(int number) {
        return number % size;
    }

    private boolean isPositionEmpty(int position) {
        return position < size && list[position] == 0;
    }

    private boolean addToNextPosition(int currentPosition, int value) {
        int nextPosition = currentPosition + 1;
        if (isPositionEmpty(nextPosition)) {
            list[nextPosition] = value;
            return true;
        }
        if (nextPosition < size)
            addToNextPosition(nextPosition, value);
        return false;
    }

    public boolean addEntry(int value) {
        int kmod = doKMod(value);
        if (isPositionEmpty(kmod)) {
            list[kmod] = value;
            return true;
        }
        return addToNextPosition(kmod, value);
    }

    public int getElement(int key) {
        return list[key];
    }
}
