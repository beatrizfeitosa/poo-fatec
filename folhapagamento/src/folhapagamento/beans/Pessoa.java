package folhapagamento.beans;

import java.util.Objects;

class Pessoa {
    protected String rg;
    protected String nome;
    protected String email;

    public Pessoa(String RG, String nome, String email) {
        this.rg = RG;
        this.nome = nome;
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "RG=" + rg + ", nome=" + nome + ", email=" + email + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.rg);
        hash = 89 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
}
