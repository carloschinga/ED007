
package dao;

import dto.Cliente;
import java.util.Stack;


public class PilaCliente {
    Stack<Cliente> pilaCliente= new Stack<>();
    
    public void agregar(Cliente c){
        pilaCliente.push(c);
    }
    
    public Cliente quitar(){
        return pilaCliente.pop();
    }
    
    public void apilar(Cliente c) {
        pilaCliente.push(c);
        System.out.println("Se apilo el cliente: " + c.getNombClie());
    }
    
    public Cliente cima(){
      Cliente cima = pilaCliente.peek(); 
      System.out.println("La cima es: " + cima.getNombClie()); 
      return cima;
    }
    
    public static void main(String[] args) {
        PilaCliente pila=new PilaCliente();
        
        Cliente c1 = new Cliente();
        c1.setNombClie("Carlos");

        Cliente c2 = new Cliente();
        c2.setNombClie("Juan");

        pila.apilar(c1);
        pila.apilar(c2);
        pila.cima();
    }
    
}
