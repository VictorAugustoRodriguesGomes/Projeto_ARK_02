package ark.pkg02;

public class Livro {

    private String Nome;
    private int NumeroDePaginas;

    public Livro(String Nome, int NumeroDePaginas) {
        this.Nome = Nome;
        this.NumeroDePaginas = NumeroDePaginas;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getNumeroDePaginas() {
        return NumeroDePaginas;
    }

    public void setNumeroDePaginas(int NumeroDePaginas) {
        this.NumeroDePaginas = NumeroDePaginas;
    }

    public String[] toArray() {
        return new String[]{
            this.Nome,
            Integer.toString(this.NumeroDePaginas)
        };
    }

}
