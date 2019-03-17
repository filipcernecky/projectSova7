package sk.itsovy.sova7;

import java.util.List;

public class Main {
    public static void main(String[] args) {

	
		Car auticko = new Car("Volga","Black","P","KE 173PS",500000);
	
        Database database = new Database();
        database.addCar(auticko);


        List<Car> cars = database.getCarsByPrice(1230000);
        for(Car i : cars){
            System.out.println(i.getBrand()+" " + i.getColor() + " " +i.getFuel()+ " " +i.getSpz()+ " " +i.getPrice());
        }

        cars = database.getCarsByBrand("skoda");
        for(Car i : cars){
            System.out.println(i.getBrand()+" " + i.getColor() + " " +i.getFuel()+ " " +i.getSpz()+ " " +i.getPrice());
        }

        cars = database.getCarsByFuel('P');
        for(Car i : cars){
            System.out.println(i.getBrand()+" " + i.getColor() + " " +i.getFuel()+ " " +i.getSpz()+ " " +i.getPrice());
        }

        cars = database.getCarsByRegion("KE");
        for(Car i : cars){
            System.out.println(i.getBrand()+" " + i.getColor() + " " +i.getFuel()+ " " +i.getSpz()+ " " +i.getPrice());
        }

        database.changeSPZ("Ke 135SK","GL 666CH");
        System.out.println("Lawsuit Incoming");

        cars = database.getAllCars();
        for(Car i : cars){
            System.out.println(i.getBrand()+" " + i.getColor() + " " +i.getFuel()+ " " +i.getSpz()+ " " +i.getPrice());
        }

        try {
            database.generateXML();
        } catch (TransformerException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        System.out.println("XML generated");

    }
}