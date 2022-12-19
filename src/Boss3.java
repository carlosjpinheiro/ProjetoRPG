
public class Boss3 extends Bosses{

    public Boss3() {
        super();
        this.setNivel(1);
        this.setHP(300);
        this.setAtaque(25);
        this.setDefesa(5);
        this.setNomeHabilidade1("Absorção de Aura");
        this.setNomeHabilidade2("O Levantar dos Mortos");
        this.setTaxaDanoHabilidade1(1.7);
        this.setTaxaDanoHabilidade2(2.5);
        this.setnome("Necromante");
        this.setimagem("/img/inimigo/Necromante.jpg");
    }
    
    public Boss3(int nivel) {
        super();
        double fatorCrescimento = nivel * 10;
        this.setNivel(nivel);
        this.setHP(300+(int)Math.round((300 * fatorCrescimento))/100);
        this.setAtaque(25+(int)Math.round((25*fatorCrescimento))/100);
        this.setDefesa(5+(int)Math.round((5*fatorCrescimento))/100);
        this.setNomeHabilidade1("Absorção de Aura");
        this.setNomeHabilidade2("O Levantar dos Mortos");
        this.setTaxaDanoHabilidade1(1.7);
        this.setTaxaDanoHabilidade2(2.5);
        this.setnome("Necromante");
        this.setimagem("/img/inimigo/Necromante.jpg");
    }
    
}