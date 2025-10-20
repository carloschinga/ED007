/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.sun.org.apache.xpath.internal.operations.Quo;
import dto.Cliente;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author USER
 */
public class ColaCliente {
    Queue<Cliente> colaCliente = new LinkedList<>();

    public void agregar(Cliente c){
        colaCliente.add(c);
    }
        public Cliente quitar() {
        if (!colaCliente.isEmpty()) {
            Cliente eliminado = colaCliente.poll();
            System.out.println("Se desencoló el cliente: " + eliminado.getNombClie());
            return eliminado;
        } else {
            System.out.println("La cola está vacía");
            return null;
        } 
    }
        
    public String imprimir(){
    }
    public static void main(String[] args) {
        Cliente c1= new Cliente();
        c1.setNombClie("Carlos");
        Cliente c2= new Cliente();
        c2.setNombClie("Juan");
        
        ColaCliente c= new ColaCliente();
        c.agregar(c1);
        c.agregar(c2);
        System.out.println(c.imprimir();
        c.quitar();
        System.out.println(c.imprimir();
    }
    
}
