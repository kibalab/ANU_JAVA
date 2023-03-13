import Graph.Graph;

public class Main {

    public static void main(String[] args) {
        int[] parameters = Console.ReadIntegersInLIne();
        int nodeCount = parameters[0];
        int transitionCount = parameters[1];
        int startIndex = parameters[2];

        Graph graph = new Graph(nodeCount, startIndex);

        for(int i =0; i< transitionCount; i++)
        {
            int[] transition = Console.ReadIntegersInLIne();

            graph.AddTransition(transition[0] - 1, transition[1] - 1);
        }
    }
}