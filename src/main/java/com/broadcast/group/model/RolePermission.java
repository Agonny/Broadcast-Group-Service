package com.broadcast.group.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(name = "role_permissions")
public class RolePermission {

    @Id
    private Long id;

    @ManyToMany(fetch = FetchType.LAZY, cascade =  CascadeType.ALL, mappedBy = "rolePermissions")
    private Set<GroupUserRole> groupUserRoles;

    private String name;

    private String description;

}
