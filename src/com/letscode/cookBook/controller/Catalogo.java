package com.letscode.cookBook.controller;

import com.letscode.cookBook.domain.Ingrediente;
import com.letscode.cookBook.domain.Receita;
import com.letscode.cookBook.domain.Rendimento;
import com.letscode.cookBook.enums.Categoria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Catalogo {
    private int index;
    private String nome;
    private List<Receita> receitas;

    public Catalogo(int index, String nome) {
        this.receitas = new ArrayList<>();
        this.index = index;
        this.nome = nome;
    }

    public int getSize(){
        return receitas.size()-1;
    }

    public void add(Receita receita) {
        if(!receitas.contains(receita)){
            this.receitas.add(receita);
        }
    }

    public void del(String nome) {
        Receita item = this.getReceita(nome);
        this.receitas.remove(item);
    }

    public Receita getReceita(int index) {
        return this.receitas.get(index);
    }

    public Receita getReceita(String nome) {
        for (Receita item: receitas ) {
            if(item.getNome().equalsIgnoreCase(nome)){
                return item;
            }
        }
        return null;
    }

    public Receita getRamdom() {
        int index = new Random().nextInt(receitas.size());
        return this.getReceita(index);
    }
}
