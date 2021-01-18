package data;
import java.util.*;

public class Journal
{
    private String title;
    private ArrayList<Issue> issues;

    Journal(String initTitle) 
    {
        title = initTitle;
        issues = new ArrayList<Issue>();
    }


    public String getTitle() 
    {
        return title;
    }


    public void addIssue(Issue initIssue) 
    {  
        issues.add(initIssue);  
    }


    public void getIssues(ArrayList<Issue> issuesList) {
        for (int i = 0; i < issues.size(); i++) {
            issuesList.add(issues.get(i));
        }
    }


    public String toString()
    {
        return title;
    }


    public static ArrayList<Journal> getSampleJournals()
    {

        ArrayList<Journal> journals = new ArrayList<Journal>();

        Journal journal1 = new Journal("Computer Science");
        Journal journal2 = new Journal("Programming");
        Journal journal3 = new Journal("Music");

        journals.add(journal1);
        journals.add(journal2);
        journals.add(journal3);

        Issue issue1 = new Issue(2010, 2, 15, journal1);
        Issue issue2 = new Issue(2010, 4, 12, journal2);
        Issue issue3 = new Issue(1990, 1, 23, journal3);

        journal1.addIssue(issue1);
        journal2.addIssue(issue2);
        journal3.addIssue(issue3);

        Article article1 = new Article("All About Java", "Jane Doe", issue1);
        Article article2 = new Article("All About C++", "John Smith", issue2);
        Article article3 = new Article("Top Hits of 1990", "Ringo Starr", issue3);
        Article article4 = new Article("Top 10 albums of 1990", "Ringo Starr", issue3);


        issue1.addArticles(article1);
        issue2.addArticles(article2);
        issue3.addArticles(article3);
        issue3.addArticles(article4);

        return journals;
    }
}
