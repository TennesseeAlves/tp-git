package fr.uga.miage.l3;

import lombok.Getter;

import java.util.Map;

@Getter
public class PackageManager {
    public PackageManager() {
    }

    private String name = "fake-app";
    private String version = "9.9.9";
    private boolean isPrivate = true;

    private Map<String, String> dependencies = Map.of(
            "super-lib", "^1.0.0",
            "magic-framework", "~0.3.4"
    );

    private Map<String, String> devDependencies = Map.of(
            "hyper-compiler", "~2.1.0",
            "unicorn-types", "^4.0.0"
    );
}


