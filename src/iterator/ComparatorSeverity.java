package iterator;

import java.util.Comparator;

import adapter.InvertedIterator;
import domain.Symptom;

public class ComparatorSeverity implements Comparator{

	@Override
	public int compare(Object sintoma1, Object sintoma2) {
		Symptom s1= (Symptom)sintoma1;
		Symptom s2= (Symptom)sintoma2;
		return s1.getSeverityIndex()-s2.getSeverityIndex();
	}

	

}
