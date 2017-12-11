package com.example.datastructure;

public class CustomArrayStack<T> implements CustomStack<T> {

    //默认栈大小
    static  final  int defaultSize =15;
    //存储数据
    private T[] arrays;
    //栈的个数
    private int size;

    public CustomArrayStack(){
        size =0;
        arrays = (T[])new Object[defaultSize];
    }

    public CustomArrayStack(int defaultSize){
        size =0;
        arrays = (T[])new Object[defaultSize];
    }

    /**
     * 添加元素,从尾部开始添加
     * @param data
     * @throws Exception
     */
    @Override
    public void push(T data) throws Exception {
        if(size< arrays.length ){
            arrays[size] = data;
            size++;
        }else{
            throw  new Exception("栈集合为空");
        }
    }

    /***
     * 移除元素,从最后移除
     * @return
     * @throws Exception
     */
    @Override
    public T pop() throws Exception {
        T object = null;
        if( empty() ){
            throw  new Exception("栈集合为空");
        }else {
            object = arrays[size-1];
            size--;
        }
        return object;
    }

    /**
     * 获取栈顶元素
     * @return
     */
    @Override
    public T peek() {
        return arrays[size-1];
    }

    @Override
    public boolean empty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }
}
