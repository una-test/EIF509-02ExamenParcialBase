package ac.cr.una.parcial02.dao;

import ac.cr.una.parcial02.model.Role;

import java.util.List;

public interface RoleDao {
    Role findByAuthority(String authority);
    Role add(Role role);
    List<Role> listRoles();
}
