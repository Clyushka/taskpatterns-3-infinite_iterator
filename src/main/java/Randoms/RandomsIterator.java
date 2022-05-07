package Randoms;

import java.util.Iterator;

public class RandomsIterator implements Iterator<Integer> {
    private final Randoms rand;

    public RandomsIterator(Randoms rand) {
        this.rand = rand;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return (rand.random.nextInt(rand.max - rand.min + 1) + rand.min);
    }
}
