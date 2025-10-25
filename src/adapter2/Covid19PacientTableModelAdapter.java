package adapter2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	  protected Covid19Pacient pacient;
	  protected String[] columnNames =
	    new String[] {"Symptom", "Weight" };

	  public Covid19PacientTableModelAdapter(Covid19Pacient p) {
	    this.pacient=p;
	  }

	  public int getColumnCount() {
	    // Challenge!
		 return 2;
	  }

	  public String getColumnName(int i) {
	    // Challenge!
		  return columnNames[i];
	
	  }

	  public int getRowCount() {
	    // Challenge!
		  return pacient.getSymptoms().size();
	  }

	  public Object getValueAt(int row, int col) {
	    Set<Symptom> listaSymptom= pacient.getSymptoms();
	    Object[] sintomak= listaSymptom.toArray();
	    Symptom sintoma;
	    switch(col) {
    	case 0:
    		return ((Symptom)sintomak[row]).getName();
    	case 1:
    		 sintoma=(Symptom)sintomak[row];
    		return pacient.getWeight(sintoma);
    	default:
    		return null;
    	}
	  }
	}
