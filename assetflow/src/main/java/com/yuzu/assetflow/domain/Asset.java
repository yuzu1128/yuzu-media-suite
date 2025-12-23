package com.yuzu.assetflow.domain;

import lombok.Data;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Column;
import org.seasar.doma.Metamodel;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(metamodel = @Metamodel)
@Data
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "asset_tag")
    private String assetTag;

    private String name;
    private String category;
    private String status;

    @Column(name = "purchase_date")
    private LocalDate purchaseDate;

    @Column(name = "purchase_cost")
    private BigDecimal purchaseCost;

    @Column(name = "assigned_to_user_id")
    private Long assignedToUserId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
