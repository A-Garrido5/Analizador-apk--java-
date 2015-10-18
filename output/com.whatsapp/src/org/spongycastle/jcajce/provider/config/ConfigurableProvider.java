// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.config;

public interface ConfigurableProvider
{
    void addAlgorithm(final String p0, final String p1);
    
    boolean hasAlgorithm(final String p0, final String p1);
}
