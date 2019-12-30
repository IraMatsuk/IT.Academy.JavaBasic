package carFactory.parts.lock.api;

import carFactory.parts.key.api.AKey;

public interface ILock {
	boolean open(AKey key);
	boolean close(AKey key);
}
