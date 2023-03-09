package Contrest;

import java.util.Random;

public class Roupa {
    
    static private int sequencia=0001;
    private int tipo;
    private int qnt;
    private String marca;
    private String fornecedor;
    private int tamanho;
    private int cod;
    
    public void cadastraRoupa(int t, int q, int ta, String f, String m){
        this.fornecedor = f;
        this.marca = m;
        this.qnt = q;
        this.tamanho = ta;
        this.tipo = t;
        this.cod = sequencia ++;
    }

    public int getTipo() {
        return tipo;
    }

    public int getQnt() {
        return qnt;
    }

    public String getMarca() {
        return marca;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getCod() {
        return cod;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }
    
}
