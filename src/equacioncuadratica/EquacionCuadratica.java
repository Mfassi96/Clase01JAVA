
package equacioncuadratica;

/*

Proponga una clase EcuacionCuadratica para modelar ecuaciones cuadráticas de
la forma ax^2 +bx+c=0 . La clase debe incluir:
a. Un constructor que reciba los valores de los coeficientes a, b y c .
b. Un método TieneRaicesReales(...) que devuelva verdadero si las raíces de
la ecuación son reales.
c. Dos métodos VerRaiz1(...) y VerRaiz2(...) que permitan obtener las raíces
reales (en caso de que lo sean).
d. Dos métodos VerParteReal(...) y VerParteImag(...) que permitan obtener las
partes real e imaginaria de las raíces complejas (en caso de que lo sean).

e. Cree un programa cliente que utilice un objeto de la clase EcuaciónCuadratica para determinar las raíces de una ecuación cuadrática cuyos coeficientes sean ingresados por el usuario, y las muestre en el formato que corresponda (según sean reales o complejas).

Puede crear todos los métodos adicionales que crean necesarios
*/


import javax.swing.JOptionPane;
public class EquacionCuadratica {

    private double a;
    private double b;
    private double c;

    public EquacionCuadratica() {
    }
    
    
    
    
    
     EquacionCuadratica(double a,double b, double c) {
    this.a=a;
    this.b=b;
    this.c=c;
    }
     
     
         public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

     
     public double verRaiz1(){
            double x1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a); 
         return x1;    
     }
     
     public double verRaiz2(){
     double x2=(-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a); 
     return x2;
     }
    
              boolean tieneRaicesReales(){
        
        var discrim=Math.pow(b, 2)-4*a*c;
        if(discrim>0){
            return true;
        }else{
            return false;
        }
        
    }

    

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        var miequacion=new EquacionCuadratica();
        
miequacion.setA(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de 'a': ")));
miequacion.setB(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de 'b': ")));
miequacion.setC(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de 'C': ")));

if(miequacion.tieneRaicesReales()){
    JOptionPane.showMessageDialog(null, miequacion.verRaiz1(),"RAIZ 1", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, miequacion.verRaiz2(),"RAiz 2",JOptionPane.INFORMATION_MESSAGE);
}


        

        
    }
    
}
