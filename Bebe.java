package model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@Table(name = "bebe")
public class Bebe {

    @Id
    @Column(name = "cpf_bebe", length = 11)
    @NotNull
    private int cpf;

    @NotNull
    @Column(name = "nome", length = 60)
    private String nome;

    @NotNull
    @Column(name = "data_nascimento")
    private LocalDate dataNasc;

    @NotNull
    @Column(name = "altura")
    private float altura;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_mae")
    @NotNull
    private Mae mae;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Mae getMae() {
        return mae;
    }

    public void setMae(Mae mae) {
        this.mae = mae;
    }

    @Override
    public String toString() {
        return "Bebe{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", dataNasc=" + dataNasc +
                ", altura=" + altura +
                ", mae=" + mae +
                '}';
    }
}
