package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@Table(name = "mae")
public class Mae {

    @Id
    @NotNull
    @Column(name = "cpf_mae", length = 11)
    private int cpf;

    @NotNull
    @Column(name = "nome", length = 60)
    private String nome;

    @NotNull
    @Column(name = "logradouro_endereco", length = 100)
    private String logradouro;

    @NotNull
    @Column(name = "numero_endereco", length = 10)
    private int numero;

    @NotNull
    @Column(name = "cep_endereco", length = 8)
    private String cep;

    @Column(name = "complemento_endereco", length = 8)
    private String complemento;

    @NotNull
    @Column(name = "telefone", length = 8)
    private String telefone;

    @NotNull
    @Column(name = "data_nasc")
    private LocalDate dataNasc;

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

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "Mae{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero=" + numero +
                ", cep='" + cep + '\'' +
                ", complemento='" + complemento + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNasc=" + dataNasc +
                '}';
    }
}
