package com.saikumar.UserManagementValidations.configuration;

import com.saikumar.UserManagementValidations.model.Type;
import com.saikumar.UserManagementValidations.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static com.saikumar.UserManagementValidations.model.Type.ADMIN;

@Configuration
public class BeanManager {
    @Bean
    public List<User> getuserList(){
        User defaultUser = new User(0,"saikumar", LocalDate.of(2000,1,26),"sai12@gmail.com","ssaaii","9898989898",LocalDate.of(2023,6,26),LocalTime.now(Clock.systemDefaultZone()),Type.ADMIN,23);
        List<User> userList = new ArrayList<>();
        userList.add(defaultUser);
        return userList;
    }
}
