
public class Tree {
	private Node root;

	public Tree(Node root) {
		this.root = root;
	}

	public boolean contains(int v) {
		return contains(root, v);
	}

	private boolean contains(Node node, int v) {
		if (node == null) {
			return false;
		}

		if (node.value == v) {
			return true;
		}

		return contains(node.left, v) || contains(node.right, v);
	}

	public void addNode(int v) {
		if (contains(v)) {
			System.out.println("Der Wert ist bereits im Baum enthalten!");
			return;
		}

		root = addNode(root, new Node(v));
	}

	private Node addNode(Node node, Node toAdd) {
		if (node == null) {
			return toAdd;
		}

		if (toAdd.value < node.value) {
			node.left = addNode(node.left, toAdd);
		} else {
			node.right = addNode(node.right, toAdd);
		}

		return node;
	}

	public Node getNode(int v) {
		return getNode(root, v);
	}

	private Node getNode(Node node, int v) {
		if (node == null) {
			return null;
		}

		if (node.value == v) {
			return node;
		}

		if (node.value > v) {
			return getNode(node.left, v);
		}

		return getNode(node.right, v);
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
}
