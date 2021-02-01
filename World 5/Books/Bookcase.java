import java.util.*;

public class Bookcase {

	ArrayList<Book>[] booksOnShelf;
	private int bookCount = 0;
	private final int bookshelfSize = 50;
	private Book[] bookcase;
  
	Bookcase()
	{
      bookcase = new Book[bookshelfSize];	
	}
	
	// Places book in readers hand on shelf
	public Book placeOnShelf(Book book)
	{
      if (bookCount < bookshelfSize ) {
          bookcase[bookCount] = book;
          bookCount++;
      } else {
          System.out.println("Sorry, this bookcase is full. You can't place this book here");
      }

      return null;
  }

	// Retrieve the requested book from the bookcase
	public Book getBook(Book book)
	{
      int i = 0;
      Book retrievedBook = null;
      while (i < bookcase.length) {
          if (bookcase[i] == book) {
              retrievedBook = bookcase[i];
              repositionBooks(i);
              bookCount--;
              return retrievedBook;
          }
          i++;
      }

      System.out.println("Sorry, this book doesn't exist on this shelf");
			return retrievedBook;
  }

  private void repositionBooks(int index) {
      for (int i = index + 1; i < bookcase.length; i++) {
          bookcase[i-1] = bookcase[i];
      }
  }

  // Prints all books on the bookcase
  public void printAllBooks()
  {
      for (int i = 0; i < bookCount; i++) {
          System.out.println(bookcase[i]);
      }
  }

}
