// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Rect;
import android.content.Intent;
import android.view.View;
import android.content.Context;
import com.whatsapp.util.co;

public class a0e extends co
{
    private static final String z;
    private Context b;
    private String c;
    
    static {
        final char[] charArray = "cc>".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'W';
                    break;
                }
                case 0: {
                    c2 = '\t';
                    break;
                }
                case 1: {
                    c2 = '\n';
                    break;
                }
                case 2: {
                    c2 = 'Z';
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
    
    public a0e(final String c, final Context b) {
        this.c = c;
        this.b = b;
    }
    
    @Override
    public void a(final View view) {
        final Intent intent = new Intent(this.b, (Class)QuickContactActivity.class);
        final int[] array = new int[2];
        view.getLocationOnScreen(array);
        final Rect sourceBounds = new Rect();
        sourceBounds.left = (int)(0.5f + 1.0f * array[0]);
        sourceBounds.top = (int)(0.5f + 1.0f * array[1]);
        sourceBounds.right = (int)(0.5f + 1.0f * (array[0] + view.getWidth()));
        sourceBounds.bottom = (int)(0.5f + 1.0f * (array[1] + view.getHeight()));
        intent.setSourceBounds(sourceBounds);
        intent.putExtra(a0e.z, this.c);
        this.b.startActivity(intent);
    }
}
