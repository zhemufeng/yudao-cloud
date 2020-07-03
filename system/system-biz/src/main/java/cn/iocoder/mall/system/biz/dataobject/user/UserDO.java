package cn.iocoder.mall.system.biz.dataobject.user;

import cn.iocoder.mall.mybatis.dataobject.DeletableDO;
import cn.iocoder.mall.system.biz.dataobject.account.AccountDO;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 用户实体
 */
@TableName(value = "users")
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Deprecated
public class UserDO extends DeletableDO {

    /**
     * 用户编号
     */
    private Integer id;
    /**
     * 账号编号
     *
     * 关联 {@link AccountDO#getId()}
     */
    private Integer accountId;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 头像
     */
    private String avatar;

    /**
     * 用户状态 1 - 开启；2 - 禁用
     */
    private Integer status;

}