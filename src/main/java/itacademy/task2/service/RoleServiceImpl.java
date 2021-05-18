package itacademy.task2.service;

import itacademy.task2.entity.Role;
import itacademy.task2.entity.Student;
import itacademy.task2.model.RoleModel;
import itacademy.task2.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private StudentService studentService;

    @Override
    public Role save(RoleModel RoleModel)throws IllegalAccessException  {
        Role userRole = new Role();
        userRole.setRoleName(RoleModel.getRoleName());
        Student student = studentService.getStudentById(RoleModel.getStudentId());
        if (student == null)throw new IllegalAccessException("Пользователь с ID " + RoleModel.getStudentId() + " не найден");
        userRole.setStudent(student);
        return roleRepository.save(userRole);
    }

    @Override
    public Role getRoleById(Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    @Override
    public Role deleteRole(Long id) {
        Role role = getRoleById(id);
        if (role != null){
            roleRepository.delete(role);
            return role;
        }

        return null;
    }
}
