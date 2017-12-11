package com.example.datastructure;

public class CustomLinkedQueue<T> implements CustomQueue<T> {

    //首元素
    private Node front;
    //当前元素
    private Node rear;
    //队列大小
    private int size;

    @Override
    public void put(T data) throws Exception {
        Node newNode = new Node( data ,null );
        if( isEmpty() ){
            front = newNode;
            //将新节点设置为尾节点
            rear = newNode;
        }else {
            //尾节点后添加节点
            rear.nextNode = newNode;
            rear = newNode;
        }
        size++;
    }

    @Override
    public T remove() throws Exception {
        T object = null;
        if( isEmpty() ){
            throw new RuntimeException("队列是空的");
        }else {
            //保存首元素
            object = front.data;
            //将下一个节点设置为上节点
            front = front.nextNode;
        }
        size --;
        return object;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T getFrontElement() throws Exception {
        if( isEmpty() ){
            throw  new Exception("队列什么都没有");
        }else{
            return front.data;
        }
    }

    /**
     * 节点内部类
     */
    class Node {
        T data;
        Node nextNode ;

        /**
         * 头节点构造
         * @param nextNode
         */
        public Node( Node nextNode ){
            this.nextNode = nextNode;
        }

        /**
         * 其他节点构造
         * @param data
         * @param nextNode
         */
        public Node( T data ,Node nextNode ){
            this.data = data;
            this.nextNode = nextNode;
        }
    }
}
