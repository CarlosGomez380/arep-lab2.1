package edu.escuelaing.arep.lab1;

/**
 * Class that defines linked lists
 * @author Carlos Gomez
 */
public class List {

    private Node head;

    /**
     * Constructor of a linked list
     */
    public List(){
        head= new Node(null,null,0);
    }

    /**
     * Add a new node
     * @param number Value of the node
     */
    public void addNode(int number){
        Node node= new Node(head.getNextN(), null, number);
        if (head.getPriorN() == null) {
            head.setPriorN(node);
        }
        else{head.getNextN().setNextN(node);}
        head.setNextN(node);
    }

    /**
     * Remove a specific node of the linked list
     * @param node Node that is going to be remove
     */
    public void removeNode(Node node){
        Node priorN= node.getPriorN();
        Node nextN = node.getNextN();
        if(priorN == null && nextN == null){
            System.out.println("Empty list");
        } else if(priorN == null){
            nextN.setPriorN(null);
            head.setPriorN(nextN);
        }else if(node.getNextN() == null){
            priorN.setNextN(null);
            head.setNextN(priorN);
        }else{
            priorN.setNextN(nextN);
            nextN.setPriorN(priorN);
        }
    }

    /**
     * Get the next node of a specific node
     * @param node Node from which is going to get the next node
     * @return The next node
     */
    public Node nextNode(Node node){
        return node.getNextN();
    }

    /**
     * Get the prior node of a specific node
     * @param node Node from which is going to get the next node
     * @return The prior node
     */
    public Node priorNode(Node node){
        return node.getPriorN();
    }

    /**
     * Get the linked list's head
     * @return The linked list's head
     */
    public Node getHead() {
        return head;
    }
}
