// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.SharedPreferences;
import com.whatsapp.notification.a2;
import com.whatsapp.fieldstats.b9;
import com.whatsapp.fieldstats.a5;
import com.whatsapp.fieldstats.ab;
import android.net.Uri;
import java.util.ArrayList;
import java.io.File;
import android.content.Context;
import com.whatsapp.util.Log;
import android.os.Environment;
import android.util.Pair;
import android.os.AsyncTask;

public class aj extends AsyncTask
{
    private static final String[] z;
    private long a;
    private String b;
    final DescribeProblemActivity c;
    private long d;
    
    static {
        final String[] z2 = new String[34];
        String s = "lqL\u00034avZ\u00104gvS\u0005+iwK\t0a`FO#p`Z\u0012(ixL\u0014)zuX\u0005iib^\t*(qG\u0014#zz^\ff{`P\u0012'oq\u001f\u000e)|4\\\u0001*kaS\u00012mp\u0013@5|uK\u0005{";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0882:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'F';
                        break;
                    }
                    case 0: {
                        c2 = '\b';
                        break;
                    }
                    case 1: {
                        c2 = '\u0014';
                        break;
                    }
                    case 2: {
                        c2 = '?';
                        break;
                    }
                    case 3: {
                        c2 = '`';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "e{J\u000e2mp";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "e{J\u000e2mp`\u0012)";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "lqL\u00036z{]O%gzI?6gdJ\u0010{";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "k{RN1`uK\u0013'xd`\u00104mrZ\u0012#fwZ\u0013";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "lqL\u00036z{]O%gzI?(g`V\u0006?5";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "xfV\u0016'km`\f'{``\u0013#mz";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "lqL\u00036z{]O%gzI?*asW\u0014\u0019k{S\u000f45";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    s = "NRy&\u0000N";
                    n = 7;
                    n2 = 8;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    array = z2;
                    s = "lqL\u00036z{]O!z{J\u0010\u0019f{K\t q)";
                    n = 8;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "xfV\u0016'km`\u00104grV\f#WdW\u000f2g";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "lqL\u00036z{]O!z{J\u0010\u0019~}]\u0012'|q`\f#fsK\b{";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "lqL\u00036z{]O6z}IO*igK]";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "zq^\u0004\u0019zq\\\u0005/x`L?#fu]\f#l";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "f{K\t qKI\t$zuK\u0005\u0019dqQ\u00072`";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "lqL\u00036z{]O6z}IO6aw\u0002";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "lqL\u00036z{]O6z}IO5|uK\u001555";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "lqL\u00036z{]O!z{J\u0010\u0019x{O\u001565";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "lqL\u00036z{]O!z{J\u0010\u0019d}X\b25";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "f{K\t qKS\t!``";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    s = "lqL\u00036z{]O+}`Z]";
                    n = 19;
                    n2 = 20;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    array = z2;
                    s = "xfV\u0016'km`\u00132i`J\u0013";
                    n = 20;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "NRy&\u0000N";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "ofP\u00156WzP\u0014/nm`\u0016/jf^\u0014#WxZ\u000e!||";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "lqL\u00036z{]O6z}IO4mu[\u0012#kqV\u00102{)";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "f{K\t qKS\t!```\u0003)d{M";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "ofP\u00156WzP\u0014/nm`\f/o|K?%gxP\u0012";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "eaK\u0005\u0019azY\u000f";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "lqL\u00036z{]O%gzI?0avM\u00012mKS\u0005(o`W]";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "lqL\u00036z{]O%gzI?*asW\u0014{";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "f{K\t qKM\t(o`P\u000e#";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "lqL\u00036z{]O!z{J\u0010\u0019d}X\b2WwP\f)z)";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "ofP\u00156WzP\u0014/nm`\u0014)fq";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "ofP\u00156WzP\u0014/nm`\f/o|K";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    break Label_0882;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    protected aj(final DescribeProblemActivity c) {
        this.c = c;
    }
    
    protected Pair a(final Void[] array) {
        this.d = App.u();
        this.b = Environment.getExternalStorageState();
        Label_0092: {
            if (aj.z[1].equals(this.b) || aj.z[2].equals(this.b)) {
                this.a = App.C();
                if (!App.I) {
                    break Label_0092;
                }
            }
            this.a = -2L;
            Log.i(aj.z[0] + this.b);
        }
        Log.i(a8q.a((Context)this.c, DescribeProblemActivity.a(this.c), DescribeProblemActivity.d(this.c), null, true, this.a, this.d, this.b));
        Log.j();
        Log.i();
        final File d = a8q.d();
        Object b = null;
        if (d == null) {
            b = a8q.b();
        }
        return new Pair(b, (Object)d);
    }
    
    protected void a(final Pair pair) {
        final boolean i = App.I;
        final String s = (String)pair.first;
        final File file = (File)pair.second;
        this.c.removeDialog(1);
        final ArrayList<Uri> list = new ArrayList<Uri>();
        final Uri[] c = DescribeProblemActivity.c(this.c);
        final int length = c.length;
        int j = 0;
        while (j < length) {
            final Uri uri = c[j];
            if (uri != null) {
                list.add(uri);
            }
            ++j;
            if (i) {
                break;
            }
        }
        DescribeProblemActivity.f(this.c).j = (double)ab.EMAIL_SEND.getCode();
        a5.a((Context)this.c, DescribeProblemActivity.f(this.c));
        a8q.a(this.c, DescribeProblemActivity.a(this.c), DescribeProblemActivity.b(this.c).getText().toString().trim(), list, DescribeProblemActivity.d(this.c), s, file, this.a, this.d, this.b);
        DescribeProblemActivity.a(this.c, (aj)null);
        this.c.finish();
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((Pair)o);
    }
    
    protected void onPreExecute() {
        this.c.showDialog(1);
        final SharedPreferences sharedPreferences = this.c.getSharedPreferences(aj.z[4], 0);
        Log.i(aj.z[17] + a2.b().a(qc.GROUP));
        Log.i(aj.z[3] + a2.b().a(qc.INDIVIDUAL));
        Log.i(aj.z[9] + sharedPreferences.getString(aj.z[32], (String)null));
        Log.i(aj.z[5] + sharedPreferences.getString(aj.z[30], (String)null));
        Log.i(aj.z[18] + sharedPreferences.getBoolean(aj.z[33], true));
        Log.i(aj.z[29] + sharedPreferences.getBoolean(aj.z[19], true));
        Log.i(aj.z[31] + sharedPreferences.getString(aj.z[26], aj.z[22]));
        Log.i(aj.z[7] + sharedPreferences.getString(aj.z[25], aj.z[8]));
        Log.i(aj.z[11] + sharedPreferences.getString(aj.z[23], "1"));
        Log.i(aj.z[28] + sharedPreferences.getString(aj.z[14], "1"));
        Log.i(aj.z[12] + SettingsPrivacy.a(sharedPreferences.getInt(aj.z[6], 0)));
        Log.i(aj.z[15] + SettingsPrivacy.a(sharedPreferences.getInt(aj.z[10], 0)));
        Log.i(aj.z[16] + SettingsPrivacy.a(sharedPreferences.getInt(aj.z[21], 0)));
        Log.i(aj.z[24] + sharedPreferences.getBoolean(aj.z[13], true));
        Log.i(aj.z[20] + sharedPreferences.getString(aj.z[27], ""));
    }
}
