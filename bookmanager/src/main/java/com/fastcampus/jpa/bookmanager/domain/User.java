package com.fastcampus.jpa.bookmanager.domain;

import java.time.LocalDateTime;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
@Entity
@EntityListeners(value = MyEntityListener.class)
//@Table(name = "user", indexes = { @Index(columnList = "name")}, uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})})
public class User implements Auditable{
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @Column(updatable = false)
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

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
