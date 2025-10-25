package iterator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import adapter.InvertedIterator;
import adapter.Sorting;
import domain.Covid19Pacient;
import domain.Symptom;
import factory.FactorySymptom;

	public class Main {

		public static void main(String[] args) {
			FactorySymptom fs= new FactorySymptom();
			Covid19Pacient p=new Covid19Pacient("Ane", 29,fs);
			p.addSymptom(new Symptom("s1", 10, 20), 1);
			p.addSymptom(new Symptom("s2", 10, 11), 2);
			p.addSymptom(new Symptom("s3", 10, 14), 3);
			p.addSymptom(new Symptom("s4", 10, 5), 4);
			p.addSymptom(new Symptom("s5", 10, 21), 5);
			List<Symptom> sintomaList= new LinkedList<>();
			Iterator i=p.iterator();
			while(i.hasNext()) {
				Symptom sintoma= (Symptom)i.next();
				System.out.println(sintoma);
				sintomaList.add(sintoma);
			}
			System.out.println("Hasierako Lista:"+ sintomaList);
			Comparator comparatorName= new ComparatorName();
			Comparator comparatorSeverity= new ComparatorSeverity();
			InvertedIterator it= new Covid19PatientInvertedIterator(sintomaList);
			i=Sorting.sortedIterator(it, comparatorName);
			System.out.println("Comparator name");
			while(i.hasNext())
				System.out.println(i.next());
			System.out.println("Comparator severity");
			i=Sorting.sortedIterator(it, comparatorSeverity);
			while(i.hasNext())
				System.out.println(i.next());

		}

	}

