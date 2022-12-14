public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        setNome(nome);
        setHPMaximo(100);
        setHP(100);
        setMPMaximo(70);
        setMP(70);
        setAtaqueFisico(25);
        setAtaqueMagico(1);
        setDefesa(20);
        setNivel(1);
        setXP(0);
        setPontosForca(10);
        setPontosInteligencia(1);
        setPontosDestreza(4);
        setPontosNaoAplicados(0);
        
        setNomeHabilidade1("Corte circular");
        setConsumoManaHabilidade1(7);
        setTaxaDanoHabilidade1(1.3);
        setNomeHabilidade2("Abalo Sismico");
        setConsumoManaHabilidade2(30);
        setTaxaDanoHabilidade2(2.0);
        setPersonagemMagico(false);
    }  
}
