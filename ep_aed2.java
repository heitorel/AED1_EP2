package ep_aed1;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ep_aed1 {
	
	public static void main(String[] args){
		pilhaIngenua2();
		PilhaIngenuaDobrada();
	}
	
	
	public static void PilhaIngenuaDobrada() {
		HashMap<String,long[]> tempos = new HashMap<String, long[]>();
		Pile2 pile;
		for(int i=1; i<100; i++) {
			System.out.println("Starting task"+i+" with Pilha Ingenua");
			long[] temposAux = new long[3];
			try {
				pile = new Pile2();
				ArrayList<String> processedTasks = new ArrayList<String>();
				String fileName = "tarefas"+i+"000.txt";
				File entrada = new File("C:/Users/heito/Desktop/EP2/entradas/"+fileName);
				Scanner leitor = new Scanner(entrada);
				temposAux[0] = System.currentTimeMillis();
				while(leitor.hasNextLine()) {
					String line = leitor.nextLine();
					if(!line.isEmpty()) {
						pile.add(Integer.parseInt(line));
					}else {
						processedTasks.add(""+pile.remove());
					}
				}
				temposAux[1] = System.currentTimeMillis();
				temposAux[2] = temposAux[1]-temposAux[0];
				tempos.put(fileName, temposAux);
				FileWriter writer = new FileWriter("C:/Users/heito/Desktop/EP2/saidas_pilhaIngenuaDobrada/"+fileName);
				for(String task : processedTasks) {
					writer.write(task+"\n");
				}
				writer.close();
				leitor.close();
			}
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			FileWriter writerTempo = new FileWriter("C:/Users/heito/Desktop/EP2/tempo_saidas_pilhaIngenuaDobrada/tempos.txt");
			writerTempo.write("Tarefa; duracao(ms)\n");
			for(String key : tempos.keySet()) {
				writerTempo.write(key+"; "+tempos.get(key)[2]+"\n");
			}
			writerTempo.write("Duracao Total(ms): "+(tempos.get("tarefas99000.txt")[1]-tempos.get("tarefas1000.txt")[0]));
			writerTempo.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void pilhaIngenua2() {
		HashMap<String,long[]> tempos = new HashMap<String, long[]>();
		PilhaIngenua2 pile;
		for(int i=1; i<100; i++) {
			System.out.println("Starting task"+i+" with Pilha Ingenua");
			long[] temposAux = new long[3];
			try {
				pile = new PilhaIngenua2();
				ArrayList<String> processedTasks = new ArrayList<String>();
				String fileName = "tarefas"+i+"000.txt";
				File entrada = new File("C:/Users/heito/Desktop/EP2/entradas/"+fileName);
				Scanner leitor = new Scanner(entrada);
				temposAux[0] = System.currentTimeMillis();
				while(leitor.hasNextLine()) {
					String line = leitor.nextLine();
					if(!line.isEmpty()) {
						pile.add(Integer.parseInt(line));
					}else {
						processedTasks.add(""+pile.remove());
					}
				}
				temposAux[1] = System.currentTimeMillis();
				temposAux[2] = temposAux[1]-temposAux[0];
				tempos.put(fileName, temposAux);
				FileWriter writer = new FileWriter("C:/Users/heito/Desktop/EP2/saidas_pilhaIngenua2/"+fileName);
				for(String task : processedTasks) {
					writer.write(task+"\n");
				}
				writer.close();
				leitor.close();
			}
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			FileWriter writerTempo = new FileWriter("C:/Users/heito/Desktop/EP2/tempo_saidas_pilhaIngenua2/tempos.txt");
			writerTempo.write("Tarefa; duracao(ms)\n");
			for(String key : tempos.keySet()) {
				writerTempo.write(key+"; "+tempos.get(key)[2]+"\n");
			}
			writerTempo.write("Duracao Total(ms): "+(tempos.get("tarefas99000.txt")[1]-tempos.get("tarefas1000.txt")[0]));
			writerTempo.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	

}
