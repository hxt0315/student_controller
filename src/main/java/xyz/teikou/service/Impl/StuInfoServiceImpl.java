package xyz.teikou.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.teikou.entity.StuInfo;
import xyz.teikou.form.StuForm;
import xyz.teikou.mapper.StuInfoMapper;
import xyz.teikou.service.StuInfoService;

/**
 * Creat by TeiKou
 * 2019/10/11 14:15
 */
@Service
public class StuInfoServiceImpl implements StuInfoService {
    @Autowired
    StuInfoMapper stuInfoMapper;
    @Override
    public void addInfo(StuInfo stuInfo) {
        stuInfoMapper.insert(stuInfo);
    }

    @Override
    public StuInfo myInfo(Integer id) {
        StuInfo stuInfo = stuInfoMapper.selectById(id);
        return stuInfo;
    }

    @Override
    public void updateInfo(StuInfo stuInfo) {
        stuInfoMapper.updateById(stuInfo);
    }
}
