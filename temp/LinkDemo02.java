class Link{
	class Node{
		private String data;
		private Node next;
		public Node(String	data){
			this.data=data;
		}
		public	void add(Node newNode){
			if(this.next==null){
				this.next=newNode;
			}
			else {
				this.next.add(newNode);
			}
		}
		public void print(){
			System.out.println(this.data + "\t");
			if(this.next!=null){
				this.next.print();
			}
		}
		public	boolean search(String	data){
			if(data.equals(this.data)){
				return true;
			}else {
				if(this.next!=null){
					return	this.next.search(data);
				}else{
					return false;
				}
			}
		}
		public void delete(Node previous, String data){
			if(data.equals(this.data)){
				previous.next= this.next;
			}
			else {
				if(this.next!=null){
					this.next.delete(this,data);
				}
			}
		}
	}
	private Node root;
	public	void addNode(String	data){
		Node newNode = new Node(data);
		if(this.root==null){
			this.root=newNode;
		}else {
			this.root.add(newNode);
		}
	}
	public void printNode(){
		if(this.root!=null){
			this.root.print();
		}
	}
	public	boolean contain(String	data){
		return	this.root.search(data);
	}
	public void deleteNode(String data){
		if(this.contain(data)){
			if(this.root.data.equals(data)){
				this.root=this.root.next;
			}else{
				this.root.next.delete(this.root,data);
			}
		}
	}
}

public class LinkDemo02{
	public static void main(String[] args){
		Link link=  new Link();
		link.addNode("A");
		link.addNode("B");
		link.addNode("C");
		link.addNode("D");
		link.addNode("E");
		System.out.println("================================  before  delete ==============");
		link.printNode();
		link.deleteNode("D");
		link.deleteNode("E");
		System.out.println();
		System.out.println("================================  after delete =============");
		link.printNode();
		System.out.println();
		System.out.println("the result of the search :" + link.contain("A"));
	}
}
