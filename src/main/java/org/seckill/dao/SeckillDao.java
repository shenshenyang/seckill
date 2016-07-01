package org.seckill.dao;

import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/7/1.
 */
public interface SeckillDao {

    /**
     * 减库存,
     * @param seckillId
     * @param killTime
     * @return 如果影响行数=1， 表示更新的记录行数
     */
    int reduceNumber(long seckillId, Date killTime);

    /**
     *
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * @param offet
     * @param limit
     * @return
     */
    List<Seckill> queryAll(int offet, int limit);

}
