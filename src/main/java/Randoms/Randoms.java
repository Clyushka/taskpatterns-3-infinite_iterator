package Randoms;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected final Random random = new Random();
    protected final int min;
    protected final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator(this);
    }
}