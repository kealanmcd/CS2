public class Reader 
{
  
    private String name;
    private Book book;

    Reader(String initName) 
    {
        name = initName;
    }

    public String getName() 
    {
        return name;
    }

    public Book getBook() 
    {
        if (book != null) {
            return book;
        } else {
            System.out.println(name + " is not holding a book");
            return  null;
        }
    }

    public void retrieveBook(Bookcase bookcase, Book newBook)
    {
        if (book == null) {
            book = bookcase.getBook(newBook);
        } else {
            System.out.println("Sorry, you're already holding a book. You need to put it back before taking another.");
        }
    }

    public void placeBookOnShelf(Bookcase bookcase)
    {
        if (book != null) {
            book = bookcase.placeOnShelf(book);
        } else {
            System.out.println("You're not holding a book, so this can't be actioned.");
        }
    }
}
