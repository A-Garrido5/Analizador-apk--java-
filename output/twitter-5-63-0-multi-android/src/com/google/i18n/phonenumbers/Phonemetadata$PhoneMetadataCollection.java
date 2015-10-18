// 
// Decompiled by Procyon v0.5.30
// 

package com.google.i18n.phonenumbers;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.util.ArrayList;
import java.util.List;
import java.io.Externalizable;

public class Phonemetadata$PhoneMetadataCollection implements Externalizable
{
    private static final long serialVersionUID = 1L;
    private List metadata_;
    
    public Phonemetadata$PhoneMetadataCollection() {
        this.metadata_ = new ArrayList();
    }
    
    public List a() {
        return this.metadata_;
    }
    
    public int b() {
        return this.metadata_.size();
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        for (int int1 = objectInput.readInt(), i = 0; i < int1; ++i) {
            final Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = new Phonemetadata$PhoneMetadata();
            phonemetadata$PhoneMetadata.readExternal(objectInput);
            this.metadata_.add(phonemetadata$PhoneMetadata);
        }
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        final int b = this.b();
        objectOutput.writeInt(b);
        for (int i = 0; i < b; ++i) {
            ((Phonemetadata$PhoneMetadata)this.metadata_.get(i)).writeExternal(objectOutput);
        }
    }
}
