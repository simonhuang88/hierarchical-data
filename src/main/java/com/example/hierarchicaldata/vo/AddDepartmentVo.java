package com.example.hierarchicaldata.vo;

import java.io.Serializable;

/**
 * @author huangsm
 * @date 2023/03/24 09:45
 **/
public class AddDepartmentVo implements Serializable {
    private Long parentId;
    private String name;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
