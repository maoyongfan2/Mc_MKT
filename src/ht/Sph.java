
package ht;

import com.android.chimpchat.adb.AdbBackend;
import com.android.ddmlib.AndroidDebugBridge;
import com.android.ddmlib.IDevice;

public class Sph{
	static AndroidDebugBridge bridge;
	    public static IDevice[] a(int i){
	    if(i==1)
	    	AndroidDebugBridge.init(false);
		 bridge=AndroidDebugBridge.createBridge("adb.exe",true);
		try{
			Thread.sleep(200L);
		}catch (InterruptedException e) {}
		IDevice[] device=bridge.getDevices();
		return device;

	 
	}
	
}