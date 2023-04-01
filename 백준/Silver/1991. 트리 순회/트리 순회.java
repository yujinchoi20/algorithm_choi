import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node {
	char data;
	Node left;
	Node right;
	
	Node(char data) {
		this.data = data;
	}
}

class Tree {
	public void searchNode(Node node, char data, char leftNode, char rightNode) {
		if(node == null) {
			return;
		}
		else if(node.data == data) {
			node.left = leftNode != '.' ? new Node(leftNode) : null;
			node.right = rightNode != '.' ? new Node(rightNode) : null;
		}
		else {
			searchNode(node.left, data, leftNode, rightNode);
			searchNode(node.right, data, leftNode, rightNode);
		}
	}
	
	public void preorder(Node node) {
		if(node != null) {
			System.out.print(node.data);
			if(node.left != null) preorder(node.left);
			if(node.right != null) preorder(node.right);
		}
	}
	
	public void inorder(Node node) {
		if(node != null) {
			if(node.left != null) inorder(node.left);
			System.out.print(node.data);
			if(node.right != null) inorder(node.right);
		}
	}
	
	public void postorder(Node node) {
		if(node != null) {
			if(node.left != null) postorder(node.left);
			if(node.right != null) postorder(node.right);
			System.out.print(node.data);
		}
	}
}

public class Main {		
	static Node head = new Node('A'); //항상 A가 루트 노드
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		Tree t = new Tree();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			char root = st.nextToken().charAt(0);
			char left = st.nextToken().charAt(0);
			char right = st.nextToken().charAt(0);
			
			t.searchNode(head, root, left, right);
		}
		
		t.preorder(head);
		System.out.println();
		t.inorder(head);
		System.out.println();
		t.postorder(head);
		System.out.println();
	}
}