package data;
import java.util.*;
import java.util.HashMap;

public class BibliographyDatabase 
{
   
    private ArrayList<Journal> journals;
    private ArrayList<Issue> issuesList;

    BibliographyDatabase()
    {

        journals = Journal.getSampleJournals();
        issuesList = new ArrayList<Issue>();
        retrieveAllIssues();
        
    }


    // Build an ArrayList of all issues in the database
    private ArrayList<Issue> retrieveAllIssues()
    {

        for (int i = 0; i < journals.size(); i++) {
            journals.get(i).getIssues(issuesList);
        }

        return issuesList;
        
    }


    // Build an ArrayList of of all Articles in the database
    private ArrayList<Article> retrieveAllArticles(ArrayList<Issue> issuesList) 
    {
        ArrayList<Article> articlesList = new ArrayList<Article>();
        for (int i = 0; i < issuesList.size(); i++) {
            issuesList.get(i).getArticles(articlesList);
        }

        return articlesList;
    }
    


    //  Finds all articles that were published in the given year
    public void findArticlesFromYear(int year)
    {

        ArrayList<Article> articlesList = new ArrayList<Article>();

        for (int i = 0; i < issuesList.size(); i++) {
            if (issuesList.get(i).getYear() == year) {
                issuesList.get(i).getArticles(articlesList);
            }
        }

        
        if (articlesList.size() == 0) {
            System.out.println("No articles from " + year + " have been found");
        } else {
            for (int i = 0; i < articlesList.size(); i++) {
                System.out.println(" " + (i+1) + ") " + articlesList.get(i));
            }
        }

    }


    // Find the most published author
    public void getMostPublishedAuthor() 
    {
        
        ArrayList<Article> articlesList = retrieveAllArticles(issuesList);
        
        HashMap<String, Integer> authors = new HashMap<String, Integer>();

        String mostPublishedAuthor = "";
        int mostPublishedAuthorCount = 0;

        for (int i = 0; i < articlesList.size(); i++) {
          
            String author = articlesList.get(i).getAuthor();
            int count = authors.containsKey(author) ? authors.get(author) : 0;
            
            authors.put(author, count + 1);

            if ((count+1) > mostPublishedAuthorCount) {
                mostPublishedAuthorCount = count + 1;
                mostPublishedAuthor = author;
            }
        }

        System.out.println("The most published author is " + mostPublishedAuthor + ".");

    }


    // Creates a new Article and adds to the relevant issue. Method is called
    // as a result of the UI option 2 (Add an article to an issue)
    public void addArticleToIssue(String title, String author, int issueNum)
    {

        Issue issue = issuesList.get(issueNum);
        Article article = new Article(title, author, issue);
        issue.addArticles(article);

    }



    // Print out all issues for the UI option 2 (Add an article to an issue)
    public void printAllIssues() 
    {

        if (issuesList.size() == 0) {

            System.out.println("No issues exist in this database");

        } else {

            for (int i = 0; i < issuesList.size(); i++) {
                System.out.println((i+1) + ") " + issuesList.get(i));
            }

            System.out.print("What issue would you like to add to (");
            String options = "";
            
            // Display the numeric options the user can choose from
            // eg. Two issues should show (1 or 2)
            //     THree issues would be (1, 2 or 3) etc.
            for (int i = 0; i < issuesList.size(); i++) {
                options += (i+1);

                if (i != issuesList.size() -1) {

                    if ((i+1) == (issuesList.size() -1)) {
                        options += " or ";
                    } else {
                        options += ", ";
                    }
                    
                }
            }
            System.out.print(options + "): ");

        }
        
    }
    
    // Used to to determine if any Issues exist in the database
    public int getIssuesSize()
    {
        return issuesList.size();
    }

    public static BibliographyDatabase getSampleBibliograhpy()
    {
        BibliographyDatabase database = new BibliographyDatabase();
          
        return database;
    }



    // Extras: The following methods aren't used in the UI.

    // The UI will print out every article to the user and will then ask 
    // the user which article they want to remove by entering the numeric
    // digit that appears beside that article.
    public void removeArticle(int articleInt) 
    {

        ArrayList<Article> articlesList = new ArrayList<Article>();
        if (articlesList.size() > articleInt) {

            articlesList.remove(articleInt);

        } else {

              System.out.println("Invalid article choice");
              
        }
          
    }

    
    // The UI will ask the user for inputs for the year, volume, issueNum and journal
    // and then pass those parameters into the following method.
    public void addIssue(int year, int volume, int issueNum, Journal journal)
    {

        Issue issue = new Issue(year, volume, issueNum, journal);
        journal.addIssue(issue);

    }


    // The UI will print out every issue to the user and will then ask 
    // the user which issue they want to remove by entering the numeric
    // value that appears beside the issue. 
    public void removeIssue(int issueNum)
    {

        issuesList.remove(issueNum);

    }


    // The UI will ask the user for title of the new journal that will
    // be added.
    public void addJournal(String journalTitle)
    {

        Journal journal = new Journal(journalTitle);
        journals.add(journal);

    }

    // The user will specify the name of the Journal they wish to remove
    public void removeJournal(String journalTitle)
    {

        for (int i = 0; i < journals.size(); i++) {
            if (journals.get(i).getTitle() == journalTitle) {
                journals.remove(i);
            }
        }

    }

}
