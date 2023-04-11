package com.tejas.practice;

public class CommonNodeMergingNodeFinding {
    public static void main(String[] args) {

        Node head1 = prepareLinkListOf(2,3,4,5,6,7);
        Node head2 = prepareLinkListOf(13,14,15,7);

    }

    private static Node prepareLinkListOf(int ...array) {
        Node head = null;
        Node prevNode = null;
        Node currentNode;
        for (int i=0; i< array.length-1; i++)
        {

             currentNode = new Node(array[i]);
             if (prevNode ==  null) {
                 prevNode = currentNode;
             }
             if (head ==null)
                 head = currentNode;
        }
        return head;
    }

    static class Node{
        Node reference;
        int data;

        public Node( int data) {
            this.data = data;
        }

        public Node getReference() {
            return reference;
        }

        public void setReference(Node reference) {
            this.reference = reference;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }
}
