package com.example.datastructure;

/***
 * 测试链表队列
 */
public class LinkedQueueTest {

    public static void main(String[] args){

        CustomLinkedQueue<String> queue = new CustomLinkedQueue<String>();
        try {
            System.out.println("队列是否为空:"+queue.isEmpty());
            queue.put("A");
            queue.put("B");
            queue.put("C");
            queue.put("D");
            queue.put("E");
            System.out.println("队首元素为:"+queue.getFrontElement());
            System.out.println("队列长度："+queue.size());
            System.out.print("移除元素：");
            while (!queue.isEmpty()) {
                System.out.print(queue.remove()+"  ");

            }
            System.out.println();
            System.out.println("队列长度："+queue.size());



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
