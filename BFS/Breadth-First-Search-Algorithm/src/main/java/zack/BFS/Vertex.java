package zack.BFS;

import java.util.ArrayList;

public class Vertex {

    private String vertexName;
    private Boolean vertexIsVisited = false;
    private ArrayList<Vertex> neighbors;

    public Vertex(String vertexName) {

        this.vertexName = vertexName;
        this.neighbors = new ArrayList<>();
    }

    public String getVertexName() {
        return vertexName;
    }

    public void setVertexName(String vertexName) {
        this.vertexName = vertexName;
    }

    public Boolean getVertexIsVisited() {
        return vertexIsVisited;
    }

    public void setVertexIsVisited(Boolean vertexIsVisited) {
        this.vertexIsVisited = vertexIsVisited;
    }

    public ArrayList<Vertex> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(ArrayList<Vertex> neighbors) {
        this.neighbors = neighbors;
    }

    public void addNeighbor(Vertex neighbor) {
        this.neighbors.add(neighbor);
    }


    @Override
    public String toString() {
        return "Vertex{" +
                "vertexName='" + vertexName;
    }
}
