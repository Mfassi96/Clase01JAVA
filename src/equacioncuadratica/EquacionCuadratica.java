
package equacioncuadratica;


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

     
     public double getRaiz1(){
            double x1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a); 
         return x1;    
     }
     
     public double getRaiz2(){
     double x2=(-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a); 
     return x2;
     }
    
              boolean tieneRaicesReales(){
        
        var discrim=Math.pow(b, 2)-4*a*c;
        if(discrim>=0){
            return true; //TIENE RAICES REALES
        }else{
            return false; //TIENE RAICES COMPLEJAS
        }
        
    }
              
     double verParteReal(){
      return (-b) / (2 * a);
     }
     
double verParteImaginaria(){
    var discriminante = Math.pow(b, 2) - 4 * a * c;
    if (discriminante >= 0) {
        return 0.0; // Las raíces son reales, por lo que la parte imaginaria es 0.
    } else {
        return Math.sqrt(Math.abs(discriminante)) / (2 * a);
    }
}


    

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        var miequacion=new EquacionCuadratica();
        
miequacion.setA(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de 'a': ")));
miequacion.setB(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de 'b': ")));
miequacion.setC(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de 'C': ")));

if(miequacion.tieneRaicesReales()){
    JOptionPane.showMessageDialog(null, miequacion.getRaiz1(),"RAIZ 1", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, miequacion.getRaiz2(),"RAiz 2",JOptionPane.INFORMATION_MESSAGE);
}

if(miequacion.tieneRaicesReales()){
    JOptionPane.showMessageDialog(null, "Raices reales :" + miequacion.verParteReal());
}else{
    JOptionPane.showMessageDialog(null, "Raices imaginarias :" + miequacion.verParteImaginaria());
}

        

        
    }
    
}
