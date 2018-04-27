/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiclient;

import java.rmi.RMISecurityManager;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Andrew
 */
public class ClientSide {
    
    private ClientSide(){}
    // WHEN LEFT - WHY DOES HE HAVE INTERFACES IN A PROJECT EACH, 4 PROJECTS TOTAL? ARE THESE STUBS N SKELETONS?
    public static void main(String[] args)
    {
        
    
        
        //   HERE WHEN LEFT MoST RECENT. I THINK MAYBE CLIENT SHOULDNT EVEN USE INTERFACE? SO THE CAST BELOW IS WRONG?
        
        try
        {
            Registry cRegistry = LocateRegistry.getRegistry("127.0.0.1", 1099);
            ServerRemoteInterface stub1 = (ServerRemoteInterface)cRegistry.lookup("aCalculation");
            
            System.out.println("blh is: " + stub1.addUp(2, 5));
        }
        catch(Exception exept)
                {
                    exept.printStackTrace();
                }
    }
}
