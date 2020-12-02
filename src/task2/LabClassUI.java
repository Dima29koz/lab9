package task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LabClassUI extends JFrame
{
    LabClass labClass =  new LabClass(); //создание объекта, содержащего массив студентов

    JTextField jta1 = new JTextField(20);
    JButton button1 = new JButton("Find");
    JButton button2 = new JButton("Sort");
    JButton button3 = new JButton("Print");

    Font fnt = new Font("Times new roman",Font.BOLD,20);

    LabClassUI()
    {
        super("Finder");
        setLayout(new FlowLayout());
        setSize(500,150);
        add(new JLabel("Введите ФИО для поиска"));
        add(jta1);
        add(button1);
        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try // вызов метода find для объекта students
                {
                    Student student = labClass.find(jta1.getText().strip());
                    JOptionPane.showMessageDialog(null, student.toString(),
                            "Данные о заданном студенте",JOptionPane.INFORMATION_MESSAGE);

                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e.getMessage(),
                            "alert" , JOptionPane.ERROR_MESSAGE);

                }
            }
        });
        add(button2);
        button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try // вызов метода sort для объекта students
                {
                    Sorting.quickSort(labClass.getStudents(), 0, labClass.getStudents().length - 1);
                    JOptionPane.showMessageDialog(null, "Массив отсортирован",
                            "Current list",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "В списке нет студентов",
                            "alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        add(button3);
        button3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    JOptionPane.showMessageDialog(null, labClass.toString(),
                            "Current list",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "В списке нет студентов",
                            "alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }

}