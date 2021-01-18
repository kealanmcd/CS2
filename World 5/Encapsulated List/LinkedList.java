public class LinkedList 
{
  private ListNode head;

  public LinkedList()
  {
      this(null);
  }
    
  public LinkedList(ListNode newData)
  {
      head = newData;
  }


  public void printListFromHere()
  {
      System.out.println("----------\nStart List\n----------");
      ListNode currNode = head;
      while (currNode != null)
      {
          System.out.println("\t" + currNode.getData());
          currNode = currNode.getNext();
      }
      System.out.println("----------\nEnd List\n----------");
  }


  public ListNode addNodeToBeginning(ListNode newNode)
  {
      ListNode temp = head;
      head = newNode;
      head.setNext(temp);
      return head;
  }

  public ListNode addNodeToEnd(ListNode newNode)
  {
      ListNode currNode = head;
      while (currNode.getNext() != null)
      {
        currNode = currNode.getNext();
      }
        
      currNode.setNext(newNode);
      return head;
  }

  public ListNode addNodeAfterNode(ListNode newNode, ListNode addAfter)
  {
      ListNode currNode = head;
      while (currNode != null &&
             !currNode.getData().equals(addAfter.getData()))
      {
          currNode = currNode.getNext();
      }
      
      if (currNode != null)
      {
          newNode.setNext(currNode.getNext());
          currNode.setNext(newNode);
      }

      return head;
  }


  public ListNode removeFirstNode()
  {
      head = head.getNext();
      return head;
  }

  public ListNode removeLastNode()
  {
      if (head == null)
      {
          return null;
      } else {
          ListNode prevNode = null;
          ListNode currNode = head;
          while (currNode.getNext() != null)
          {
              prevNode = currNode;
              currNode = currNode.getNext();
          }
          
          prevNode.setNext(null);
          return head;
      }
  }


  public ListNode removeNode(ListNode toRemove)
  { 
      if (head.getData().equals(toRemove.getData()))
      {
          head = head.getNext();
          return head;
      } else {
            
          ListNode currNode = head;
            
          while (currNode.getNext() != null &&
                 !currNode.getNext().getData().equals(toRemove.getData()))
          {
              currNode = currNode.getNext();
          }
            
          if (currNode.getNext() != null)
          {
              currNode.setNext(currNode.getNext().getNext());
          }
            
          return head;
      }
  }
    
    
  public int getLength()
  {
      int length = 0;
      ListNode currNode = head;
      while (currNode != null)
      {
          length++;
          currNode = currNode.getNext();
      }
        
      return length;
  }

}