package dataStructures;

public class BSTNode {

	public String value;
	public BSTNode left;
	public BSTNode right;
	
	public BSTNode(String value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public boolean insertNode(BSTNode node) {
		
		if(this.contains(node.value)) {
			return false;
			
		// left
		} else if(this.value.compareTo(node.value) < 0) {
			
			// if left null
			if(this.left == null) {
				this.left = node;
				return true;
			} else {
				
				// if new smaller than left
				if (this.left.value.compareTo(node.value) < 0) {
					return this.left.insertNode(node);
					
				// if new bigger than left
				} else {
					BSTNode temp = left;
					this.left = node;
					return this.left.insertNode(temp);
				}
			}
		// right
		} else if (this.value.compareTo(node.value) > 0) {
			
			// if right null
			if (this.right == null) {
				this.right = node;
				return true;
			} else {
				
				// if new bigger than right
				if (this.right.value.compareTo(node.value) > 0) {
					return this.right.insertNode(node);
					
				// if new smaller than right
				} else {
					BSTNode temp = right;
					this.right = node;
					return this.right.insertNode(temp);
				}
			}
		}
		return false;
	}
	
	public boolean contains(String target) {
		
		if(this != null && this.value.equals(target)) {
			return true;
		} else if(this.value.compareTo(target) < 0 && this.left != null && this.left.contains(target)) {
			return true;
		} else if(this.value.compareTo(target) > 0 && this.right != null && this.right.contains(target)) {
			return true;
		} else {
			return false;
		}
	}
	
	public BSTNode printTree(BSTNode node) {
		BSTNode curr = node;
		System.out.println(curr.value + " ");
		if(curr.left != null) {
			
			return printTree(curr.left);
		}
		if (curr.right != null) {
			return printTree(curr.left);
		}
		return null;
	}
}
