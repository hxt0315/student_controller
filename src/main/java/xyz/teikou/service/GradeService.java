package xyz.teikou.service;

import xyz.teikou.entity.Grade;

import java.util.List;

/**
 * Creat by TeiKou
 * 2019/10/10 15:11
 */
public interface GradeService {
    /**
     * @author Teikou
     * @date 2019/10/10 15:12
     * 添加成绩
     */
    public void addGrade(Grade grade);

    public List<Grade> selectMyGrade(String schNumber);
}
