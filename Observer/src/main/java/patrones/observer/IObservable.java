package patrones.observer;

public interface IObservable {
    
    public void notityAllObserver(String command, Object source);
    
    public void addObserver(IObserver observer);
    
    public void removeObserver(IObserver observer);
}
