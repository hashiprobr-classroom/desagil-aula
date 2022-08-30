package br.edu.insper.desagil.aula6.rpg;

public class Personagem extends Elemento {
	private Equipamento equipamentoEsquerdo;
	private Equipamento equipamentoDireito;

	public Personagem(int x, int y) {
		super(x, y);
		this.equipamentoEsquerdo = null;
		this.equipamentoDireito = null;
	}

	public Equipamento getEquipamentoEsquerdo() {
		return equipamentoEsquerdo;
	}

	public void setEquipamentoEsquerdo(Equipamento equipamentoEsquerdo) {
		this.equipamentoEsquerdo = equipamentoEsquerdo;
	}

	public Equipamento getEquipamentoDireito() {
		return equipamentoDireito;
	}

	public void setEquipamentoDireito(Equipamento equipamentoDireito) {
		this.equipamentoDireito = equipamentoDireito;
	}
}
