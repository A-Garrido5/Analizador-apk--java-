// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.proto;

import com.google.fU;
import com.google.hA;
import com.google.ch;
import com.google.bl;
import com.google.by;

public final class E2E
{
    public static int a;
    private static by descriptor;
    private static final bl internal_static_com_whatsapp_proto_Message_SenderKeyDistributionMessage_descriptor;
    private static ch internal_static_com_whatsapp_proto_Message_SenderKeyDistributionMessage_fieldAccessorTable;
    private static final bl internal_static_com_whatsapp_proto_Message_descriptor;
    private static ch internal_static_com_whatsapp_proto_Message_fieldAccessorTable;
    private static final String[] z;
    
    static {
        final String[] array = new String[4];
        String s = "t[\u001dj7zM";
        int n = -1;
        String[] array2 = array;
        String[] z2 = array;
        int n2 = 0;
        String intern = null;
    Label_0269:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'G';
                        break;
                    }
                    case 0: {
                        c2 = '3';
                        break;
                    }
                    case 1: {
                        c2 = ')';
                        break;
                    }
                    case 2: {
                        c2 = 'r';
                        break;
                    }
                    case 3: {
                        c2 = '\u001f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array2[n2] = intern;
                    s = "rQ\u001ds(GE!z)WL\u0000T\"Jm\u001bl3A@\u0010j3ZF\u001cR\"@Z\u0013x\"";
                    n2 = 1;
                    array2 = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array2[n2] = intern;
                    s = "pF\u001ci\"AZ\u0013k.\\G";
                    n2 = 2;
                    array2 = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array2[n2] = intern;
                    s = "`L\u001c{\"Ab\u0017f\u0003ZZ\u0006m.Q\\\u0006v(]d\u0017l4RN\u0017";
                    n2 = 3;
                    array2 = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array2[n2] = intern;
                    z = z2;
                    array2 = (z2 = new String[] { null });
                    s = "9 \u0017-\"\u001dY\u0000p3\\;`|(^\u0007\u0005w&GZ\u0013o7\u001dY\u0000p3\\\u000b\u0097\u001eM4d\u0017l4RN\u0017\rS9%\u0011p)EL\u0000l&G@\u001dq_2\ts7N!Hx\u00004VG\u0016z5lB\u0017f\u0018W@\u0001k5ZK\u0007k.\\G-r\"@Z\u0013x\"++R\u001eo8\u001bJ1$\\D\\h/R]\u0001~7C\u0007\u0002m(GF\\R\"@Z\u0013x\"\u001dz\u0017q#V[9z>w@\u0001k5ZK\u0007k.\\G?z4@H\u0015z]R#nL\"]M\u0017m\fVP6v4G[\u001b}2G@\u001dq\nVZ\u0001~ V;b\u0015OT[\u001dj7l@\u0016\u0007F\u0013(Z\u0016U\u001c#U~?\\E\u001dk+lZ\u0017q#V[-t\"Jv\u0016v4G[\u001b}2G@\u001dq\u0018^L\u0001l&TLj\u001dg2\u0001~";
                    n = 3;
                    n2 = 0;
                    continue;
                }
                case 3: {
                    break Label_0269;
                }
            }
        }
        array2[n2] = intern;
        by.a(z2, new by[0], new E2E$1());
        internal_static_com_whatsapp_proto_Message_descriptor = getDescriptor().e().get(0);
        E2E.internal_static_com_whatsapp_proto_Message_fieldAccessorTable = new ch(E2E.internal_static_com_whatsapp_proto_Message_descriptor, new String[] { E2E.z[2], E2E.z[3] });
        internal_static_com_whatsapp_proto_Message_SenderKeyDistributionMessage_descriptor = E2E.internal_static_com_whatsapp_proto_Message_descriptor.g().get(0);
        E2E.internal_static_com_whatsapp_proto_Message_SenderKeyDistributionMessage_fieldAccessorTable = new ch(E2E.internal_static_com_whatsapp_proto_Message_SenderKeyDistributionMessage_descriptor, new String[] { E2E.z[0], E2E.z[1] });
    }
    
    static bl access$000() {
        return E2E.internal_static_com_whatsapp_proto_Message_descriptor;
    }
    
    static ch access$100() {
        return E2E.internal_static_com_whatsapp_proto_Message_fieldAccessorTable;
    }
    
    static by access$2002(final by descriptor) {
        return E2E.descriptor = descriptor;
    }
    
    static bl access$300() {
        return E2E.internal_static_com_whatsapp_proto_Message_SenderKeyDistributionMessage_descriptor;
    }
    
    static ch access$400() {
        return E2E.internal_static_com_whatsapp_proto_Message_SenderKeyDistributionMessage_fieldAccessorTable;
    }
    
    public static by getDescriptor() {
        return E2E.descriptor;
    }
    
    public static void registerAllExtensions(final fU fu) {
    }
}
