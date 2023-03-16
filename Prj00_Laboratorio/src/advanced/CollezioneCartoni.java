package advanced;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CollezioneCartoni {
	
	private List<Cartone> cartoni = new ArrayList<>();
	
	File f = new File("file/cartoni.csv");
	
	public List<Cartone> dammiTuttiICartoniCheAiNellaLista(){
		return cartoni;
	}
	
	public void scriviUnFileDaUnaLista(List<Cartone> lista) {
		File f2 = new File("file/output.txt");
		try {
			PrintWriter pw = new PrintWriter(f2);
			for (Cartone cartone : lista) {
				pw.println(cartone);
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void mettiIlContenutoDelFileInUnaLista() {
		try {
			FileReader fr = new FileReader(f);
			BufferedReader reader = new BufferedReader(fr);
			
			while(true) {
				String riga = reader.readLine();
				if (riga == null) break;
				String [] split = riga.split(",");
				int id = Integer.parseInt(split[0]);
				String titolo = split[1];
				double rating = Double.parseDouble(split[2]);
				
				Cartone temp = new Cartone();
				temp.setId(id);
				temp.setTitolo(titolo);
				temp.setRating(rating);
				cartoni.add(temp);
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
