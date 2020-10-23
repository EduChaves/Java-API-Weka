/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoweka;

/**
 *
 * @author Eduardo
 */
public class DeathEvent {
    
    private int idade;
    private int creatina_fosfocinase;
    private double plaquetas;
    private double soro_creatina;
    private int soro_sodico;
    private int sexo;
    private int fumante;
    private int anemia;
    private int diabetes;
    private int fracao_de_ejecao;
    private int pressao_alta;

    public double getProb1() {
        return prob1;
    }

    public void setProb1(double prob1) {
        this.prob1 = prob1;
    }

    public double getProb2() {
        return prob2;
    }

    public void setProb2(double prob2) {
        this.prob2 = prob2;
    }
    private double prob1;
    private double prob2;
    


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCreatina_fosfocinase() {
        return creatina_fosfocinase;
    }

    public void setCreatina_fosfocinase(int creatina_fosfocinase) {
        this.creatina_fosfocinase = creatina_fosfocinase;
    }

    public double getPlaquetas() {
        return plaquetas;
    }

    public void setPlaquetas(double plaquetas) {
        this.plaquetas = plaquetas;
    }

    public double getSoro_creatina() {
        return soro_creatina;
    }

    public void setSoro_creatina(double soro_creatina) {
        this.soro_creatina = soro_creatina;
    }

    public int getSoro_sodico() {
        return soro_sodico;
    }

    public void setSoro_sodico(int soro_sodico) {
        this.soro_sodico = soro_sodico;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getFumante() {
        return fumante;
    }

    public void setFumante(int fumante) {
        this.fumante = fumante;
    }

    public int getAnemia() {
        return anemia;
    }

    public void setAnemia(int anemia) {
        this.anemia = anemia;
    }

    public int getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(int diabetes) {
        this.diabetes = diabetes;
    }

    public int getFracao_de_ejecao() {
        return fracao_de_ejecao;
    }

    public void setFracao_de_ejecao(int fracao_de_ejecao) {
        this.fracao_de_ejecao = fracao_de_ejecao;
    }

    public int getPressao_alta() {
        return pressao_alta;
    }

    public void setPressao_alta(int pressao_alta) {
        this.pressao_alta = pressao_alta;
    }
}
