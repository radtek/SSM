package com.kylin.electricassistsys.pojo.ghdg;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TGhdgDwyxzb extends Model<TGhdgDwyxzb> {

    private static final long serialVersionUID = 1L;
    @TableId("T_DWYXZB_ID")
    private String tDwyxzbId;
    private String tDwyxzbGqlx;
    private String tDwyxzbDydj;
    private String tDwyxzbRzb;
    private String tDwyxzbDzs;
    private String tDwyxzbDbl;
    private String tDwyxzbZbts;
    private String tDwyxzbZbbl;
    private String tDwyxzbXlts;
    private String tDwyxzbXlbl;


    public String gettDwyxzbId() {
        return tDwyxzbId;
    }

    public void settDwyxzbId(String tDwyxzbId) {
        this.tDwyxzbId = tDwyxzbId;
    }

    public String gettDwyxzbGqlx() {
        return tDwyxzbGqlx;
    }

    public void settDwyxzbGqlx(String tDwyxzbGqlx) {
        this.tDwyxzbGqlx = tDwyxzbGqlx;
    }

    public String gettDwyxzbDydj() {
        return tDwyxzbDydj;
    }

    public void settDwyxzbDydj(String tDwyxzbDydj) {
        this.tDwyxzbDydj = tDwyxzbDydj;
    }

    public String gettDwyxzbRzb() {
        return tDwyxzbRzb;
    }

    public void settDwyxzbRzb(String tDwyxzbRzb) {
        this.tDwyxzbRzb = tDwyxzbRzb;
    }

    public String gettDwyxzbDzs() {
        return tDwyxzbDzs;
    }

    public void settDwyxzbDzs(String tDwyxzbDzs) {
        this.tDwyxzbDzs = tDwyxzbDzs;
    }

    public String gettDwyxzbDbl() {
        return tDwyxzbDbl;
    }

    public void settDwyxzbDbl(String tDwyxzbDbl) {
        this.tDwyxzbDbl = tDwyxzbDbl;
    }

    public String gettDwyxzbZbts() {
        return tDwyxzbZbts;
    }

    public void settDwyxzbZbts(String tDwyxzbZbts) {
        this.tDwyxzbZbts = tDwyxzbZbts;
    }

    public String gettDwyxzbZbbl() {
        return tDwyxzbZbbl;
    }

    public void settDwyxzbZbbl(String tDwyxzbZbbl) {
        this.tDwyxzbZbbl = tDwyxzbZbbl;
    }

    public String gettDwyxzbXlts() {
        return tDwyxzbXlts;
    }

    public void settDwyxzbXlts(String tDwyxzbXlts) {
        this.tDwyxzbXlts = tDwyxzbXlts;
    }

    public String gettDwyxzbXlbl() {
        return tDwyxzbXlbl;
    }

    public void settDwyxzbXlbl(String tDwyxzbXlbl) {
        this.tDwyxzbXlbl = tDwyxzbXlbl;
    }

    @Override
    protected Serializable pkVal() {
        return this.tDwyxzbId;
    }

    @Override
    public String toString() {
        return "TGhdgDwyxzb{" +
        "tDwyxzbId=" + tDwyxzbId +
        ", tDwyxzbGqlx=" + tDwyxzbGqlx +
        ", tDwyxzbDydj=" + tDwyxzbDydj +
        ", tDwyxzbRzb=" + tDwyxzbRzb +
        ", tDwyxzbDzs=" + tDwyxzbDzs +
        ", tDwyxzbDbl=" + tDwyxzbDbl +
        ", tDwyxzbZbts=" + tDwyxzbZbts +
        ", tDwyxzbZbbl=" + tDwyxzbZbbl +
        ", tDwyxzbXlts=" + tDwyxzbXlts +
        ", tDwyxzbXlbl=" + tDwyxzbXlbl +
        "}";
    }
}
