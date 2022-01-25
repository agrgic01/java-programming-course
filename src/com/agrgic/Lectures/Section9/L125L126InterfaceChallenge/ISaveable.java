package com.agrgic.Lectures.Section9.L125L126InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {

    List<String> write();

    void read(List<String> savedValues);

} // ISaveable interface
