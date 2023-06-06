import java.util.*;

public class Concessionaria implements Subject {
	private ArrayList observers;
	private String carro;
	private String moto;
	
	public Concessionaria() {
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(carro, moto);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(String carro, String moto) {
		this.moto = moto;
		this.carro = carro;
	}
	
	public String getMoto() {
		return moto;
	}
	
	public String getCarro() {
		return carro;
	}

    @Override
    public void setConcessionaria(String moto, String carro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setConcessionaria'");
    }
}
