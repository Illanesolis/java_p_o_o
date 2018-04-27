public class Rana
{
    private String nombre;
    private String color;
    int metros;

    public Rana(String nombre, String color, int metros) {
        this.nombre = nombre;
        this.color = color;
        this.metros = metros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }
    public void ganador()
    {
        int random1=1 + (int)(Math.random() * ((1 - 3) + 1)) ;
        this.metros=this.metros+random1 ;
        System.out.println(metros);

    }
    public void metros(int t )
    {


    }



}
