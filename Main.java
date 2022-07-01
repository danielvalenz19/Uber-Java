class Main{
    public static void main(String[] args) {
        System.out.println("hola");
        Car car = new Car("AMQ123", new Account("Juan roberto ", "ASD23"));
        car.passegenger=4;
        car.printDataCar();

        Car car2 = new Car("LKJ324", new Account("Roberto Pice ", "ret45"));
        car2.passegenger =3;
        car2.printDataCar();
    }
}