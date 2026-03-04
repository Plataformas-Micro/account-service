package store.account;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Table(name = "accounts")
@Setter @Accessors(chain = true,fluent = false)
@NoArgsConstructor @AllArgsConstructor
public class AccountModel {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "email",nullable = false)
    private String email;

}
