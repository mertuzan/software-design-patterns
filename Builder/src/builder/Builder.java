package builder;

class Phone {

    private String brand;
    private String model;
    private String os;
    private int camera;
    private String color;
    private int RAM;
    private int battery;
    private double display;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOs(String os) {
        this.os = os;
    }
    
    public void setCamera(int camera) {
        this.camera = camera;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    String PhonetoString() {
        String features = "Phone Features :";
        features += "\nBrand: " + this.brand;
        features += "\nModel: " + this.model;
        features += "\nOS: " + this.os;
        features += "\nCamera: " + this.camera;
        features += "\nColor: " + this.color;
        features += "\nRAM: " + this.RAM;
        features += "\nBattery: " + this.battery;
        features += "\nDisplay: " + this.display;

        return features;
    }
}

interface PhoneBuilder{
    void buildBrand();
    void buildModel();
    void buildOs();
    void buildCamera();
    void buildColor();
    void buildRAM();
    void buildBattery();
    void buildDisplay();
    Phone getPhone();
}

class Samsung implements PhoneBuilder{
    private Phone phone;
    
    public Samsung(){
        phone = new Phone();
    }
    
    @Override
    public void buildBrand() {
        phone.setBrand("Samsung");
    }

    @Override
    public void buildModel() {
        phone.setModel("CustomX");
    }

    @Override
    public void buildOs() {
        phone.setOs("Android");
    }

    @Override
    public void buildCamera() {
        phone.setCamera(32);
    }

    @Override
    public void buildColor() {
        phone.setColor("Black");
    }

    @Override
    public void buildRAM() {
        phone.setRAM(4);
    }

    @Override
    public void buildBattery() {
        phone.setBattery(5000);
    }

    @Override
    public void buildDisplay() {
        phone.setDisplay(5.5);
    }

    @Override
    public Phone getPhone() {
        return this.phone;
    }
    
}

class iPhone implements PhoneBuilder{
    private Phone phone;
    
    public iPhone(){
        phone = new Phone();
    }
    
    @Override
    public void buildBrand() {
        phone.setBrand("iPhone");
    }

    @Override
    public void buildModel() {
        phone.setModel("iCustom");
    }

    @Override
    public void buildOs() {
        phone.setOs("iOS");
    }

    @Override
    public void buildCamera() {
        phone.setCamera(16);
    }

    @Override
    public void buildColor() {
        phone.setColor("Silver");
    }

    @Override
    public void buildRAM() {
        phone.setRAM(4);
    }

    @Override
    public void buildBattery() {
        phone.setBattery(3000);
    }

    @Override
    public void buildDisplay() {
        phone.setDisplay(5);
    }

    @Override
    public Phone getPhone() {
        return this.phone;
    }
    
}

class Contractor{
    private PhoneBuilder phoneBuilder;
    
    public Contractor(PhoneBuilder phoneBuilder){
        this.phoneBuilder=phoneBuilder;
    }
    
    Phone getPhone(){
        return phoneBuilder.getPhone();
    }
    
    void buildPhone(){
        phoneBuilder.buildBrand();
        phoneBuilder.buildModel();
        phoneBuilder.buildOs();
        phoneBuilder.buildCamera();
        phoneBuilder.buildColor();
        phoneBuilder.buildRAM();
        phoneBuilder.buildBattery();
        phoneBuilder.buildDisplay();
    }  
}

public class Builder {

    public static void main(String[] args) {
        PhoneBuilder samsungPhoneBldr= new Samsung();
        PhoneBuilder iphonePhoneBldr= new iPhone();
        
        Contractor ctr1= new Contractor(samsungPhoneBldr);
        Contractor ctr2= new Contractor(iphonePhoneBldr);
        
        ctr1.buildPhone();
        Phone p1= ctr1.getPhone();
        
        System.out.println("Phone 1:");
        System.out.println("Constructed: "+p1);
        p1.setModel("Custom S1");
        p1.setColor("White");
        p1.setRAM(6);
        System.out.println(p1.PhonetoString());
        
        System.out.println("---");
        
        ctr2.buildPhone();
        Phone p2=ctr2.getPhone();
        
        System.out.println("Phone 2:");
        System.out.println("Constructed: "+p2);
        p2.setModel("Custom 1");
        p2.setColor("Rose Gold");
        System.out.println(p2.PhonetoString());
        
    }

}
