// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.location.LocationManager;

class su implements Runnable
{
    private static final String[] z;
    final LocationPicker2 a;
    
    static {
        final String[] z2 = new String[3];
        String s = ">8V";
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
                        c2 = 'Z';
                        break;
                    }
                    case 0: {
                        c2 = 'Y';
                        break;
                    }
                    case 1: {
                        c2 = 'H';
                        break;
                    }
                    case 2: {
                        c2 = '%';
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
                    s = "5'F\f.0'K";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "7-Q\u001a5+#";
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
    
    su(final LocationPicker2 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        LocationPicker2.b(this.a, true);
        if (LocationPicker2.y(this.a) != null && LocationPicker2.k(this.a) == null) {
            LocationPicker2.a(this.a, LocationPicker2.y(this.a), Math.max((int)LocationPicker2.y(this.a).getAccuracy(), 100), null, true);
        }
        if (LocationPicker2.y(this.a) == null || LocationPicker2.y(this.a).getAccuracy() > 200.0f) {
            final LocationManager locationManager = (LocationManager)this.a.getSystemService(su.z[1]);
            if (!locationManager.isProviderEnabled(su.z[0]) || !locationManager.isProviderEnabled(su.z[2])) {
                this.a.showDialog(2);
            }
        }
    }
}
