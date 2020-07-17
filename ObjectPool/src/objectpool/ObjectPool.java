package objectpool;

import java.util.Stack;

public class ObjectPool {
    public static final int DEFAULT_POOL_SIZE=5;
    private int counter=0;
    private Stack <Product> _pool;
    private int maxPoolSize = DEFAULT_POOL_SIZE;
    
    public int getMaxPoolSize(){
        return maxPoolSize;
    }
    
    public void setMaxPoolSize(int maxPoolSize){
        this.maxPoolSize=maxPoolSize;
    }
    
    Product acquire(){
        if(_pool.size()>0 && _pool.size()<=maxPoolSize){
            return this._pool.pop();
        }else if(_pool.size()>maxPoolSize || counter==maxPoolSize){
            System.out.println("POOL SIZE LIMIT 5 !");
            return null;
        }else{
            counter++;
            Product temp=new Product();
            return temp;
        }
            
    }
    
    void lenPool(){
        System.out.println(_pool.size());
    }
    
    void release(Product p){
        _pool.add(p);
        System.out.println("Released!: "+p.hashCode());
    }

    
static class Product{
    Product(){
        System.out.println("New Product!: "+this.hashCode());
    }
}    
    
private static ObjectPool instance;

    
    private ObjectPool(){
        _pool= new Stack<Product>();
    }
   
    
    public static ObjectPool getPool() {

        if (instance == null) {
            synchronized (ObjectPool.class) {
                if (instance == null) {
                    instance = new ObjectPool();
                }
            }
        }
        return instance;
    }
    public static void main(String[] args) {
        ObjectPool pool=ObjectPool.getPool();
        ObjectPool pool2=ObjectPool.getPool();
        System.out.println("Singleton ObjectPool:");
        System.out.println("pool object:"+pool.hashCode()+"\npool2 object:"+pool2.hashCode()+"\n");
        
        
        Product product1 =pool.acquire();
        System.out.println("Product1 hashcode:"+product1.hashCode()+"\n");
        Product product2 =pool.acquire();
        System.out.println("Product2 hashcode:"+product2.hashCode()+"\n");
        Product product3 =pool.acquire();
        System.out.println("Product3 hashcode:"+product3.hashCode()+"\n");
        Product product4 =pool.acquire();
        System.out.println("Product4 hashcode:"+product4.hashCode()+"\n");
        Product product5 =pool.acquire();
        System.out.println("Product5 hashcode:"+product5.hashCode()+"\n");
        Product product6 =pool.acquire();
        try{
            System.out.println("Product6 hashcode:"+product6.hashCode());
        }catch(NullPointerException e){
            System.out.println("NullPointerException for Product6: THERE IS NO MORE PRODUCT IN POOL\n");
        }
        pool.release(product1);
        product6=pool.acquire();
        System.out.println("Product6 hashcode:"+product6.hashCode());  
        
    }
    
}
