package xyz.teikou.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.teikou.entity.User;
import xyz.teikou.mapper.UserMapper;
import xyz.teikou.service.UserService;

/**
 * Creat by TeiKou
 * 2019/10/9 11:51
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public Integer findUserName(String username) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        Integer count = userMapper.selectCount(queryWrapper);
        return count;
    }

    @Override
    public Integer findSchNumber(String schNumber) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("sch_number", schNumber);
        Integer count = userMapper.selectCount(queryWrapper);
        return count;
    }

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public String findPasswordByUsername(String username) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        return userMapper.selectOne(queryWrapper).getPassword();

    }
}
