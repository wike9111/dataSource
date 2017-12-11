package com.example.datastructure;

/***
 * 数组实现队列
 */
public class CustomArrayQueue<T> implements CustomQueue<T> {

    //默认队列长度
    static final int defaultSize =15;
    //队列元素集合
    private T [] queueVars;
    //队列长度
    private int size;
    //队列第一个对象的位置
    private int front;
    //队列当前对象的位置
    private int rear;

    @SuppressWarnings("unchecked")
    public CustomArrayQueue( ){
        front = rear =0;
        size =0;
        queueVars = (T[])new Object[defaultSize];
    }

    @SuppressWarnings("unchecked")
    public CustomArrayQueue( int defaultSize ){
        front = rear = 0;
        size= 0;
        queueVars = (T[])new Object[defaultSize];
    }

    /***
     * 添加元素
     * @param data
     * @throws Exception
     */
    @Override
    public void put(T data) throws Exception {
        if( size > 0 && front == rear ){
            throw new Exception("队列已经满了");
        }else{
            queueVars[rear] = data;
            rear = (rear+1 )%(queueVars.length);
            size++;
        }
    }

    /***
     * 删除元素
     * @return
     * @throws Exception
     */
    @Override
    public T remove() throws Exception {
        T object = null;
        if(isEmpty()){
            throw new Exception("队列什么都没有");
        }else{
            //获取队列首元素
            object = queueVars[front];
            //将队列首元素设置为空
            queueVars[front] = null;
            front = (front+1)%(queueVars.length);
            size --;
        }
        return object;
    }

    /***
     * 判断是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {
        return size ==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T getFrontElement() throws Exception {
        if( isEmpty()){
            throw  new Exception("队列什么都没有");
        }else{
            return queueVars[front];
        }
    }
}
