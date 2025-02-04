/***
 * @Author: 码上talk|RC/3189482282@qq.com
 * @Date: 2021-10-26 17:20:08
 * @LastEditTime: 2021-10-30 11:12:37
 * @LastEditors: 码上talk|RC
 * @Description: 
 * @FilePath: /tacomall-api/common/src/main/java/store/tacomall/common/entity/member/MemberCart.java
 */
package store.tacomall.common.entity.member;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import store.tacomall.common.entity.goods.GoodsItems;
import store.tacomall.common.entity.shop.Shop;

/**
 * <p>
 * 
 * </p>
 *
 * @author 码上talk
 * @since 2021-10-26
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberCart implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer memberId;

    private Integer shopId;

    private Integer goodsItemsId;

    private Integer quantity;

    private Integer status;

    @TableLogic
    private Integer isDelete;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private LocalDateTime deleteTime;

    @TableField(exist = false)
    private Shop shop;

    @TableField(exist = false)
    private GoodsItems goodsItems;

}
