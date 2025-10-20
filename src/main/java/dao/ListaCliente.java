package dao;

import dto.Cliente;
import java.util.LinkedList;

public class ListaCliente {
    private LinkedList<Cliente> lista = new LinkedList<>();
    private int apuntador=-1;
    
    public void agregar(Cliente c){
        lista.add(c);    
        //lista.addFirst(c); -> agregar al inicio
        //lista.addLast(c); -> agregar al final
        apuntador=lista.size()-1;
    }
    public Cliente getClienteActual(){
        return lista.get(apuntador);
    }
    public Cliente inicio(){
        apuntador=0;
        return lista.getFirst();
    }
    public Cliente ultimo(){
        apuntador=lista.size()-1;
        return lista.getLast();
    }
    public Cliente siguiente(){
        //Aqui debo programar como
        // lo tengo en mi otros proyectos
        //return lista.
        return null;
    }
    
    public Cliente anterior() {
        if (apuntador >= 0) {
            apuntador--;
            return lista.get(apuntador);
        } else{
            System.out.println("Llegaste al inicio de la lista.");
            return lista.get(apuntador);
        }
    }
    
    public String imprimir(){
        String resultado="";
        for (Cliente cliente : lista) {
            resultado+=cliente.getNombClie() +"\n";
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        Cliente c1= new Cliente();
        c1.setNombClie("Carlos");
        Cliente c2= new Cliente();
        c2.setNombClie("Juan");
        Cliente c3= new Cliente();
        c3.setNombClie("Luis");
        
        ListaCliente l= new ListaCliente();
        l.agregar(c1);
        l.agregar(c2);
        l.agregar(c3);
        System.out.println(l.imprimir());
        //l.ultimo();
        Cliente cx=l.anterior();
        System.out.println(cx.getNombClie());
    }
}
