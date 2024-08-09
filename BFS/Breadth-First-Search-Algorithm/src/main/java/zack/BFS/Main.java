package zack.BFS;

public class Main {
    public static void main(String[] args) {


        BFS bfs = new BFS();
        Vertex vertex1 = new Vertex("1");
        Vertex vertex2 = new Vertex("2");
        Vertex vertex3 = new Vertex("3");
        Vertex vertex4 = new Vertex("4");
        Vertex vertex5 = new Vertex("5");

        vertex1.addNeighbor(vertex2);
        vertex1.addNeighbor(vertex3);
        vertex1.addNeighbor(vertex4);
        vertex2.addNeighbor(vertex1);
        vertex4.addNeighbor(vertex3);
        vertex5.addNeighbor(vertex3);
        vertex5.addNeighbor(vertex2);


        bfs.BFS(vertex5);












    }
}