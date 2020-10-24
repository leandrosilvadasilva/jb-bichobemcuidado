package br.com.bichobemcuidado.run;

import br.com.bichobemcuidado.model.Animal;
import br.com.bichobemcuidado.model.GeneroAnimal;

public class ChamarAnimal {

	public static void main(String[] args) {
	Animal animal1 = new Animal("Peter", "Gato", "Desconhecida", "Laranja",
			GeneroAnimal.MACHO, 3);	
	
		
		System.out.println(animal1);
	}

}
