package me.hanjaekyeong.springbootdeveloper.repository;

import me.hanjaekyeong.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
