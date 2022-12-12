



    public class mago extends personagem {
        public mago(String nome) {
            setNome(nome);
            setHPMaximo(50);
            setHP(50);
            setMPMaximo(30);
            setMP(30);
            setAtaqueFisico(1);
            setAtaqueMagico(11);
            setDefesa(2);
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
