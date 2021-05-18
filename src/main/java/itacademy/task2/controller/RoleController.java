package itacademy.task2.controller;

import itacademy.task2.entity.Role;
import itacademy.task2.model.RoleModel;
import itacademy.task2.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @PostMapping
    public Role save (@RequestBody RoleModel roleModel)throws IllegalAccessException{
        return roleService.save(roleModel);
    }
    @DeleteMapping("/{id}")
    public Role deleteRole(@PathVariable Long id){
        return roleService.deleteRole(id);
    }
    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable Long id){
        return roleService.getRoleById(id);
    }
}
