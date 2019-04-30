package linear_list.common;

/**
 * @version: java version 1.8+
 * @Author :
 * @Explain :
 * @contact:
 * @Time : 2019-04-30  17:17
 * @File : Node
 * @Software: IntelliJ IDEA 2018.3
 */
public class Node {

    /**
     * LinkList Node 类
     */

    public Node linkedList; //单链表
    public Object data;  //数据域
    public Node next;    //指针域

    public Node() {
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
