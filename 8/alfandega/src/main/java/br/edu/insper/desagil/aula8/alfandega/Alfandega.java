package br.edu.insper.desagil.aula8.alfandega;

import java.util.ArrayList;
import java.util.List;

public class Alfandega {
	private List<Item> itens;
	private List<ItemTarifado> itensTarifados;

	public Alfandega() {
		this.itens = new ArrayList<>();
		this.itensTarifados = new ArrayList<>();
	}

	public void declara(Item item) {
		itens.add(item);
	}

	public void declara(ItemTarifado itemTarifado) {
		itensTarifados.add(itemTarifado);
	}

	public double calculaTotalTarifado() {
		double total = 0.0;
		for (Item item : itens) {
			total += item.getTarifa() * item.getValor();
		}
		for (ItemTarifado itemTarifado : itensTarifados) {
			total += itemTarifado.getTarifa() * itemTarifado.getValor();
		}
		return total;
	}

	public double calculaTotalExtra() {
		double total = 0.0;
		for (ItemTarifado itemTarifado : itensTarifados) {
			total += itemTarifado.getTarifa() * itemTarifado.getValor() * itemTarifado.getTaxa();
		}
		return total;
	}
}
