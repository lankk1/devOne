package com.blueseaheart.core.service.impl;

import com.blueseaheart.core.dao.PKECHxMapper;
import com.blueseaheart.core.domain.PKECHx;
import com.blueseaheart.core.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Walker on 2018/4/23.
 */
@Service
public class LoginServiceImpl implements LoginService {
    // vars
//    @Autowired
//    private CoreUserMapper coreUserMapper;
    @Autowired
    private PKECHxMapper pkecHxMapper;

    // public functions
    @Override
    public Integer addUser(String userName) {
//        CoreUser user = new CoreUser();
//        user.setUserName(userName);
//        user.setUserCreateTime(new Date());
//        user.setUserComment("第一次添加,暂时不要删除");
//        user.setUserIdNo("123456789");
//        user.setUserMarried(0);
//        user.setUserSex(SexEnum.NAN.getCode());
//        return coreUserMapper.insertSelective(user);
        return 0;
    }

    @Override
    @Transactional
    public int updateHx() {
        PKECHx hx = new PKECHx();
        hx.setHxId(1);
        hx.setHxPassword("123456");
        hx.setHxNickname("王医生");
        hx.setHxPkecuserid(1);
        hx.setHxUsertype("2");
        hx.setHxUsername("doctor001");
        pkecHxMapper.updateByPrimaryKeySelective(hx);
        int i=1/0;
        return 2;
    }

    // private functions
}
