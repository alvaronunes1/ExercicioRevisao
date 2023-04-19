package br.newton.paiva.br;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Ingresso> ingressos = new ArrayList<Ingresso>();

    public double valorTotal(){

        double valorTotal = 0;
      for (int i = 0; i < ingressos.size();i++){
          Ingresso ing = (Ingresso) ingressos.get(i);
          valorTotal += ing.getValor() * ing.getQuantidade();
      }

        return valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

}
