
package model;

import java.sql.Date;

/**
 * @author (Diego Schmitt , 08-07-2017)
 */
public class Carro {
    private int id,renavam;

    
    private short anoFabricacao,anoLancamento,tipoPneu;
    private byte quantidadePortas,quantidadeBatidas;
    private String nome,cor,fabricante,placa,chassi,descricao;
    private float quilometragem,potencia;
    private Date dataCompra;
    private boolean estaFuncional,permitidaCirculacao;
    
    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public short getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(short anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public short getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(short anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public short getTipoPneu() {
        return tipoPneu;
    }

    public void setTipoPneu(short tipoPneu) {
        this.tipoPneu = tipoPneu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getRenavan() {
        return renavam;
    }

    public void setRenavan(int renavan) {
        this.renavam = renavan;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public float getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(float quilometragem) {
        this.quilometragem = quilometragem;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public byte getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(byte quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public byte getQuantidadeBatidas() {
        return quantidadeBatidas;
    }

    public void setQuantidadeBatidas(byte quantidadeBatidas) {
        this.quantidadeBatidas = quantidadeBatidas;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public boolean isEstaFuncional() {
        return estaFuncional;
    }

    public void setEstaFuncional(boolean estaFuncional) {
        this.estaFuncional = estaFuncional;
    }

    public boolean isPermitidaCirculacao() {
        return permitidaCirculacao;
    }

    public void setPermitidaCirculacao(boolean permitidaCirculacao) {
        this.permitidaCirculacao = permitidaCirculacao;
    }
    
    
    
    
}
