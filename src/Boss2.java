public class Boss2 extends Bosses{

    public Boss2() {
        super();
        this.setNivel(1);
        this.setHP(170);
        this.setAtaque(20);
        this.setDefesa(5);
        this.setNomeHabilidade1("Grito Estridente");
        this.setNomeHabilidade2("Invocação do Mal");
        this.setTaxaDanoHabilidade1(1.5);
        this.setTaxaDanoHabilidade2(2.2);
        this.setnome("Bruxa");
        this.setimagem("/img/inimigo/Bruxo.jpg");
    }

    public Boss2(int nivel) {
        super();
        double fatorCrescimento = nivel * 10;
        this.setNivel(nivel);
        this.setHP(170+(int)Math.round((100 * fatorCrescimento))/100);
        this.setAtaque(20+(int)Math.round((10*fatorCrescimento))/100);
        this.setDefesa(5+(int)Math.round((2*fatorCrescimento))/100);
        this.setNomeHabilidade1("Grito Estridente");
        this.setNomeHabilidade2("Invocação do Mal");
        this.setTaxaDanoHabilidade1(1.5);
        this.setTaxaDanoHabilidade2(2.2);
        this.setnome("Bruxa");
        this.setimagem("/img/inimigo/Bruxo.jpg");
    }
}