package com.gyh.mall.service;

import com.gyh.mall.dao.AdminDao;
import com.gyh.mall.dao.AdminDaoImpl;
import com.gyh.mall.model.Admin;
import com.gyh.mall.model.bo.AdminAddBo;
import com.gyh.mall.model.bo.AdminLoginBo;

import java.util.List;

public class AdminServiceImpl implements AdminService{

    private AdminDao adminDao = new AdminDaoImpl();
    @Override
    public Admin login(AdminLoginBo loginBo) {
        Admin admin = new Admin();
        admin.setEmail(loginBo.getEmail());
        admin.setPwd(loginBo.getPwd());

        return adminDao.login(admin);
    }

    @Override
    public List<Admin> allAdmins() {
        return adminDao.allAdmins();
    }

    @Override
    public int addAdminss(AdminAddBo addBo) {
        Admin admin = new Admin();
        admin.setEmail(addBo.getEmail());
        admin.setNickname(addBo.getNickname());
        admin.setPwd(addBo.getPwd());

        return adminDao.addAdminss(admin);
    }

    @Override
    public Admin deleteAdmins(int id) {
        return adminDao.deleteAdmins(id);
    }
}
