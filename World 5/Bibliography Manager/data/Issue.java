package data;
import java.util.*;

public class Issue
{
    private int year;
    private int volume;
    private int issueNum;
    private ArrayList<Article> articles;
    private Journal journal;

    Issue (int initYear, int initVolume, int initIssueNum, Journal initJournal)
    {
        year = initYear;
        volume = initVolume;
        issueNum = initIssueNum;
        articles = new ArrayList<Article>();
        journal = initJournal;
    }

    // Getter Methods
    public int getYear() 
    {
        return year;
    }


    public int getVolume() 
    {
        return volume;
    }


    public int getIssueNum() 
    {
        return issueNum;
    }
    

    // Setter Methods
    public void setJournal(Journal initJournal)
    {
        journal = initJournal;
    }

    public void addArticles(Article article)
    {
        articles.add(article);
    }


    public void getArticles(ArrayList<Article> articlesList) {
        for (int i = 0; i < articles.size(); i++) {
            articlesList.add(articles.get(i));
        }
    }

    public String toString() 
    {
        return "Journal of " + journal + ", " + issueNum + "(" + volume + ")" + ", " + year;
    }
    
}
