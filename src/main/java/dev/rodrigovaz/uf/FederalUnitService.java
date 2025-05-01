package dev.rodrigovaz.uf;

public interface FederalUnitService {

	/**
	 * Atualizar um estado
	 * 
	 * @param name
	 * @param population
	 */
	void updateUnitPopulation(String name, Double population);

	/**
	 * Adiciona um novo estado
	 * 
	 * @param name
	 * @param population
	 */
	void add(String name, Double population);

	/**
	 * Adicioanr um novo estado se ele não existir
	 * 
	 * @param name       - nome do estado
	 * @param population - população atual do estado
	 */
	void addIfNotExists(String name, Double population);

	/**
	 * Imprimi todos os estados cadastro
	 */
	void printAllFederalUnit();

	void printSortedAscByName();
}
