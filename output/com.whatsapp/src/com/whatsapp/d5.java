// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.location.LocationManager;

class d5 implements Runnable
{
    private static final String[] z;
    final LocationPicker a;
    
    static {
        final String[] z2 = new String[3];
        String s = ";UT";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001a';
                        break;
                    }
                    case 0: {
                        c2 = '\\';
                        break;
                    }
                    case 1: {
                        c2 = '%';
                        break;
                    }
                    case 2: {
                        c2 = '\'';
                        break;
                    }
                    case 3: {
                        c2 = 'e';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "0JD\u0004n5JI";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "2@S\u0012u.N";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    d5(final LocationPicker a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        LocationPicker.b(this.a, true);
        if (LocationPicker.j(this.a) != null && LocationPicker.a(this.a) == null) {
            LocationPicker.a(this.a, LocationPicker.j(this.a), Math.max((int)LocationPicker.j(this.a).getAccuracy(), 100), null, true);
        }
        if (LocationPicker.j(this.a) == null || LocationPicker.j(this.a).getAccuracy() > 200.0f) {
            final LocationManager locationManager = (LocationManager)this.a.getSystemService(d5.z[1]);
            if (!locationManager.isProviderEnabled(d5.z[0]) || !locationManager.isProviderEnabled(d5.z[2])) {
                this.a.showDialog(2);
            }
        }
    }
}
