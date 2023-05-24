/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetopoo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProjetoPOO {

    public static void main(String[] args) {

        ArrayList<User> Cadastros = new ArrayList<User>();

        String nome, cpf, cell;
        int op = 0, id = 0, j;
        float valor;

        while (op != 10) {

            op = Integer.parseInt(JOptionPane.showInputDialog("1 Cadastro \n 2 login \n 3 Atualizar \n 4 sacar \n 5 dapositar \n"));

            /*(cadastro) foi criado um contador para adcionar um id para o usuario, depois foi pedido as informaçoes
               para o cadastro dentro do switch case, as informações foram colocados dentro do cadastro usando User usuario
               apos isso o usuario foi colocado dentro da lista de cadastro. para poder adcionar um INT ou FLOAT
            é necessario colocar um (parse) na frente da variavel.
             */
            switch (op) {
                case 1://CADASTRO
                    id = id + 1;
                    nome = JOptionPane.showInputDialog("Informe um Nome:");
                    cpf = JOptionPane.showInputDialog("Informe um CPF:");
                    cell = JOptionPane.showInputDialog("Informe um Telefone:");
                    valor = Float.parseFloat(JOptionPane.showInputDialog("Informe um Valor:"));
                    User usuario = new User(id, nome, cpf, cell, valor);
                    System.out.println(usuario.getId());
                    System.out.println(usuario.getCpf()); 
                    System.out.println(usuario.getNome());
                    System.out.println(usuario.getCell());
                    System.out.println(usuario.getValor());
                    Cadastros.add(usuario);

                    break;
                case 2://LOGIN
                    /* criar um for para informar a posição do usuario no vetor, usar o (cadastros.get(i)cpf)
                    junto com o equals. fazer uma comparação com o (if) para que ele retorne um true(verdadeiro)
                    ou false(falso).
                     */
                    String CpfSearch;
                    boolean acha = false;

                    CpfSearch = JOptionPane.showInputDialog("Informe o CPF cadastrado:");
                    for (j = 0; j < Cadastros.size(); j++) {
                        acha = Cadastros.get(j).getCpf().equals(CpfSearch);
                        if (acha == true) {
                            Cadastros.get(j).setCpf(CpfSearch);
                            j = 1000000000;
                        }
                    }
                    if (acha == false) {
                        JOptionPane.showConfirmDialog(null, "CPF Invalido");
                    }
                    break;
                case 3://ATUALIZAR
                    /*Foi criada uma variavel buleana para fazer uma comparação retornar um falso caso,
                    encontre uma informação invalida como (cpf ou ID), apos foi feito um (for) para fazer a comparação
                    e encontrar a informação que esteja na posição (i). e foi adcionado um valor aleatorio na 
                    variavel (i) para que o for pare de ser executado. tambem foi criada uma variavel de pesquisa 
                    de cpf (cpfSearch).
                     */
                    String cpfSearch;
                    boolean achou = false;

                    cpfSearch = JOptionPane.showInputDialog("informe o cpf do usuario que voce deseja alterar");
                    for (int i = 0; i < Cadastros.size(); i++) {
                        achou = Cadastros.get(i).getCpf().equals(cpfSearch);
                        if (achou == true) {
                            nome = JOptionPane.showInputDialog("Atualize o Nome:");
                            cell = JOptionPane.showInputDialog("Atualize o Telefone:");
                            valor = Cadastros.get(i).getValor() + Float.parseFloat(JOptionPane.showInputDialog("Atualize o Valor:"));
                            Cadastros.get(i).setNome(nome);
                            Cadastros.get(i).setCell(cell);
                            Cadastros.get(i).setValor(valor);
                            i = 100000;
                        }
                    }
                    if (achou == false) {
                        JOptionPane.showMessageDialog(null, "Usuario não existe.");
                    }
                    break;
                case 4://SACAR
                    /*foi feito um FOR pra poder localizar um CPF, e feito um if para fazer a conparação e
                    ver se o CPF cadastrado é valido ou não, usando também uma variavel boleanapara essa 
                    comaparação. a variavel sacar tem que receber (Joptionpane em parse).
                     */

                    float sacar;
                    String CpfValido;
                    boolean olhaLa = false;

                    CpfValido = JOptionPane.showInputDialog("Informe seu CPF:");
                    for (int i = 0; i < Cadastros.size(); i++) {
                        olhaLa = Cadastros.get(i).getCpf().equals(CpfValido);
                        if (olhaLa == true) {
                            sacar = Cadastros.get(i).getValor() - Float.parseFloat(JOptionPane.showInputDialog("Informe o valor que quer sacar:"));
                            Cadastros.get(i).setValor(sacar);
                        }

                    }
                    if (olhaLa == false) {
                        JOptionPane.showInputDialog("CPF invalido");
                    }
                    break;
                case 5://depositar
                    /*foi feito um FOR pra poder localizar um CPF, e feito um if para fazer a conparação e
                    ver se o CPF cadastrado é valido ou não, usando também uma variavel boleanapara essa 
                    comaparação. a variavel sacar tem que receber (Joptionpane em parse).
                     */
                    float depositar;
                    String CPFvalido;
                    boolean OlhaLa = false;

                    CPFvalido = JOptionPane.showInputDialog("Informe seu CPF:");
                    for (int i = 0; i < Cadastros.size(); i++) {
                        OlhaLa = Cadastros.get(i).getCpf().equals(CPFvalido);
                        if (OlhaLa == true) {
                            depositar = Cadastros.get(i).getValor() + Float.parseFloat(JOptionPane.showInputDialog("Informe o valor a ser depositado:"));
                            Cadastros.get(i).setValor(depositar);
                        }

                    }
                    if (OlhaLa == false) {
                        JOptionPane.showInputDialog("CPF invalido:");

                    }

            }

        }

    }

}

