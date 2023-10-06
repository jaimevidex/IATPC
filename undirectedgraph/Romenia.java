package undirectedgraph;

public class Romenia {

    public static Graph defineGraph() {

        Graph g = new Graph();
        // Define cities:
        g.addVertex("Oradea", 47.06463926100731, 22.01449564522743);
        g.addVertex("Zerind", 46.55928001595497, 21.38665753619194);
        g.addVertex("Bucharest", 44.37785138583184, 26.047278331050872);
        g.addVertex("Urziceni", 44.575556581048964, 26.765627355690004);
        g.addVertex("Arad", 46.10392359550476, 21.28854671661377);
        g.addVertex("Mehadia", 44.874802914724356, 22.510207133073806);
        g.addVertex("Neamt", 46.90492895113945, 26.242422011260985);
        g.addVertex("Iasi", 47.24716429562569, 27.474521928491594);
        g.addVertex("R. Vilcea", 45.080240314655306, 24.26710959751129);
        g.addVertex("Eforie", 43.91473318688392, 28.745271505699158);
        g.addVertex("Pitesti", 44.78882944939613, 24.86002488749504);
        g.addVertex("Timisoara", 45.87814575111389, 21.158105196647647);
        g.addVertex("Craiova", 44.32332332604408, 23.872134593372344);
        g.addVertex("Hirsova", 44.59990403351784, 27.855573325309752);
        g.addVertex("Vaslui", 46.68169707769394, 27.757196535015108);
        g.addVertex("Giurgiu", 43.76050593086242, 26.041355992250445);
        g.addVertex("Sibiu", 45.930920210437776, 24.00155624659538);
        g.addVertex("Dobreta", 44.50678717581749, 22.68311859438896);
        g.addVertex("Fagaras", 45.91009844984055, 24.980726271247864);
        g.addVertex("Lugoj", 45.55170254611015, 21.77153717680931);
        // Define routes:
        g.addEdge("Bucharest","Giurgiu");
        g.addEdge("R. Vilcea","Sibiu");
        g.addEdge("Iasi","Vaslui");
        g.addEdge("Iasi","Neamt");
        g.addEdge("Lugoj","Mehadia");
        g.addEdge("Arad","Timisoara");
        g.addEdge("Arad","Sibiu");
        g.addEdge("Bucharest","Fagaras");
        g.addEdge("Eforie","Hirsova");
        g.addEdge("Fagaras","Sibiu");
        g.addEdge("Bucharest","Urziceni");
        g.addEdge("Craiova","Pitesti");
        g.addEdge("Dobreta","Mehadia");
        g.addEdge("Hirsova","Urziceni");
        g.addEdge("Arad","Zerind");
        g.addEdge("Craiova","R. Vilcea");
        g.addEdge("Craiova","Dobreta");
        g.addEdge("Urziceni","Vaslui");
        g.addEdge("Lugoj","Timisoara");
        g.addEdge("Bucharest","Pitesti");
        g.addEdge("Pitesti","R. Vilcea");
        g.addEdge("Oradea","Zerind");
        g.addEdge("Oradea","Sibiu");
        // Define regions:
        g.addVertexSet("Banat");
        g.addVertexToSet("Banat","Mehadia");
        g.addVertexToSet("Banat","Timisoara");
        g.addVertexToSet("Banat","Lugoj");
        g.addVertexSet("Crisana");
        g.addVertexToSet("Crisana","Oradea");
        g.addVertexToSet("Crisana","Zerind");
        g.addVertexToSet("Crisana","Arad");
        g.addVertexSet("Dobrogea");
        g.addVertexToSet("Dobrogea","Eforie");
        g.addVertexToSet("Dobrogea","Hirsova");
        g.addVertexSet("Moldova");
        g.addVertexToSet("Moldova","Neamt");
        g.addVertexToSet("Moldova","Iasi");
        g.addVertexToSet("Moldova","Vaslui");
        g.addVertexSet("Muntenia");
        g.addVertexToSet("Muntenia","Bucharest");
        g.addVertexToSet("Muntenia","Urziceni");
        g.addVertexToSet("Muntenia","Pitesti");
        g.addVertexToSet("Muntenia","Giurgiu");
        g.addVertexSet("Oltenia");
        g.addVertexToSet("Oltenia","R. Vilcea");
        g.addVertexToSet("Oltenia","Craiova");
        g.addVertexToSet("Oltenia","Dobreta");
        g.addVertexSet("Transilvania");
        g.addVertexToSet("Transilvania","Sibiu");
        g.addVertexToSet("Transilvania","Fagaras");

        return g;
    }

}