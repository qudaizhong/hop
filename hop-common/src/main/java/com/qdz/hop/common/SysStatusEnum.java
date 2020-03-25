package com.qdz.hop.common;

/**
 * 系统默认状态
 * @author qdz
 * @createDate 2020年3月13日 上午10:10:15
 * @updateDate 2020年3月13日 上午10:10:15
 * @version 1.0
 */
public enum SysStatusEnum {
	NOT_ENABLED(0, "未启用"),
	ENABLED(1, "已启用"),
	DELETED(2, "已删除");
	
	private Integer code;
    private String value;

    private SysStatusEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
