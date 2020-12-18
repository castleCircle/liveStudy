package weeks5;

import org.junit.jupiter.api.*;

import java.util.Collections;

class BinaryTreeTest {

    private Node node1;
    private int[] bfsArray = {1,10,23,7,8,13,48,22,49};
    private int[] dfsArray = {22,7,49,10,8,1,13,23,48};

    @BeforeEach
    @DisplayName("초기화")
    public void setUp(){
        node1 = new Node(1);
        Node node2 = new Node(10);
        Node node3 = new Node(23);
        Node node4 = new Node(7);
        Node node5 = new Node(8);
        Node node6 = new Node(13);
        Node node7 = new Node(48);
        Node node8 = new Node(22);
        Node node9 = new Node(49);

        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        node3.setRight(node7);
        node4.setLeft(node8);
        node4.setRight(node9);
    }


    @Test
    public void dfs(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.dfs(node1);
        System.out.println(binaryTree.getDfsResult());
        for(int i=0;i<binaryTree.getDfsResult().size();i++){
            Assertions.assertEquals(dfsArray[i],binaryTree.getDfsResult().get(i));
        }
    }


    @Test
    public void bfs(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.bfs(node1);
        System.out.println(binaryTree.getBfsResult());
        for(int i=0;i<binaryTree.getBfsResult().size();i++){
            Assertions.assertEquals(bfsArray[i],binaryTree.getBfsResult().get(i));
        }
    }


}