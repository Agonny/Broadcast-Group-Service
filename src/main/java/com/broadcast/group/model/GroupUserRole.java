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
@Table(name = "group_user_roles")
public class GroupUserRole {

    @Id
    private String id;

    private String name;

    @JoinColumn(name = "group_id")
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH})
    private GroupUser groupUser;

    @JoinTable(name = "role_permissions",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id"))
    @ManyToMany(fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    private Set<RolePermission> groupUserRoles;

}
