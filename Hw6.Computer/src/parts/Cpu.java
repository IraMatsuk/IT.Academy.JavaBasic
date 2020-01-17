package parts;

import parts.api.IParts;
import standards.CpuStandard;

public class Cpu implements IParts{
	private CpuStandard[] cpuStd;
	
	public Cpu(CpuStandard[] cpuStd) {	
		this.cpuStd = cpuStd;
	}
}