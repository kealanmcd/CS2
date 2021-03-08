import java.util.ArrayList;

public class BinaryTree 
{
    private String     data;
    private BinaryTree leftChild;
    private BinaryTree rightChild;
    
    // A constructor that takes root data only and
    // makes a tree with no children (i.e., a leaf)
    public BinaryTree(String d) 
    {
        data = d;
        leftChild = null;
        rightChild = null;
    }
    
    // A constructor that takes root data as well as two subtrees
    // which then become children to this new larger tree.
    public BinaryTree(String d, BinaryTree left, BinaryTree right)
    {
        data = d;
        leftChild = left;
        rightChild = right;
    }
    
    // Get methods
    public String getData() { return data; }
    public BinaryTree getLeftChild() { return leftChild; }
    public BinaryTree getRightChild() { return rightChild; }
    
    // Set methods
    public void setData(String d) { data = d; }
    public void setLeftChild(BinaryTree left) { leftChild = left; }
    public void setRightChild(BinaryTree right) { rightChild = right; }
    

    
    public boolean hasSameContentsAs(BinaryTree tree)
    {
        boolean leftNode = leftChild != null;
        boolean rightNode = rightChild != null;

        boolean treeLeft = tree.getLeftChild() != null;
        boolean treeRight = tree.getRightChild() != null;

        // If the current nodes data matches, check their inner nodes
        if (data == tree.getData())
        {
            // If both nodes are leaf nodes, we've reached the end of the subtree so can return true
            if (!leftNode && !rightNode && !treeLeft && !treeRight)
            {
                return true;
            }

            // If both nodes don't have a left child node but do have a right child, call the right node
            if (!leftNode && rightNode && !treeLeft && treeRight) 
            {
                return rightChild.hasSameContentsAs(tree.getRightChild());
            }
            // If both nodes don't have a right child but do have a left child, call the left child node
            else if (leftNode && !rightNode && treeLeft && !treeRight) 
            {
                return leftChild.hasSameContentsAs(tree.getLeftChild());
            }
            // The current node has both left and right child nodes so recursively call both child nodes.
            // Both child nodes need to return true in order for both trees to match
            else if (leftNode && rightNode && treeLeft && treeRight)
            {
                return leftChild.hasSameContentsAs(tree.getLeftChild()) && rightChild.hasSameContentsAs(tree.getRightChild());
            }

        }

        return false;
    }
    

    public int numberOfNodes()
    {
        // We've reached the leaf node in the Subtree so return 1
        // to be added to the total nodes found
        if (leftChild == null && rightChild == null)
        {
            return 1;
        }

        // If no left child then we know there's a right node
        if (leftChild == null)
        {
            return 1 + rightChild.height();
        }
        // If no right child then travel down the left child node
        else if (rightChild == null)
        {
            return 1 + leftChild.height();
        }
        // Travel down both left and right child nodes and add each of those to the
        // accumulative count
        else 
        {
            return 1 + leftChild.numberOfNodes() + rightChild.numberOfNodes();
        }
    }
    
    // Return the height of the tree
    public int height()  
    {
        // Base case: if there are no more children, return 1
        if (leftChild == null && rightChild == null)
        {
            return 1;
        }
        
        // Recursive case: one or neither child is null
        if (leftChild == null)
        {
            return 1 + rightChild.height();
        }
        else if (rightChild == null)
        {
            return 1 + leftChild.height();
        }
        else
        {
            return 1 + Math.max(leftChild.height(),
                                rightChild.height());
        }
    }
    
    
    // Return all the leaves of the tree
    public ArrayList<String> leafData()  
    {
        ArrayList<String> result = new ArrayList<String>();
        
        if (data != null) 
        {
            // Base case: check if the current tree is a leaf, and if so,
            // add the data
            if ((leftChild == null) && (rightChild == null))
            {
                result.add(data);
            }
        }
        
        // Recursive case: collect the leaves of the children and add them
        if (leftChild != null)
        {
            result.addAll(leftChild.leafData());
        }
        if (rightChild != null)
        {
            result.addAll(rightChild.leafData());
        }
        
        // Return all the leaves part of this tree
        return result;
    }
}
