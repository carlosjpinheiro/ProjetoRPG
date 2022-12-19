public class Assassin extends Character {
    public Assassin(String nome) {
        setNome(nome);
        setHPMaximo(70);
        setHP(70);
        setMPMaximo(40);
        setMP(40);
        setAtaqueFisico(35);
        setAtaqueMagico(5);
        setDefesa(10);
        setNivel(1);
        setXP(0);
        setPontosForca(8);
        setPontosInteligencia(1);
        setPontosDestreza(8);
        setPontosNaoAplicados(0);            
            
        setNomeHabilidade1("Estocada Ardente");
        setConsumoManaHabilidade1(10);
        setTaxaDanoHabilidade1(1.3);
        setNomeHabilidade2("Execução silenciosa");
        setConsumoManaHabilidade2(30);
        setTaxaDanoHabilidade2(2.1);       
        setPersonagemMagico(false);
    }
}
