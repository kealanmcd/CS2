import java.util.*;

public class Bookcase {

	private int rows;
	private int columns;
	ArrayList<Book>[] booksOnShelf;
	private int bookCount = 0;
  
	Bookcase(int initRows, int initColumns)
	{
			rows = initRows;
			columns = initColumns;
			buildBookShelves(initRows);
	}
	
	public int getShelves()
	{
			return rows;
	}

	public int getShelfSize() 
	{
			return columns;
	}

	// Builds each shelf on the bookcase
	private void buildBookShelves(int rows)
	{
			booksOnShelf = new ArrayList[rows];
			for (int i = 0; i < rows; i++) { 
					booksOnShelf[i] = new ArrayList<Book>();
			}
	}
	
	// Places book in readers hand on shelf
	public Book placeOnShelf(Book book)
	{
			if (bookCount < (rows * columns)) {
					boolean bookPlaced = false;
					int i = 0;
					while (bookPlaced == false && i < rows) {		
							if (booksOnShelf[i].size() < columns) {
									booksOnShelf[i].add(book);
									bookPlaced = true;
							} else {
									i++;
							}
					}
					bookCount++;
			} else {
					System.out.println("Sorry, this bookcase is full. You can't place this book here");
			}

			return null;
	}

	// Retrieve the requiested book from the bookcase
	public Book getBook(Book book)
	{
			int i = 0, j = 0;
			while (i < rows) {
					while (j < booksOnShelf[i].size()) {
							if (booksOnShelf[i].get(j) == book) {
									bookCount--;
									return booksOnShelf[i].remove(j);
							}
							j++;
					}
					i++;
			}

			System.out.println("Sorry, this book doesn't exist on this shelf");
			return null;
	}

	// Prints all books on the bookcase
	public void printAllBooks()
	{
			for (int i = 0; i < rows; i++) {
					for (int j = 0; j < booksOnShelf[i].size(); j++) {			
			  			System.out.println(booksOnShelf[i].get(j));
					}
			}
	}

}
