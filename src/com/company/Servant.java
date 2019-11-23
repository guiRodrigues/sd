package com.company;

import java.rmi.*;

public class Servant implements RemoteInterface {
    public int foo() {
        return 7;
    }
}
