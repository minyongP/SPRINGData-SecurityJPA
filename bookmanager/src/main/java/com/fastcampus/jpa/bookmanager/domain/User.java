package com.fastcampus.jpa.bookmanager.domain;

import java.time.LocalDateTime;
import javax.persistence.*;

import com.fastcampus.jpa.bookmanager.domain.listener.Auditable;
import com.fastcampus.jpa.bookmanager.domain.listener.UserEntityListener;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Builder
@Entity
@EntityListeners(value = UserEntityListener.class)
//@Table(name = "user", indexes = { @Index(columnList = "name")}, uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})})
public class User extends BaseEntity implements Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

//    @Column(updatable = false)
//    @CreatedDate
//    private LocalDateTime createdAt;
//
//    @LastModifiedDate
//    private LocalDateTime updatedAt;

//    @Transient
//    private String testData;

//    @OneToMany(fetch = FetchType.EAGER)
//    private List<Address> address;

//    @PrePersist
//    public void prePersist(){
//        this.createdAt=LocalDateTime.now();
//        this.updatedAt=LocalDateTime.now();
//    }
//    @PostUpdate
//    public void postUpdate() {
//        this.updatedAt=LocalDateTime.now();
//    }
//    @PreUpdate
//    public void preUpdate(){
//        System.out.println(">>> preUpdate");
//    }
//    @PreRemove
//    public void preRemove(){
//        System.out.println(">>> preRemove");
//    }
//    @PostPersist
//    public void postPersist(){
//        System.out.println(">>> postPersist");
//    }
//    @PostRemove
//    public void postRemove(){
//        System.out.println(">>> postRemove");
//    }
//    @PostLoad
//    public void postLoad(){
//        System.out.println(">>> postLoad");
//    }
}
