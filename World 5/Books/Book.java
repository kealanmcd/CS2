public class Book {

    private String title;
    private String author;
    private int ISBN;

    Book(String bTitle, String aTitle, int num)
    {
        title  = bTitle;
        author = aTitle;
        ISBN  = num;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getISBN()
    {
        return ISBN;
    }

    public String toString()
    {
      return "Title: " + title + ", Author: " + author + " and ISBN: " + ISBN;
    }
}