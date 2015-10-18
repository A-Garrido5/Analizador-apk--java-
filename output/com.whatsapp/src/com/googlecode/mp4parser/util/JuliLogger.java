// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.util;

import java.util.logging.Level;

public class JuliLogger extends Logger
{
    java.util.logging.Logger logger;
    
    public JuliLogger(final String s) {
        this.logger = java.util.logging.Logger.getLogger(s);
    }
    
    @Override
    public void logDebug(final String s) {
        this.logger.log(Level.FINE, s);
    }
    
    @Override
    public void logError(final String s) {
        this.logger.log(Level.SEVERE, s);
    }
    
    @Override
    public void logWarn(final String s) {
        this.logger.log(Level.WARNING, s);
    }
}
