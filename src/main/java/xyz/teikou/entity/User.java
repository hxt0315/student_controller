package xyz.teikou.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author teikou
 * @since 2019-10-09
 */
@Data
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    @TableField("username")
    private String username;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 盐
     */
    @TableField("salt")
    private String salt;

    /**
     * 姓名
     */
    @TableField("name")
    private String name;

    /**
     * 学号/工号
     */
    @TableField("sch_number")
    private String schNumber;

    /**
     * 邮箱
     */
    @TableField("mail")
    private String mail;

    /**
     * 创建时间
     */
    @TableField("creat_time")
    private Date creatTime;

    /**
     * 上次登陆时间
     */
    @TableField("last_time")
    private Date lastTime;

    /**
     * 角色 1学生 2老师
     */
    @TableField("role_id")
    private Integer roleId;

    /**
     * 班级/部门
     */
    @TableField("sch_department")
    private String schDepartment;

}
