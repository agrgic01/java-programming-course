package com.agrgic.CodingExercises.CE47Interface;

import java.util.List;

public interface ISaveable {

    List<String> write();

    void read(List<String> savedValues);

} // "ISaveable" interface
