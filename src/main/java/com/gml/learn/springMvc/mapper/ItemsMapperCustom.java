package com.gml.learn.springMvc.mapper;

import com.gml.learn.springMvc.po.Items;
import com.gml.learn.springMvc.po.ItemsCustom;
import com.gml.learn.springMvc.po.ItemsExample;
import com.gml.learn.springMvc.po.ItemsQueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemsMapperCustom {
    //商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}