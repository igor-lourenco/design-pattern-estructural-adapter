package estructural.adapter.tvPort;

import estructural.adapter.tvPort.adapters.HDMIToOldMonitorAdapter;
import estructural.adapter.tvPort.adapters.HDMIToVGAAdapter;
import estructural.adapter.tvPort.devices.Computer;
import estructural.adapter.tvPort.devices.OldMonitor;
import estructural.adapter.tvPort.devices.TV;

public class Client {

    public static void main(String[] args) {
	Computer pc = new Computer();
	TV tv = new TV();
	pc.connectPort(tv);
	pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");

	System.out.println("------ Monitor ----------");

	Computer pc2 = new Computer();
	OldMonitor monitor = new OldMonitor();
//	 pc2.connectPort(monitor.getConnector()); // não funciona!  por isso que criamos o adaptador
	pc2.connectPort(new HDMIToVGAAdapter(monitor)); // implementação usando objeto como parametro
	pc2.sendImageAndSound("Cat and rainbow", "Nyan cat song");

	System.out.println("------ Monitor Class Adapter ----------");

	Computer pc3 = new Computer();
	HDMIToOldMonitorAdapter monitorAdaptee = new HDMIToOldMonitorAdapter(); // implementação usando classe com herança como parametro
	pc3.connectPort(monitorAdaptee);
	pc3.sendImageAndSound("Cat and rainbow", "Nyan cat song");
    }
}