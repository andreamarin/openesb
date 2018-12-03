/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tstholamundo;

/**
 *
 * @author andreamarin
 */
public class TstHolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        javax.xml.ws.Holder<java.lang.String> p = new javax.xml.ws.Holder<java.lang.String>();
        holamundoca.HolaMundoCAService1 service = new holamundoca.HolaMundoCAService1();
        holamundoca.HolaMundoWSDLPortType port = service.getCasaPort1();
        
        for (int i = 0; i < 1000; i++) {
            p.value = ""+i;
            port.holaMundoWSDLOperation(p);
            System.out.println(i+" ... resultado: "+p.value);
            
        }
        
    }

    private static void holaMundoWSDLOperation() {
        holamundoca.HolaMundoCAService1 service = new holamundoca.HolaMundoCAService1();
        holamundoca.HolaMundoWSDLPortType port = service.getCasaPort1();
        
    }
    
    
    
    
}
