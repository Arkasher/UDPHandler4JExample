package com.yan.udphandler4jexample.packets;

import com.yan.udphandler4j.packets.Packet;
import java.net.DatagramPacket;

public class MyPacket extends Packet {

    private int id;
    
    /**
     * Pode ser substituido por return id, porém é aconselhável atribuir um valor para o pacote
     * @return 
     */
    @Override
    public int getId() {
        return 3;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void handle(DatagramPacket datagramPacket) {
        
    }
    
}