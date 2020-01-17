package parts;

import parts.api.IParts;
import standards.RamStandard;

public class Ram implements IParts{
	private RamStandard[] ramStd;
	
	public Ram(RamStandard[] ramStd) {
		this.ramStd = ramStd;
	}
}
