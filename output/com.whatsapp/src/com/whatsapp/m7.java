// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import android.os.HandlerThread;
import android.os.Handler;
import android.database.ContentObserver;

public class m7 extends ContentObserver
{
    private static int b;
    private static int d;
    private static boolean f;
    private static final String[] z;
    private final Runnable a;
    private final Runnable c;
    private final Handler e;
    
    static {
        final String[] z2 = new String[14];
        int n = 0;
        String[] array = z2;
        String s = "-@d\u000b@&N}VV>_VUE+IlWR LlV";
        int n2 = -1;
        String intern = null;
    Label_0369:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '7';
                        break;
                    }
                    case 0: {
                        c2 = 'N';
                        break;
                    }
                    case 1: {
                        c2 = '/';
                        break;
                    }
                    case 2: {
                        c2 = '\t';
                        break;
                    }
                    case 3: {
                        c2 = '%';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n2) {
                default: {
                    array[n] = intern;
                    s = "-@gQV-[VSR<\\`JY";
                    n = 1;
                    array = z2;
                    n2 = 0;
                    continue;
                }
                case 0: {
                    array[n] = intern;
                    s = "-@gQV-[VSR<\\`JY";
                    n = 2;
                    array = z2;
                    n2 = 1;
                    continue;
                }
                case 1: {
                    array[n] = intern;
                    n = 3;
                    array = z2;
                    s = "n\u0007yWR8\u0012";
                    n2 = 2;
                    continue;
                }
                case 2: {
                    array[n] = intern;
                    n = 4;
                    s = "-@gQV-[&JU=J{SR<\u0000z@C8J{V^!AzPZaIhL[+K";
                    n2 = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n] = intern;
                    n = 5;
                    s = "-@gQV-[&JU=J{SR<\u0000z@C8J{V^!A4";
                    n2 = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n] = intern;
                    n = 6;
                    s = "-@d\u000b@&N}VV>_VUE+IlWR LlV";
                    n2 = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n] = intern;
                    n = 7;
                    s = "=VgFh JlAR*";
                    n2 = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n] = intern;
                    n = 8;
                    s = "nIhL[+K";
                    n2 = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n] = intern;
                    s = "-@d\u000b@&N}VV>_VUE+IlWR LlV";
                    n2 = 8;
                    n = 9;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n] = intern;
                    n = 10;
                    array = z2;
                    s = "=VgFh JlAR*";
                    n2 = 9;
                    continue;
                }
                case 9: {
                    array[n] = intern;
                    n = 11;
                    s = ">]lCDa\\pKT;_mDC+\u000f";
                    n2 = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n] = intern;
                    n = 12;
                    s = "-@gQV-[&JU=J{SR<\u0000zN^>\u0000aJ[*xaL[+njFX;A}vN L";
                    n2 = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n] = intern;
                    n = 13;
                    s = "=VgF";
                    n2 = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    break Label_0369;
                }
            }
        }
        array[n] = intern;
        z = z2;
        m7.b = -1;
    }
    
    public m7() {
        super((Handler)null);
        this.a = new c_(this);
        this.c = new go(this);
        final HandlerThread handlerThread = new HandlerThread(m7.z[13], 10);
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper());
    }
    
    static Runnable a(final m7 m7) {
        return m7.a;
    }
    
    private void a(final boolean b, final boolean b2) {
        final boolean i = App.I;
        final SharedPreferences sharedPreferences = App.aq.getSharedPreferences(m7.z[9], 0);
        if (sharedPreferences != null) {
            final int int1 = sharedPreferences.getInt(m7.z[7], 0);
            int n = 0;
            Label_0120: {
                if (b2) {
                    Label_0105: {
                        switch (int1) {
                            default: {
                                n = 1;
                                break;
                            }
                            case 0: {
                                return;
                            }
                            case 2: {
                                n = 0;
                                if (i) {
                                    break Label_0105;
                                }
                                break;
                            }
                            case 1: {
                                if (!b) {
                                    return;
                                }
                                n = 0;
                                if (i) {
                                    return;
                                }
                                break;
                            }
                        }
                    }
                    if (!i) {
                        break Label_0120;
                    }
                }
                if (!b || i) {
                    if (int1 == 1) {
                        return;
                    }
                    n = 2;
                }
                else {
                    n = 1;
                }
            }
            if (!sharedPreferences.edit().putInt(m7.z[10], n).commit()) {
                Log.e(m7.z[11] + n + m7.z[8]);
            }
        }
    }
    
    private void b() {
        synchronized (this) {
            this.e.removeCallbacks(this.c);
            this.e.post(this.c);
        }
    }
    
    static void b(final m7 m7) {
        m7.b();
    }
    
    public int a() {
        if (m7.b == -1) {
            m7.b = App.aq.getSharedPreferences(m7.z[0], 0).getInt(m7.z[1], 0);
        }
        return m7.b;
    }
    
    public void a(final int b) {
        final int a = this.a();
        Log.i(m7.z[5] + b + m7.z[3] + a + ")");
        if (a != b) {
            m7.b = b;
            final SharedPreferences$Editor edit = App.aq.getSharedPreferences(m7.z[6], 0).edit();
            edit.putInt(m7.z[2], b);
            if (!edit.commit()) {
                Log.e(m7.z[4]);
            }
        }
    }
    
    public void a(final boolean b) {
        // monitorenter(this)
        Label_0040: {
            if (!b) {
                break Label_0040;
            }
            try {
                if (m7.d == 0) {
                    m7.f = true;
                    App.aq.getContentResolver().unregisterContentObserver((ContentObserver)this);
                }
                ++m7.d;
                if (App.I) {
                    --m7.d;
                    if (m7.d == 0) {
                        m7.f = false;
                        App.aq.a5().postDelayed((Runnable)new dp(this), 5000L);
                    }
                }
            }
            finally {
            }
            // monitorexit(this)
        }
    }
    
    public void b(final boolean b) {
        this.a(b, false);
    }
    
    public void c(final boolean b) {
        this.a(b, true);
    }
    
    public void onChange(final boolean b) {
        if (App.aX != null) {
            if (!m7.f) {
                this.b();
                return;
            }
            Log.i(m7.z[12]);
        }
    }
}
