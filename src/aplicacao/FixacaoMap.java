package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixacaoMap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> votos = new LinkedHashMap<>();
		
		System.out.println("Informe o arquivo :");
		String path = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String linha = br.readLine();
			while (linha != null) {
				String[] linhaCsv = linha.split(",");
				String chave = linhaCsv[0];
				Integer qtvotos = Integer.parseInt(linhaCsv[1]);
				//Boolean x1 = votos.containsKey(chave);
				if (votos.containsKey(chave)) {
					qtvotos += votos.get(chave);
				}
				
				votos.put(chave, qtvotos);
				linha = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (String key : votos.keySet()) {
			System.out.println(key + ": " + votos.get(key));
		}
		sc.close();
	}

}
