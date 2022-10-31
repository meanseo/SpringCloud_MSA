package com.example.catalogservice.jpa;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="catalog")
public class CatalogEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120, unique = true)
    private String productId;
    @Column(nullable = false)
    private String productName;
    @Column(nullable = false)
    private Integer stock;
    @Column(nullable = false)
    private Integer unitPrice;

    @Column(nullable = false, updatable = false, insertable = false) //직접 입력하지 않고
    @ColumnDefault(value = "CURRENT_TIMESTAMP")// 현재 시간을 자동으로 찍히게 설정
    private Date createAt;
}
