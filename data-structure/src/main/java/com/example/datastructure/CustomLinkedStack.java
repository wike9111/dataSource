package com.example.datastructure;

public class CustomLinkedStack<T> implements CustomStack<T> {


    private Node topNode;
    private int size;

    /***
     * 进栈
     * @param data
     * @throws Exception
     */
    @Override
    public void push(T data) throws Exception {
        Node newNode ;
        if( empty() ){//第一次元素添加
            newNode = new Node(data,null);
        }else{//后续元素添加
            newNode = new Node( data,topNode );
        }
        topNode = newNode;
        size++;
    }

    /***
     * 出栈
     * @return
     * @throws Exception
     */
    @Override
    public T pop() throws Exception {
        T object ;
        if( empty() ){
            throw new Exception("栈为空");
        }else{
            object = topNode.data;
            topNode = topNode.nextNode;
            size--;
        }
        return object;
    }

    @Override
    public T peek() {
        return topNode.data;
    }

    @Override
    public boolean empty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }

    /***
     * 内部节点类
     */
    class Node{
        private T data;
        private Node nextNode;

        public Node(T data, Node nextNode) {
            this.data = data;
            this.nextNode = nextNode;
        }
    }
}
