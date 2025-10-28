package factory;

import domain.Covid19Pacient;
import domain.Medicament;

public class Main {

	public static void main(String[] args) {
		FactorySymptom fs= FactorySymptom.getInstance();
		Covid19Pacient p1=new Covid19Pacient("aitor", 35,fs);
		new PacientSymptomGUI(p1);
		new MedicalGUI(new Medicament("Ibuprofeno",fs));

	}

}
