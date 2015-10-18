// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser;

import java.io.IOException;
import java.io.Reader;
import java.io.LineNumberReader;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class Version
{
    private static final Logger LOG;
    public static final String VERSION;
    
    static {
        LOG = Logger.getLogger(Version.class.getName());
        final LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(Version.class.getResourceAsStream("/version.txt")));
        while (true) {
            try {
                final String line = lineNumberReader.readLine();
                VERSION = line;
            }
            catch (IOException ex) {
                Version.LOG.warning(ex.getMessage());
                final String line = "unknown";
                continue;
            }
            break;
        }
    }
}
