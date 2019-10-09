package xyz.teikou.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("grade")
public class Grade implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER)
    private Integer id;

    @TableField("sch_number")
    private Integer schNumber;

    @TableField("chinese")
    private Integer chinese;

    @TableField("math")
    private Integer math;

    @TableField("english")
    private Integer english;

}
