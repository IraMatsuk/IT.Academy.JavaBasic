package carFactory.parts.lock.api;

import carFactory.parts.key.api.AKey;

public abstract class ALock implements ILock {
	private boolean lock = true;
	
	public boolean open(AKey key) {
		if(lock) {
			this.lock = false;
			return true;
		} else {
			throw new IllegalArgumentException("Can not open lock twice!");
		}
	}
	
	public boolean close(AKey key) {
		if(!lock) {
			this.lock = true;
			return true;
		} else {
			throw new IllegalArgumentException("Can not close lock twice!");
		}
	}
}
