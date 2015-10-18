// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.h264.model;

import com.googlecode.mp4parser.h264.write.CAVLCWriter;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import com.googlecode.mp4parser.h264.read.CAVLCReader;
import java.io.InputStream;

public class PictureParameterSet extends BitstreamElement
{
    public int[] bottom_right;
    public int chroma_qp_index_offset;
    public boolean constrained_intra_pred_flag;
    public boolean deblocking_filter_control_present_flag;
    public boolean entropy_coding_mode_flag;
    public PPSExt extended;
    public int num_ref_idx_l0_active_minus1;
    public int num_ref_idx_l1_active_minus1;
    public int num_slice_groups_minus1;
    public int pic_init_qp_minus26;
    public int pic_init_qs_minus26;
    public boolean pic_order_present_flag;
    public int pic_parameter_set_id;
    public boolean redundant_pic_cnt_present_flag;
    public int[] run_length_minus1;
    public int seq_parameter_set_id;
    public boolean slice_group_change_direction_flag;
    public int slice_group_change_rate_minus1;
    public int[] slice_group_id;
    public int slice_group_map_type;
    public int[] top_left;
    public int weighted_bipred_idc;
    public boolean weighted_pred_flag;
    
    public static PictureParameterSet read(final InputStream inputStream) throws IOException {
        final CAVLCReader cavlcReader = new CAVLCReader(inputStream);
        final PictureParameterSet set = new PictureParameterSet();
        set.pic_parameter_set_id = cavlcReader.readUE("PPS: pic_parameter_set_id");
        set.seq_parameter_set_id = cavlcReader.readUE("PPS: seq_parameter_set_id");
        set.entropy_coding_mode_flag = cavlcReader.readBool("PPS: entropy_coding_mode_flag");
        set.pic_order_present_flag = cavlcReader.readBool("PPS: pic_order_present_flag");
        set.num_slice_groups_minus1 = cavlcReader.readUE("PPS: num_slice_groups_minus1");
        if (set.num_slice_groups_minus1 > 0) {
            set.slice_group_map_type = cavlcReader.readUE("PPS: slice_group_map_type");
            set.top_left = new int[1 + set.num_slice_groups_minus1];
            set.bottom_right = new int[1 + set.num_slice_groups_minus1];
            set.run_length_minus1 = new int[1 + set.num_slice_groups_minus1];
            if (set.slice_group_map_type == 0) {
                for (int i = 0; i <= set.num_slice_groups_minus1; ++i) {
                    set.run_length_minus1[i] = cavlcReader.readUE("PPS: run_length_minus1");
                }
            }
            else if (set.slice_group_map_type == 2) {
                for (int j = 0; j < set.num_slice_groups_minus1; ++j) {
                    set.top_left[j] = cavlcReader.readUE("PPS: top_left");
                    set.bottom_right[j] = cavlcReader.readUE("PPS: bottom_right");
                }
            }
            else if (set.slice_group_map_type == 3 || set.slice_group_map_type == 4 || set.slice_group_map_type == 5) {
                set.slice_group_change_direction_flag = cavlcReader.readBool("PPS: slice_group_change_direction_flag");
                set.slice_group_change_rate_minus1 = cavlcReader.readUE("PPS: slice_group_change_rate_minus1");
            }
            else if (set.slice_group_map_type == 6) {
                int n;
                if (1 + set.num_slice_groups_minus1 > 4) {
                    n = 3;
                }
                else if (1 + set.num_slice_groups_minus1 > 2) {
                    n = 2;
                }
                else {
                    n = 1;
                }
                final int ue = cavlcReader.readUE("PPS: pic_size_in_map_units_minus1");
                set.slice_group_id = new int[ue + 1];
                for (int k = 0; k <= ue; ++k) {
                    set.slice_group_id[k] = cavlcReader.readU(n, "PPS: slice_group_id [" + k + "]f");
                }
            }
        }
        set.num_ref_idx_l0_active_minus1 = cavlcReader.readUE("PPS: num_ref_idx_l0_active_minus1");
        set.num_ref_idx_l1_active_minus1 = cavlcReader.readUE("PPS: num_ref_idx_l1_active_minus1");
        set.weighted_pred_flag = cavlcReader.readBool("PPS: weighted_pred_flag");
        set.weighted_bipred_idc = (int)cavlcReader.readNBit(2, "PPS: weighted_bipred_idc");
        set.pic_init_qp_minus26 = cavlcReader.readSE("PPS: pic_init_qp_minus26");
        set.pic_init_qs_minus26 = cavlcReader.readSE("PPS: pic_init_qs_minus26");
        set.chroma_qp_index_offset = cavlcReader.readSE("PPS: chroma_qp_index_offset");
        set.deblocking_filter_control_present_flag = cavlcReader.readBool("PPS: deblocking_filter_control_present_flag");
        set.constrained_intra_pred_flag = cavlcReader.readBool("PPS: constrained_intra_pred_flag");
        set.redundant_pic_cnt_present_flag = cavlcReader.readBool("PPS: redundant_pic_cnt_present_flag");
        if (cavlcReader.moreRBSPData()) {
            set.extended = new PPSExt();
            set.extended.transform_8x8_mode_flag = cavlcReader.readBool("PPS: transform_8x8_mode_flag");
            if (cavlcReader.readBool("PPS: pic_scaling_matrix_present_flag")) {
                int n2 = 0;
                while (true) {
                    int n3;
                    if (set.extended.transform_8x8_mode_flag) {
                        n3 = 1;
                    }
                    else {
                        n3 = 0;
                    }
                    if (n2 >= 6 + n3 * 2) {
                        break;
                    }
                    if (cavlcReader.readBool("PPS: pic_scaling_list_present_flag")) {
                        set.extended.scalindMatrix.ScalingList4x4 = new ScalingList[8];
                        set.extended.scalindMatrix.ScalingList8x8 = new ScalingList[8];
                        if (n2 < 6) {
                            set.extended.scalindMatrix.ScalingList4x4[n2] = ScalingList.read(cavlcReader, 16);
                        }
                        else {
                            set.extended.scalindMatrix.ScalingList8x8[n2 - 6] = ScalingList.read(cavlcReader, 64);
                        }
                    }
                    ++n2;
                }
            }
            set.extended.second_chroma_qp_index_offset = cavlcReader.readSE("PPS: second_chroma_qp_index_offset");
        }
        cavlcReader.readTrailingBits();
        return set;
    }
    
