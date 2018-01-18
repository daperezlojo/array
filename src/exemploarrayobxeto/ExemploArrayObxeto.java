package exemploarrayobxeto;

import javax.swing.JOptionPane;

public class ExemploArrayObxeto {

    public static void main(String[] args) {
            
        Persoa[] persoas=new Persoa[4];
        Persoa[] creap1=new Persoa[4]; //creo para probar la creacion de un array y meter el que em devuelve aqui
            String nome;
            String dni;
            MetodosArray obxMetodos=new MetodosArray();
   /*         
        for(int i=0;i<persoas.length;i++){
            nome=JOptionPane.showInputDialog("nome");
            dni=JOptionPane.showInputDialog("dni");
            persoas[i]=new Persoa(nome,dni);
            
        }*/
   
   creap1 =obxMetodos.crearArray();
   obxMetodos.amosar(creap1);
   obxMetodos.buscar(creap1,"1234");
   
   
   Persoa[] lista={new Persoa("aa","123"), new Persoa ("bb","1234")};
        obxMetodos.amosar(persoas);
        obxMetodos.amosar(lista);
        
    }
    
}
