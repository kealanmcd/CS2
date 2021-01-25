package ui;

import data.BibliographyDatabase;
import java.util.Scanner;

public class BibliographyManagerUI 
{
    private BibliographyDatabase database;
    BibliographyManagerUI(BibliographyDatabase newDatabase)
    {
        database = newDatabase;
    }

    void runBibliographyManager()
    {
        System.out.println("Welcome to the Bibliography Database!\n");
        boolean managerRunning = true;

        while (managerRunning)
        {
            System.out.print("You may perform the following operations:" + "\n"
            + " 1) Find articles from a given year" + "\n"
            + " 2) Add an article to an issue" + "\n"
            + " 3) Find the most-published author" + "\n"
            + " 4) Exit" + "\n"
            + " Please enter your choice (1, 2, 3 or 4): ");

            Scanner input = new Scanner(System.in);
            int choiceIndex = input.nextInt();
            System.out.println();

            switch(choiceIndex) {
                case 1:

                    // Find articles from a given year
                    System.out.print("What year are you interested in? ");
                    int year = input.nextInt();
                    database.findArticlesFromYear(year);

                    break;
                case 2:
                
                    // Add an article to an issue
                    System.out.println("Add an article to an issue" + "\n");
                    database.printAllIssues();

                    if (database.getIssuesSize() > 0) {

                        int issueNum = input.nextInt() - 1;
                        input.nextLine();

                        if (issueNum >= 0 && (issueNum + 1) <= database.getIssuesSize()) {

                            System.out.print("\nPlease specify the article title: ");
                            String title = input.nextLine();

                            System.out.print("Please specify the article author: ");
                            String author = input.nextLine();

                            database.addArticleToIssue(title, author, issueNum);

                        } else {

                            System.out.println("\nInvalid choice");

                        }

                    } else {

                        System.out.println("\nSorry this database has no issues");

                    }
                    
                    break;
                case 3:
                    // Find the most-published author
                    System.out.println("Find the most-published author" + "\n");
                    database.getMostPublishedAuthor();
                    
                    break;
                case 4:
                    // Exit Bibliography Manager
                    System.out.println("Exit" + "\n");
                    input.close();
                    managerRunning = false;

                    break;
                default:
                    System.out.println("Invalid Choice" + "\n");
            }

            System.out.println();
        }

    }
    
    public static void main(String[] args) {
        
        BibliographyManagerUI ui = new BibliographyManagerUI(BibliographyDatabase.getSampleBibliograhpy());
        ui.runBibliographyManager();

    }
}
