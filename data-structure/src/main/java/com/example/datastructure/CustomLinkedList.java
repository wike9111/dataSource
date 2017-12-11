package com.example.datastructure;

/***
 * 链表结构
 */
public class CustomLinkedList {

    //单链表数据长度
    private int size = 0;
    //链表节点
    private Node rootNode;
    //链表位置下标
    private int foot = 0;

    /*
     * 添加节点
     * 思路：根据传入数据构造节点类，判断是否存在根节点，如果不存在则将新节点设置为根节点，如果存在则添加到最后一个节点后面
     */
    public boolean add(Object data ){
        if( data == null ){
            return false;
        }else{
            Node newNode = new Node(data );
            if( rootNode == null ){
                rootNode = newNode;
            }else{
                rootNode.addNode( newNode );
            }
            this.size ++;
            return true;
        }
    }

    /*
     * 删除节点
     * 思路：这里需要先考虑链表中是否存在该数据，如果存在则再根据是否是根节点做相应的处理
     */
    public boolean remove( Object data ){

        if( !this.isExist( data )){
            return  false;
        }else{
            if( rootNode !=null ){
                if( rootNode.data.equals( data )){
                    rootNode = rootNode.nextNode;
                }else{
                    rootNode.removeNode(data);
                }
            }
            size --;
            return true;
        }
    }

    /***
     * 根据索引获取对应的数据
     */
    public Object get(int index ){
        if( index > this.size ){
            return null;
        }
        return this.rootNode.get( index );
    }

    /***
     * 返回链表长度
     * @return
     */
    public int size(){
        return this.size;
    }

    /***
     * 判断链表是否为空
     * @return
     */
    public boolean isEmpty(){
        return this.size ==0;
    }

    /***
     * 传入数据数组一次性添加
     * @param data
     * @return
     */
    public boolean addAll( Object data[] ){
        for( int i=0;i<data.length;i++ ){
            if( !this.add(data[i])){
                return false;
            }
        }
        return true;
    }

    /*
    * 输出所有节点的数据
    */
    public void print(){
        if (rootNode != null) {
            System.out.print(rootNode.data+"  ");
            rootNode.printNode();
        }
    }

    /*
     * 判断指定数据是否存在链表中
     * @return
     */
    public boolean isExist(Object data ){
        if( data == null || rootNode ==null  ){
            return false;
        }
        return this.rootNode.isExistNode( data );
    }

    /***
     * 清空链表数据
     */
    public void clear(){
        this.rootNode = null;
        this.size = 0;
    }

    class Node {
        //节点数据
        private Object data;
        //节点指针域表示下一个节点
        private Node nextNode;

        /***
         * 传入数据构造方法
         */
        public Node(Object data ){
            this.data = data;
        }
        /***
         * 根据传入的节点做添加节点的操作
         */
        public void addNode( Node newNode ){
            //判断某一节点的下一节点是否为空，如果为空则添加新节点，如果不为空再向下移一个节点继续判断这个节点的下一节点是否为空
            if( this.nextNode == null ){
                this.nextNode = newNode;
            }else{
                this.nextNode.addNode(newNode);
            }
        }

        /***
         * 根据传入值
         */
        public void removeNode( Object dataVal ){
            //判断当前节点的下一节点不为空
            if( this.nextNode != null ){
                //判断当前节点的下一节点数据域输入数据是否相等，相等则将指针域指向下一节点的下一节点位置，达到删除节点的作用
                if(this.nextNode.data.equals( dataVal)){
                    this.nextNode = this.nextNode.nextNode;
                }else{
                    this.nextNode.removeNode( dataVal );
                }
            }
        }

        /***
         * 根据传入的数据判断是否存在,存在返回true,不存在返回false
         *
         */
        public boolean isExistNode( Object dataVal ){
            //如果当前节点的数据域或传入域的直接放回true
            if( this.data.equals( dataVal )){
                return true;
            }else{
                //如当前节点不满足相等则判断下一节点是否为null，如果不为空再判断当前节点的下一节点是否和传入值相等，依次递归循环
                if( this.nextNode !=null ) {
                    return this.nextNode.isExistNode(dataVal);
                }else{
                    return false;
                }
            }
        }

        /***
         * 递归打印节点
         */
        public void printNode(){
            if( this.nextNode !=null ){
                System.out.print((this.nextNode.data).toString()+"  ");
                this.nextNode.printNode();
            }
        }

        /***
         * 根据传入的索引 ,返回对应的数据
         */
        public Object get(int index ){
            if( CustomLinkedList.this.foot++ == index ){
                return this.data;
            }else{
                return this.nextNode.get(index);
            }
        }

    }
}
