// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.net.Uri;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;

class ut extends AsyncTask
{
    private static final String z;
    private final int a;
    final VoiceService b;
    private final a_9 c;
    final int d;
    
    static {
        final char[] charArray = "}sK\u001b{|~r\u0007q{\u007fK\u0000}nbD\u0006p".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001e';
                    break;
                }
                case 0: {
                    c2 = '\u000f';
                    break;
                }
                case 1: {
                    c2 = '\u0016';
                    break;
                }
                case 2: {
                    c2 = '-';
                    break;
                }
                case 3: {
                    c2 = 'i';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public ut(final VoiceService b, final a_9 c, final int a, final int d) {
        this.b = b;
        this.d = d;
        this.c = c;
        this.a = a;
    }
    
    protected Bitmap a(final Void[] array) {
        return this.c.a(this.a, (float)this.d, true);
    }
    
    protected void a(final Bitmap bitmap) {
        this.b.startService(new Intent(ut.z, (Uri)null, (Context)this.b, (Class)VoiceService.class));
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((Bitmap)o);
    }
}
