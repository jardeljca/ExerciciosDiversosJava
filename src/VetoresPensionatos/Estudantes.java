package VetoresPensionatos;

public class Estudantes {
    private final String nome;
    private final String email;

    public Estudantes(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return nome + ", " + email;
    }
}
