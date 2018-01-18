package exemploarrayobxeto;


public class Persoa {
    private String nome;
    private String dni;

    public Persoa(String nome, String dni) {
        this.nome = nome;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persoa{" + "nome=" + nome + ", dni=" + dni + '}';
    }

    public Persoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
}
