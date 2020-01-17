package parts;

import parts.api.IParts;
import standards.HddStandard;

public class Hdd implements IParts{
	private HddStandard[] hddStd;
	
	public Hdd(HddStandard[] hddStd) {
		this.hddStd = hddStd;
	}

}
