package zack.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {


    public void BFS(Vertex root) {

            Queue<Vertex> queue = new LinkedList<Vertex>();
            root.setVertexIsVisited(true);
            queue.add(root);
            while(!queue.isEmpty()) {
                Vertex current = queue.remove();
                System.out.println(current);
                for(Vertex neighbor : current.getNeighbors()) {
                    if (!neighbor.getVertexIsVisited())
                    {
                        neighbor.setVertexIsVisited(true);
                        queue.add(neighbor);
                    }
                }

            }


    }


}
