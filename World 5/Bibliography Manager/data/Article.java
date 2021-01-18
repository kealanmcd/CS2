package data;

public class Article 
{

    private String title;
    private String author;
    private Issue issue;

    Article(String initTitle, String initAuthor, Issue initIssue)
    {
        title = initTitle;
        author = initAuthor;
        issue = initIssue;
    }
  
    // Getter Methods
    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public Issue getIssue() 
    {
        return issue;
    }

    public String toString()
    {
        return author + ". " + title  + ". " + issue + ".";
    }
}
