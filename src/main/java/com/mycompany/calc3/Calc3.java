//Калькулятор 1.0 Дата создания: 02.10.2024 Автор: Брутская А.А. 3ИС

package com.mycompany.calc3;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JOptionPane;


public class Calc3 
{    static arif arifop=new arif();
     public static void run() 
     {
    	 //Создадим окно и установим заголовок
          final JFrame window = new JFrame("Калькулятор");
          //Подключаем иконку из корня папки проекта
          ImageIcon img = new ImageIcon("images/calc.png");
          window.setIconImage(img.getImage());
 
          //Событие "закрыть" при нажатии по крестику окна
          window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
          //Текстовое поле
          JTextField textField = new JTextField();
          textField.setBackground(Color.WHITE);
          textField.setFont(new Font("Arial", Font.PLAIN, 30));
          

          
          //Создадим панель
          JPanel panel = new JPanel();
          panel.setPreferredSize(new Dimension(600,600));
          panel.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));
          
          
          
          //Создадим кнопки
          JButton one = new JButton("1");
          one.setFont(new Font("Arial", Font.BOLD, 24));
          JButton two = new JButton("2"); 
          JButton three = new JButton("3");
          JButton four = new JButton("4");  
          JButton five = new JButton("5");  
          JButton six = new JButton ("6");
          JButton seven = new JButton ("7");
          JButton eight = new JButton ("8");
          JButton nine = new JButton ("9");
          JButton zero = new JButton ("0");
          JButton back = new JButton ("<");
          JButton zap = new JButton ("=");
          JButton plus = new JButton ("+");
          JButton minus = new JButton ("-");
          JButton del = new JButton ("/");
          JButton umnozh = new JButton ("*");
          JButton deleteall = new JButton ("C");
          JButton dot = new JButton (".");
          JButton plusminus = new JButton ("+/-");
          JButton koren = new JButton ("√");
          JButton kvadr = new JButton ("x^2");
          JButton sin = new JButton ("sin(x)");
          JButton cos = new JButton ("cos(x)");
          JButton tg = new JButton ("tg(x)");
          JButton ctg = new JButton ("ctg(x)");
          JButton x = new JButton ("1/x");          
          
          one.setFont(new Font("Arial", Font.BOLD, 24));
          two.setFont(new Font("Arial", Font.BOLD, 24));
          three.setFont(new Font("Arial", Font.BOLD, 24));
          four.setFont(new Font("Arial", Font.BOLD, 24));
          five.setFont(new Font("Arial", Font.BOLD, 24));
          six.setFont(new Font("Arial", Font.BOLD, 24));
          seven.setFont(new Font("Arial", Font.BOLD, 24));
          eight.setFont(new Font("Arial", Font.BOLD, 24));
          nine.setFont(new Font("Arial", Font.BOLD, 24));
          zero.setFont(new Font("Arial", Font.BOLD, 24));
          back.setFont(new Font("Arial", Font.BOLD, 24));
          zap.setFont(new Font("Arial", Font.BOLD, 24));
          zap.setBackground(Color.CYAN);
          plus.setFont(new Font("Arial", Font.BOLD, 24));
          minus.setFont(new Font("Arial", Font.BOLD, 24));
          umnozh.setFont(new Font("Arial", Font.BOLD, 24));
          del.setFont(new Font("Arial", Font.BOLD, 24));
          deleteall.setFont(new Font("Arial", Font.BOLD, 24));
          dot.setFont(new Font("Arial", Font.BOLD, 24));
          plusminus.setFont(new Font("Arial", Font.BOLD, 24));
          koren.setFont(new Font("Arial", Font.BOLD, 24));
          kvadr.setFont(new Font("Arial", Font.BOLD, 24));
          sin.setFont(new Font("Arial", Font.BOLD, 24));
          sin.setBackground(Color.blue);
          cos.setFont(new Font("Arial", Font.BOLD, 24));
          cos.setBackground(Color.blue);
          tg.setFont(new Font("Arial", Font.BOLD, 24));
          tg.setBackground(Color.blue);
          ctg.setFont(new Font("Arial", Font.BOLD, 24));
          ctg.setBackground(Color.blue);
          x.setFont(new Font("Arial", Font.BOLD, 24));
          
          //Событие для кнопки "Свернуть"
          one.addActionListener(new ActionListener() 
          {
               public void actionPerformed(ActionEvent e) 
               {   
                   String text=textField.getText();
                   textField.setText(text+"1");
               }
          });
          
          two.addActionListener(new ActionListener() 
          {
               public void actionPerformed(ActionEvent e) 
               {   
                   String text=textField.getText();
                   textField.setText(text+"2");
               }
          });
          
          three.addActionListener(new ActionListener() 
          {
               public void actionPerformed(ActionEvent e) 
               {   
                   String text=textField.getText();
                   textField.setText(text+"3");
               }
          });
          
          four.addActionListener(new ActionListener() 
          {
               public void actionPerformed(ActionEvent e) 
               {   
                   String text=textField.getText();
                   textField.setText(text+"4");
               }
          });
          
          five.addActionListener(new ActionListener() 
          {
               public void actionPerformed(ActionEvent e) 
               {   
                   String text=textField.getText();
                   textField.setText(text+"5");
               }
          });
          
          six.addActionListener(new ActionListener() 
          {
               public void actionPerformed(ActionEvent e) 
               {   
                   String text=textField.getText();
                   textField.setText(text+"6");
               }
          });
          
          seven.addActionListener(new ActionListener() 
          {
               public void actionPerformed(ActionEvent e) 
               {   
                   String text=textField.getText();
                   textField.setText(text+"7");
               }
          });
          
          eight.addActionListener(new ActionListener() 
          {
               public void actionPerformed(ActionEvent e) 
               {   
                   String text=textField.getText();
                   textField.setText(text+"8");
               }
          });
          
          nine.addActionListener(new ActionListener() 
          {
               public void actionPerformed(ActionEvent e) 
               {   
                   String text=textField.getText();
                   textField.setText(text+"9");
               }
          });
          
          zero.addActionListener(new ActionListener() 
          {
               public void actionPerformed(ActionEvent e) 
               {   
                   String text=textField.getText();
                   textField.setText(text+"0");
               }
          });
          
          back.addActionListener(new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              {
                  String text=textField.getText();
                  textField.setText(text.substring(0, text.length()-1));
              }
          }
          );
          
          plus.addActionListener(new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              {
                  String text=textField.getText();
                  textField.setText("");
                  double t= Double.parseDouble(text);
                  arifop.get1(t, '+');
              }
          }
          );
          
          minus.addActionListener(new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              {
                  String text=textField.getText();
                  textField.setText("");
                  double t=Double.parseDouble(text);
                  arifop.get1(t, '-');
              }
          }
          );
          
          umnozh.addActionListener(new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              {
                  String text=textField.getText();
                  textField.setText("");
                  double t=Double.parseDouble(text);
                  arifop.get1(t, '*');
              }
          }
          );
          
          del.addActionListener(new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              {   
                  String text=textField.getText();
                  textField.setText("");
                  double t=Double.parseDouble(text);
                  arifop.get1(t, '/');
              }
          }
          );
          
          
          
          zap.addActionListener(new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              {  
                  String text=textField.getText();
                  double r=Double.parseDouble(text);
                  arifop.get2(r);
                  if(arifop.testzero()==true)
                  {
                      JOptionPane.showMessageDialog(null, "Нельзя делить на 0, операция прервана");
                      textField.setText("");
                  }
                  else{
                  textField.setText(arifop.type(arifop));
                  }
                  
                  
              }
          }
          );
          
          deleteall.addActionListener(new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              {
                  textField.setText("");
              }
          }
          );
          
          dot.addActionListener(new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              {
                  String text=textField.getText();
                  textField.setText(text+".");
              }
          }
          );
          
          plusminus.addActionListener(new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              {
                  String text = textField.getText();
                  double r=Double.parseDouble(text);
                  r=-r;
                  if (r%1==0)
                  {
                      int t;
                      t=(int)r;
                      text=String.valueOf(t);
                  }
                  else
                  text=String.valueOf(r);
                  textField.setText(text);
              }
          }
          );
          
          koren.addActionListener(new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              {
                  String text=textField.getText();
                  double t=Double.parseDouble(text);
                  arifop.get1(t,'k');
                  if(arifop.testkoren()==true)
                  {
                      JOptionPane.showMessageDialog(null, "Нельзя вычислить квадратный корень из отрицательного числа, операция прервана");
                      textField.setText("");
                  }
                  else
                  textField.setText(arifop.type(arifop));
              }
          }
          );
          
          kvadr.addActionListener(new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              {
                  String text=textField.getText();
                  double t=Double.parseDouble(text);
                  arifop.get1(t, '^');
                  textField.setText(arifop.type(arifop));
              }
          }
          );
          
          sin.addActionListener(new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              {
                 String text=textField.getText();
                 double t=Double.parseDouble(text);
                 arifop.get1(t, 's');
                 textField.setText(arifop.type(arifop));
          }
          }
          );
          
          cos.addActionListener(new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              {
                  String text=textField.getText();
                  double t=Double.parseDouble(text);
                  arifop.get1(t, 'c');
                  textField.setText(arifop.type(arifop));
          }
          }
          );
          
          tg.addActionListener(new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              {
                  String text=textField.getText();
                  double t=Double.parseDouble(text);
                  arifop.get1(t, 't');
                  textField.setText(arifop.type(arifop));
              }
          }
          );
          
          ctg.addActionListener(new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              {
                  String text=textField.getText();
                  double t=Double.parseDouble(text);
                  arifop.get1(t, 'g');
                  textField.setText(arifop.type(arifop));
              }
          }
          );
          
          x.addActionListener(new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              {
                  String text=textField.getText();
                  double t=Double.parseDouble(text);
                  arifop.get1(t, 'x');
                  if(arifop.testx()==true)
                  {
                      JOptionPane.showMessageDialog(null, "На 0 делить нельзя, операция прервана");
                      textField.setText("");
                  }
                  else
                  textField.setText(arifop.type(arifop));
              }
          }
          );
          
          
        
          panel.setLayout(new GridBagLayout());
          GridBagConstraints constraints= new GridBagConstraints();
          constraints.fill=GridBagConstraints.HORIZONTAL;
          constraints.weightx=50;
          constraints.weighty=50;
          constraints.ipady=200;
          constraints.ipadx=50;
          //Добавим кнопки и поля на панель
          JButton button;
          button=one;
          constraints.gridx=0;
          constraints.gridy=1;
          panel.add(one, constraints);
          button=two;
          constraints.gridx=1;
          constraints.gridy=1;
          panel.add(two, constraints);
          button=three;
          constraints.gridx=2;
          constraints.gridy=1;
          panel.add(three, constraints);
          button=four;
          constraints.gridx=0;
          constraints.gridy=2;
          panel.add(four, constraints);
          button=five;
          constraints.gridx=1;
          constraints.gridy=2;
          panel.add(five, constraints);
          button=six;
          constraints.gridx=2;
          constraints.gridy=2;
          panel.add(six, constraints);
          button=seven;
          constraints.gridx=0;
          constraints.gridy=3;
          panel.add(seven, constraints);
          button=eight;
          constraints.gridx=1;
          constraints.gridy=3;
          panel.add(eight, constraints);
          button=nine;
          constraints.gridx=2;
          constraints.gridy=3;
          panel.add(nine,constraints);
          button=zero;
          constraints.gridx=1;
          constraints.gridy=4;
          panel.add(zero, constraints);
          button=back;
          constraints.gridx=2;
          constraints.gridy=4;
          panel.add(back, constraints);
          button=zap;
          constraints.gridx=5;
          constraints.gridy=0;
          panel.add(zap, constraints);
          button=plus;
          constraints.gridx=4;
          constraints.gridy=1;
          panel.add(plus, constraints);
          button=minus;
          constraints.gridx=4;
          constraints.gridy=2;
          panel.add(minus, constraints);
          button=del;
          constraints.gridx=4;
          constraints.gridy=3;
          panel.add(del, constraints);
          button=umnozh;
          constraints.gridx=4;
          constraints.gridy=4;
          panel.add(umnozh, constraints);
          button=deleteall;
          constraints.gridx=5;
          constraints.gridy=1;
          panel.add(deleteall, constraints);
          button=dot;
          constraints.gridx=0;
          constraints.gridy=4;
          panel.add(dot, constraints);
          button=plusminus;
          constraints.gridx=5;
          constraints.gridy=2;
          panel.add(plusminus, constraints);
          button=koren;
          constraints.gridx=5;
          constraints.gridy=3;
          panel.add(koren, constraints);
          button=kvadr;
          constraints.gridx=5;
          constraints.gridy=4;
          panel.add(kvadr, constraints);
          button=sin;
          constraints.gridx=6;
          constraints.gridy=0;
          panel.add(sin, constraints);
          button=cos;
          constraints.gridx=6;
          constraints.gridy=1;
          panel.add(cos, constraints);
          button=tg;
          constraints.gridx=6;
          constraints.gridy=2;
          panel.add(tg, constraints);
          button=ctg;
          constraints.gridx=6;
          constraints.gridy=3;
          panel.add(ctg, constraints);
          button=x;
          constraints.gridx=6;
          constraints.gridy=4;
          panel.add(x, constraints);
          
          JTextField button1=textField;
          
          constraints.gridwidth=5;
          constraints.gridy=0;
          constraints.gridx=0;
          
          panel.add(textField, constraints);
          
          
           
        

          //Добавим панель в окно 
          window.getContentPane().add(panel);
 
          window.pack();
          
          //Разместим программу по центру
          window.setLocationRelativeTo(null);
          window.setVisible(true);
     }
     

     
     
     public static void main(String[] args)
     {
         run();
                 }
}
