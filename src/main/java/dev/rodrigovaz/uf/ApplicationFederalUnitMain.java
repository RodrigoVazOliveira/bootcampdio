package dev.rodrigovaz.uf;

import java.util.HashMap;

public class ApplicationFederalUnitMain {

	public static void main(String[] args) {
		FederalUnit federalUnit = new FederalUnit(new HashMap<>());
		FederalUnitService federalUnitService = new FederalUnitMemoryService(federalUnit);
		federalUnitService.add("PE", 9616621d);
		federalUnitService.add("AL", 3351543d);
		federalUnitService.add("CE", 9187103d);
		federalUnitService.add("RN", 3534265d);

		// atualizar população do RN
		federalUnitService.updateUnitPopulation("RN", 3534165d);

		// adicionar estado de PB caso ele não exista
		federalUnitService.addIfNotExists("PB", 4039277d);

		// imprimir todos os estados
		federalUnitService.printAllFederalUnit();
		System.out.println("imprimir ordenado por noem");

		federalUnitService.printSortedAscByName();

	}

}
