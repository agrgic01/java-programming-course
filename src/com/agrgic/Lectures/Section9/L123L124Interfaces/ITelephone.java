package com.agrgic.Lectures.Section9.L123L124Interfaces;

public interface ITelephone {
    void powerOn();

    void dial(int phoneNumber);

    void answer();

    boolean callPhone(int phoneNumber);

    boolean isRinging();
}
