package task1;

import java.util.Scanner;

public class Client {
    String name;
    long INN;

    public Client(String name, int INN) {
        this.name = name;
        this.INN = INN;
    }

    public Client(){
        setName();
        setINN();
    }

    public void setName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        this.name = in.nextLine();
    }

    public void setINN() {
        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Введите ИНН: ");
            this.INN = Long.parseLong(in.nextLine());
        }
        catch (NumberFormatException e){
            System.out.println("Введено не число");
            setINN();
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", INN=" + INN +
                '}';
    }
}
