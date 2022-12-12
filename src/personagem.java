


public class personagem {
    private int HPMaximo;
    private int HP;
    private int MPMaximo;
    private int MP;
    private int AtaqueFisico;
    private int AtaqueMagico;
    private int Defesa;
    private int Nivel;
    private int XP = 0;
    private int XPNecessario = 100;
    private int PontosForca;
    private int PontosInteligencia;
    private int PontosDestreza;
    private int PontosNaoAplicados;
    private String nome;
    private String nomeHabilidade1;
    private int consumoManaHabilidade1;
    private double taxaDanoHabilidade1;
    private String nomeHabilidade2;
    private int consumoManaHabilidade2;
    private double taxaDanoHabilidade2;
    private boolean personagemMagico;
    
    public void diminuiHP(int dano){
        int danoFinal = (dano - Defesa);
        if (danoFinal > 0){
           HP -= danoFinal;
        }
    }

    public int calculaDano(int habilidade) {
        switch (habilidade) {
            case 1:
                if (isPersonagemMagico()) {
                    return (int) (AtaqueMagico);
                } else {
                    return (int) (AtaqueFisico);
                }
            case 2:
                MP -= this.consumoManaHabilidade1;
                if (isPersonagemMagico()) {
                    return (int) (AtaqueMagico * taxaDanoHabilidade1);
                } else {
                    return (int) (AtaqueFisico * taxaDanoHabilidade1);
                }
            case 3:
                MP -= this.consumoManaHabilidade2;
                if (isPersonagemMagico()) {
                    return (int) (AtaqueMagico * taxaDanoHabilidade2);
                } else {
                    return (int) (AtaqueFisico * taxaDanoHabilidade2);
                }
            default:
                return 0;
        }
    }

    public void aumentaForca() {
        PontosNaoAplicados--;
        PontosForca++;
        HP++;
        HPMaximo++;
        AtaqueFisico++;
    }

    public void aumentaInteligencia() {
        PontosNaoAplicados--;
        PontosInteligencia++;
        MP++;
        MPMaximo++;
        AtaqueMagico++;
    }

    public void aumentaNivel() {
        Nivel++;
        PontosNaoAplicados += 5;
        XPNecessario = (int)(XPNecessario * 1.4);
    }

    public void addXP(int xpNovo) {
        int xpParaUP = XPNecessario - XP;
        if (xpParaUP <= xpNovo) {
            aumentaNivel();
            this.XP = 0;
            this.XP = (xpNovo - xpParaUP);
        } else {
            this.XP += xpNovo;
        }
    }

    public void aumentaDestreza() {
        PontosNaoAplicados--;
        PontosDestreza++;
        Defesa++;
    }

    public int getMPMaximo() {
        return MPMaximo;
    }

    public void setMPMaximo(int MPMaximo) {
        this.MPMaximo = MPMaximo;
    }

    public int getHPMaximo() {
        return HPMaximo;
    }

    public void setHPMaximo(int HPMaximo) {
        this.HPMaximo = HPMaximo;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getAtaqueFisico() {
        return AtaqueFisico;
    }

    public void setAtaqueFisico(int AtaqueFisico) {
        this.AtaqueFisico = AtaqueFisico;
    }

    public int getAtaqueMagico() {
        return AtaqueMagico;
    }

    public void setAtaqueMagico(int AtaqueMagico) {
        this.AtaqueMagico = AtaqueMagico;
    }

    public int getDefesa() {
        return Defesa;
    }

    public void setDefesa(int Defesa) {
        this.Defesa = Defesa;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public int getXP() {
        return XP;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }

    public int getPontosForca() {
        return PontosForca;
    }

    public void setPontosForca(int PontosForca) {
        this.PontosForca = PontosForca;
    }

    public int getPontosInteligencia() {
        return PontosInteligencia;
    }

    public void setPontosInteligencia(int PontosInteligencia) {
        this.PontosInteligencia = PontosInteligencia;
    }

    public int getPontosDestreza() {
        return PontosDestreza;
    }

    public void setPontosDestreza(int PontosDestreza) {
        this.PontosDestreza = PontosDestreza;
    }

    public int getPontosNaoAplicados() {
        return PontosNaoAplicados;
    }

    public void setPontosNaoAplicados(int PontosNaoAplicados) {
        this.PontosNaoAplicados = PontosNaoAplicados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getXPNecessario() {
        return XPNecessario;
    }

    public void setXPNecessario(int XPNecessario) {
        this.XPNecessario = XPNecessario;
    }

    public String getNomeHabilidade1() {
        return nomeHabilidade1;
    }

    public void setNomeHabilidade1(String nomeHabilidade1) {
        this.nomeHabilidade1 = nomeHabilidade1;
    }

    public int getConsumoManaHabilidade1() {
        return consumoManaHabilidade1;
    }

    public void setConsumoManaHabilidade1(int consumoManaHabilidade1) {
        this.consumoManaHabilidade1 = consumoManaHabilidade1;
    }

    public double getTaxaDanoHabilidade1() {
        return taxaDanoHabilidade1;
    }

    public void setTaxaDanoHabilidade1(double taxaDanoHabilidade1) {
        this.taxaDanoHabilidade1 = taxaDanoHabilidade1;
    }

    public String getNomeHabilidade2() {
        return nomeHabilidade2;
    }

    public void setNomeHabilidade2(String nomeHabilidade2) {
        this.nomeHabilidade2 = nomeHabilidade2;
    }

    public int getConsumoManaHabilidade2() {
        return consumoManaHabilidade2;
    }

    public void setConsumoManaHabilidade2(int consumoManaHabilidade2) {
        this.consumoManaHabilidade2 = consumoManaHabilidade2;
    }

    public double getTaxaDanoHabilidade2() {
        return taxaDanoHabilidade2;
    }

    public void setTaxaDanoHabilidade2(double taxaDanoHabilidade2) {
        this.taxaDanoHabilidade2 = taxaDanoHabilidade2;
    }

    public boolean isPersonagemMagico() {
        return personagemMagico;
    }

    public void setPersonagemMagico(boolean personagemMagico) {
        this.personagemMagico = personagemMagico;
    }

}
