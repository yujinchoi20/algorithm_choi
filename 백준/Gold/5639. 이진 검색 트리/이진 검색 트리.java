import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
	int data;
	Node left;
	Node right;
	
	Node (int data){ //root 노드
		this.data = data;
	}
	Node(int data, Node left, Node right){ //node 추가 
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	void insert(int data) {
		if(data < this.data) { //작으면 왼쪽
			if(this.left == null) this.left = new Node(data);
			else this.left.insert(data); //재귀
		}
		else { //크거나 같으면 오른쪽
			if(this.right == null) this.right = new Node(data);
			else this.right.insert(data); //재귀 
		}
	}
}

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		Node root = new Node(Integer.parseInt(br.readLine())); //root 노드
		
		while(true) {
			input = br.readLine();
			if(input == null || input.equals("")) break;
			root.insert(Integer.parseInt(input)); //Node 추가
		}
		
		postorder(root); //후위순회 
	}

	public static void postorder(Node node) {
		if(node == null) return;
		
		//왼쪽 -> 오른쪽 -> 루트
		postorder(node.left);
		postorder(node.right);
		System.out.println(node.data);
	}
}