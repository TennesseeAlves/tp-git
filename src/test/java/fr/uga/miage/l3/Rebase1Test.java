package fr.uga.miage.l3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Rebase1Test {

    @Test
    void goodRebase1(){
        Assertions.assertEquals("3.5.1",(new PackageManager()).getVersion());
    }
}
