package com.ryo.ocr.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Value;
import net.minidev.json.JSONArray;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
@TableName("order_entity")
public class OrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(type=IdType.AUTO)
    private Integer id;

    private Long memberId;

    private String memberUsername;

    private Integer deleteStatus;

    private Integer totalAmount;

    private String createdTime;

    @TableField(exist = false)
    private String storeName;

    private String note;

    @TableField(exist = false)
    private JSONArray jsonArray;

    private String itemList;

    private String receiptDate;
}

