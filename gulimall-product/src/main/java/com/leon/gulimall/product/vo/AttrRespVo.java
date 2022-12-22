package com.leon.gulimall.product.vo;

import lombok.Data;

@Data
public class AttrRespVo extends AttrVo{
    /* 所属分类的名字，三级分类的第三级 */
    private String catelogName;

    /* 某一分类下的具体组，如三级分类的休闲零食为第三级，手撕牦牛肉属于具体分组 */
    private String groupName;

    private Long[] catelogPath;
}
