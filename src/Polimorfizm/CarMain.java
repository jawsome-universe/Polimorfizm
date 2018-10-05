package Polimorfizm;

public class CarMain {
    void useCar(Car car) {
        car.driving();
        System.out.println(car.getNumOfSeets());
    }

    public static void main(String[] args) {
      /*
        CarMain main = new CarMain();
        Car car = new Toyota();
        main.useCar(car);
*/

      int a = 2;
      int b = 3;
     // int c = ++a - b++;
      int c1 = a - b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c1);


    }
}
