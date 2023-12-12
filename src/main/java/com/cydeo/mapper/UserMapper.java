package com.cydeo.mapper;


import com.cydeo.dto.UserDTO;
import com.cydeo.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {



        //if you want to use any method from ModelMapper class, What do we need to do? (Injection)
        private final ModelMapper modelMapper;

        public UserMapper(ModelMapper modelMapper) {
            this.modelMapper = modelMapper;
        }

        //convert to Entity
        public User convertToEntity(UserDTO dto) {

            return modelMapper.map(dto, User.class);
        }

        //convert to DTO

        public UserDTO convertToDTO(User entity) {

            return modelMapper.map(entity, UserDTO.class);
        }

    }


