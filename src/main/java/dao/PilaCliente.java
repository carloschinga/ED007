
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
        System.out.println("Cliente apilado: " + c.getNombClie());
    }
    
    public Cliente cima(){
        return pilaCliente.peek();
    }
    
    public static void main(String[] args) {
        PilaCliente pila=new PilaCliente();
        
        Cliente c1 = new Cliente();
        c1.setNombClie("Carlos");

        Cliente c2 = new Cliente();
        c2.setNombClie("Juan");

        pila.apilar(c1);
        pila.apilar(c2);

    }
    
}
