public class mago extends personagem {
    public mago(String nome) {
        setNome(nome);
        setHPMaximo(170);
        setHP(170);
        setMPMaximo(100);
        setMP(100);
        setAtaqueFisico(5);
        setAtaqueMagico(20);
        setDefesa(12);
        setNivel(1);
        setXP(0);
        setPontosForca(1);
        setPontosInteligencia(10);
        setPontosDestreza(4);
        setPontosNaoAplicados(0);
            
        setNomeHabilidade1("Projetil de Fogo");
        setConsumoManaHabilidade1(13);
        setTaxaDanoHabilidade1(1.5);
        setNomeHabilidade2("Explosão Arcana");
        setConsumoManaHabilidade2(35);
        setTaxaDanoHabilidade2(2.5);  
        setPersonagemMagico(true);
    }
}
