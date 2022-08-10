package br.com.dio.desafio.domain;

public abstract class Conteudo {

    //final - constante
    //static - pode acessar essa cobstante fora da classe
    //protected - somente as classes filhas podem ter acesso a constante
    //abstract - classe nao pode ser instanciada

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
