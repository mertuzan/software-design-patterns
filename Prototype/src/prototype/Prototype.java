package prototype;

class Telefon {
    public String marka;
    public String model;
    public int yil;
    public String os;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Telefon temp = new Telefon();
        temp.marka = this.marka;
        temp.model = this.model;
        temp.yil = this.yil;
        temp.os = this.os;
          
        return temp;
    }
}

public class Prototype {

    public static void main(String[] args) {
        Telefon tel = new Telefon();
        tel.marka="Samsung";
        tel.model="S10";
        tel.os="Android";
        tel.yil=2019;
        
        System.out.println("\tHashCode\tMarka\tModel\tOS\tYil");
        System.out.println("tel:\t"+tel.hashCode()+"\t"+tel.marka+ "\t"+ tel.model+"\t"+tel.os+"\t"+tel.yil+"\n");
        
        Telefon tel2=tel; // Shallow copy
        tel2.model="S10+";
        System.out.println("#===Shallow Copy===#");
        System.out.println("tel:\t"+tel.hashCode()+"\t"+tel.marka+ "\t"+ tel.model+"\t"+tel.os+"\t"+tel.yil);
        System.out.println("tel2:\t"+tel2.hashCode()+"\t"+tel2.marka+ "\t"+ tel2.model+"\t"+tel2.os+"\t"+tel2.yil+"\n");
        
        Telefon tel3=new Telefon();
        try{
        tel3 = (Telefon) tel.clone(); //Deep copy
        }catch(CloneNotSupportedException e){
            e.printStackTrace();         
        }
        tel3.marka="Apple";
        tel3.os="iOS";
        
        System.out.println("#===Deep Copy===#");
        System.out.println("tel:\t"+tel.hashCode()+"\t"+tel.marka+ "\t"+ tel.model+"\t"+tel.os+"\t"+tel.yil);
        System.out.println("tel3:\t"+tel3.hashCode()+"\t"+tel3.marka+ "\t"+ tel3.model+"\t"+tel3.os+"\t"+tel3.yil);
        
       
    }
    
}
