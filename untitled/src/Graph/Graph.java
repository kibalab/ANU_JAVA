package Graph;

import java.util.LinkedList;

public class Graph {
    public static Node Root;
    private static LinkedList<Node> nodes = new LinkedList<Node>();

    public Graph(int nodeCount, int startIndex) {
        InitializeNodes(nodeCount, startIndex);
    }

    public void InitializeNodes(int NodeCount, int startIndex) {
        for (int i = 0; i < NodeCount; i++) {
            Node node = new Node(i);
            nodes.add(node);
            if(startIndex - 1 == i) Root = node;
        }
    }

    public void AddTransition(int fromIndex, int toIndex) {
        nodes.get(fromIndex).linkedNode.add(nodes.get(toIndex));
    }
}
