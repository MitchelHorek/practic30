package practic30;
public interface AbstractQueue<E> {

    void add(E element);

    E poll();

    boolean isEmpty();

}