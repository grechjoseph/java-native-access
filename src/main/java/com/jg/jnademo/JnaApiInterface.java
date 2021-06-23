package com.jg.jnademo;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

/**
 * Java Interface over Native Library.
 */
public interface JnaApiInterface extends Library {

    /**
     * The Default instance to intiatie the instance, selecting msvcrt.dll if Windows, otherwise C library.
     */
    JnaApiInterface INSTANCE = Native.load((Platform.isWindows() ? "msvcrt" : "c"), JnaApiInterface.class);

    /**
     * A Method reflecting the same method name and arguments in the Native Library being interfaced.
     */
    void printf(String format, Object... args);

    double cosh(double value);

}
