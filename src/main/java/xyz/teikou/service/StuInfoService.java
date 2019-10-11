package xyz.teikou.service;

import xyz.teikou.entity.StuInfo;

/**
 * Creat by TeiKou
 * 2019/10/11 14:12
 */
public interface StuInfoService {
    public void addInfo(StuInfo stuInfo);

    public StuInfo myInfo(Integer id);

    public void  updateInfo(StuInfo stuInfo);
}
