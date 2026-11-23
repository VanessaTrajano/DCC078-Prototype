package org.example;

public class ContratoAluguel implements Cloneable {
    private int numeroContrato;
    private String nomeInquilino;
    private Imovel imovel;
    private String tipoGarantia;

    public ContratoAluguel(int numeroContrato, String nomeInquilino, Imovel imovel, String tipoGarantia) {
        this.numeroContrato = numeroContrato;
        this.nomeInquilino = nomeInquilino;
        this.imovel = imovel;
        this.tipoGarantia = tipoGarantia;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public String getNomeInquilino() {
        return nomeInquilino;
    }

    public void setNomeInquilino(String nomeInquilino) {
        this.nomeInquilino = nomeInquilino;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public String getTipoGarantia() {
        return tipoGarantia;
    }

    public void setTipoGarantia(String tipoGarantia) {
        this.tipoGarantia = tipoGarantia;
    }

    @Override
    public ContratoAluguel clone() throws CloneNotSupportedException {
        ContratoAluguel contratoClone = (ContratoAluguel) super.clone();
        contratoClone.imovel = (Imovel) contratoClone.imovel.clone();
        return contratoClone;
    }

    @Override
    public String toString() {
        return "ContratoAluguel{" +
                "numeroContrato=" + numeroContrato +
                ", nomeInquilino='" + nomeInquilino + '\'' +
                ", imovel=" + imovel +
                ", tipoGarantia='" + tipoGarantia + '\'' +
                '}';
    }
}