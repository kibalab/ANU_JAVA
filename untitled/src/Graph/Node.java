package Graph;

import java.util.LinkedList;

public class Node {
    public int index = 0;
    public boolean isSaw = false;
    public LinkedList<Node> linkedNode = new LinkedList<>();

    public Node(int index)
    {
        this.index = index;
    }
}
