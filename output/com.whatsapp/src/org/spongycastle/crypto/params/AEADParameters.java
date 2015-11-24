// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.params;

import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.crypto.CipherParameters;

public class AEADParameters implements CipherParameters
{
    private byte[] associatedText;
    private KeyParameter key;
    private int macSize;
    private byte[] nonce;
    
    public AEADParameters(final KeyParameter keyParameter, final int n, final byte[] array) {
        this(keyParameter, n, array, null);
    }
    
    public AEADParameters(final KeyParameter key, final int macSize, final byte[] nonce, final byte[] associatedText) {
        final boolean a = ParametersWithIV.a;
        this.key = key;
        this.nonce = nonce;
        this.macSize = macSize;
        this.associatedText = associatedText;
        if (BaseKeyGenerator.a) {
            ParametersWithIV.a = !a;
        }
    }
    
    public byte[] getAssociatedText() {
        return this.associatedText;
    }
    
    public KeyParameter getKey() {
        return this.key;
    }
    
    public int getMacSize() {
        return this.macSize;
    }
    
    public byte[] getNonce() {
        return this.nonce;
    }
}
