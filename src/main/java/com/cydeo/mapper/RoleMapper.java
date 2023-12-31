package com.cydeo.mapper;

import com.cydeo.dto.RoleDTO;
import com.cydeo.entity.Role;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {

    //if you want to use any method from ModelMapper class, What do we need to do? (Injection)
    private final ModelMapper modelMapper;

    public RoleMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    //convert to Entity
    public Role convertToEntity(RoleDTO dto) {

        return modelMapper.map(dto, Role.class);
    }

    //convert to DTO

    public RoleDTO convertToDto(Role entity) {

        return modelMapper.map(entity, RoleDTO.class);
    }

}
