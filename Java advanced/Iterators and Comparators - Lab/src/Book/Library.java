package Book;

import java.util.Iterator;

public class Library implements Iterable<Book> {
    private Book[] books;

    Library(Book... books){
        this.books=books;
    }
    public int getLength(){
        return books.length;
    }
    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }

    private final class LibIterator implements Iterator<Book> {
        private int i=0;

        @Override
        public boolean hasNext() {

            return i<getLength();
        }

        @Override
        public Book next() {
            i++;
            return books[i-1];
        }
    }


}
