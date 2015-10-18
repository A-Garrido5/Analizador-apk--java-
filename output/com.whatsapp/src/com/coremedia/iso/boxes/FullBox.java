// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

public interface FullBox extends Box
{
    int getFlags();
    
    int getVersion();
    
    void setFlags(final int p0);
    
    void setVersion(final int p0);
}
