public class Candidato
{

    private String nombre;
    private float voto;

    public Candidato(String nombre, int voto) {
        this.nombre = nombre;
        this.voto = voto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getVoto() {
        return voto;
    }

    public void setVoto(float voto) {

        this.voto = voto;
    }
}
