// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import org.whispersystems.at;
import org.whispersystems.V;
import com.whatsapp.proto.E2E$Message$Builder;
import java.util.Set;
import com.whatsapp.protocol.bi;
import org.whispersystems.jobqueue.a;
import com.whatsapp.jobqueue.job.SendE2EMessageJob;
import com.google.hv;
import org.whispersystems.aq;
import org.whispersystems.d;
import org.whispersystems.p;
import com.whatsapp.proto.E2E$Message;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import com.whatsapp.protocol.c6;
import com.whatsapp.protocol.cr;

class fz implements Runnable
{
    private static final String[] z;
    final cr a;
    final c6 b;
    final int c;
    final ie d;
    final int e;
    
    static {
        final String[] z2 = new String[21];
        String s = "^&!$`\fp!.q\u0004j\u0002#`X";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0557:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0004';
                        break;
                    }
                    case 0: {
                        c2 = 'e';
                        break;
                    }
                    case 1: {
                        c2 = '\u0006';
                        break;
                    }
                    case 2: {
                        c2 = 'H';
                        break;
                    }
                    case 3: {
                        c2 = 'J';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0004~'&k\u0011jh.a\tc<#j\u0002&;/w\u0016o'$$\u0001s-jp\n&:/c\fu<8e\u0011o'$$\fbh)l\u0004h//$\u0003i:j";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "^&!$`\fp!.q\u0004j\u0002#`X";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "^&/8k\u0010v\u0002#`X";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0004~'&k\u0011jh)k\u0010j,jj\nrh,m\u0002s:/$\ns<jl\fu<%v\feh-v\ns8ji\u0000k*/v\u0016n!:?Ek-9w\u0004a-do\u0000\u007fu";
                    n = 3;
                    n2 = 4;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0004~'&k\u0011jh)l\u0000e##j\u0002&/8k\u0010vh'a\bd-8w\ro8j`\u0010ch>kEt->v\u001c&:/g\u0000o8>?Em-39";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    s = "\u0004~'&k\u0011jh=m\tjh=e\frh>kEu-$`E";
                    n = 5;
                    n2 = 6;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    array = z2;
                    s = "Es&>m\t&)jj\u0000qh:v\u0000m-3$\rg;jf\u0000c&jb\u0000r+\"a\u0001";
                    n = 6;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\nt!-m\u000bg$ji\u0000u;+c\u0000& +wEd-/jEb-&a\u0011c,q$\bc;9e\u0002cf!a\u001c;";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "^&?+w,h\u000f8k\u0010v\t>P\fk-\u0005b(c;9e\u0002cu";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0004~'&k\u0011jh)l\u0000e##j\u0002&;/w\u0016o'$wE`'8$";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0004~'&k\u0011jh,k\u0010h,jj\n&8+v\u0011o+#t\u0004h<jl\u0004u q$\bc;9e\u0002cf!a\u001c;";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "^&!9G\u0010t:/j\u0011j1\u0003j\"t'?tX";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u0004~'&k\u0011jh)l\u0000e##j\u0002&+%j\u0001o<#k\u000buh,k\u0017&/8k\u0010vh8a\u0011t1jp\n&!$`\fp!.q\u0004jsji\u0000u;+c\u0000(#/}X";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u0004~'&k\u0011jh8a\u0014s!8m\u000bah$a\u0012&;/w\u0016o'$$\u0007c.%v\u0000&:/w\u0000h,#j\u0002=h'a\u0016u)-aKm-39";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u0004~'&k\u0011jh=m\tjh8a\u0006i:.$\u0011n-jf\u0004u-jo\u0000\u007fh?w\u0000bh>kEu-$`E";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "Eb=/$\u0011ih8a\u0011t1jv\u0000e-#t\u0011&.%vE";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u0004~'&k\u0011jh8a\u0016c&.m\u000bah-v\ns8ji\u0000u;+c\u0000=h'a\u0016u)-aKm-39";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "%uf=l\u0004r;+t\u0015(&/p";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "^&8+v\u0011o+#t\u0004h<w";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "^&!$`\fp!.q\u0004j\u0002#`X";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    break Label_0557;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    fz(final ie d, final cr a, final c6 b, final int c, final int e) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        Label_0710: {
            if (adc.b(this.b.a)) {
                final String a = this.a.a;
                final String d = this.a.d;
                Log.i(fz.z[5] + this.b + fz.z[3] + a + fz.z[2] + d);
                final atf a2 = adc.a(a);
                final boolean b = a2.a(d) != null;
                final bi a3 = App.ak.a(this.b);
                while (true) {
                    Label_1080: {
                        if (a3 == null) {
                            Log.w(fz.z[8] + this.b);
                            if (!i) {
                                break Label_1080;
                            }
                        }
                        if (TextUtils.isEmpty((CharSequence)a3.Q)) {
                            Log.w(fz.z[11] + this.b);
                            if (!i) {
                                break Label_1080;
                            }
                        }
                        boolean contains;
                        if (!TextUtils.equals((CharSequence)a2.m(), (CharSequence)a3.Q) || i) {
                            final Set f = App.ak.f(a, a3.Q);
                            if (f == null) {
                                Log.w(fz.z[4] + this.b);
                                if (!i) {
                                    break Label_1080;
                                }
                            }
                            contains = f.contains(d);
                        }
                        else {
                            contains = b;
                        }
                        Label_0699: {
                            if (b || contains) {
                                Log.i(fz.z[17] + this.b + fz.z[19] + d + fz.z[12] + b + fz.z[9] + contains);
                                final E2E$Message$Builder builder = E2E$Message.newBuilder();
                                if (b) {
                                    final byte[] a4 = new p(ie.a(this.d).a2.h()).a(new aq(a, ha.g(App.aX.jabber_id + fz.z[18]))).a();
                                    builder.getSenderKeyDistributionMessageBuilder().setGroupId(a);
                                    builder.getSenderKeyDistributionMessageBuilder().setAxolotlSenderKeyDistributionMessage(hv.a(a4));
                                }
                                if (contains) {
                                    builder.setConversation(a3.c());
                                }
                                final E2E$Message build = builder.build();
                                final V g = ha.g(d);
                                while (true) {
                                    Label_1074: {
                                        if (!ie.a(this.d).a2.a(g)) {
                                            break Label_1074;
                                        }
                                        Log.i(fz.z[13] + this.b + fz.z[0] + d);
                                        final at b2 = ie.a(this.d).a2.b(g);
                                        if (this.c < 2 && b2.b().p() == this.e) {
                                            break Label_1074;
                                        }
                                        Log.i(fz.z[14] + this.b + fz.z[20] + d);
                                        final byte[] l = b2.b().l();
                                        ie.a(this.d).aG.a(new SendE2EMessageJob(build, this.b.c, a, d, this.c, null, null, null, l));
                                        break Label_0699;
                                    }
                                    final byte[] l = null;
                                    continue;
                                }
                            }
                        }
                        App.b(this.a);
                        if (i) {
                            break Label_0710;
                        }
                        return;
                    }
                    boolean contains = false;
                    continue;
                }
            }
        }
        final V g2 = ha.g(this.b.a);
        Log.i(fz.z[10] + g2 + fz.z[16] + this.b);
        if (ie.a(this.d).a2.a(g2)) {
            final at b3 = ie.a(this.d).a2.b(g2);
            if (b3.b().p() != this.e) {
                Log.i(fz.z[1] + this.b);
                ie.a(this.d).a2.b(g2);
                ie.a(this.d).a2.a(g2);
                ie.a(this.d).a5().post((Runnable)new awg(this, true));
                return;
            }
            if (this.c > 2 && ie.a(this.d).a2.a(g2, this.b)) {
                Log.i(fz.z[6] + this.b + fz.z[7]);
                ie.a(this.d).a5().post((Runnable)new awg(this, true));
                return;
            }
            if (this.c == 2) {
                Log.i(fz.z[15] + this.b);
                ie.a(this.d).a2.a(this.b, b3.b().l());
            }
        }
        ie.a(this.d).a5().post((Runnable)new awg(this, false));
    }
}
