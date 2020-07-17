package singleton;

public class Singleton {

    private static Singleton instance;

    public int num = (int)(Math.random()*10);

    private Singleton() {
    }
    
    public static Singleton getInstance() {

        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        System.out.println("obj:" + obj.num);
        obj.num++;
        System.out.println("obj:" + obj.num);

        Singleton obj2 = Singleton.getInstance();
        System.out.println("obj2:" + obj2.num);
        obj2.num++;
        System.out.println("obj2:" + obj2.num);
        System.out.println("obj:" + obj.num);

    }
}
