// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.jobqueue.requirement;

import com.whatsapp.ha;
import java.io.InvalidObjectException;
import android.text.TextUtils;
import java.io.ObjectInputStream;
import com.whatsapp.a_9;
import com.whatsapp.adc;
import com.whatsapp.aol;
import com.whatsapp.App;
import org.whispersystems.jobqueue.requirements.e;
import com.whatsapp.jobqueue.b;

public final class AxolotlSessionRequirement implements b, e
{
    private static final long serialVersionUID = 1L;
    private static final String[] z;
    private transient App a;
    private final String jid;
    
    static {
        final String[] z2 = new String[3];
        String s = "#u8Cs<o(Cp&h|\u0001{iy1\u0013j0";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001e';
                        break;
                    }
                    case 0: {
                        c2 = 'I';
                        break;
                    }
                    case 1: {
                        c2 = '\u001c';
                        break;
                    }
                    case 2: {
                        c2 = '\\';
                        break;
                    }
                    case 3: {
                        c2 = 'c';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "#u8Cs<o(C|,<=\r> r8\nh x)\u0002riv5\u0007%iv5\u0007#";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "#u8Cs<o(C|,<=\r> r8\nh x)\u0002riv5\u0007%iv5\u0007#";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public AxolotlSessionRequirement(final String s) {
        this.jid = (String)aol.a((CharSequence)s);
        while (true) {
            if (!adc.b(s)) {
                try {
                    if (a_9.h(s)) {
                        throw new IllegalArgumentException(AxolotlSessionRequirement.z[2] + s);
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                return;
            }
            continue;
        }
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            if (TextUtils.isEmpty((CharSequence)this.jid)) {
                throw new InvalidObjectException(AxolotlSessionRequirement.z[0]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            Label_0054: {
                if (adc.b(this.jid)) {
                    break Label_0054;
                }
                try {
                    if (a_9.h(this.jid)) {
                        throw new InvalidObjectException(AxolotlSessionRequirement.z[1] + this.jid);
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
    }
    
    public String a() {
        return this.jid;
    }
    
    @Override
    public void a(final App a) {
        this.a = a;
    }
    
    @Override
    public boolean a() {
        return this.a.a2.a(ha.g(this.jid));
    }
}
