package Graph.Algorithm;

import Graph.Graph;
import Graph.Node;

public class Search {
    public static void DFS(Node node, Action)
    {
        if(node.isSaw) return;
         node.isSaw = true;

        for(int i = 0; i< node.linkedNode.size(); i++)
        {
            DFS(node.linkedNode.get(i));
        }
    }
}
