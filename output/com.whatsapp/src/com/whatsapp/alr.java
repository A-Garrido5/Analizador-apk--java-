// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.ObjectStreamClass;
import java.io.InputStream;
import java.io.ObjectInputStream;

class alr extends ObjectInputStream
{
    private static final String z;
    final bi a;
    
    static {
        final char[] charArray = "\u000f@\u001co \u0004N\u000526\u001c__5$".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'W';
                    break;
                }
                case 0: {
                    c2 = 'l';
                    break;
                }
                case 1: {
                    c2 = '/';
                    break;
                }
                case 2: {
                    c2 = 'q';
                    break;
                }
                case 3: {
                    c2 = 'A';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    alr(final bi a, final InputStream inputStream) {
        this.a = a;
        super(inputStream);
    }
    
    @Override
    protected ObjectStreamClass readClassDescriptor() {
        ObjectStreamClass objectStreamClass = super.readClassDescriptor();
        if (alr.z.equals(objectStreamClass.getName())) {
            objectStreamClass = ObjectStreamClass.lookup(EmojiPicker$EmojiWeight.class);
        }
        return objectStreamClass;
    }
}
