



    public class arqueiro extends personagem {
        public arqueiro(String nome) {
            setNome(nome);
            setHPMaximo(50);
            setHP(50);
            setMPMaximo(30);
            setMP(30);
            setAtaqueFisico(1);
            setAtaqueMagico(8);
            setDefesa(5);
            setNivel(1);
            setXP(0);
            setPontosForca(4);
            setPontosInteligencia(1);
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
