package dev.rodrigovaz.uf;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.TreeMap;

public class FederalUnitMemoryService implements FederalUnitService {
	private final FederalUnit federalUnit;

	public FederalUnitMemoryService(FederalUnit federalUnit) {
		this.federalUnit = federalUnit;
	}

	@Override
	public void updateUnitPopulation(String name, Double population) {
		Map<String, Double> federalUnits = federalUnit.federalUnits();
		federalUnits.put(name, population);
	}

	@Override
	public void add(String name, Double population) {
		Map<String, Double> federalUnits = federalUnit.federalUnits();
		federalUnits.put(name, population);
	}

	@Override
	public void addIfNotExists(String name, Double population) {
		if (Objects.isNull(federalUnit.federalUnits().get(name))) {
			federalUnit.federalUnits().put(name, population);
		}
	}

	@Override
	public void printAllFederalUnit() {
		Iterator<Entry<String, Double>> iterator = federalUnit.federalUnits().entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<String, Double> unit = iterator.next();
			System.out.println("ESTADO: " + unit.getKey() + " - POPULAÇÃO: " + unit.getValue());
		}
	}

	@Override
	public void printSortedAscByName() {
		Map<String, Double> sortedMap = new TreeMap<>(federalUnit.federalUnits());
		sortedMap.entrySet()
				.forEach(unit -> System.out.println("ESTADO: " + unit.getKey() + " - POPULAÇÃO: " + unit.getValue()));
	}

}
