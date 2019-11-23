package com.company;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public static void main(String args[]) {

        System.setProperty("java.security.policy","./hello.policy");

        System.setSecurityManager(new SecurityManager());

        try{
            RemoteInterface refServente = new Servant();
            RemoteInterface stub = (RemoteInterface)
                    UnicastRemoteObject.exportObject(refServente, 0);
            Naming.rebind("Apelido_do_Servico", refServente);
            System.out.println("Servidor em execucao");
        } catch(Exception e) {
            System.out.println("ShapeList server main " + e.getMessage());
        }

    }
}
