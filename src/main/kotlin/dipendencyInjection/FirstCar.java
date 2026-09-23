package dipendencyInjection;


// Without Di
class FirstEngine {
    void start(){
        System.out.println("start Vehicle");
    }

}
public class FirstCar {
    // Problems with this approach
    /*1. voilating Single Responsiblity principle
      2. your code in not flexible and not Future Ready
      3. tight coupling  between Car and Engine
      4. Engine object lifetime direcyly depend on Car object , if Car object destroy engine destroy automatically
    * */
    FirstEngine engine = new FirstEngine();
    void driveCar(){
        engine.start();
    }

    public static void main(String[]args){
        FirstCar car = new FirstCar();
        car.driveCar();

        Engine engine = new ElectricEngin();
        SecondCar car2 = new SecondCar(engine);
        car2.driveCar();

    }
}

// With Di
interface Engine{
    void start();
}
class ElectricEngin implements Engine{

    @Override
    public void start() {
        System.out.println("electric Engine started");

    }
}
class  PetrolEngin implements Engine{

    @Override
    public void start() {
        System.out.println("Petrol Engine started");
    }
}
class DeseleEngine implements Engine{

    @Override
    public void start() {
        System.out.println("DeseleEngine Engine started");

    }
}

class  HydrogenEngine implements Engine{

    @Override
    public void start() {
        System.out.println("HydrogenEngine Engine started");
    }
}
class SecondCar{
    Engine engine;
    SecondCar(Engine engine){
        this.engine = engine;
    }
    void driveCar(){
        engine.start();

    }
}