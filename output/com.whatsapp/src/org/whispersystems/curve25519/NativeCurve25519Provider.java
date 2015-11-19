// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

class NativeCurve25519Provider implements at
{
    private static Throwable b;
    private static boolean c;
    private e a;
    
    static {
        NativeCurve25519Provider.c = false;
        NativeCurve25519Provider.b = null;
        final char[] charArray = "jZ`|o;\u001a';3".toCharArray();
        final int length = charArray.length;
        int n = 0;
        while (true) {
            Label_0047: {
                if (length > n) {
                    break Label_0047;
                }
                final String intern = new String(charArray).intern();
                try {
                    System.loadLibrary(intern);
                    NativeCurve25519Provider.c = true;
                    return;
                    char c = '\0';
                    Label_0123: {
                        c = '\n';
                    }
                    // switch([Lcom.strobel.decompiler.ast.Label;@66e97c63, n % 5)
                    final char c2;
                    Label_0088: {
                        break Label_0088;
                        Label_0109:
                        c = '/';
                        break Label_0088;
                        Label_0116:
                        c = '\u0012';
                        break Label_0088;
                        c2 = charArray[n];
                        Label_0102:
                        c = '\t';
                        break Label_0088;
                        Label_0084:
                        c = '\n';
                    }
                    charArray[n] = (char)(c ^ c2);
                    ++n;
                }
                catch (UnsatisfiedLinkError unsatisfiedLinkError) {}
                catch (SecurityException ex) {
                    goto Label_0132;
                }
            }
        }
    }
    
    NativeCurve25519Provider() {
        this.a = new v();
        if (!NativeCurve25519Provider.c) {
            throw new ai(NativeCurve25519Provider.b);
        }
        try {
            this.smokeCheck(31337);
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            throw new ai(unsatisfiedLinkError);
        }
    }
    
    private native boolean smokeCheck(final int p0);
    
    @Override
    public void a(final e a) {
        this.a = a;
    }
    
    @Override
    public byte[] a() {
        return this.generatePrivateKey(this.a(32));
    }
    
    @Override
    public byte[] a(final int n) {
        final byte[] array = new byte[n];
        this.a.a(array);
        return array;
    }
    
    @Override
    public boolean b() {
        return true;
    }
    
    @Override
    public native byte[] calculateAgreement(final byte[] p0, final byte[] p1);
    
    @Override
    public native byte[] calculateSignature(final byte[] p0, final byte[] p1, final byte[] p2);
    
    @Override
    public native byte[] generatePrivateKey(final byte[] p0);
    
    @Override
    public native byte[] generatePublicKey(final byte[] p0);
    
    @Override
    public native boolean verifySignature(final byte[] p0, final byte[] p1, final byte[] p2);
}
