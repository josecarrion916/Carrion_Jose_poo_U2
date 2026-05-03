package uni1a;

public class Streaming extends ContenidoAudiovisual {
    private String plataforma;
    private String idiomaOriginal;
    private boolean esOriginal;

    // 🔹 NUEVO
    private Investigador investigador;

    public Streaming(String titulo, int duracionEnMinutos, String genero, 
                     String plataforma, String idiomaOriginal, boolean esOriginal) {
        super(titulo, duracionEnMinutos, genero);
        this.plataforma = plataforma;
        this.idiomaOriginal = idiomaOriginal;
        this.esOriginal = esOriginal;
    }

    // 🔹 NUEVO
    public void setInvestigador(Investigador investigador) {
        this.investigador = investigador;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Streaming:");
        mostrarDetallesBase();
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Idioma: " + idiomaOriginal);
        System.out.println("Original: " + (esOriginal ? "Sí" : "No"));

        // 🔹 NUEVO
        if (investigador != null) {
            investigador.mostrarDetalles();
        }

        System.out.println();
    }
}