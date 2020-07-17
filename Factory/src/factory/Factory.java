package factory;

public class Factory {

    public interface Phone{
        void brand();
        void model(String name);       
        void year(int year);
        void os();      
        void camera_res(int res);
    }

    public static class Samsung implements Phone {
        @Override
        public void brand() {
            System.out.println("The phone brand is Samsung");
        }    
        
        @Override
        public void model(String name) {
            System.out.println("The phone model is "+name);
        }
        
        @Override
        public void year(int year) {
            System.out.println("Purchased in "+year);
        }

        @Override
        public void os() {
            System.out.println("Android");
        }

        
        @Override
        public void camera_res(int res) {
            System.out.println(res+"MP camera resolution");
        }

    }
    
    public static class Apple implements Phone {
        @Override
        public void brand() {
            System.out.println("The phone brand is Apple");
        }

        @Override
        public void year(int year) {
            System.out.println("Purchased in "+year);
        }

        @Override
        public void os() {
            System.out.println("iOS");
        }

        @Override
        public void model(String name) {
            System.out.println("The phone model is "+name);
        }
        
        @Override
        public void camera_res(int res) {
            System.out.println(res+"MP camera resolution");
        }       
    }   
    
    public static class PhoneFactory {
        public static Phone createPhone(Class phone) throws InstantiationException, IllegalAccessException{
            return (Phone) phone.newInstance();
        }
    }
    
    public static void main(String[] args) {
            try {
                Samsung samsung = (Samsung) PhoneFactory.createPhone(Samsung.class);
                samsung.brand();
                samsung.model("S5");
                samsung.year(2014);
                samsung.os();
                samsung.camera_res(2);
                
                System.out.println();
                
                Apple apple = (Apple) PhoneFactory.createPhone(Apple.class);
                apple.brand();
                apple.model("iPhone 11");
                apple.year(2019);
                apple.os();
                apple.camera_res(12);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
