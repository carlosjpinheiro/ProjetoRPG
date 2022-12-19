
public class Boss1 extends Bosses{

    public Boss1() {
        super();
        this.setNivel(1);
        this.setHP(250);
        this.setAtaque(15);
        this.setDefesa(10);
        this.setNomeHabilidade1("Rabada");
        this.setNomeHabilidade2("Jato Leptospiroso");
        this.setTaxaDanoHabilidade1(1.2);
        this.setTaxaDanoHabilidade2(1.9);
        this.setnome("Rato Gigante");
        this.setimagem("/img/inimigo/RatoGigate.jpg");
    }
    
    public Boss1(int nivel) {
        super();
        double fatorCrescimento = nivel * 10;
        this.setNivel(nivel);
        this.setHP(250+(int)Math.round((100 * fatorCrescimento))/100);
        this.setAtaque(15+(int)Math.round((10*fatorCrescimento))/100);
        this.setDefesa(5+(int)Math.round((2*fatorCrescimento))/100);
        this.setNomeHabilidade1("Rabada");
        this.setNomeHabilidade2("Jato Leptospiroso");
        this.setTaxaDanoHabilidade1(1.2);
        this.setTaxaDanoHabilidade2(1.9);
        this.setnome("Rato Gigante");
        this.setimagem("/img/inimigo/RatoGigate.jpg");
    }
    
}