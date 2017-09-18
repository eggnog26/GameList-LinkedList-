public class GamerList 
{
    private class Node 
    {
        String name;
        int score;
        Node next;
        Node(String name, int score) 
        {
            this.name = name;
            this.score = score;
            next = null;
        }
    }
    private Node list;
    public GamerList()
    {
      list = null;  
    }
    public int size() 
    {
        int count = 0;
        Node p = list;
        while(p != null) 
        {
            count++;
            p = p.next;
        }
        return count;
    }
    public void insert(String name, int score) 
    {
        Node node = new Node(name, score);
        if(list == null) 
        {
            list=node;
        }
        else if(list.score <= node.score) 
        {
            node.next = list;
            list = node;
        }
        else 
        {
            Node current = list;
            Node prev = list;
            while(current.score > node.score && current.next != null) 
            {
                prev = current;
                current = current.next;
            }
            node.next = prev.next;
            prev.next = node;
        }
        if(size() > 10) 
        {
            Node current = list;
            for (int i = 0; i < 9; i++) 
            {
                current = current.next;
            }
            current.next = null;
        }
    }
    public void printList() 
    {
        Node temp = list;
        while(temp != null) 
        {
            System.out.println(temp.name + " - " + temp.score);
            temp = temp.next;
        }
    }
}