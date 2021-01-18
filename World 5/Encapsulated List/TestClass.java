public class TestClass
{
    public static void main(String[] args)
    {
        // Here are some objects we can store in our lists...
        
        ReadThis r1 = new ReadThis("http://www.bustle.com/articles/" +
                                   "63466-im-brianna-wu-and-im-risking-" +
                                   "my-life-standing-up-to-gamergate");
        
        ReadThis r2 = new ReadThis("http://i.imgur.com/4NjBQzn.jpg");
        
        ReadThis r3 = new ReadThis("http://imgur.com/zhppgSx");
        
        ReadThis r4 = new ReadThis("http://gnuu.org/2009/09/18/writing-" +
                                   "your-own-toy-compiler/all/1/");
        
        ReadThis r5 = new ReadThis("https://gigaom.com/2015/02/10/samsung-" +
                                   "tvs-start-inserting-ads-into-your-movies/");

        
        

        LinkedList listOne = new LinkedList(new ListNode(r1, new ListNode(r2)));
        ListNode.printNumNodes(); //listOne.printNumNodes();
        listOne.printListFromHere();
        listOne.addNodeToBeginning(new ListNode(r3));

        listOne.printListFromHere();
        
        listOne.addNodeToEnd(new ListNode(r4));
        
        listOne.addNodeAfterNode(new ListNode(r5), new ListNode(r3));
        
        
        ListNode.printNumNodes(); //listOne.printNumNodes();
        listOne.printListFromHere();

        ////
        // Let's test removing nodes from the beginning, middle, and end:
        
        listOne.removeFirstNode();
        listOne.printListFromHere();
        
        listOne.removeLastNode();
        listOne.printListFromHere();
        
        listOne.removeNode(new ListNode(r5));
        listOne.printListFromHere();
        
        listOne.removeNode(new ListNode(r1));
        listOne.printListFromHere();
        
        listOne.removeNode(new ListNode(r2));
        listOne.printListFromHere();
    }
    
    
    
}