    public static PictureParameterSet read(final byte[] array) throws IOException {
        return read(new ByteArrayInputStream(array));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null) {
                return false;
            }
            if (this.getClass() != o.getClass()) {
                return false;
            }
            final PictureParameterSet set = (PictureParameterSet)o;
            if (!Arrays.equals(this.bottom_right, set.bottom_right)) {
                return false;
            }
            if (this.chroma_qp_index_offset != set.chroma_qp_index_offset) {
                return false;
            }
            if (this.constrained_intra_pred_flag != set.constrained_intra_pred_flag) {
                return false;
            }
            if (this.deblocking_filter_control_present_flag != set.deblocking_filter_control_present_flag) {
                return false;
            }
            if (this.entropy_coding_mode_flag != set.entropy_coding_mode_flag) {
                return false;
            }
            if (this.extended == null) {
                if (set.extended != null) {
                    return false;
                }
            }
            else if (!this.extended.equals(set.extended)) {
                return false;
            }
            if (this.num_ref_idx_l0_active_minus1 != set.num_ref_idx_l0_active_minus1) {
                return false;
            }
            if (this.num_ref_idx_l1_active_minus1 != set.num_ref_idx_l1_active_minus1) {
                return false;
            }
            if (this.num_slice_groups_minus1 != set.num_slice_groups_minus1) {
                return false;
            }
            if (this.pic_init_qp_minus26 != set.pic_init_qp_minus26) {
                return false;
            }
            if (this.pic_init_qs_minus26 != set.pic_init_qs_minus26) {
                return false;
            }
            if (this.pic_order_present_flag != set.pic_order_present_flag) {
                return false;
            }
            if (this.pic_parameter_set_id != set.pic_parameter_set_id) {
                return false;
            }
            if (this.redundant_pic_cnt_present_flag != set.redundant_pic_cnt_present_flag) {
                return false;
            }
            if (!Arrays.equals(this.run_length_minus1, set.run_length_minus1)) {
                return false;
            }
            if (this.seq_parameter_set_id != set.seq_parameter_set_id) {
                return false;
            }
            if (this.slice_group_change_direction_flag != set.slice_group_change_direction_flag) {
                return false;
            }
            if (this.slice_group_change_rate_minus1 != set.slice_group_change_rate_minus1) {
                return false;
            }
            if (!Arrays.equals(this.slice_group_id, set.slice_group_id)) {
                return false;
            }
            if (this.slice_group_map_type != set.slice_group_map_type) {
                return false;
            }
            if (!Arrays.equals(this.top_left, set.top_left)) {
                return false;
            }
            if (this.weighted_bipred_idc != set.weighted_bipred_idc) {
                return false;
            }
            if (this.weighted_pred_flag != set.weighted_pred_flag) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int n = 1231;
        final int n2 = 31 * (31 * (31 + Arrays.hashCode(this.bottom_right)) + this.chroma_qp_index_offset);
        int n3;
        if (this.constrained_intra_pred_flag) {
            n3 = n;
        }
        else {
            n3 = 1237;
        }
        final int n4 = 31 * (n2 + n3);
        int n5;
        if (this.deblocking_filter_control_present_flag) {
            n5 = n;
        }
        else {
            n5 = 1237;
        }
        final int n6 = 31 * (n4 + n5);
        int n7;
        if (this.entropy_coding_mode_flag) {
            n7 = n;
        }
        else {
            n7 = 1237;
        }
        final int n8 = 31 * (n6 + n7);
        int hashCode;
        if (this.extended == null) {
            hashCode = 0;
        }
        else {
            hashCode = this.extended.hashCode();
        }
        final int n9 = 31 * (31 * (31 * (31 * (31 * (31 * (n8 + hashCode) + this.num_ref_idx_l0_active_minus1) + this.num_ref_idx_l1_active_minus1) + this.num_slice_groups_minus1) + this.pic_init_qp_minus26) + this.pic_init_qs_minus26);
        int n10;
        if (this.pic_order_present_flag) {
            n10 = n;
        }
        else {
            n10 = 1237;
        }
        final int n11 = 31 * (31 * (n9 + n10) + this.pic_parameter_set_id);
        int n12;
        if (this.redundant_pic_cnt_present_flag) {
            n12 = n;
        }
        else {
            n12 = 1237;
        }
        final int n13 = 31 * (31 * (31 * (n11 + n12) + Arrays.hashCode(this.run_length_minus1)) + this.seq_parameter_set_id);
        int n14;
        if (this.slice_group_change_direction_flag) {
            n14 = n;
        }
        else {
            n14 = 1237;
        }
        final int n15 = 31 * (31 * (31 * (31 * (31 * (31 * (n13 + n14) + this.slice_group_change_rate_minus1) + Arrays.hashCode(this.slice_group_id)) + this.slice_group_map_type) + Arrays.hashCode(this.top_left)) + this.weighted_bipred_idc);
        if (!this.weighted_pred_flag) {
            n = 1237;
        }
        return n15 + n;
    }
    
    @Override
    public String toString() {
        return "PictureParameterSet{\n       entropy_coding_mode_flag=" + this.entropy_coding_mode_flag + ",\n       num_ref_idx_l0_active_minus1=" + this.num_ref_idx_l0_active_minus1 + ",\n       num_ref_idx_l1_active_minus1=" + this.num_ref_idx_l1_active_minus1 + ",\n       slice_group_change_rate_minus1=" + this.slice_group_change_rate_minus1 + ",\n       pic_parameter_set_id=" + this.pic_parameter_set_id + ",\n       seq_parameter_set_id=" + this.seq_parameter_set_id + ",\n       pic_order_present_flag=" + this.pic_order_present_flag + ",\n       num_slice_groups_minus1=" + this.num_slice_groups_minus1 + ",\n       slice_group_map_type=" + this.slice_group_map_type + ",\n       weighted_pred_flag=" + this.weighted_pred_flag + ",\n       weighted_bipred_idc=" + this.weighted_bipred_idc + ",\n       pic_init_qp_minus26=" + this.pic_init_qp_minus26 + ",\n       pic_init_qs_minus26=" + this.pic_init_qs_minus26 + ",\n       chroma_qp_index_offset=" + this.chroma_qp_index_offset + ",\n       deblocking_filter_control_present_flag=" + this.deblocking_filter_control_present_flag + ",\n       constrained_intra_pred_flag=" + this.constrained_intra_pred_flag + ",\n       redundant_pic_cnt_present_flag=" + this.redundant_pic_cnt_present_flag + ",\n       top_left=" + this.top_left + ",\n       bottom_right=" + this.bottom_right + ",\n       run_length_minus1=" + this.run_length_minus1 + ",\n       slice_group_change_direction_flag=" + this.slice_group_change_direction_flag + ",\n       slice_group_id=" + this.slice_group_id + ",\n       extended=" + this.extended + '}';
    }
    
    @Override
    public void write(final OutputStream outputStream) throws IOException {
        final CAVLCWriter cavlcWriter = new CAVLCWriter(outputStream);
        cavlcWriter.writeUE(this.pic_parameter_set_id, "PPS: pic_parameter_set_id");
        cavlcWriter.writeUE(this.seq_parameter_set_id, "PPS: seq_parameter_set_id");
        cavlcWriter.writeBool(this.entropy_coding_mode_flag, "PPS: entropy_coding_mode_flag");
        cavlcWriter.writeBool(this.pic_order_present_flag, "PPS: pic_order_present_flag");
        cavlcWriter.writeUE(this.num_slice_groups_minus1, "PPS: num_slice_groups_minus1");
        if (this.num_slice_groups_minus1 > 0) {
            cavlcWriter.writeUE(this.slice_group_map_type, "PPS: slice_group_map_type");
            final int[] array = { 0 };
            final int[] array2 = { 0 };
            final int[] array3 = { 0 };
            if (this.slice_group_map_type == 0) {
                for (int i = 0; i <= this.num_slice_groups_minus1; ++i) {
                    cavlcWriter.writeUE(array3[i], "PPS: ");
                }
            }
            else if (this.slice_group_map_type == 2) {
                for (int j = 0; j < this.num_slice_groups_minus1; ++j) {
                    cavlcWriter.writeUE(array[j], "PPS: ");
                    cavlcWriter.writeUE(array2[j], "PPS: ");
                }
            }
            else if (this.slice_group_map_type == 3 || this.slice_group_map_type == 4 || this.slice_group_map_type == 5) {
                cavlcWriter.writeBool(this.slice_group_change_direction_flag, "PPS: slice_group_change_direction_flag");
                cavlcWriter.writeUE(this.slice_group_change_rate_minus1, "PPS: slice_group_change_rate_minus1");
            }
            else if (this.slice_group_map_type == 6) {
                int n;
                if (1 + this.num_slice_groups_minus1 > 4) {
                    n = 3;
                }
                else if (1 + this.num_slice_groups_minus1 > 2) {
                    n = 2;
                }
                else {
                    n = 1;
                }
                cavlcWriter.writeUE(this.slice_group_id.length, "PPS: ");
                for (int k = 0; k <= this.slice_group_id.length; ++k) {
                    cavlcWriter.writeU(this.slice_group_id[k], n);
                }
            }
        }
        cavlcWriter.writeUE(this.num_ref_idx_l0_active_minus1, "PPS: num_ref_idx_l0_active_minus1");
        cavlcWriter.writeUE(this.num_ref_idx_l1_active_minus1, "PPS: num_ref_idx_l1_active_minus1");
        cavlcWriter.writeBool(this.weighted_pred_flag, "PPS: weighted_pred_flag");
        cavlcWriter.writeNBit(this.weighted_bipred_idc, 2, "PPS: weighted_bipred_idc");
        cavlcWriter.writeSE(this.pic_init_qp_minus26, "PPS: pic_init_qp_minus26");
        cavlcWriter.writeSE(this.pic_init_qs_minus26, "PPS: pic_init_qs_minus26");
        cavlcWriter.writeSE(this.chroma_qp_index_offset, "PPS: chroma_qp_index_offset");
        cavlcWriter.writeBool(this.deblocking_filter_control_present_flag, "PPS: deblocking_filter_control_present_flag");
        cavlcWriter.writeBool(this.constrained_intra_pred_flag, "PPS: constrained_intra_pred_flag");
        cavlcWriter.writeBool(this.redundant_pic_cnt_present_flag, "PPS: redundant_pic_cnt_present_flag");
        if (this.extended != null) {
            cavlcWriter.writeBool(this.extended.transform_8x8_mode_flag, "PPS: transform_8x8_mode_flag");
            cavlcWriter.writeBool(this.extended.scalindMatrix != null, "PPS: scalindMatrix");
            if (this.extended.scalindMatrix != null) {
                int n2 = 0;
                while (true) {
                    int n3;
                    if (this.extended.transform_8x8_mode_flag) {
                        n3 = 1;
                    }
                    else {
                        n3 = 0;
                    }
                    if (n2 >= 6 + n3 * 2) {
                        break;
                    }
                    if (n2 < 6) {
                        cavlcWriter.writeBool(this.extended.scalindMatrix.ScalingList4x4[n2] != null, "PPS: ");
                        if (this.extended.scalindMatrix.ScalingList4x4[n2] != null) {
                            this.extended.scalindMatrix.ScalingList4x4[n2].write(cavlcWriter);
                        }
                    }
                    else {
                        cavlcWriter.writeBool(this.extended.scalindMatrix.ScalingList8x8[n2 - 6] != null, "PPS: ");
                        if (this.extended.scalindMatrix.ScalingList8x8[n2 - 6] != null) {
                            this.extended.scalindMatrix.ScalingList8x8[n2 - 6].write(cavlcWriter);
                        }
                    }
                    ++n2;
                }
            }
            cavlcWriter.writeSE(this.extended.second_chroma_qp_index_offset, "PPS: ");
        }
        cavlcWriter.writeTrailingBits();
    }
    
    public static class PPSExt
    {
        public boolean[] pic_scaling_list_present_flag;
        public ScalingMatrix scalindMatrix;
        public int second_chroma_qp_index_offset;
        public boolean transform_8x8_mode_flag;
        
        public PPSExt() {
            this.scalindMatrix = new ScalingMatrix();
        }
        
        @Override
        public String toString() {
            return "PPSExt{transform_8x8_mode_flag=" + this.transform_8x8_mode_flag + ", scalindMatrix=" + this.scalindMatrix + ", second_chroma_qp_index_offset=" + this.second_chroma_qp_index_offset + ", pic_scaling_list_present_flag=" + this.pic_scaling_list_present_flag + '}';
        }
    }
}
