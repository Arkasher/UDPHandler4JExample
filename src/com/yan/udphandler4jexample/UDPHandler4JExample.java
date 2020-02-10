package com.yan.udphandler4jexample;

import com.yan.udphandler4j.UDPHandler4J;
import com.yan.udphandler4jexample.packets.PacketUtils;

/**
 * Projeto exemplo para executar o servidor
 * @author Yan
 */
public class UDPHandler4JExample {

    /**
     * O método de registrar os Packets deve ser chamado diretamente por uma classe que está dentro do mesmo
     * Como o exemplo abaixo: o método register está dentro do pacote com.yan.udphandler4jexample.packets
     * @param args 
     */
    public static void main(String[] args) {
        PacketUtils.register();
        
        UDPHandler4J.run(args);
    }
}
