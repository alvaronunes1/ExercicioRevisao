package br.newton.paiva.br;

import javax.swing.*;

public class LojaJogos {

    public static void main(String[] args) {

        Cliente c = new Cliente();
        Ingresso i = new Ingresso();
        Pedido p = new Pedido();


        String nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ","Nome" , JOptionPane.INFORMATION_MESSAGE);
        String nomeJogo = JOptionPane.showInputDialog(null,"Digite o nome do jogo: ", "Jogo", JOptionPane.INFORMATION_MESSAGE);
        Double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Valor do jogo", "Valor Ingresso", JOptionPane.INFORMATION_MESSAGE));
        Integer quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a quantidade de ingressos", "Ingressos" , JOptionPane.INFORMATION_MESSAGE));
        c.setNome(nome);
        i.setNomeJogo(nomeJogo);
        i.setValor(valor);
        i.setQuantidade(quantidade);
        //Ingresso ing = new Ingresso();
        //i.setValor(valor);
        //i.setQuantidade(quantidade);
        p.getIngressos().add(i);

        JOptionPane.showMessageDialog(null,"Pedido feito para " +c.getNome() + "\n " + i.getQuantidade() + " Ingressos: " + i.getNomeJogo() +"\n Valor: " +p.valorTotal());





    }
}
