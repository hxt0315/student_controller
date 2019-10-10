package xyz.teikou.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.teikou.entity.Grade;
import xyz.teikou.mapper.GradeMapper;
import xyz.teikou.service.GradeService;

/**
 * Creat by TeiKou
 * 2019/10/10 15:13
 */
@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    GradeMapper gradeMapper;

    @Override
    public void addGrade(Grade grade) {
        gradeMapper.insert(grade);
    }
}
