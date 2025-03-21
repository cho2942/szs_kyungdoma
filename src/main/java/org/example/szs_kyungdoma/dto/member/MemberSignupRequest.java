package org.example.szs_kyungdoma.dto.member;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class MemberSignupRequest{
        @NotNull(message = "Invalid userId")
        private String userId;
        @NotNull(message = "Invalid password")
        private String password;
        @NotNull(message = "Invalid name")
        private String name;
        @Pattern(regexp = "^[0-9]{6}-[1234][0-9]{6}$", message = "Invalid regNo")
        private String regNo;
}
