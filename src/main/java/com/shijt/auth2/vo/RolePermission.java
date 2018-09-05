package com.shijt.auth2.vo;

import com.shijt.auth2.commons.GlobalConsts;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name =GlobalConsts.tb_role_permission,schema = GlobalConsts.db_schema)
public class RolePermission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long roleId;
    private int permissionType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public int getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(int permissionType) {
        this.permissionType = permissionType;
    }
}
