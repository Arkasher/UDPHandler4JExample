package com.yan.udphandler4jexample.packets;

import com.yan.udphandler4j.packets.PacketHandler;

/**
 *
 * @author Yan
 */
public class PacketUtils {
    
    /**
     * Registra o próprio pacote para ser tratado no servidor
     */
    public static void register() {
        PacketHandler.registerJavaPackage(Package.getPackage("com.yan.udphandler4jexample.packets"));
    }
    
}
