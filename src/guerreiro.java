




public class guerreiro extends personagem {
    public guerreiro(String nome) {
        setNome(nome);
        setHPMaximo(50);
        setHP(50);
        setMPMaximo(15);
        setMP(15);
        setAtaqueFisico(10);
        setAtaqueMagico(1);
        setDefesa(3);
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
