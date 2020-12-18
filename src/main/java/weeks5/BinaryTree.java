package weeks5;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BinaryTree {

    List<Integer> bfsResult= new ArrayList<>();
    List<Integer> dfsResult= new ArrayList<>();

    public void bfs(Node node){

        if(node == null){
            return;
        }

        Queue<Node> nodes = new ConcurrentLinkedQueue<>();
        nodes.offer(node);

        while(!nodes.isEmpty()){
            Node polledNode = nodes.poll();
            bfsResult.add(polledNode.getValue());

            if(null != polledNode.getLeft()){
                nodes.offer(polledNode.getLeft());
            }

            if(null != polledNode.getRight()){
                nodes.offer(polledNode.getRight());
            }
        }

    }

    public void dfs(Node node){
        if(node!=null){
            dfs(node.getLeft());
            dfsResult.add(node.getValue());
            dfs(node.getRight());
        }
    }

    public List<Integer> getBfsResult() {
        return bfsResult;
    }

    public List<Integer> getDfsResult() {
        return dfsResult;
    }
}
