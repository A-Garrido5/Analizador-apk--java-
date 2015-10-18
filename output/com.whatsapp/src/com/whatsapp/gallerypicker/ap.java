// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import java.text.Collator;
import java.util.Map;
import java.util.Comparator;

class ap implements Comparator
{
    private static final String[] z;
    final GalleryPickerFragment a;
    
    static {
        final String[] z2 = new String[4];
        String s = "\t6&%K\u001f.7qq3? 4K";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '8';
                        break;
                    }
                    case 0: {
                        c2 = '^';
                        break;
                    }
                    case 1: {
                        c2 = '^';
                        break;
                    }
                    case 2: {
                        c2 = 'G';
                        break;
                    }
                    case 3: {
                        c2 = 'Q';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\t6&%K\u001f.7qq3? 4K";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\t6&%K\u001f.7qn7:\">";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\t6&%K\u001f.7qn7:\">";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    ap(final GalleryPickerFragment a) {
        this.a = a;
    }
    
    public int a(final Map.Entry entry, final Map.Entry entry2) {
        int n = -1;
        final int v = MediaGalleryBase.v;
        final Collator instance = Collator.getInstance();
        instance.setStrength(0);
        instance.setDecomposition(1);
        int compare = instance.compare(entry.getValue(), entry2.getValue());
        if (compare != 0) {
            if (ap.z[1].equals(entry.getValue())) {
                if (v == 0) {
                    return n;
                }
                compare = n;
            }
            if (ap.z[0].equals(entry2.getValue())) {
                if (v == 0) {
                    return 1;
                }
                compare = 1;
            }
            if (ap.z[2].equals(entry.getValue())) {
                if (v == 0) {
                    return n;
                }
            }
            else {
                n = compare;
            }
            if (ap.z[3].equals(entry2.getValue())) {
                n = 1;
            }
            return n;
        }
        return compare;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((Map.Entry)o, (Map.Entry)o2);
    }
}
