package Question2;

import Question1.Composant;

import java.util.NoSuchElementException;

/**
 * Created by clement on 06/12/2017.
 */
public interface NodeIterator {
    public Composant next() throws NoSuchElementException;
    public boolean hasNext();
}
