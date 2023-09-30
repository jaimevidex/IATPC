import searchalgorithm.*;
import searchproblem.*;
import undirectedgraph.*;

public class Main {
    public static void main(String[] args) {
        Graph graph = Romenia.defineGraph();
        graph.showLinks();
        graph.showSets();
        Node n;
        String[] labels = new String[2];
        labels[0] = "Dobrogea";
        labels[1] = "Banat";
        n = graph.searchSetSolution("Arad", "Bucharest", labels, Algorithms.AStarSearch);
        graph.showSolution(n);
    }
}
