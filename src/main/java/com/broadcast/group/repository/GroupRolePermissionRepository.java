package com.broadcast.group.repository;

import com.broadcast.group.model.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRolePermissionRepository extends JpaRepository<RolePermission, Long> {
}
