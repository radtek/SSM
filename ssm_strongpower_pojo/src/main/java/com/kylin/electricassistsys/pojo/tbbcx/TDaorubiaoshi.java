package com.kylin.electricassistsys.pojo.tbbcx;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TDaorubiaoshi extends Model<TDaorubiaoshi> {

    private static final long serialVersionUID = 1L;

    private String drId;
    private String drCreateuserid;
    private String drMobanentity;
    private String drBiaoshiids;
    private String drRemark;


    public String getDrId() {
        return drId;
    }

    public void setDrId(String drId) {
        this.drId = drId;
    }

    public String getDrCreateuserid() {
        return drCreateuserid;
    }

    public void setDrCreateuserid(String drCreateuserid) {
        this.drCreateuserid = drCreateuserid;
    }

    public String getDrMobanentity() {
        return drMobanentity;
    }

    public void setDrMobanentity(String drMobanentity) {
        this.drMobanentity = drMobanentity;
    }

    public String getDrBiaoshiids() {
        return drBiaoshiids;
    }

    public void setDrBiaoshiids(String drBiaoshiids) {
        this.drBiaoshiids = drBiaoshiids;
    }

    public String getDrRemark() {
        return drRemark;
    }

    public void setDrRemark(String drRemark) {
        this.drRemark = drRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.drId;
    }

    @Override
    public String toString() {
        return "TDaorubiaoshi{" +
        "drId=" + drId +
        ", drCreateuserid=" + drCreateuserid +
        ", drMobanentity=" + drMobanentity +
        ", drBiaoshiids=" + drBiaoshiids +
        ", drRemark=" + drRemark +
        "}";
    }
}
