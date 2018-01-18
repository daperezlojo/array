package exemploarrayobxeto;

import javax.swing.JOptionPane;

public class MetodosArray {
       
    public static void amosar(Persoa[] listaPersoas){
            
            for(Persoa ele:listaPersoas){   //recorre toda a lista e cada elemento da lista o mete en ele
                System.out.println(ele);
            }
   }

    public  Persoa[] crearArray(){
         String nome;
         String dni;
         int t =Integer.parseInt(JOptionPane.showInputDialog("extension do array"));
Persoa[] lista = new Persoa[t];
            for(int i=0;i<lista.length;i++){
            nome=JOptionPane.showInputDialog("nome");
            dni=JOptionPane.showInputDialog("dni");
            lista[i]=new Persoa(nome,dni);            
            }
            return lista;
    }
    public void buscar(Persoa[] persoa, String dni){
        boolean existe = false;
        for (int i = 0; i<persoa.length; i++) {
            
             if (dni==(persoa[i].getDni())) {
                existe = true;
                System.out.println("el valor que buscas esta en la posicion: " + i);
             } 
             else {
                existe = false;
                System.out.println("no existe");
            }
        }
    }
    }
