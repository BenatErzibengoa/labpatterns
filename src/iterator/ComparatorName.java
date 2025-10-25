package iterator;

import java.util.Comparator;

import domain.Symptom;

public class ComparatorName implements Comparator{

	@Override
	public int compare(Object sintoma1, Object sintoma2) {
		Symptom s1= (Symptom)sintoma1;
		Symptom s2= (Symptom)sintoma2;
		return s1.getName().compareTo(s2.getName());
	}

}
