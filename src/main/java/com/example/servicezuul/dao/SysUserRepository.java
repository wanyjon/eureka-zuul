package com.example.servicezuul.dao;

import com.example.servicezuul.bean.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser, String> {

    SysUser findByUsername(String username);

}
