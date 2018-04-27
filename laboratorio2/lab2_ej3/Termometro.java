public class Termometro
{
    int agitadas;
    private int tempertura_;

    public Termometro(int agitadas, int tempertura_) {
        this.agitadas = agitadas;
        this.tempertura_ = tempertura_;
    }

    public int getAgitadas() {
        return agitadas;
    }

    public void setAgitadas(int agitadas) {
        this.agitadas = agitadas;
    }

    public int getTempertura_() {
        return tempertura_;
    }

    public void setTempertura_(int tempertura_) {
        this.tempertura_ = tempertura_;
    }
     public void temperatura (int t )
    {
        this.tempertura_ = this.tempertura_+(t/2);
        System.out.println(tempertura_);
    }
}
