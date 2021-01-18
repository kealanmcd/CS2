public class ListNode
{
    private ReadThis data;    
    private ListNode next;
    
   public static int totalNodes = 0;
    
    public ListNode(ReadThis newData)
    {
        setData(newData);
        setNext(null);
        incrementTotalNodes();
    }
    
    public ListNode(ReadThis newData, ListNode newNext)
    {
        setData(newData);
        setNext(newNext);
        incrementTotalNodes();
    }

    private void incrementTotalNodes() {
        totalNodes++;
    }

    public static void printNumNodes()
    {
        System.out.println(totalNodes + " have been created so far.");
    }

    public ReadThis getData() {
        return data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setData(ReadThis newData) {
        data = newData;
    }
    public void setNext(ListNode newNext) {
        next = newNext;
        return;
    }
    
}