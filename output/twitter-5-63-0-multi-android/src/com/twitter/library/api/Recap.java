// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.util.HashMap;
import java.util.ArrayList;

public class Recap
{
    public final ArrayList a;
    public final HashMap b;
    public final Recap$Metadata c;
    
    public Recap(final ArrayList a, final HashMap b, final Recap$Metadata c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void a(final long entityId, final String scribeComponent, final HashMap scribeItemExtras) {
        this.c.entityId = entityId;
        this.c.scribeComponent = scribeComponent;
        this.c.scribeItemExtras = scribeItemExtras;
    }
}
