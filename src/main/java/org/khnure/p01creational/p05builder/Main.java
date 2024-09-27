package org.khnure.p01creational.p05builder;

import org.khnure.p01creational.p05builder.University.UniversityBuilder;

public class Main {

    University khNURE =
            new University("ITM, RT, KN",
                    1000,
                    100,
                    "tech",
                    "PM, EK, PI",
                    "A, N, B",
                    "I. Ruban",
                    "V.A. Doroshenko");

    University khPI =
            new University("ITM, RT, KN",
                    1000,
                    100,
                    "tech",
                    "PM, EK, PI",
                    "A, N, B",
                    "I. Ruban",
                    "V.A. Doroshenko");


    new UniUniversityBuilder();
}
