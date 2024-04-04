package models;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int edicao;

    public Livro(int id, String titulo, String autor, int edicao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.edicao = edicao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return "id: " + id + ", titulo: " + titulo + ", autor: " + autor + ", edicao: " + edicao;
    }

}
