package com.company;

import java.rmi.*;

public interface RemoteInterface extends Remote {
    public int foo() throws RemoteException;
}
