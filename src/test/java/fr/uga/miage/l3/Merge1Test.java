package fr.uga.miage.l3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Merge1Test {

    @Test
    void goodMerge(){
        Assertions.assertTrue((new PackageManager()).isPrivate());
    }
}
