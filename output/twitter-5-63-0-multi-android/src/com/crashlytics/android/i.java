// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import java.io.IOException;

final class i extends IOException
{
    private static final long serialVersionUID = -6947486886997889499L;
    
    i() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}
