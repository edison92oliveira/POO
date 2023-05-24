/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo;


public class User {

    int id;
    String nome;
    String cpf;
    String cell;
    float valor;

    public User(int id, String nome, String cpf, String cell, float valor) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cell = cell;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\nId:" + getId()
                + "\nNome:" + getNome()
                + "\nCpf: " + getCpf()
                + "\nCell" + getCell()
                + "\nValor" + getValor();
    }

}

