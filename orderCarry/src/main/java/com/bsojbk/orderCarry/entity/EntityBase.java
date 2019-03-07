package com.bsojbk.orderCarry.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 	基础依赖，
 * 创建时间，修改时间
 * @author dingy
 *
 */

public class EntityBase implements Serializable{

	private static final long serialVersionUID = 1L;
	/**创建时间*/
    Date createTime;
    /**修改时间*/
    Date modifyTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
