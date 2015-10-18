// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;

class a6e implements Runnable
{
    private static final String[] z;
    final String a;
    final VoiceService$VoiceServiceEventCallback b;
    final int c;
    
    static {
        final String[] z2 = new String[2];
        String s = "d\u0012b\u001eqx";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
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
                        c2 = '\u0016';
                        break;
                    }
                    case 1: {
                        c2 = 'w';
                        break;
                    }
                    case 2: {
                        c2 = '\u0003';
                        break;
                    }
                    case 3: {
                        c2 = 'm';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "|\u001eg";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    a6e(final VoiceService$VoiceServiceEventCallback b, final String a, final int c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public void run() {
        final Intent intent = new Intent((Context)App.aq, (Class)VoipNotAllowedActivity.class);
        intent.putExtra(a6e.z[1], this.a);
        intent.putExtra(a6e.z[0], this.c);
        intent.setFlags(268435456);
        this.b.this$0.startActivity(intent);
    }
}
