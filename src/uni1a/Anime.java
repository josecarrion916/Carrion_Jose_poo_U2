package uni1a;

public class Anime extends ContenidoAudiovisual {
    private String estudio;
    private int episodios;
    private String temporada;

    // 🔹 NUEVO
    private Actor actor;
    private Temporada temp;

    public Anime(String titulo, int duracionEnMinutos, String genero, 
                 String estudio, int episodios, String temporada) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.episodios = episodios;
        this.temporada = temporada;
    }

    // 🔹 NUEVO
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void setTemporada(Temporada temp) {
        this.temp = temp;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Anime:");
        mostrarDetallesBase();
        System.out.println("Estudio: " + estudio);
        System.out.println("Episodios: " + episodios);
        System.out.println("Temporada: " + temporada);

        // 🔹 NUEVO
        if (actor != null) {
            actor.mostrarDetalles();
        }

        if (temp != null) {
            temp.mostrarDetalles();
        }

        System.out.println();
    }
}