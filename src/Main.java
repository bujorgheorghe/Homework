public class Main extends Car {
    Car Audi = new Car();
    Car bmw = new Car();
    Car audi = new Car();
    public void main (String[] args){
        Audi.setCountryOfCar("Germany");
        bmw.setCountryOfCar("GER");
        audi.setCountryOfCar("EU");
        Audi.setMaker("AUDI");
        bmw.setMaker("BMW");
        audi.setMaker("AuDi");
        Audi.setModel("R8");
        bmw.setModel("M6");
        audi.setModel("Q7");

        System.out.println(Audi.getCountryOfCar()+Audi.getMaker()+Audi.getModel());
        System.out.println(bmw.getCountryOfCar()+bmw.getMaker()+bmw.getModel());
        System.out.println(audi.getCountryOfCar()+audi.getMaker()+audi.getModel());
    }
}
