package itacademy.task2.service;

import itacademy.task2.entity.Role;
import itacademy.task2.model.RoleModel;

public interface RoleService {
    Role save(RoleModel RoleModel) throws IllegalAccessException;
    Role getRoleById(Long id);
    Role deleteRole(Long id);
}
