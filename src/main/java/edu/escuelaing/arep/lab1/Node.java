package edu.escuelaing.arep.lab1;

/**
 * Class that defines nodes
 * @author Carlos Gomez
 *
 */
public class Node {
    private Node priorN;
    private Node nextN;
    private int number;

    /**
     * Constructor of a node
     * @param priorN Prior node that is going to have this node
     * @param nextN  Next node that is going to have this node
     * @param number Value of the node
     */
    public Node(Node priorN, Node nextN, int number){
        this.priorN= priorN;
        this.nextN= nextN;
        this.number=number;
    }

    /**
     * Get the next node of a specific node
     * @return The node's next node
     */
    public Node getNextN() {
        return nextN;
    }

    /**
     * Get the prior node of a specific node
     * @return The node's prior node
     */
    public Node getPriorN() {
        return priorN;
    }

    /**
     * Get the value of a specific node
     * @return The node's value
     */
    public int getNumber() { return number; }

    /**
     * Set the next node of a specific node
     * @param nextN Node which is going to be the node's next
     */
    public void setNextN(Node nextN) {
        this.nextN = nextN;
    }

    /**
     * Set the prior node of a specific node
     * @param priorN Node which is going to be the node's prior
     */
    public void setPriorN(Node priorN) {
        this.priorN = priorN;
    }

}
