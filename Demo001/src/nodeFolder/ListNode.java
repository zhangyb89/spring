package nodeFolder;

public class ListNode {

	private Node headNode;
	

	/**
	 * @return the headNode
	 */
	public Node getHeadNode() {
		return headNode;
	}

	/**
	 * @param headNode the headNode to set
	 */
	public void setHeadNode(Node headNode) {
		this.headNode = headNode;
	}
//	ListNode result = new ListNode();
//	Node head = this.getHeadNode();
//	Node temp = null,nextNode = null;
//	while(head != null){
//		nextNode = head.getNextNode();
//		head.setNextNode(temp);
//		temp = head;
//		
//		head = nextNode;
//	}
//	result.setHeadNode(temp);
//	return result;
	/**
	 * 
	 * 功能描述: <br>
	 * 〈升序插入〉
	 *
	 * @author zhangybn
	 * @date 2017-6-13
	 * @param node
	 * @return
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	public boolean addNodeAsc(Node node){
		if(this.getHeadNode() == null){
			this.setHeadNode(node);
			return true;
		}
		Node temp = null;
		Node current = this.getHeadNode();
		while(current != null && current.getData() < node.getData()){
			temp = current;
			current = current.getNextNode();
		}
		if(temp != null){
			temp.setNextNode(node);
		}
		node.setNextNode(current);
		if(temp == null){
			this.setHeadNode(node);
		}
		return true;
	}
	/**
	 * 
	 * 功能描述: <br>
	 * 〈降序插入〉
	 *
	 * @author zhangybn
	 * @date 2017-6-13
	 * @param node
	 * @return
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	public boolean addNodeDesc(Node node){
		if(this.getHeadNode() == null){
			this.setHeadNode(node);
			return true;
		}
		Node temp = null;
		Node current = this.getHeadNode();
		while(current != null && current.getData() > node.getData()){
			temp = current;
			current = current.getNextNode();
		}
		if(temp != null){
			temp.setNextNode(node);
		}
		node.setNextNode(current);
		if(temp == null){
			this.setHeadNode(node);
		}
		return true;
	}
	/**
	 * 
	 * 功能描述: <br>
	 * 〈逆向单向链表〉
	 *
	 * @author zhangybn
	 * @date 2017-6-9
	 * @param listNode
	 * @return
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	public ListNode reverseList(){
//		ListNode result = new ListNode();
//		Node head = this.getHeadNode();
//		Node temp = null;
//		Node tempNextNode = null;
//		Node sourceNextNode = null;
//		while(head != null){
//			sourceNextNode = head.getNextNode();
//			temp = head;
//			temp.setNextNode(tempNextNode);
//			tempNextNode = temp;
//			
//			head = sourceNextNode;
//		}
//		result.setHeadNode(temp);
//		return result;
		ListNode result = new ListNode();
		Node head = this.getHeadNode();
		Node temp = null;
		Node nextNode = null;
		while(head != null){
			nextNode = head.getNextNode();
			
			head.setNextNode(temp);
			temp = head;
			
			head = nextNode;
		}
		result.setHeadNode(temp);
		return result;
	}
	
	/**
	 * 
	 * 功能描述: <br>
	 * 〈有序合并两个List〉
	 *
	 * @author zhangybn
	 * @date 2017-6-12
	 * @param list1
	 * @param list2
	 * @return
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	public static ListNode mergeList(ListNode list1,ListNode list2){
		ListNode result = new ListNode();
		if(list1 == null) return list2;
		if(list2 == null) return list1;
		Node mergeDetail = mergeDetail(list1.getHeadNode(),list2.getHeadNode());
		result.setHeadNode(mergeDetail);
		return result;
	}

	/**
	 * 
	 * 功能描述: <br>
	 * 〈合并两个有序的单向链表，貌似有问题。
	 * 	如果两个链表都是递增的那么还可以，如果一个递增一个递减就不行了。〉
	 *
	 * @author zhangybn
	 * @date 2017-6-13
	 * @param a
	 * @param b
	 * @return
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	private static Node mergeDetail(Node a, Node b) {
		Node resultNode = null;
		if(a != null && b != null){
			int a1 = a.getData();
			int b2 = b.getData();
			if(a1 <= b2){
				resultNode = a;
				resultNode.setNextNode(mergeDetail(a.getNextNode(), b));
			}else{
				resultNode = b;
				resultNode.setNextNode(mergeDetail(b.getNextNode(),a));
			}
		}
		return resultNode;
	}
	/**
	 * 
	 * 功能描述: <br>
	 * 〈逐对逆置单向链表〉
	 *
	 * @author zhangybn
	 * @date 2017-6-13
	 * @return
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	public static ListNode reversePair(ListNode list){
		ListNode result = new ListNode();
		if(list == null) return null;
		
		Node temp = list.getHeadNode();
		Node resultNode = null;
		while(temp != null && temp.getNextNode() != null){
			Node headNode = temp.getNextNode();
			
			temp.setNextNode(temp.getNextNode().getNextNode());
			
			headNode.setNextNode(temp);
			
			if(resultNode == null){
				result.setHeadNode(headNode);
			}else{
				resultNode.setNextNode(headNode);
			}
			resultNode = headNode.getNextNode();
			temp = temp.getNextNode();
		}
		if(temp != null){
			resultNode.setNextNode(temp);
		}
		return result;
	}
	/**
	 * 
	 * 功能描述: <br>
	 * 〈书中的逐对逆置〉
	 *
	 * @author zhangybn
	 * @date 2017-6-13
	 * @param list
	 * @return
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	public static ListNode ReversePairV2(ListNode list){
		ListNode result = new ListNode();
		Node head = list.getHeadNode();
		
		Node temp1 = null;
		Node temp2 = null;
		
		while(head != null && head.getNextNode() != null){
				if(temp1 != null){
					Node nextNode = head.getNextNode();
					temp1.getNextNode().setNextNode(nextNode);
				}
				
				temp1 = head.getNextNode();
				Node nextNode2 = head.getNextNode().getNextNode();
				head.setNextNode(nextNode2);
				
				temp1.setNextNode(head);
				if(temp2 == null){
					temp2 = temp1;
				}
				
				head = head.getNextNode();
		}
		result.setHeadNode(temp2);
		return result;
	}

	public static void splitTwoList(ListNode list) {
		Node head = list.getHeadNode();
		ListNode linkList = new ListNode();
		linkList.setHeadNode(head);
		Node one = head;
		Node speed2 = head.getNextNode().getNextNode();
		while(head.getData() != speed2.getData()){
			one = one.getNextNode();
			if(speed2.getNextNode().getData() == head.getData()){
				break;
			}else{
				speed2 = speed2.getNextNode().getNextNode();
			}
		}
		Node twoHead = one.getNextNode();
		one.setNextNode(null);
		speed2.setNextNode(null);
		System.out.println("over");
	}
}





