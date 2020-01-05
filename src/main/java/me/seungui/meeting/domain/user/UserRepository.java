package me.seungui.meeting.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // 소셜로그인으로 반환되는 값 중 email을 통해
    // 이미 생성된 사용자인지 처음 가입한 사용자인지 판단하기 위한 메소드
    Optional<User> findByEmail(String email);
}
