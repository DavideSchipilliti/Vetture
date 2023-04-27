import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main {

	private final static String[] nominativi= {"Amalia_Cesarotti", "Costantino_Cortese", "Patrizia_Gemito", "Elvira_Avogadro", "Evangelista_Badoglio", "Monica_Morucci", "Diana Satta", 
			"Fabia_Strangio", "Pierangelo_Bocca", "Telemaco_Scaramucci", "Micheletto_Rensi", "Augusto_Marzorati", "Fiorenzo_Ammaniti", "Silvia_Viviani",
			"Martino_Frescobaldi", "Giada_Tacchini", "Mauro_Volta", "Mariana_Cagnotto", "Rosaria_Mancini", "Lucrezia_Chiappetta", "Baldassare_Montanelli",
			"Gianna_Notarbartolo", "Annetta_Sollima", "Erika_Gentilini", "Manuel_Toldo", "Eraldo_Bompiani", "Gabriella_Eco", "Ettore_Dallapé", "Bianca_Mannoia",
			"Piersanti_Antonetti"};
	
	public static void main (String args[]) throws VehicleDuplicationException{
		String path ="vetture.txt";
		List<Vettura> vetture=new ArrayList<>(30);
		String stringa="";
		Set<String> targheUsate=new HashSet<>(30);
		
		//creo le 30 vetture e il contenuto del file
		for(String nominativo:nominativi) {
			
			Vettura vettura=new Vettura(getRandTarga(), nominativo);
			
			if (targheUsate.contains(vettura.getTarga()) )
				throw new VehicleDuplicationException();
			
			targheUsate.add(vettura.getTarga());
			vetture.add(vettura);
			stringa+=vettura.getTarga() + "|" + vettura.getMarca() + "|" + vettura.getProprietario() + "\n";
		}
		stringa=stringa.substring(0, stringa.length()-1);	//tolgo l'ultimo \n
		
		//creo il file (se esiste prima lo cancello)
		File file = new File(path);
		
		try {
			if (file.exists() ) {
	            file.delete();
	            System.out.println("Il file " + path + " è stato eliminato");
	        }
	        if (file.createNewFile())
	            System.out.println("Il file " + path + " è stato creato");
	        else
	            System.out.println("Il file " + path + " non può essere creato");
	        
		} catch(IOException e) {
			e.printStackTrace();
		}
        
		//scrivo sul file
		try( BufferedWriter bw=new BufferedWriter(new FileWriter(file) )) {
			bw.write(stringa);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//funzione che genera stringa random con 2 char, 2 numeri, 2 char
	private static String getRandTarga() {
		String targa="";
		Random r = new Random();
        targa+= (char) (r.nextInt(26) +'A');
        targa+= (char) (r.nextInt(26) +'A');
        targa+= r.nextInt(5);
        targa+= r.nextInt(5);
        targa+= (char) (r.nextInt(26) +'A');
        targa+= (char) (r.nextInt(26) +'A');
		return targa;
	}
	
}
