package fr.uga.miage.l3;

import lombok.Getter;

import java.util.Map;

@Getter
public class PackageManager {

    private final String name = "ng-app";
    private final String version = "2.0.0";
    private final boolean isPrivate = true;

    private final Map<String, String> dependencies = Map.of(
            "@angular/forms", "^20.5.0",
            "@angular/core", "^21.0.0",
            "zone.js", "~0.15.2",
            "lodash", "^4.17.21",
            "dayjs", "^1.11.10"
    );

    private final Map<String, String> devDependencies = Map.of(
            "@angular/build", "^20.3.0",
            "@angular/cli", "^21.0.0",
            "typescript", "~5.8.0",
            "eslint", "^9.0.0",
            "prettier", "^3.2.0"
    );
}