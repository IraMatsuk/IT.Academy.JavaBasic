package carFactory.parts.engine.api;

public abstract class AEngine implements IEngine{
	private String id;
	private int capacity;
    //private FuelType fuelType;
    private boolean running = false;

    @Override
    public String getId() {
    	return this.id;
    }
    //FuelType getFuelType();
    @Override
    public int getCapacity() {
    	return this.capacity;   	
    }

    @Override
    public boolean start(){
        if(!running){
            running = true;
        } else {
            throw new IllegalArgumentException("Can't start running engine");
        }
        return running;
    }
    
    @Override
    public boolean stop(){
        if(running){
            running = false;
        } else {
            throw new IllegalArgumentException("Can't stop stopping engine");
        }
        return running;
    }
    
    @Override
    public double running(){
        if(running){
            //TODO add random
            return 2;
        }
        return 0;
    }
}
