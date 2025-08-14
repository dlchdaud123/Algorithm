import java.io.*;

public class Main {
    static class Node {
        int num;
        Node left, right;
        Node(int num) { this.num = num; }
        void insert(int n) {
            if (n < this.num) {
                if (left == null) left = new Node(n);
                else left.insert(n);
            } else {
                if (right == null) right = new Node(n);
                else right.insert(n);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Node root = new Node(Integer.parseInt(br.readLine()));
        String line;
        while ((line = br.readLine()) != null && !line.equals("")) {
            root.insert(Integer.parseInt(line));
        }
        postOrder(root);
    }

    static void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.num);
    }
}