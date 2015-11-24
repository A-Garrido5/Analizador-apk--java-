// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;

class c5 implements Runnable
{
    private static final String[] z;
    final GoogleDriveService a;
    
    static {
        final String[] z2 = new String[3];
        String s = "Ig\u0003\nFK.\u0002\u0006BXj\u0012\u0006\u001fFb\u001f\u0007\\K.\u0018\rDKm\u0005";
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
                        c2 = '0';
                        break;
                    }
                    case 0: {
                        c2 = '.';
                        break;
                    }
                    case 1: {
                        c2 = '\u0003';
                        break;
                    }
                    case 2: {
                        c2 = 'q';
                        break;
                    }
                    case 3: {
                        c2 = 'c';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Ig\u0003\nFK.\u0002\u0006BXj\u0012\u0006\u001fFb\u001f\u0007\\K.\u0018\rDKm\u0005";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "Ig\u0003\nFK.\u0002\u0006BXj\u0012\u0006\u001fFb\u001f\u0007\\K.\u0018\rDKm\u0005";
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
    
    c5(final GoogleDriveService a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        Label_0015: {
            if (GoogleDriveService.w() >= 0L) {
                break Label_0015;
            }
            GoogleDriveService.e(System.currentTimeMillis());
            try {
                GoogleDriveService.d(this.a).d();
                GoogleDriveService.d(this.a).b(GoogleDriveService.n(this.a));
                System.currentTimeMillis();
            }
            catch (br br) {
                Log.b(c5.z[2], br);
            }
            catch (bc bc) {
                this.a.e(11);
                Log.b(c5.z[0], bc);
            }
            catch (be be) {
                this.a.e(15);
                Log.b(c5.z[1], be);
            }
            finally {
                GoogleDriveService.d(this.a).b(false);
            }
        }
    }
}
