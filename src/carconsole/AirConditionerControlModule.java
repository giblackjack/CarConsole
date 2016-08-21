/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carconsole;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.zu.ardulink.*;
/**
 *
 * @author STIVY
 */
public class AirConditionerControlModule {

    private final Link boardLink;
    
    public AirConditionerControlModule(CarConsoleGUI parent) {
        this.boardLink = Link.getDefaultInstance();
        /*List<String> portList = boardLink.getPortList(); // 2
        if (portList != null && portList.size() > 0) {
            String port = portList.get(0);
            System.out.println("Connecting on port: " + port);
            boolean connected = boardLink.connect(port); // 3
            System.out.println("Connected:" + connected);
            try {
                Thread.sleep(2000); // 4
            } catch (InterruptedException ex) {
                Logger.getLogger(AirConditionerControlModule.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/

         parent.boardConnected(boardLink.isConnected());
        }
    
    protected void sendInstructions(String message){
        //boardLink.sendCustomMessage(message);
        System.out.println(message);
    }
    
}
/*
Code	Arduino pin	Action
999	--	Close all output pins
Servo		
10-90	5	Control servo angle 0-90 deg.
Vents		
190	6	Face vent
191	7	Face and feet vents
192	8	Feet vent
193	9	Feet and windows vents
194	10	Windows vents
195	--	All vents offs
Airflow		
196	11	Circulate air inside
197	12	Circulate air from outside
AC		
198	13	AC on
199	--	AC off
Fan		
300		Fan Off. AC Off
325	A1	Fan speed 1 (min)
350	A2	Fan speed 2
375	A3	Fan speed 3
400	A4	Fan speed 4 (max)
*/