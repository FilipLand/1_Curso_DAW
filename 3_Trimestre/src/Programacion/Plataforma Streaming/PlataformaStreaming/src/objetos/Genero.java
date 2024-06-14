package objetos;

public enum Genero {
    COMEDIA(1),
    CIENCIA_FICCION(2),
    ACCION(3),
    AMOR(4),
    AVENTURA(5);

    private final int categoria;

    private Genero(int categoria) {
        this.categoria = categoria;
    }

}
