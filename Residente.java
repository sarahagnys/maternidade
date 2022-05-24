package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "residente")
public class Residente extends Medico{

    @NotNull
    @Column(name = "instituicao_ensino", length = 50)
    private String instituicao;

    @NotNull
    @Column(name = "ano_ingresso", length = 10)
    private int ano;

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Residente{" +
                "instituicao='" + instituicao + '\'' +
                ", ano=" + ano +
                '}';
    }
}
