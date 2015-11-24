// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.adm;

import android.os.Bundle;
import com.whatsapp.c2dm.b;
import android.content.Intent;
import com.whatsapp.util.Log;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.App;
import com.whatsapp.c2dm.a;
import com.amazon.device.messaging.ADM;
import android.content.Context;
import com.amazon.device.messaging.ADMMessageHandlerBase;

public class ADMMessageHandler extends ADMMessageHandlerBase
{
    public static boolean a;
    private static final String[] z;
    private final Context b;
    private final ADM c;
    private final a d;
    
    static {
        final String[] z2 = new String[16];
        String s = "\" ";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0432:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '=';
                        break;
                    }
                    case 0: {
                        c2 = 'N';
                        break;
                    }
                    case 1: {
                        c2 = 'T';
                        break;
                    }
                    case 2: {
                        c2 = '+';
                        break;
                    }
                    case 3: {
                        c2 = '\u0010';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "'0";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "'$";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "/8G\u007fJ\u00111S`T<1O";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u000f\u0010f?O+3BcI<5_yR {NbO!&\u00045N";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u000f\u0010f?O+3BcI<5_yR {NbO!&\u00045N";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u000f\u0001\u007fXx\u0000\u0000bS|\u001a\u001dd^b\b\u0015b\\x\n";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u001d\u0011yFt\r\u0011t^r\u001a\u000bjF|\u0007\u0018jRq\u000b";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0007\u001a}Qq\u0007\u0010tCx\u0000\u0010nB";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u000f\u0010f?O+3BcI+&Nt\u0012 1\\";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u000f\u0010f?O+3BcI+&Nt\u0012k'\u000bqM>\u0002NbN';E-\u0018*";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u000f\u0010f0O+%^uN:=Ew\u001d<1YuZ''_b\\:=D~\u0013";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u000f\u0010f0T=tYuZ''_uO+0\u000bqS*t|x\\:'j`Mn'NbK+&X0U/\"N0^!&Yu^:tYuZ''_b\\:=D~\u001d\u0007\u0010\u000bvR<tjTp`";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u000f\u0010f0N+:OyS)tGqI+'_0|\n\u0019\u000bbX)=XdO/ B\u007fS\u00070\u000bdRn\u0003CqI=\u0015[`\u001d>!Xx\u001d=1YfX<'\u0005";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "-;F>J&5_c\\>$\u0005qY#zjTp\u00031Xc\\)1cqS*8Nb";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "/0F";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    break Label_0432;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ADMMessageHandler() {
        this((Context)App.aq);
    }
    
    public ADMMessageHandler(final Context b) {
        final boolean a = ADMMessageHandler.a;
        super(ADMMessageHandler.z[14]);
        this.b = b;
        this.c = new ADM(b);
        this.d = new a(b);
        if (DialogToastActivity.h) {
            ADMMessageHandler.a = !a;
        }
    }
    
    private void a() {
        if (this.c.getRegistrationId() == null) {
            this.c.startRegister();
        }
    }
    
    private void a(final String s) {
        App.b(s, ADMMessageHandler.z[15]);
    }
    
    public void b(final String s) {
        final boolean a = ADMMessageHandler.a;
        if (this.c.getRegistrationId() == null) {
            Log.i(ADMMessageHandler.z[11]);
            this.a();
            if (!a) {
                return;
            }
        }
        if (s == null || !s.equals(this.c.getRegistrationId())) {
            Log.i(ADMMessageHandler.z[13]);
            this.a(this.c.getRegistrationId());
            if (!a) {
                return;
            }
        }
        Log.i(ADMMessageHandler.z[12]);
    }
    
    protected void onMessage(final Intent intent) {
        final boolean a = ADMMessageHandler.a;
        final Bundle extras = intent.getExtras();
        extras.getString(ADMMessageHandler.z[1]);
        extras.getString(ADMMessageHandler.z[2]);
        extras.getString(ADMMessageHandler.z[0]);
        extras.getBoolean(ADMMessageHandler.z[3]);
        com.whatsapp.c2dm.b.a(this.b, intent, false);
        if (a) {
            final boolean h = DialogToastActivity.h;
            boolean h2 = false;
            if (!h) {
                h2 = true;
            }
            DialogToastActivity.h = h2;
        }
    }
    
    protected void onRegistered(final String s) {
        if (s == null) {
            return;
        }
        final int a = this.d.a();
        Log.c(ADMMessageHandler.z[10], null, new Object[] { s, a });
        this.d.g();
        if (this.d.j() == null) {
            Log.i(ADMMessageHandler.z[9]);
            App.c((Context)this, 0);
        }
        this.d.a(s);
        if (a > 0) {
            this.d.a(a);
        }
        this.a(s);
    }
    
    protected void onRegistrationError(final String s) {
        if (s.equals(ADMMessageHandler.z[7])) {
            Log.c(ADMMessageHandler.z[4], null, new Object[] { s });
            this.d.d();
            this.a();
            if (!ADMMessageHandler.a) {
                return;
            }
        }
        if (s.equals(ADMMessageHandler.z[8]) || s.equals(ADMMessageHandler.z[6])) {
            Log.a(ADMMessageHandler.z[5], null, new Object[] { s });
            this.d.e();
            this.d.c();
        }
    }
    
    protected void onUnregistered(final String s) {
        this.d.e();
        this.d.c();
    }
}
