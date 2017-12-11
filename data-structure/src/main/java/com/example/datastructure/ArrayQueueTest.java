package com.example.datastructure;

/***
 * 测试数组队列
 */
public class ArrayQueueTest {

    public static void main(String[] args){

        CustomArrayQueue<String> queue = new CustomArrayQueue<String>(5);
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
