// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import com.whatsapp.vp;
import de.greenrobot.event.m;
import java.util.concurrent.atomic.AtomicReference;

final class bt extends AtomicReference
{
    bt(final String s) {
        super(s);
        m.b().a(this);
    }
    
    public void onEvent(final vp vp) {
        final boolean l = Log.l;
        String string = null;
        Label_0044: {
            Label_0064: {
                switch (vp.d()) {
                    case -1: {
                        string = "D";
                        if (l) {
                            break Label_0064;
                        }
                        break Label_0044;
                    }
                    case 0: {
                        string = "M";
                        if (l) {
                            break Label_0064;
                        }
                        break Label_0044;
                    }
                    case 1: {
                        string = "W";
                        if (l) {
                            break;
                        }
                        break Label_0044;
                    }
                }
            }
            string = Integer.toString(vp.d());
        }
        this.set(string);
    }
}
