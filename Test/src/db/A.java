package db;

import java.io.Serializable;

class X {
}

class Z implements Serializable {

    X i = new X();
}

class A extends Z {

    A r = new A();
}
