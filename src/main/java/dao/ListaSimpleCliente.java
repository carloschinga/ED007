package dao;

import dto.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ListaSimpleCliente {

    private int apuntador = -1;

    List<Cliente> lista = new ArrayList<>();

    public void agregar(Cliente c) {
        lista.add(c);
        apuntador = lista.size() - 1;
    }

    public String imprimir() {
        String resultado = "";
        for (Cliente c : lista) {
            resultado += c.getNombClie() + "\n";
        }
        return resultado;
    }

    public static void main(String[] args) {
        Cliente c1= new Cliente();
        c1.setNombClie("Carlos");
        Cliente c2= new Cliente();
        c2.setNombClie("JUan");

        ListaCliente lista= new ListaCliente();
        lista.agregar(c1);
        lista.agregar(c2);
        System.out.println(lista.imprimir());
        
    }
    
}
