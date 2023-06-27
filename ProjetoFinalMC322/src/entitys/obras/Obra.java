package src.entitys.obras;

public abstract class Obra {
    public static Integer id;
    private String titulo;
    private String autor;
    private boolean isReservado;
    private final Integer codigo;

    public Obra(String titulo, String autor, boolean isReservado) {
        this.titulo = titulo;
        this.autor = autor;
        this.isReservado = isReservado;
        this.codigo = id++;
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

    public boolean isReservado() {
        return isReservado;
    }

    public void setReservado(boolean reservado) {
        isReservado = reservado;
    }

    public Integer getCodigo() {
        return codigo;
    }
}
