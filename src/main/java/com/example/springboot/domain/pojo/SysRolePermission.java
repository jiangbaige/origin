package com.example.springboot.domain.pojo;

import java.io.Serializable;

public class SysRolePermission implements Serializable {
    private static final long serialVersionUID = -8574753866315035223L;

    private Long roleId;

    private Long permissionId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }
}
