package com.letscode.cookBook.domain;

import com.letscode.cookBook.enums.Categoria;

import java.util.Arrays;

public class Receita {
    private String nome;
    private Categoria categoria;
    private int tempoPreparo;
    private Rendimento rendimento;
    private Ingrediente[] ingredientes;
    private String[] modoPreparo;

    public Receita(String nome, Categoria categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public Rendimento getRendimento() {
        return rendimento;
    }

    public void setRendimento(Rendimento rendimento) {
        this.rendimento = rendimento;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String[] getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String[] modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    @Override
    public String toString() {
        return  "\tnome: \n\t\t" + nome + '\n' +
                "\tcategoria: \n\t\t" + categoria + '\n' +
                "\ttempoPreparo: \n\t\t" + tempoPreparo + '\n' +
                "\trendimento: \n\t\t" + rendimento + '\n' +
                "\tingredientes: \n\t\t" + Arrays.toString(ingredientes) + '\n' +
                "\tmodoPreparo: \n\t\t" + Arrays.toString(modoPreparo) + '\n';
    }
}
