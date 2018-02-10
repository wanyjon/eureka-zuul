package com.example.servicezuul.service;

import com.example.servicezuul.bean.SysUser;
import com.example.servicezuul.dao.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserService implements UserDetailsService {

    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    public void saveSysUser(SysUser sysUser) {
        sysUserRepository.save(sysUser);
    }
}
