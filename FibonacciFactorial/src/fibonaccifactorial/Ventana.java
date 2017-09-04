package fibonaccifactorial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener{
    
        private JLabel desc;
        private JTextField num;
        private JButton boton;
        private JButton boton2;
        
        public Ventana() {
        super();                    /** usamos el contructor de la clase padre JFrame*/
        configurarVentana();        /** configuramos la ventana*/
        inicializarComponentes();   /** inicializamos los atributos o componentes*/
        }
        
        private void configurarVentana() {
        this.setTitle("Ejercicio");                   /** colocamos titulo a la ventana*/
        this.setSize(200, 200);                                 /** colocamos tamanio a la ventana (ancho, alto)*/
        this.setLocationRelativeTo(null);                       /** centramos la ventana en la pantalla*/
        this.setLayout(null);                                   /** no usamos ningun layout, solo asi podremos dar posiciones a los componentes*/
        this.setResizable(false);                               /** hacemos que la ventana no sea redimiensionable*/
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    /** hacemos que cuando se cierre la ventana termina todo proceso*/
        }
        
        private void inicializarComponentes() {
            /**variables de Swing*/
            desc = new JLabel();
            num = new JTextField();
            boton = new JButton();
            boton2 = new JButton();            
            
            
            desc.setText("Inserta Numero");
            boton.setText("Fibonacci");
            boton2.setText("Factorial");
            
            desc.setBounds(20, 20, 150, 30);            
            num.setBounds(20, 50, 150, 30);
            boton.setBounds(20, 80 , 150, 30);
            boton2.setBounds(20, 110 , 150, 30);
            
            boton.addActionListener(this);
            boton2.addActionListener(this);
            
            this.add(desc);
            this.add(num);
            this.add(boton);
            this.add(boton2);
            
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            int n00m = Integer.parseInt(num.getText());              
            if (e.getSource() == boton) {
                JOptionPane.showMessageDialog(this, "Fibonacci: " + fibo(n00m)); /**La opción corre el proceso de Fibonacci*/
            }
            if (e.getSource() == boton2) {
                JOptionPane.showMessageDialog(this, "Factorial: " + factorial(n00m)); /**La opción corre el proceso de Factorial*/
            }
   
        }
        
        public static int factorial(int n) {
            /**logica Factorial*/
            int resultado = 1;
            for (int i = 1; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
        
        public String fibo(int n){
            /**
             * logica fibonacci
             */
            String s="0";    
            if (n>0){
                int a=0;
                int b=1;   
                int c;
                for(int i=0; i<=(n-1);i++){
                    c=a+b;
                    a=b;
                    b=c;    
                    s = s + ", " + a;    
                }    
            }    
            return s;
        }
}  

    
    
    
