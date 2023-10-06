import searchalgorithm.*;
import searchproblem.*;
import undirectedgraph.*;

public class Main {
    public static void main(String[] args) {
        Graph graph = Romenia.defineGraph();
        graph.showLinks();
        graph.showSets();
        Node n;
        String[] labels = new String[3];
        labels[0] = "Muntenia";
        labels[1] = "Dobrogea";
        labels[2] = "Oltenia";
        n = graph.searchSolution("R. Vilcea", "Bucharest", labels , Algorithms.AStarSearch);
        graph.showSolution(n);
    }
}
