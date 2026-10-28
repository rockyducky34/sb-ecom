package com.ecommerce.project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "roles")
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer roleId;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, name = "role_name")
    private AppRole roleName;

    public Role() {
    }
    public Role(AppRole roleName) {
        this.roleName = roleName;
    }

    public AppRole getRoleName() {
        return roleName;
    }
    public void setRoleName(AppRole roleName) {
        this.roleName = roleName;
    }
    public Integer getRoleId() {
        return roleId;
    }
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
