
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
    
    public Cliente cima(){
        return pilaCliente.peek();
    }
    
}
