import parts.Cpu;
import parts.Hdd;
import parts.Ram;
import parts.api.IParts;
import standards.CpuStandard;
import standards.HddStandard;
import standards.RamStandard;
import standards.api.IStandard;

public class Main {

	public static void main(String[] args) {
		CpuStandard[] cpuStd = {CpuStandard.XEON, CpuStandard.ZEN}; 
		RamStandard[] ramStd = {RamStandard.DDR1, RamStandard.DDR2, RamStandard.DDR3};
		HddStandard[] hddStd = {HddStandard.SAS, HddStandard.SATA};
		IParts[] parts = {new Cpu(cpuStd), new Ram(ramStd), new Hdd(hddStd)};
		IStandard[] pcStandards = {CpuStandard.XEON, HddStandard.SATA, RamStandard.DDR2};
		Computer pc = new Computer(parts, pcStandards);

	}

}
