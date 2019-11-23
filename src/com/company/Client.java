package com.company;

import java.rmi.Naming;

public class Client {
    public static void main(String args[]) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        } else System.out.println("Já há um gerenciador de Seg");
        RemoteInterface refRemota = null;
        try {
            refRemota = (RemoteInterface)
                    Naming.lookup("end/apelido");
            System.out.println("Found server");
            System.out.println("Returned value: " + refRemota.foo());
        } catch (Exception e) {
            System.out.println("error...");
        }
    }
}
