package com.letscode.cookBook.view;

import com.letscode.cookBook.domain.Ingrediente;
import com.letscode.cookBook.domain.Receita;
import com.letscode.cookBook.enums.Categoria;
import com.letscode.cookBook.enums.TipoMedida;

import java.util.Arrays;
import java.util.Scanner;

public class NovaReceitaView {
    Scanner scanner;

    public NovaReceitaView() {
        this.scanner = new Scanner(System.in);
    }

    private String askNome() {
        System.out.println("Qual o nome da receita?");
        String nome = scanner.nextLine();
        if (nome.isBlank()) {
            System.out.println("Nome inválido!");
            nome = askNome();
        }
        return nome;
    }

    private Categoria askCategoria() {

        System.out.println("Qual a categoria da receita?");
        for (Categoria cat : Categoria.values()) {
            System.out.printf("\t%d - %s \n", cat.ordinal(), cat.name());
        }

        System.out.printf("#: ");
        int categoria = scanner.nextInt();

        if (categoria < 0 || categoria >= Categoria.values().length) {
            System.out.println("Categoria inválida!");
             askCategoria();
        }

        for (Categoria cat : Categoria.values()) {
            if (categoria == cat.ordinal() ) {
                return Categoria.valueOf(cat.name());
            }
        }
        return null;
    }

    public Receita criar() {
        String nome = askNome();
        Categoria categoriaItem = askCategoria();

        Receita receita = new Receita(nome, categoriaItem);

        return receita;
    }
}
