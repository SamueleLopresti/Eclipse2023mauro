package advanced;

import java.util.Comparator;

public class comparatoreuperficie  implements Comparator<Casa>{

	@Override
	public int compare(Casa primaCasa, Casa altraCasa) {
		// TODO Auto-generated method stub
		return Double.compare(primaCasa.getSuperficie(), altraCasa.getSuperficie());
	}

}
