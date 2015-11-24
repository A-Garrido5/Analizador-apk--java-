// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.content;

import android.support.v4.app.FragmentActivity;
import android.net.Uri;
import java.io.IOException;
import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;

class FileProvider$SimplePathStrategy implements FileProvider$PathStrategy
{
    private static final String[] z;
    private final String mAuthority;
    private final HashMap mRoots;
    
    static {
        final String[] z2 = new String[5];
        String s = "7\u0004\u001e{?\u0015E\u0003xz\u0003\u0000\u0004x6\u0007\u0000Wt;\u001f\n\u0019~9\u0010\tWg;\u0005\rWq5\u0003E";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
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
                        c2 = 'q';
                        break;
                    }
                    case 1: {
                        c2 = 'e';
                        break;
                    }
                    case 2: {
                        c2 = 'w';
                        break;
                    }
                    case 3: {
                        c2 = '\u0017';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "$\u000b\u0016u6\u0014E\u0003xz\u0017\f\u0019sz\u0012\n\u0019q3\u0016\u0010\u0005r>Q\u0017\u0018x.Q\u0003\u0018ez";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "#\u0000\u0004x6\u0007\u0000\u00137*\u0010\u0011\u001f70\u0004\b\u0007r>Q\u0007\u0012n5\u001f\u0001Wt5\u001f\u0003\u001ep/\u0003\u0000\u00137(\u001e\n\u0003";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "?\u0004\u001arz\u001c\u0010\u0004cz\u001f\n\u000378\u0014E\u0012z*\u0005\u001c";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "7\u0004\u001e{?\u0015E\u0003xz\u0003\u0000\u0004x6\u0007\u0000Wt;\u001f\n\u0019~9\u0010\tWg;\u0005\rWq5\u0003E";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public FileProvider$SimplePathStrategy(final String mAuthority) {
        this.mRoots = new HashMap();
        this.mAuthority = mAuthority;
    }
    
    public void addRoot(final String s, final File file) {
        try {
            if (TextUtils.isEmpty((CharSequence)s)) {
                throw new IllegalArgumentException(FileProvider$SimplePathStrategy.z[3]);
            }
        }
        catch (IOException ex) {
            throw ex;
        }
        try {
            this.mRoots.put(s, file.getCanonicalFile());
        }
        catch (IOException ex2) {
            throw new IllegalArgumentException(FileProvider$SimplePathStrategy.z[4] + file, ex2);
        }
    }
    
    @Override
    public File getFileForUri(final Uri uri) {
        final boolean a = ContextCompat.a;
        final String encodedPath = uri.getEncodedPath();
        final int index = encodedPath.indexOf(47, 1);
        final String decode = Uri.decode(encodedPath.substring(1, index));
        final String decode2 = Uri.decode(encodedPath.substring(index + 1));
        final File file = this.mRoots.get(decode);
        if (file == null) {
            try {
                throw new IllegalArgumentException(FileProvider$SimplePathStrategy.z[1] + uri);
            }
            catch (IOException ex) {
                throw ex;
            }
        }
        final File file2 = new File(file, decode2);
        File canonicalFile;
        try {
            canonicalFile = file2.getCanonicalFile();
            try {
                if (!canonicalFile.getPath().startsWith(file.getPath())) {
                    throw new SecurityException(FileProvider$SimplePathStrategy.z[2]);
                }
            }
            catch (IOException ex2) {
                throw ex2;
            }
        }
        catch (IOException ex5) {
            throw new IllegalArgumentException(FileProvider$SimplePathStrategy.z[0] + file2);
        }
        while (true) {
            while (true) {
                Label_0219: {
                    try {
                        if (FragmentActivity.a != 0) {
                            if (!a) {
                                break Label_0219;
                            }
                            final boolean a2 = false;
                            ContextCompat.a = a2;
                        }
                        return canonicalFile;
                    }
                    catch (IOException ex3) {
                        try {
                            throw ex3;
                        }
                        catch (IOException ex4) {
                            throw ex4;
                        }
                    }
                }
                final boolean a2 = true;
                continue;
            }
        }
    }
}
