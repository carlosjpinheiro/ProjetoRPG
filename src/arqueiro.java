public class arqueiro extends personagem {
    public arqueiro(String nome) {
        setNome(nome);
        setHPMaximo(90);
        setHP(90);
        setMPMaximo(80);
        setMP(80);
        setAtaqueFisico(10);
        setAtaqueMagico(25);
        setDefesa(15);
        setNivel(1);
        setXP(0);
        setPontosForca(4);
        setPontosInteligencia(4);
        setPontosDestreza(10);
        setPontosNaoAplicados(0);
            
        setNomeHabilidade1("Disparo Critico");
        setConsumoManaHabilidade1(15);
        setTaxaDanoHabilidade1(1.5);
        setNomeHabilidade2("Chuva de Flexas");
        setConsumoManaHabilidade2(35);
        setTaxaDanoHabilidade2(2.5);  
        setPersonagemMagico(true);
   }
}
