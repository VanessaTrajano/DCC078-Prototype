package org.example;

public class Imovel implements Cloneable {
    private String logradouro;
    private Integer numeroUnidade;

    public Imovel(String logradouro, Integer numeroUnidade) {
        super();
        this.logradouro = logradouro;
        this.numeroUnidade = numeroUnidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumeroUnidade() {
        return numeroUnidade;
    }

    public void setNumeroUnidade(Integer numeroUnidade) {
        this.numeroUnidade = numeroUnidade;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "logradouro='" + logradouro + '\'' +
                ", numeroUnidade=" + numeroUnidade +
                '}';
    }
}