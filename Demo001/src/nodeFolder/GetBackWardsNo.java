package nodeFolder;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * 
 * 〈获取一个nodeList中的倒数第n个元素〉<br> 
 * 〈功能详细描述〉
 *
 * @author zhangybn
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class GetBackWardsNo {
	/*public static void main(String[] args) {
		
		ListNode headNode = new ListNode();
		Node node = new Node(12);
		
		headNode.addNode(node);
		
		System.out.println(headNode);
		
		headNode.addNode(new Node(10));
		headNode.addNode(new Node(8));
		headNode.addNode(new Node(9));
		System.out.println(headNode);
		
		ListNode reverseList = headNode.reverseList();
		
		System.out.println(reverseList);
		
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		String str = "1";
		int hashCode = str.hashCode();
		hashtable.put("1", "a");
		hashtable.put("2", "b");
		hashtable.put("3", "c");
		hashtable.put("4", "d");
		System.out.println(hashtable);
	}*/
	public static void main(String[] args) {
		ListNode list1 = new ListNode();
		
		list1.addNodeAsc(new Node(10));
		list1.addNodeAsc(new Node(1));
		list1.addNodeAsc(new Node(140));
		list1.addNodeAsc(new Node(141));
		list1.addNodeAsc(new Node(158));
		list1.addNodeAsc(new Node(166));
		
		
		ListNode list2 = new ListNode();
		Node node180 = new Node(180);
		Node node5 = new Node(5);
		list2.addNodeDesc(node180);
		list2.addNodeDesc(node5);
		list2.addNodeDesc(new Node(149));
		list2.addNodeDesc(new Node(15));
		list2.addNodeDesc(new Node(13));
		list2.addNodeDesc(new Node(16));
		list2.addNodeDesc(new Node(11));
		node5.setNextNode(node180);
		
		ListNode.splitTwoList(list2);
		
		System.out.println("list2 === "+list2);
		
		//ListNode mergeList = ListNode.mergeList(list1, list2);
//		ListNode reversePair = ListNode.reversePair(list2);
//		ListNode reversePairV2 = ListNode.ReversePairV2(list2);
//		System.out.println(reversePairV2);
	}

}
