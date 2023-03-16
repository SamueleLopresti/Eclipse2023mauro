package advanced;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import advanced.Casa.Tipo;

public class AgenziaImmobiliare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Casa> immobili = new LinkedList<>();
		
		Casa casa1 = new Casa();
		casa1.setNome("Casa BLU");
		casa1.setPrezzo(150000);
		casa1.setSuperficie(150);
		casa1.setStanze(4);
		casa1.setTipologia(Tipo.APPARTAMENTO);
		
		Casa casa2 = new Casa();
		casa2.setNome("Casa GIALLA");
		casa2.setPrezzo(250000);
		casa2.setSuperficie(140);
		casa2.setStanze(7);
		casa2.setTipologia(Tipo.CASA_INDIPENDENTE);
		
		Casa casa3 = new Casa();
		casa3.setNome("Casa VERDE");
		casa3.setPrezzo(950000);
		casa3.setSuperficie(155);
		casa3.setStanze(1);
		casa3.setTipologia(Tipo.LOFT);
		
		immobili.add(casa1);
		immobili.add(casa2);
		immobili.add(casa3);
		
		Set<Casa> immobiliSet = new TreeSet<>(immobili);
		
		immobiliSet.add(casa1);
		immobiliSet.add(casa2);
		immobiliSet.add(casa3);
		immobiliSet.add(casa3);
		
		
		
		for (Casa casa : immobili) {
			System.out.println(casa);
		}
		System.out.println("_____-----------------------------");
		
		for (Casa casa : immobiliSet) {
			System.out.println(casa);
		}
		
		comparatoreuperficie cs = new comparatoreuperficie();
		Collections.sort(immobili,cs);
		
		System.out.println("-----------------------------------------");
		
		for (Casa casa : immobili) {
			System.out.println(casa);
		}

	}

}
