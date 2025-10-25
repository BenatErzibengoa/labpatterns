package iterator;

import java.util.LinkedList;
import java.util.List;

import adapter.InvertedIterator;
import domain.Symptom;

public class Covid19PatientInvertedIterator implements InvertedIterator{
	List<Symptom> sintomak= new LinkedList<Symptom>();
	int pos =0;
	public Covid19PatientInvertedIterator(List<Symptom> s) {
		this.sintomak=s;
	}
	@Override
	public Object previous() {
		Symptom itzuli= sintomak.get(pos);
		pos=pos-1;
		return itzuli;
	}

	@Override
	public boolean hasPrevious() {
		
		return pos>=0;
	}

	@Override
	public void goLast() {
		pos= sintomak.size()-1;
	}

}
