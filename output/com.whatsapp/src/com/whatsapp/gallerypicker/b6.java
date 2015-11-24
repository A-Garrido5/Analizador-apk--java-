// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.widget.ImageView$ScaleType;
import com.whatsapp.util.av;
import java.io.IOException;
import java.io.FileNotFoundException;
import com.whatsapp.util.Log;
import com.whatsapp.util.br;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;

class b6 extends AsyncTask
{
    private static final String[] z;
    final Uri a;
    final ImagePreview$ThumbImageView b;
    final int c;
    
    static {
        final String[] z2 = new String[4];
        String s = "m)4`gt60qka3ztgp1'n";
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
                        c2 = '\u0002';
                        break;
                    }
                    case 0: {
                        c2 = '\u0004';
                        break;
                    }
                    case 1: {
                        c2 = 'D';
                        break;
                    }
                    case 2: {
                        c2 = 'U';
                        break;
                    }
                    case 3: {
                        c2 = '\u0007';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "m)4`gt60qka3ztgp1'n";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "m)4`gt60qka3ztgp1'n";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "m)4`gt60qka3ztgp1'n";
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
    
    b6(final ImagePreview$ThumbImageView b, final Uri a, final int c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    protected Bitmap a(final Void[] array) {
        try {
            final Bitmap a = br.a(this.a, this.c, this.c);
            br.a(ImagePreview$ThumbImageView.a(this.b), a);
            return a;
        }
        catch (FileNotFoundException ex) {
            Log.b(b6.z[2], ex);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            Log.b(b6.z[0], outOfMemoryError);
            goto Label_0044;
        }
        catch (IOException ex2) {
            Log.b(b6.z[3], ex2);
            goto Label_0044;
        }
        catch (av av) {
            Log.b(b6.z[1], av);
            goto Label_0044;
        }
    }
    
    protected void a(final Bitmap imageBitmap) {
        if (imageBitmap != null) {
            this.b.setScaleType(ImageView$ScaleType.CENTER_CROP);
            this.b.setBackgroundResource(0);
            this.b.setImageBitmap(imageBitmap);
            if (MediaGalleryBase.v == 0) {
                return;
            }
        }
        this.b.setScaleType(ImageView$ScaleType.CENTER);
        this.b.setBackgroundColor(this.b.getResources().getColor(2131623999));
        this.b.setImageResource(2130838808);
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((Bitmap)o);
    }
}
