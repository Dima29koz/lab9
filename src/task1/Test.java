package task1;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Queue clients = new ArrayDeque();
        System.out.println("Введите данные о 5 клиентах:");
        for(int i = 0;i<5;i++){
            clients.add(new Client());
        }
        System.out.println(clients);

    }
}
