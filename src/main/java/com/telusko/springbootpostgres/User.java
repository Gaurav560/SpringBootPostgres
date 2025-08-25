package com.telusko.springbootpostgres;
import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false)
    private String userName;

    private String phone;

    @Column(unique = true, nullable = false)
    private String email;
}