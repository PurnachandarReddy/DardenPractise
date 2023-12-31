package com.microservices.departmentservice.service.impl;

import com.microservices.departmentservice.dto.DepartmentDto;
import com.microservices.departmentservice.entity.Department;
import com.microservices.departmentservice.repository.DepartmentRepository;
import com.microservices.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;


    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        //jpa to dto
        Department department = new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription(),
                departmentDto.getDepartmentCode()
        );

        Department savedDepartment = departmentRepository.save(department);

        //dto to jap
        DepartmentDto savedDepartmentDto = new DepartmentDto(
                savedDepartment.getId(),
                savedDepartment.getDepartmentName(),
                savedDepartment.getDepartmentDescription(),
                savedDepartment.getDepartmentCode()
        );

        return savedDepartmentDto;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        Department department = departmentRepository.findByDepartmentCode(departmentCode);
        DepartmentDto departmentDto=new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentName(),
                department.getDepartmentCode()
        );
        return departmentDto;
    }
}
