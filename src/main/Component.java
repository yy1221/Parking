package main;

public abstract class Component {
	protected int name;
	protected int totalnumber;
	protected int emptyspace;
	
//	public abstract void add(AbComponent a);	
//	public abstract void remove(AbComponent a) ;
	public abstract Ticket stopCar(Car car) throws NoPlaceException;
	public abstract Car getCar(Ticket t) throws NoCarException;
	public abstract void diplay(int depth);
    public abstract int getTotalnumber() ;
    public abstract int getEmptySpace(); 
    
}