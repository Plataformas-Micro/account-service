package store.account;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountResource implements AccountController {

    @Override
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("OK");
    }

    @Override
    public ResponseEntity<Void> create(AccountIn in) {
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> delete(String id) {
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<List<AccountOut>> findAll() {
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<AccountOut> findById(String id) {
        AccountOut out = AccountOut.builder()
            .name("John Doe")
            .email("john.doe@example.com")
            .id("123")
            .build();
        return ResponseEntity.ok(out);
    }
}